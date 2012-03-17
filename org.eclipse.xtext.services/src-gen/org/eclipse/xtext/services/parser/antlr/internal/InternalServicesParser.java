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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'component'", "'{'", "'requires'", "','", "'}'", "'service'", "'['", "'GET'", "'POST'", "'PUT'", "'DELETE'", "']'", "'('", "')'", "':'", "'import'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'|'", "';'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:115:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRequireDeclaration ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_imports_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_requires_7_0 = null;

        EObject lv_requires_9_0 = null;

        EObject lv_services_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:118:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRequireDeclaration ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:119:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRequireDeclaration ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:119:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRequireDeclaration ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:119:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRequireDeclaration ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_10_0= ruleService ) )* otherlv_11= '}'
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

                if ( (LA1_0==29) ) {
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleComponent300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:185:1: (otherlv_6= 'requires' ( (lv_requires_7_0= ruleRequireDeclaration ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRequireDeclaration ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:185:3: otherlv_6= 'requires' ( (lv_requires_7_0= ruleRequireDeclaration ) ) (otherlv_8= ',' ( (lv_requires_9_0= ruleRequireDeclaration ) ) )*
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleComponent313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getRequiresKeyword_6_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:189:1: ( (lv_requires_7_0= ruleRequireDeclaration ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:190:1: (lv_requires_7_0= ruleRequireDeclaration )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:190:1: (lv_requires_7_0= ruleRequireDeclaration )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:191:3: lv_requires_7_0= ruleRequireDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentAccess().getRequiresRequireDeclarationParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRequireDeclaration_in_ruleComponent334);
                    lv_requires_7_0=ruleRequireDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                      	        }
                             		add(
                             			current, 
                             			"requires",
                              		lv_requires_7_0, 
                              		"RequireDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:207:2: (otherlv_8= ',' ( (lv_requires_9_0= ruleRequireDeclaration ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:207:4: otherlv_8= ',' ( (lv_requires_9_0= ruleRequireDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleComponent347); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:211:1: ( (lv_requires_9_0= ruleRequireDeclaration ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:212:1: (lv_requires_9_0= ruleRequireDeclaration )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:212:1: (lv_requires_9_0= ruleRequireDeclaration )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:213:3: lv_requires_9_0= ruleRequireDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getComponentAccess().getRequiresRequireDeclarationParserRuleCall_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRequireDeclaration_in_ruleComponent368);
                    	    lv_requires_9_0=ruleRequireDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"requires",
                    	              		lv_requires_9_0, 
                    	              		"RequireDeclaration");
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:229:6: ( (lv_services_10_0= ruleService ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:230:1: (lv_services_10_0= ruleService )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:230:1: (lv_services_10_0= ruleService )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:231:3: lv_services_10_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleService_in_ruleComponent393);
            	    lv_services_10_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"services",
            	              		lv_services_10_0, 
            	              		"Service");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleComponent406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8());
                  
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:259:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:260:2: (iv_ruleService= ruleService EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:261:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService442);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService452); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:268:1: ruleService returns [EObject current=null] : ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:271:28: ( ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:272:1: ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:272:1: ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:272:2: ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:272:2: ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:272:3: ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:272:3: ( (lv_service_0_0= 'service' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:273:1: (lv_service_0_0= 'service' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:273:1: (lv_service_0_0= 'service' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:274:3: lv_service_0_0= 'service'
                    {
                    lv_service_0_0=(Token)match(input,19,FOLLOW_19_in_ruleService496); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleService521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_0_1());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:291:1: ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) )
                    int alt5=4;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt5=1;
                        }
                        break;
                    case 22:
                        {
                        alt5=2;
                        }
                        break;
                    case 23:
                        {
                        alt5=3;
                        }
                        break;
                    case 24:
                        {
                        alt5=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:291:2: ( (lv_get_2_0= 'GET' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:291:2: ( (lv_get_2_0= 'GET' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:292:1: (lv_get_2_0= 'GET' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:292:1: (lv_get_2_0= 'GET' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:293:3: lv_get_2_0= 'GET'
                            {
                            lv_get_2_0=(Token)match(input,21,FOLLOW_21_in_ruleService540); if (state.failed) return current;
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:307:6: ( (lv_post_3_0= 'POST' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:307:6: ( (lv_post_3_0= 'POST' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:308:1: (lv_post_3_0= 'POST' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:308:1: (lv_post_3_0= 'POST' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:309:3: lv_post_3_0= 'POST'
                            {
                            lv_post_3_0=(Token)match(input,22,FOLLOW_22_in_ruleService577); if (state.failed) return current;
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:323:6: ( (lv_put_4_0= 'PUT' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:323:6: ( (lv_put_4_0= 'PUT' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:324:1: (lv_put_4_0= 'PUT' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:324:1: (lv_put_4_0= 'PUT' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:325:3: lv_put_4_0= 'PUT'
                            {
                            lv_put_4_0=(Token)match(input,23,FOLLOW_23_in_ruleService614); if (state.failed) return current;
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:339:6: ( (lv_delete_5_0= 'DELETE' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:339:6: ( (lv_delete_5_0= 'DELETE' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:340:1: (lv_delete_5_0= 'DELETE' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:340:1: (lv_delete_5_0= 'DELETE' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:341:3: lv_delete_5_0= 'DELETE'
                            {
                            lv_delete_5_0=(Token)match(input,24,FOLLOW_24_in_ruleService651); if (state.failed) return current;
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

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleService677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:358:3: ( (lv_name_7_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:359:1: (lv_name_7_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:359:1: (lv_name_7_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:360:3: lv_name_7_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleService700);
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

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleService712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:380:1: ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==26||LA8_0==78) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:380:2: ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:380:2: ( (lv_params_9_0= ruleFullJvmFormalParameter ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:381:1: (lv_params_9_0= ruleFullJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:381:1: (lv_params_9_0= ruleFullJvmFormalParameter )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:382:3: lv_params_9_0= ruleFullJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getServiceAccess().getParamsFullJvmFormalParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleService734);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:398:2: (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:398:4: otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleService747); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:402:1: ( (lv_params_11_0= ruleFullJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:403:1: (lv_params_11_0= ruleFullJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:403:1: (lv_params_11_0= ruleFullJvmFormalParameter )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:404:3: lv_params_11_0= ruleFullJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getServiceAccess().getParamsFullJvmFormalParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleService768);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleService784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleService796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getColonKeyword_5());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:428:1: ( (lv_type_14_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:429:1: (lv_type_14_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:429:1: (lv_type_14_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:430:3: lv_type_14_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getTypeJvmTypeReferenceParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleService817);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:446:2: ( (lv_body_15_0= ruleXBlockExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:447:1: (lv_body_15_0= ruleXBlockExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:447:1: (lv_body_15_0= ruleXBlockExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:448:3: lv_body_15_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getBodyXBlockExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleService838);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:472:1: entryRuleRequireDeclaration returns [EObject current=null] : iv_ruleRequireDeclaration= ruleRequireDeclaration EOF ;
    public final EObject entryRuleRequireDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireDeclaration = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:473:2: (iv_ruleRequireDeclaration= ruleRequireDeclaration EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:474:2: iv_ruleRequireDeclaration= ruleRequireDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequireDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleRequireDeclaration_in_entryRuleRequireDeclaration874);
            iv_ruleRequireDeclaration=ruleRequireDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequireDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequireDeclaration884); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:481:1: ruleRequireDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleRequireDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:484:28: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:485:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:485:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:485:2: ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:485:2: ( (lv_type_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:486:1: (lv_type_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:486:1: (lv_type_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:487:3: lv_type_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequireDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleRequireDeclaration930);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:503:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==RULE_ID||(LA9_1>=17 && LA9_1<=19)) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:504:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:504:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:505:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequireDeclaration947); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:529:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:530:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:531:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport989);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport999); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:538:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:541:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:542:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:542:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:542:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleImport1036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:546:1: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:547:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:547:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:548:3: lv_importedNamespace_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport1057);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:572:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:573:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:574:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1093);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1103); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:581:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:584:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:586:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1149);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:602:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:603:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:604:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1183);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1193); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:611:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:614:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:615:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:615:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=RULE_ID && LA11_1<=RULE_DECIMAL)||LA11_1==15||(LA11_1>=17 && LA11_1<=18)||LA11_1==20||(LA11_1>=25 && LA11_1<=28)||(LA11_1>=31 && LA11_1<=53)||(LA11_1>=55 && LA11_1<=78)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==30) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_DECIMAL)||LA11_0==15||LA11_0==20||LA11_0==26||LA11_0==40||(LA11_0>=43 && LA11_0<=44)||LA11_0==49||LA11_0==56||LA11_0==58||(LA11_0>=61 && LA11_0<=63)||LA11_0==66||(LA11_0>=68 && LA11_0<=75)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:615:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:615:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:615:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:615:3: ()
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:616:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:621:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:622:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:622:1: ( ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:623:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1251);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1267);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:644:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:645:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:645:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:646:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1287);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:663:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:663:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:664:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1317);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:672:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==31) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred1_InternalServices()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:672:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:672:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:672:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:677:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:677:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:677:7: ()
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:678:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:683:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:684:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:684:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:685:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1370);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:698:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:699:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:699:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:700:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1393);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:724:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:725:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:726:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1433);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1444); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:733:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:736:28: (kw= '=' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:738:2: kw= '='
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpSingleAssign1481); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:752:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:753:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1521);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1532); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:760:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:763:28: (kw= '+=' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:765:2: kw= '+='
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMultiAssign1569); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:778:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:779:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:780:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1608);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1618); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:787:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:790:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:791:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:791:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:792:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1665);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:800:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalServices()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:800:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:800:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:800:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:805:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:805:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:805:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:806:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:811:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:812:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:812:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:813:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1718);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:826:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:827:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:827:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:828:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1741);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:853:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:854:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1780);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1791); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:861:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:864:28: (kw= '||' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:866:2: kw= '||'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOr1828); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:879:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:880:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:881:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1867);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1877); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:888:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:891:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:892:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:892:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1924);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:901:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalServices()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:901:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:901:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:901:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:906:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:906:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:906:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:907:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:912:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:913:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:913:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:914:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1977);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:927:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:928:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:928:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:929:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2000);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:953:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:954:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:955:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2039);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2050); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:962:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:965:28: (kw= '&&' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:967:2: kw= '&&'
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAnd2087); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:980:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:981:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:982:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2126);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2136); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:989:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:992:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:993:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:993:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:994:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2183);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalServices()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==35) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalServices()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1007:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1007:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1007:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1008:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1013:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1014:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1014:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1015:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2236);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1028:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1029:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1029:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1030:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2259);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1054:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1055:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1056:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2298);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2309); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1063:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1066:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1067:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1067:1: (kw= '==' | kw= '!=' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1068:2: kw= '=='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpEquality2347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1075:2: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpEquality2366); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1088:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1089:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1090:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2406);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2416); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1097:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1100:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1101:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1101:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1102:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2463);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred5_InternalServices()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA16_6 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1112:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1112:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1112:6: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXRelationalExpression2499); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1123:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1123:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1124:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2522);
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
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1146:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1146:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1146:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1147:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1152:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1153:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1153:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2583);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1167:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1168:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1168:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1169:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2606);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1193:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1194:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1195:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2646);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2657); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1202:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1205:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1206:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1206:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            case 40:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1207:2: kw= '>='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpCompare2695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1214:2: kw= '<='
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpCompare2714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:2: kw= '>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpCompare2733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1228:2: kw= '<'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpCompare2752); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1241:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1242:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1243:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2792);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2802); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1250:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1253:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1254:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1254:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1255:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2849);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1263:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred7_InternalServices()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==42) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred7_InternalServices()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1263:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1263:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1263:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1268:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1268:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1268:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1269:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1274:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1275:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1275:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1276:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2902);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1289:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1290:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1290:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1291:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2925);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1315:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1316:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1317:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2964);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2975); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1324:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1327:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1328:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1328:1: (kw= '->' | kw= '..' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            else if ( (LA19_0==42) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:2: kw= '->'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1336:2: kw= '..'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther3032); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1349:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1350:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1351:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3072);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3082); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1358:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1361:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1363:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3129);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==43) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred8_InternalServices()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==44) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred8_InternalServices()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1376:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1376:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1376:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1377:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1382:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1383:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1383:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1384:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3182);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1397:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1398:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1398:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1399:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3205);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1423:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1424:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1425:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3244);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3255); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1432:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1435:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1436:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1436:1: (kw= '+' | kw= '-' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            else if ( (LA21_0==44) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1437:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpAdd3293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1444:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpAdd3312); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1457:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1458:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1459:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3352);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3362); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1466:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1469:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1470:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1470:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1471:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3409);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA22_2 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA22_4 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA22_5 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt22=1;
                    }


                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1485:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1490:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1491:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1491:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1492:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3462);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1505:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1506:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1506:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1507:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3485);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1531:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1532:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1533:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3524);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3535); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1540:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1543:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1544:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1544:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 47:
                {
                alt23=3;
                }
                break;
            case 48:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1545:2: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti3573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1552:2: kw= '**'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti3592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1559:2: kw= '/'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti3611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1566:2: kw= '%'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpMulti3630); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1579:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1580:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1581:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3670);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3680); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1588:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1591:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=43 && LA24_0<=44)||LA24_0==49) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_DECIMAL)||LA24_0==15||LA24_0==20||LA24_0==26||LA24_0==40||LA24_0==56||LA24_0==58||(LA24_0>=61 && LA24_0<=63)||LA24_0==66||(LA24_0>=68 && LA24_0<=75)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:3: ()
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1593:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1598:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1599:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1599:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1600:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3738);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1613:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1614:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1614:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1615:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3759);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1633:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3788);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1649:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1650:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1651:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3824);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3835); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1658:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1661:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1662:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1662:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt25=1;
                }
                break;
            case 44:
                {
                alt25=2;
                }
                break;
            case 43:
                {
                alt25=3;
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1663:2: kw= '!'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpUnary3873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1670:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary3892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1677:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary3911); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1690:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1691:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1692:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3951);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3961); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1699:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1702:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1703:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1703:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1704:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4008);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred10_InternalServices()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1714:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1714:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1714:6: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1715:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXCastedExpression4043); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1724:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1725:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1725:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1726:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4066);
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
            	    break loop26;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1750:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1751:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1752:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4104);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4114); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1759:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1762:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1763:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1763:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1764:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4161);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop34:
            do {
                int alt34=3;
                switch ( input.LA(1) ) {
                case 51:
                    {
                    int LA34_2 = input.LA(2);

                    if ( (synpred11_InternalServices()) ) {
                        alt34=1;
                    }
                    else if ( (synpred12_InternalServices()) ) {
                        alt34=2;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA34_3 = input.LA(2);

                    if ( (synpred12_InternalServices()) ) {
                        alt34=2;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA34_4 = input.LA(2);

                    if ( (synpred12_InternalServices()) ) {
                        alt34=2;
                    }


                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1778:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1778:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1778:26: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1779:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall4210); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1788:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1789:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1789:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1790:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4233);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4249);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1811:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1812:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1812:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1813:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4271);
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
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1846:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1846:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1846:8: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1847:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1852:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 51:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 53:
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
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1852:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall4357); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1857:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1857:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1858:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1858:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1859:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall4381); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1873:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1873:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1875:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall4418); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1888:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==40) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1888:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4447); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1892:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1893:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1893:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1894:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4468);
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

            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1910:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==17) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1910:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4481); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1914:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1915:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1915:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1916:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4502);
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
            	            	    break loop28;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4516); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1936:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1937:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1937:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1938:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4541);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1951:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt32=2;
            	    alt32 = dfa32.predict(input);
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1951:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1951:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1951:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1958:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1959:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall4575); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt31=3;
            	            alt31 = dfa31.predict(input);
            	            switch (alt31) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1989:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1990:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4660);
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
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2007:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2007:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2007:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2007:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2008:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2008:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2009:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4688);
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

            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2025:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop30:
            	                    do {
            	                        int alt30=2;
            	                        int LA30_0 = input.LA(1);

            	                        if ( (LA30_0==17) ) {
            	                            alt30=1;
            	                        }


            	                        switch (alt30) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2025:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4701); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2029:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2030:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2030:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2031:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4722);
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
            	                    	    break loop30;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4739); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt33=2;
            	    alt33 = dfa33.predict(input);
            	    switch (alt33) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2056:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2057:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4772);
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
            	    break loop34;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2081:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2082:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2083:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4812);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4822); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2090:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2093:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2094:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2094:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt35=13;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt35=1;
                }
                break;
            case 15:
                {
                alt35=2;
                }
                break;
            case 58:
                {
                alt35=3;
                }
                break;
            case RULE_ID:
            case 40:
            case 66:
                {
                alt35=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 20:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt35=5;
                }
                break;
            case 56:
                {
                alt35=6;
                }
                break;
            case 61:
                {
                alt35=7;
                }
                break;
            case 62:
                {
                alt35=8;
                }
                break;
            case 63:
                {
                alt35=9;
                }
                break;
            case 73:
                {
                alt35=10;
                }
                break;
            case 74:
                {
                alt35=11;
                }
                break;
            case 75:
                {
                alt35=12;
                }
                break;
            case 26:
                {
                alt35=13;
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2095:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4869);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2105:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4896);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2115:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4923);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2125:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4950);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2135:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4977);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2145:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5004);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2155:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5031);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2165:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5058);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2175:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5085);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2185:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5112);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2195:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5139);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2205:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5166);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2215:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5193);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2231:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2232:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2233:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5228);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5238); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2240:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2243:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2244:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2244:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt36=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt36=1;
                }
                break;
            case 69:
            case 70:
                {
                alt36=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt36=3;
                }
                break;
            case 71:
                {
                alt36=4;
                }
                break;
            case RULE_STRING:
                {
                alt36=5;
                }
                break;
            case 72:
                {
                alt36=6;
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2245:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5285);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2255:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5312);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2265:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5339);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2275:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5366);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2285:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5393);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2295:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5420);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2311:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2312:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2313:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5455);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5465); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2320:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2323:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2324:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2324:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2324:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2324:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2325:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleXClosure5511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2349:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2349:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2349:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID||LA38_0==26||LA38_0==78) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2349:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2349:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2350:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2350:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2351:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5582);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2367:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==17) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2367:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXClosure5595); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2371:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2372:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2372:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2373:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5616);
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
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2389:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2390:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2390:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2391:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,54,FOLLOW_54_in_ruleXClosure5638); if (state.failed) return current;
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2404:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2405:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2405:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2406:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5675);
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

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXClosure5687); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2434:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2435:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2436:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5723);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5733); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2443:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2446:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2447:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2447:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2447:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2447:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2448:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2453:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_DECIMAL)||LA41_0==15||LA41_0==20||LA41_0==26||LA41_0==40||(LA41_0>=43 && LA41_0<=44)||LA41_0==49||LA41_0==56||LA41_0==58||(LA41_0>=61 && LA41_0<=66)||(LA41_0>=68 && LA41_0<=75)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2453:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2453:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2454:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2454:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2455:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5789);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2471:2: (otherlv_2= ';' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==55) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2471:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleXExpressionInClosure5802); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2483:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2484:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2485:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5842);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5852); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2492:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2495:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2496:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2496:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2496:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2496:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2496:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2512:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2512:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2512:7: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2513:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2518:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==26||LA43_0==78) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2518:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2518:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2519:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2519:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2520:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5960);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2536:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==17) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2536:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXShortClosure5973); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2540:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2541:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2541:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2542:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5994);
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
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2558:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2559:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2559:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2560:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,54,FOLLOW_54_in_ruleXShortClosure6016); if (state.failed) return current;
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2573:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2574:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2574:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2575:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6052);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2599:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2600:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2601:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6088);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6098); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2611:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2612:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2612:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2612:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleXParenthesizedExpression6135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6157);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXParenthesizedExpression6168); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2637:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2638:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2639:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6204);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6214); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2646:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2649:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2650:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2650:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2650:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2650:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2651:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXIfExpression6260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXIfExpression6272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2664:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2665:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2665:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2666:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6293);
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

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXIfExpression6305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2686:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2687:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2687:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2688:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6326);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2704:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==57) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred18_InternalServices()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2704:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2704:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2704:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleXIfExpression6347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2709:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2710:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2710:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2711:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6369);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2735:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2736:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2737:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6407);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6417); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2744:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2747:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2749:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_DECIMAL)||LA46_0==15||LA46_0==20||LA46_0==40||(LA46_0>=43 && LA46_0<=44)||LA46_0==49||LA46_0==56||LA46_0==58||(LA46_0>=61 && LA46_0<=63)||LA46_0==66||(LA46_0>=68 && LA46_0<=75)) ) {
                alt46=1;
            }
            else if ( (LA46_0==26) ) {
                int LA46_2 = input.LA(2);

                if ( (LA46_2==RULE_ID) ) {
                    int LA46_3 = input.LA(3);

                    if ( (LA46_3==28) && (synpred20_InternalServices())) {
                        alt46=2;
                    }
                    else if ( (LA46_3==20||(LA46_3>=26 && LA46_3<=27)||(LA46_3>=30 && LA46_3<=48)||(LA46_3>=50 && LA46_3<=53)||LA46_3==67) ) {
                        alt46=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA46_2>=RULE_STRING && LA46_2<=RULE_DECIMAL)||LA46_2==15||LA46_2==20||LA46_2==26||LA46_2==40||(LA46_2>=43 && LA46_2<=44)||LA46_2==49||LA46_2==56||LA46_2==58||(LA46_2>=61 && LA46_2<=63)||LA46_2==66||(LA46_2>=68 && LA46_2<=75)) ) {
                    alt46=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID) ) {
                        int LA45_1 = input.LA(2);

                        if ( (LA45_1==28) && (synpred19_InternalServices())) {
                            alt45=1;
                        }
                    }
                    switch (alt45) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2763:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2763:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2763:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2764:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2764:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2765:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6506);
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

                            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXSwitchExpression6518); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2785:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2786:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2786:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2787:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6542);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2810:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2810:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleXSwitchExpression6586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2814:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2815:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2815:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2816:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6607);
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

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXSwitchExpression6619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2836:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2837:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2837:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2838:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6642);
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

                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleXSwitchExpression6654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression6668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2862:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==26||LA47_0==28||LA47_0==60||LA47_0==78) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2863:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2863:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2864:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6689);
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
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2880:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2880:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression6703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleXSwitchExpression6715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2888:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2889:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2889:1: (lv_default_14_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2890:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6736);
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

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression6750); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2918:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2919:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2920:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6786);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6796); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2927:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2930:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2931:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2931:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2931:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2931:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==26||LA49_0==78) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2932:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2932:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2933:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6842);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2949:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==60) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2949:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXCasePart6856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2953:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2954:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2954:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2955:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6877);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXCasePart6891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2975:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2976:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2976:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2977:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6912);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3001:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3002:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3003:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6948);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6958); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3010:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3013:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3014:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3014:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3014:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3014:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3015:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXForLoopExpression7004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXForLoopExpression7016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3028:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3029:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3029:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3030:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7037);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXForLoopExpression7049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3050:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3051:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3051:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3052:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7070);
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

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXForLoopExpression7082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3072:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3073:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3073:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3074:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7103);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3098:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3099:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3100:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7139);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7149); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3107:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3110:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3111:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3111:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3111:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3111:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3112:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXWhileExpression7195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXWhileExpression7207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3125:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3126:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3126:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3127:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7228);
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

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXWhileExpression7240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3147:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3148:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3148:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3149:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7261);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3173:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3174:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3175:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7297);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7307); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3182:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3185:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3186:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3186:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3186:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3186:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3187:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression7353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3196:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3197:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3197:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3198:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7374);
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

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleXDoWhileExpression7398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3222:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3223:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3223:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3224:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7419);
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

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXDoWhileExpression7431); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3252:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3253:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3254:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7467);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7477); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3261:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3264:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3265:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3265:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3265:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3265:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3266:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression7523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3275:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_DECIMAL)||LA52_0==15||LA52_0==20||LA52_0==26||LA52_0==40||(LA52_0>=43 && LA52_0<=44)||LA52_0==49||LA52_0==56||LA52_0==58||(LA52_0>=61 && LA52_0<=66)||(LA52_0>=68 && LA52_0<=75)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3275:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3275:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3276:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3276:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3277:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7545);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3293:2: (otherlv_3= ';' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==55) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3293:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression7558); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXBlockExpression7574); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3309:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3310:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3311:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7610);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7620); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3318:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3321:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3322:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3322:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=64 && LA53_0<=65)) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_DECIMAL)||LA53_0==15||LA53_0==20||LA53_0==26||LA53_0==40||(LA53_0>=43 && LA53_0<=44)||LA53_0==49||LA53_0==56||LA53_0==58||(LA53_0>=61 && LA53_0<=63)||LA53_0==66||(LA53_0>=68 && LA53_0<=75)) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3323:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7667);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3333:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7694);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3349:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3350:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3351:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7729);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7739); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3358:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3361:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3362:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3362:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3362:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3362:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3363:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3368:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==64) ) {
                alt54=1;
            }
            else if ( (LA54_0==65) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3368:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3368:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3369:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3369:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3370:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration7792); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3384:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration7823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred21_InternalServices()) ) {
                    alt55=1;
                }
                else if ( (true) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA55_0==26) && (synpred21_InternalServices())) {
                alt55=1;
            }
            else if ( (LA55_0==78) && (synpred21_InternalServices())) {
                alt55=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3396:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3396:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3396:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3397:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3397:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3398:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7871);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3414:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3415:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3415:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3416:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7892);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3433:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3433:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3434:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3434:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3435:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7921);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3451:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==30) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3451:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleXVariableDeclaration7935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3455:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3456:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3456:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3457:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7956);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3481:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3482:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3483:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7994);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8004); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3490:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3493:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3494:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3494:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3494:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3494:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==RULE_ID||LA57_1==20||LA57_1==40||LA57_1==51) ) {
                    alt57=1;
                }
            }
            else if ( (LA57_0==26||LA57_0==78) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3495:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3495:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3496:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8050);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3512:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3513:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3513:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3514:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8072);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3538:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3539:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3540:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8108);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8118); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3547:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3550:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3551:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3551:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3551:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3551:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3552:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3552:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3553:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8164);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3569:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3570:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3570:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3571:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8185);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3595:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3596:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3597:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8221);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8231); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3604:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3607:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3608:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3608:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3608:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3608:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3614:2: ( ( ruleStaticQualifier ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==67) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3615:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3615:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3616:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8288);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3629:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==40) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3629:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall8302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3633:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3634:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3634:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3635:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8323);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3651:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==17) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3651:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall8336); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3655:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3656:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3656:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3657:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8357);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall8371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3677:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3678:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3678:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3679:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8396);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3692:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3692:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3692:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3692:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3699:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3700:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall8430); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt62=3;
                    alt62 = dfa62.predict(input);
                    switch (alt62) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3730:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3731:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8515);
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3748:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3748:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3748:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3748:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3749:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3749:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3750:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8543);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3766:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==17) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3766:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall8556); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3770:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3771:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3771:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3772:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8577);
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
                            	    break loop61;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall8594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3792:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3792:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3797:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3798:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8627);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3822:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3823:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3824:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8665);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8676); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3831:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3834:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3835:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3835:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            else if ( (LA65_0==66) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8723);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3848:2: kw= 'super'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleIdOrSuper8747); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3861:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3862:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3863:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8788);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8799); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3870:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3873:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3874:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3874:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    int LA66_2 = input.LA(2);

                    if ( (LA66_2==67) ) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3875:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8846);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleStaticQualifier8864); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3899:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3900:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3901:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8905);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8915); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3908:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3911:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3912:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3912:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3912:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3912:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3913:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXConstructorCall8961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3922:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3923:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3923:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3924:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8984);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3937:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3937:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3937:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3937:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall9005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3942:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3943:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3943:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3944:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9027);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3960:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==17) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3960:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall9040); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3964:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3965:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3965:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3966:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9061);
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
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall9075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3986:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3986:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3986:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3986:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall9098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt70=3;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4008:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4009:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9171);
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4026:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4026:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4026:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4026:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4027:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4027:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4028:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9199);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4044:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==17) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4044:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall9212); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4048:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4049:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4049:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4050:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9233);
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
                            	    break loop69;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall9250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4070:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4070:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4075:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4076:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9283);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4100:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4101:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4102:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9320);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9330); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4109:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4112:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4113:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4113:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4113:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4113:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4114:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4119:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==69) ) {
                alt73=1;
            }
            else if ( (LA73_0==70) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4119:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4124:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4124:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4125:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4125:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4126:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9401); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4147:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4148:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4149:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9451);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9461); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4156:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4159:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4160:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4160:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4160:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4160:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4161:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXNullLiteral9507); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4178:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4179:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4180:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9543);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9553); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4187:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4190:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4191:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4191:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4191:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4191:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4192:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4197:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4198:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4198:1: (lv_value_1_0= ruleNumber )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4199:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9608);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4223:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4224:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4225:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9644);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9654); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4232:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4235:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4236:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4236:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4236:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4236:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4237:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4242:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4243:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4243:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4244:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9705); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4268:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4269:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4270:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9746);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9756); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4277:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4280:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4281:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4281:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4281:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4281:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4282:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTypeLiteral9802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXTypeLiteral9814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4295:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4296:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4296:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4297:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9837);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXTypeLiteral9849); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4322:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4323:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4324:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9885);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9895); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4331:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4335:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4335:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4335:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4335:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4336:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXThrowExpression9941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4345:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4346:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4346:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4347:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9962);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4371:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4372:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4373:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9998);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10008); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4380:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4383:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4384:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4384:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4384:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4384:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4385:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXReturnExpression10054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4394:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4394:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4399:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4400:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10085);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4424:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4425:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4426:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10122);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10132); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4433:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4436:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4437:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4437:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4437:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4437:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4438:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4447:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4448:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4448:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4449:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10199);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4465:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==77) ) {
                alt77=1;
            }
            else if ( (LA77_0==76) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4465:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4465:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4465:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4465:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==77) ) {
                            int LA75_2 = input.LA(2);

                            if ( (synpred30_InternalServices()) ) {
                                alt75=1;
                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4465:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4467:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4468:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10229);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4484:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==76) ) {
                        int LA76_1 = input.LA(2);

                        if ( (synpred31_InternalServices()) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4484:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4484:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4484:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10251); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4489:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4490:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4490:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4491:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10273);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4508:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4508:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4508:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4512:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4513:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4513:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4514:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10316);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4538:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4539:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4540:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10354);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10364); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4547:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4550:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4551:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4551:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4551:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4551:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4551:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleXCatchClause10409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleXCatchClause10422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4560:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4561:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4561:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4562:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10443);
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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleXCatchClause10455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4582:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4583:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4583:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4584:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10476);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4608:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4609:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4610:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10513);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10524); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4617:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4620:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4621:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4621:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4622:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10571);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4632:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==51) ) {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==RULE_ID) ) {
                        int LA78_3 = input.LA(3);

                        if ( (synpred33_InternalServices()) ) {
                            alt78=1;
                        }


                    }


                }


                switch (alt78) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4632:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4632:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4632:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,51,FOLLOW_51_in_ruleQualifiedName10599); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10622);
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


    // $ANTLR start "entryRuleNumber"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4659:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4663:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4664:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10676);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10687); if (state.failed) return current;

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4674:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4678:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4679:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4679:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_HEX) ) {
                alt82=1;
            }
            else if ( ((LA82_0>=RULE_INT && LA82_0<=RULE_DECIMAL)) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4679:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4687:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4687:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4687:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4687:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4687:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10759); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4695:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10785); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4702:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==51) ) {
                        int LA81_1 = input.LA(2);

                        if ( ((LA81_1>=RULE_INT && LA81_1<=RULE_DECIMAL)) ) {
                            alt81=1;
                        }
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4703:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,51,FOLLOW_51_in_ruleNumber10805); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4708:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4708:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10821); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4716:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10847); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4734:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4735:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4736:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10900);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10910); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4743:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4746:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4747:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4747:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                alt84=1;
            }
            else if ( (LA84_0==26||LA84_0==78) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4747:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4747:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4748:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10958);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4756:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==20) ) {
                            int LA83_2 = input.LA(2);

                            if ( (LA83_2==25) ) {
                                int LA83_3 = input.LA(3);

                                if ( (synpred34_InternalServices()) ) {
                                    alt83=1;
                                }


                            }


                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4756:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4759:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4759:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4759:6: ()
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4760:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleJvmTypeReference10996); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleJvmTypeReference11008); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4775:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11040);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4791:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4792:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4793:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11075);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11085); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4800:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4803:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4804:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4804:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4804:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4804:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==26) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4804:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleXFunctionTypeRef11123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4808:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_ID||LA86_0==26||LA86_0==78) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4808:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4808:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4809:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4809:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4810:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11145);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4826:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop85:
                            do {
                                int alt85=2;
                                int LA85_0 = input.LA(1);

                                if ( (LA85_0==17) ) {
                                    alt85=1;
                                }


                                switch (alt85) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4826:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleXFunctionTypeRef11158); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4830:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4831:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4831:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4832:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11179);
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
                            	    break loop85;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXFunctionTypeRef11195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleXFunctionTypeRef11209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4856:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4857:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4857:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4858:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11230);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4882:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4883:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4884:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11266);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11276); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4891:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4894:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4895:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4895:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4895:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4895:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4896:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4896:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4897:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11324);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4910:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4910:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4910:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4910:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleJvmParameterizedTypeReference11345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4915:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4916:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4916:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4917:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11367);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4933:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==17) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4933:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleJvmParameterizedTypeReference11380); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4937:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4938:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4938:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4939:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11401);
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
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleJvmParameterizedTypeReference11415); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4967:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4968:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4969:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11453);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11463); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4976:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4979:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4980:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4980:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID||LA90_0==26||LA90_0==78) ) {
                alt90=1;
            }
            else if ( (LA90_0==79) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4981:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11510);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4991:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11537);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5007:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5008:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5009:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11572);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11582); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5016:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5019:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5020:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5020:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5020:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5020:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5021:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleJvmWildcardTypeReference11628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5030:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt91=3;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==80) ) {
                alt91=1;
            }
            else if ( (LA91_0==66) ) {
                alt91=2;
            }
            switch (alt91) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5030:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5030:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5031:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5031:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5032:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11650);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5049:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5049:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5050:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5050:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5051:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11677);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5075:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5076:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5077:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11715);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11725); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5084:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5087:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5088:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5088:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5088:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBound11762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5092:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5093:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5093:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5094:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11783);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5118:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5119:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5120:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11819);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11829); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5127:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5130:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBoundAnded11866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5135:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5136:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5136:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5137:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11887);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5161:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5162:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5163:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11923);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11933); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5170:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5173:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5174:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5174:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5174:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleJvmLowerBound11970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5178:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5179:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5179:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5180:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11991);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5206:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5207:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5208:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12030);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12041); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5215:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5218:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5219:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12080); if (state.failed) return current;
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:672:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:672:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:672:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:672:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:672:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:673:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:673:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:674:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:674:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:675:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalServices1338);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:800:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:800:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:800:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:800:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:800:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:801:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:801:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:802:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:802:1: ( ruleOpOr )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:803:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalServices1686);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:901:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:901:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:901:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:901:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:901:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:902:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:902:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:903:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:903:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:904:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalServices1945);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1003:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1003:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1004:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1004:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1005:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalServices2204);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1111:1: 
        {
        }

        match(input,36,FOLLOW_36_in_synpred5_InternalServices2480); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalServices

    // $ANTLR start synpred6_InternalServices
    public final void synpred6_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:10: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1142:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1142:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1143:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1143:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1144:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalServices2551);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1263:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1263:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1263:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1263:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1263:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1264:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1264:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1265:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1265:1: ( ruleOpOther )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1266:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalServices2870);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1372:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1372:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1373:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1373:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1374:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalServices3150);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1480:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1480:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1481:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1481:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1482:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalServices3430);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:4: ( () 'as' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:5: () 'as'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1713:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred10_InternalServices4024); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalServices

    // $ANTLR start synpred11_InternalServices
    public final void synpred11_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1772:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1773:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred11_InternalServices4178); if (state.failed) return ;
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1774:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1775:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1775:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1776:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalServices4187);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalServices4193);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalServices

    // $ANTLR start synpred12_InternalServices
    public final void synpred12_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:10: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1831:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1831:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt92=3;
        switch ( input.LA(1) ) {
        case 51:
            {
            alt92=1;
            }
            break;
        case 52:
            {
            alt92=2;
            }
            break;
        case 53:
            {
            alt92=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 92, 0, input);

            throw nvae;
        }

        switch (alt92) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1831:4: '.'
                {
                match(input,51,FOLLOW_51_in_synpred12_InternalServices4296); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1833:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1833:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1834:1: ( '?.' )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1834:1: ( '?.' )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1835:2: '?.'
                {
                match(input,52,FOLLOW_52_in_synpred12_InternalServices4310); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1840:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1840:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1841:1: ( '*.' )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1841:1: ( '*.' )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1842:2: '*.'
                {
                match(input,53,FOLLOW_53_in_synpred12_InternalServices4330); if (state.failed) return ;

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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1951:4: ( ( '(' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1952:1: ( '(' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1952:1: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1953:2: '('
        {
        match(input,26,FOLLOW_26_in_synpred13_InternalServices4557); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalServices

    // $ANTLR start synpred14_InternalServices
    public final void synpred14_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1973:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1973:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==26||LA94_0==78) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1973:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1973:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1974:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1974:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1975:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4609);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1977:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==17) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1977:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred14_InternalServices4616); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1978:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1979:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1979:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1980:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4623);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1982:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1983:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1983:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1984:2: '|'
        {
        match(input,54,FOLLOW_54_in_synpred14_InternalServices4637); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalServices

    // $ANTLR start synpred15_InternalServices
    public final void synpred15_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2052:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2052:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2053:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalServices4755);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalServices

    // $ANTLR start synpred16_InternalServices
    public final void synpred16_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==26||LA96_0==78) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:5: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2335:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2335:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2336:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5528);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2338:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==17) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2338:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred16_InternalServices5535); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2339:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2340:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2340:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2341:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5542);
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

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2343:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2344:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2344:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2345:2: '|'
        {
        match(input,54,FOLLOW_54_in_synpred16_InternalServices5556); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalServices

    // $ANTLR start synpred18_InternalServices
    public final void synpred18_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2704:4: ( 'else' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2704:6: 'else'
        {
        match(input,57,FOLLOW_57_in_synpred18_InternalServices6339); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalServices

    // $ANTLR start synpred19_InternalServices
    public final void synpred19_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2758:6: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2759:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2759:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2760:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalServices6481);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,28,FOLLOW_28_in_synpred19_InternalServices6487); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalServices

    // $ANTLR start synpred20_InternalServices
    public final void synpred20_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,26,FOLLOW_26_in_synpred20_InternalServices6563); if (state.failed) return ;
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2805:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2806:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2806:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2807:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalServices6570);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,28,FOLLOW_28_in_synpred20_InternalServices6576); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalServices

    // $ANTLR start synpred21_InternalServices
    public final void synpred21_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3389:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3389:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3390:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred21_InternalServices7841);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3392:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3393:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3393:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3394:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalServices7850);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3692:4: ( ( '(' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3693:1: ( '(' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3693:1: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3694:2: '('
        {
        match(input,26,FOLLOW_26_in_synpred22_InternalServices8412); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalServices

    // $ANTLR start synpred23_InternalServices
    public final void synpred23_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3714:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3714:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==RULE_ID||LA100_0==26||LA100_0==78) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3714:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3714:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3715:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3715:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3716:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8464);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3718:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop99:
                do {
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==17) ) {
                        alt99=1;
                    }


                    switch (alt99) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3718:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred23_InternalServices8471); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3719:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3720:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3720:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3721:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8478);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop99;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3723:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3724:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3724:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3725:2: '|'
        {
        match(input,54,FOLLOW_54_in_synpred23_InternalServices8492); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalServices

    // $ANTLR start synpred24_InternalServices
    public final void synpred24_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3792:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3793:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3793:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3794:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred24_InternalServices8610);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalServices

    // $ANTLR start synpred25_InternalServices
    public final void synpred25_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3937:4: ( '<' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3937:6: '<'
        {
        match(input,40,FOLLOW_40_in_synpred25_InternalServices8997); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalServices

    // $ANTLR start synpred26_InternalServices
    public final void synpred26_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3986:5: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3986:7: '('
        {
        match(input,26,FOLLOW_26_in_synpred26_InternalServices9090); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalServices

    // $ANTLR start synpred27_InternalServices
    public final void synpred27_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3992:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3992:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==26||LA102_0==78) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3992:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3992:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3993:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3993:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3994:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9120);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3996:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==17) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3996:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,17,FOLLOW_17_in_synpred27_InternalServices9127); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3997:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3998:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3998:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3999:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9134);
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

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4001:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4002:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4002:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4003:2: '|'
        {
        match(input,54,FOLLOW_54_in_synpred27_InternalServices9148); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalServices

    // $ANTLR start synpred28_InternalServices
    public final void synpred28_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4070:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4071:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4071:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4072:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred28_InternalServices9266);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalServices

    // $ANTLR start synpred29_InternalServices
    public final void synpred29_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4394:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4395:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4395:1: ( ruleXExpression )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4396:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred29_InternalServices10068);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalServices

    // $ANTLR start synpred30_InternalServices
    public final void synpred30_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4465:5: ( 'catch' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4465:7: 'catch'
        {
        match(input,77,FOLLOW_77_in_synpred30_InternalServices10213); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalServices

    // $ANTLR start synpred31_InternalServices
    public final void synpred31_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4484:5: ( 'finally' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4484:7: 'finally'
        {
        match(input,76,FOLLOW_76_in_synpred31_InternalServices10243); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalServices

    // $ANTLR start synpred33_InternalServices
    public final void synpred33_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4632:3: ( '.' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4633:2: '.'
        {
        match(input,51,FOLLOW_51_in_synpred33_InternalServices10590); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalServices

    // $ANTLR start synpred34_InternalServices
    public final void synpred34_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4756:2: ( ( () '[' ']' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4756:3: ( () '[' ']' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4756:3: ( () '[' ']' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4756:4: () '[' ']'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4756:4: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4757:1: 
        {
        }

        match(input,20,FOLLOW_20_in_synpred34_InternalServices10973); if (state.failed) return ;
        match(input,25,FOLLOW_25_in_synpred34_InternalServices10977); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalServices

    // $ANTLR start synpred35_InternalServices
    public final void synpred35_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4910:4: ( '<' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4910:6: '<'
        {
        match(input,40,FOLLOW_40_in_synpred35_InternalServices11337); if (state.failed) return ;

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


    protected DFA32 dfa32 = new DFA32(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA89 dfa89 = new DFA89(this);
    static final String DFA32_eotS =
        "\76\uffff";
    static final String DFA32_eofS =
        "\1\2\75\uffff";
    static final String DFA32_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA32_maxS =
        "\1\116\1\0\74\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA32_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\1\2"+
            "\2\2\uffff\27\2\1\uffff\14\2\1\uffff\13\2",
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
            return "1951:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred13_InternalServices()) ) {s = 61;}

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
    static final String DFA31_eotS =
        "\36\uffff";
    static final String DFA31_eofS =
        "\36\uffff";
    static final String DFA31_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA31_maxS =
        "\1\116\2\0\33\uffff";
    static final String DFA31_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA31_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\4\5\6\uffff\1\5\4\uffff\1\5\5\uffff\1\2\1\35\14\uffff"+
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
            return "1972:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_0 = input.LA(1);

                         
                        int index31_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_0==RULE_ID) ) {s = 1;}

                        else if ( (LA31_0==26) ) {s = 2;}

                        else if ( (LA31_0==78) && (synpred14_InternalServices())) {s = 3;}

                        else if ( (LA31_0==54) && (synpred14_InternalServices())) {s = 4;}

                        else if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_DECIMAL)||LA31_0==15||LA31_0==20||LA31_0==40||(LA31_0>=43 && LA31_0<=44)||LA31_0==49||LA31_0==56||LA31_0==58||(LA31_0>=61 && LA31_0<=63)||LA31_0==66||(LA31_0>=68 && LA31_0<=75)) ) {s = 5;}

                        else if ( (LA31_0==27) ) {s = 29;}

                         
                        input.seek(index31_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_2);
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
            "\5\2\6\uffff\1\2\1\uffff\2\2\1\uffff\1\1\4\uffff\4\2\2\uffff"+
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
            return "2051:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalServices()) ) {s = 61;}

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
    static final String DFA39_eotS =
        "\40\uffff";
    static final String DFA39_eofS =
        "\40\uffff";
    static final String DFA39_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA39_maxS =
        "\1\116\2\0\35\uffff";
    static final String DFA39_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA39_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\4\5\6\uffff\1\5\4\uffff\1\5\4\uffff\1\5\1\2\15\uffff\1"+
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2334:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_0 = input.LA(1);

                         
                        int index39_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_0==RULE_ID) ) {s = 1;}

                        else if ( (LA39_0==26) ) {s = 2;}

                        else if ( (LA39_0==78) && (synpred16_InternalServices())) {s = 3;}

                        else if ( (LA39_0==54) && (synpred16_InternalServices())) {s = 4;}

                        else if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_DECIMAL)||LA39_0==15||LA39_0==20||LA39_0==25||LA39_0==40||(LA39_0>=43 && LA39_0<=44)||LA39_0==49||LA39_0==56||LA39_0==58||(LA39_0>=61 && LA39_0<=66)||(LA39_0>=68 && LA39_0<=75)) ) {s = 5;}

                         
                        input.seek(index39_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
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
        "\1\116\1\0\74\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA63_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\1\2"+
            "\2\2\uffff\27\2\1\uffff\14\2\1\uffff\13\2",
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
            return "3692:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred22_InternalServices()) ) {s = 61;}

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
    static final String DFA62_eotS =
        "\36\uffff";
    static final String DFA62_eofS =
        "\36\uffff";
    static final String DFA62_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA62_maxS =
        "\1\116\2\0\33\uffff";
    static final String DFA62_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA62_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\4\5\6\uffff\1\5\4\uffff\1\5\5\uffff\1\2\1\35\14\uffff"+
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
            return "3713:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==RULE_ID) ) {s = 1;}

                        else if ( (LA62_0==26) ) {s = 2;}

                        else if ( (LA62_0==78) && (synpred23_InternalServices())) {s = 3;}

                        else if ( (LA62_0==54) && (synpred23_InternalServices())) {s = 4;}

                        else if ( ((LA62_0>=RULE_STRING && LA62_0<=RULE_DECIMAL)||LA62_0==15||LA62_0==20||LA62_0==40||(LA62_0>=43 && LA62_0<=44)||LA62_0==49||LA62_0==56||LA62_0==58||(LA62_0>=61 && LA62_0<=63)||LA62_0==66||(LA62_0>=68 && LA62_0<=75)) ) {s = 5;}

                        else if ( (LA62_0==27) ) {s = 29;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index62_2);
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
            "\5\2\6\uffff\1\2\1\uffff\2\2\1\uffff\1\1\4\uffff\4\2\2\uffff"+
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
            return "3792:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred24_InternalServices()) ) {s = 61;}

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
    static final String DFA68_eotS =
        "\76\uffff";
    static final String DFA68_eofS =
        "\1\2\75\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA68_maxS =
        "\1\116\1\0\74\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\2\2\1\uffff\1\2\4\uffff\4\2\2\uffff"+
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

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3937:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
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
        "\1\116\1\0\74\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA71_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\1\2"+
            "\2\2\uffff\27\2\1\uffff\14\2\1\uffff\13\2",
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
            return "3986:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalServices()) ) {s = 61;}

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
    static final String DFA70_eotS =
        "\36\uffff";
    static final String DFA70_eofS =
        "\36\uffff";
    static final String DFA70_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA70_maxS =
        "\1\116\2\0\33\uffff";
    static final String DFA70_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA70_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\4\5\6\uffff\1\5\4\uffff\1\5\5\uffff\1\2\1\35\14\uffff"+
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
            return "3991:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_0 = input.LA(1);

                         
                        int index70_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA70_0==RULE_ID) ) {s = 1;}

                        else if ( (LA70_0==26) ) {s = 2;}

                        else if ( (LA70_0==78) && (synpred27_InternalServices())) {s = 3;}

                        else if ( (LA70_0==54) && (synpred27_InternalServices())) {s = 4;}

                        else if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_DECIMAL)||LA70_0==15||LA70_0==20||LA70_0==40||(LA70_0>=43 && LA70_0<=44)||LA70_0==49||LA70_0==56||LA70_0==58||(LA70_0>=61 && LA70_0<=63)||LA70_0==66||(LA70_0>=68 && LA70_0<=75)) ) {s = 5;}

                        else if ( (LA70_0==27) ) {s = 29;}

                         
                        input.seek(index70_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_2);
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
            "\5\2\6\uffff\1\2\1\uffff\2\2\1\uffff\1\1\4\uffff\4\2\2\uffff"+
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
            return "4070:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalServices()) ) {s = 61;}

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
        "\76\uffff";
    static final String DFA74_eofS =
        "\1\33\75\uffff";
    static final String DFA74_minS =
        "\1\4\32\0\43\uffff";
    static final String DFA74_maxS =
        "\1\116\32\0\43\uffff";
    static final String DFA74_acceptS =
        "\33\uffff\1\2\41\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\43\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\6\uffff\1\6\1\uffff\2\33\1\uffff\1"+
            "\12\4\uffff\1\33\1\32\2\33\2\uffff\11\33\1\10\2\33\1\4\1\3\4"+
            "\33\1\2\4\33\1\uffff\1\33\1\23\1\33\1\7\2\33\1\24\1\25\1\26"+
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
            return "4394:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_10 = input.LA(1);

                         
                        int index74_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_11 = input.LA(1);

                         
                        int index74_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_13 = input.LA(1);

                         
                        int index74_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_14 = input.LA(1);

                         
                        int index74_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_15 = input.LA(1);

                         
                        int index74_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA74_16 = input.LA(1);

                         
                        int index74_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA74_17 = input.LA(1);

                         
                        int index74_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA74_18 = input.LA(1);

                         
                        int index74_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA74_19 = input.LA(1);

                         
                        int index74_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA74_20 = input.LA(1);

                         
                        int index74_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA74_21 = input.LA(1);

                         
                        int index74_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA74_22 = input.LA(1);

                         
                        int index74_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA74_23 = input.LA(1);

                         
                        int index74_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA74_24 = input.LA(1);

                         
                        int index74_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA74_25 = input.LA(1);

                         
                        int index74_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA74_26 = input.LA(1);

                         
                        int index74_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index74_26);
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
    static final String DFA89_eotS =
        "\77\uffff";
    static final String DFA89_eofS =
        "\1\2\76\uffff";
    static final String DFA89_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA89_maxS =
        "\1\116\1\0\75\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA89_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA89_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\4\2\4\uffff\4\2\2\uffff\11\2\1\1\15"+
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

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "4910:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_1 = input.LA(1);

                         
                        int index89_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalServices()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index89_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
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
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComponent233 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleComponent254 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_14_in_ruleComponent267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleComponent288 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent300 = new BitSet(new long[]{0x00000000000D0010L});
    public static final BitSet FOLLOW_16_in_ruleComponent313 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleRequireDeclaration_in_ruleComponent334 = new BitSet(new long[]{0x00000000000E0010L});
    public static final BitSet FOLLOW_17_in_ruleComponent347 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleRequireDeclaration_in_ruleComponent368 = new BitSet(new long[]{0x00000000000E0010L});
    public static final BitSet FOLLOW_ruleService_in_ruleComponent393 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_18_in_ruleComponent406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleService496 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService521 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_21_in_ruleService540 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22_in_ruleService577 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23_in_ruleService614 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24_in_ruleService651 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleService677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleService700 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService712 = new BitSet(new long[]{0x000000000C000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleService734 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleService747 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleService768 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_ruleService784 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleService796 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleService817 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleService838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequireDeclaration_in_entryRuleRequireDeclaration874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequireDeclaration884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleRequireDeclaration930 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequireDeclaration947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleImport1036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1251 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1267 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1317 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1370 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpSingleAssign1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMultiAssign1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1665 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1718 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1741 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOr1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1924 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1977 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2000 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAnd2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2183 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2236 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2259 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpEquality2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpEquality2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2463 = new BitSet(new long[]{0x000001F000000002L});
    public static final BitSet FOLLOW_36_in_ruleXRelationalExpression2499 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2522 = new BitSet(new long[]{0x000001F000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2583 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2606 = new BitSet(new long[]{0x000001F000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpCompare2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpCompare2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpCompare2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpCompare2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2849 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2902 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2925 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3129 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3182 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3205 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpAdd3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpAdd3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3409 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3462 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3485 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpMulti3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3738 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpUnary3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4008 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXCastedExpression4043 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4066 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4161 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall4210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4233 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4249 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4271 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall4357 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall4381 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall4418 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4447 = new BitSet(new long[]{0x0000000004000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4468 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4481 = new BitSet(new long[]{0x0000000004000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4502 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4541 = new BitSet(new long[]{0x0038000004100002L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall4575 = new BitSet(new long[]{0xE54219000C1081F0L,0x0000000000004FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4660 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4688 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4701 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4722 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4739 = new BitSet(new long[]{0x0038000000100002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4772 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleXClosure5511 = new BitSet(new long[]{0xE5421900061081F0L,0x0000000000004FF7L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5582 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXClosure5595 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5616 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_54_in_ruleXClosure5638 = new BitSet(new long[]{0xE5021900061081F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5675 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXClosure5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5789 = new BitSet(new long[]{0xE5821900041081F2L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_55_in_ruleXExpressionInClosure5802 = new BitSet(new long[]{0xE5021900041081F2L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5960 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXShortClosure5973 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5994 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_54_in_ruleXShortClosure6016 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleXParenthesizedExpression6135 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6157 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXParenthesizedExpression6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXIfExpression6260 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXIfExpression6272 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6293 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXIfExpression6305 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6326 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXIfExpression6347 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6463 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6506 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXSwitchExpression6518 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6542 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_26_in_ruleXSwitchExpression6586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6607 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXSwitchExpression6619 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6642 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXSwitchExpression6654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression6668 = new BitSet(new long[]{0x1000000014000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6689 = new BitSet(new long[]{0x1800000014040010L,0x0000000000004000L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression6703 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXSwitchExpression6715 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6736 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6842 = new BitSet(new long[]{0x1000000010000000L});
    public static final BitSet FOLLOW_60_in_ruleXCasePart6856 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6877 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXCasePart6891 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXForLoopExpression7004 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXForLoopExpression7016 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7037 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXForLoopExpression7049 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7070 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXForLoopExpression7082 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXWhileExpression7195 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXWhileExpression7207 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7228 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXWhileExpression7240 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression7353 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7374 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7386 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXDoWhileExpression7398 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7419 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXDoWhileExpression7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression7523 = new BitSet(new long[]{0xE5021900041481F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7545 = new BitSet(new long[]{0xE5821900041481F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression7558 = new BitSet(new long[]{0xE5021900041481F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_18_in_ruleXBlockExpression7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration7792 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration7823 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7892 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7921 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleXVariableDeclaration7935 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8288 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall8302 = new BitSet(new long[]{0x0000000004000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8323 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall8336 = new BitSet(new long[]{0x0000000004000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8357 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall8371 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8396 = new BitSet(new long[]{0x0000000004100002L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall8430 = new BitSet(new long[]{0xE54219000C1081F0L,0x0000000000004FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8515 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8543 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall8556 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8577 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall8594 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIdOrSuper8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStaticQualifier8864 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXConstructorCall8961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8984 = new BitSet(new long[]{0x0000010004100002L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall9005 = new BitSet(new long[]{0x0000000004000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9027 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall9040 = new BitSet(new long[]{0x0000000004000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9061 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall9075 = new BitSet(new long[]{0x0000000004100002L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall9098 = new BitSet(new long[]{0xE54219000C1081F0L,0x0000000000004FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9171 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9199 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall9212 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9233 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall9250 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXNullLiteral9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTypeLiteral9802 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXTypeLiteral9814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9837 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXTypeLiteral9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXThrowExpression9941 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXReturnExpression10054 = new BitSet(new long[]{0xE5021900041081F2L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10178 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10229 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10251 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10295 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXCatchClause10409 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXCatchClause10422 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10443 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXCatchClause10455 = new BitSet(new long[]{0xE5021900041081F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10571 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleQualifiedName10599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10622 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10759 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10785 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNumber10805 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10958 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleJvmTypeReference10996 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleJvmTypeReference11008 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleXFunctionTypeRef11123 = new BitSet(new long[]{0x000000000C000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11145 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleXFunctionTypeRef11158 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11179 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_ruleXFunctionTypeRef11195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleXFunctionTypeRef11209 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11324 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleJvmParameterizedTypeReference11345 = new BitSet(new long[]{0x0000000004000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11367 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_17_in_ruleJvmParameterizedTypeReference11380 = new BitSet(new long[]{0x0000000004000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11401 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_39_in_ruleJvmParameterizedTypeReference11415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmWildcardTypeReference11628 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010004L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBound11762 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBoundAnded11866 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleJvmLowerBound11970 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalServices1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalServices1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalServices1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalServices2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred5_InternalServices2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalServices2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalServices2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalServices3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalServices3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred10_InternalServices4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred11_InternalServices4178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalServices4187 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalServices4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred12_InternalServices4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred12_InternalServices4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred12_InternalServices4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred13_InternalServices4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4609 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_17_in_synpred14_InternalServices4616 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4623 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_54_in_synpred14_InternalServices4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalServices4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5528 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_17_in_synpred16_InternalServices5535 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5542 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_54_in_synpred16_InternalServices5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred18_InternalServices6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalServices6481 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred19_InternalServices6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred20_InternalServices6563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalServices6570 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred20_InternalServices6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred21_InternalServices7841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalServices7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred22_InternalServices8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8464 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_17_in_synpred23_InternalServices8471 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8478 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_54_in_synpred23_InternalServices8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred24_InternalServices8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred25_InternalServices8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred26_InternalServices9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9120 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_17_in_synpred27_InternalServices9127 = new BitSet(new long[]{0x0000000004000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9134 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_54_in_synpred27_InternalServices9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred28_InternalServices9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred29_InternalServices10068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred30_InternalServices10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred31_InternalServices10243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred33_InternalServices10590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred34_InternalServices10973 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred34_InternalServices10977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred35_InternalServices11337 = new BitSet(new long[]{0x0000000000000002L});

}