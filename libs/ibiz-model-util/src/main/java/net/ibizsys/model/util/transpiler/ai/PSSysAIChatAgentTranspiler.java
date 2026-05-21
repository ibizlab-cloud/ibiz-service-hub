package net.ibizsys.model.util.transpiler.ai;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.ai.PSSysAIChatAgentImpl.*;



public class PSSysAIChatAgentTranspiler extends net.ibizsys.model.util.transpiler.ai.PSSysAIFactoryObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.ai.PSSysAIChatAgentImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.ai.PSSysAIChatAgentImpl realPSModelObject = (net.ibizsys.model.ai.PSSysAIChatAgentImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aiplatformpsdefid", realPSModelObject.getAIPlatformPSDEField(), realPSModelObject, "getAIPlatformPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "aiplatformtype", realPSModelObject.getAIPlatformType(), realPSModelObject, "getAIPlatformType");
		this.setDomainValue(iPSModelTranspileContext, domain, "agentgrouptagspsdefid", realPSModelObject.getAgentGroupTagsPSDEField(), realPSModelObject, "getAgentGroupTagsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "agentinfo", realPSModelObject.getAgentInfo(), realPSModelObject, "getAgentInfo");
		this.setDomainValue(iPSModelTranspileContext, domain, "aichatagentparams", realPSModelObject.getAgentParams(), realPSModelObject, "getAgentParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "aichatagenttag", realPSModelObject.getAgentTag(), realPSModelObject, "getAgentTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "aichatagenttag2", realPSModelObject.getAgentTag2(), realPSModelObject, "getAgentTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "aichatagenttype", realPSModelObject.getAgentType(), realPSModelObject, "getAgentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcodepsdefid", realPSModelObject.getCustomCodePSDEField(), realPSModelObject, "getCustomCodePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflagpsdefid", realPSModelObject.getDefaultFlagPSDEField(), realPSModelObject, "getDefaultFlagPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "digestprompt", realPSModelObject.getDigestPrompt(), realPSModelObject, "getDigestPrompt");
		this.setDomainValue(iPSModelTranspileContext, domain, "dynamicmode", realPSModelObject.getDynamicMode(), realPSModelObject, "getDynamicMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablesearching", realPSModelObject.getEnableSearching(), realPSModelObject, "getEnableSearching");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablesearchingpsdefid", realPSModelObject.getEnableSearchingPSDEField(), realPSModelObject, "getEnableSearchingPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablesuggestedquestions", realPSModelObject.getEnableSuggestedQuestions(), realPSModelObject, "getEnableSuggestedQuestions");
		this.setDomainValue(iPSModelTranspileContext, domain, "esqpsdefid", realPSModelObject.getEnableSuggestedQuestionsPSDEField(), realPSModelObject, "getEnableSuggestedQuestionsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablethinking", realPSModelObject.getEnableThinking(), realPSModelObject, "getEnableThinking");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablethinkingpsdefid", realPSModelObject.getEnableThinkingPSDEField(), realPSModelObject, "getEnableThinkingPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "enabletools", realPSModelObject.getEnableTools(), realPSModelObject, "getEnableTools");
		this.setDomainValue(iPSModelTranspileContext, domain, "enabletoolspsdefid", realPSModelObject.getEnableToolsPSDEField(), realPSModelObject, "getEnableToolsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "generationmode", realPSModelObject.getGenerationMode(), realPSModelObject, "getGenerationMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "generationmodepsdefid", realPSModelObject.getGenerationModePSDEField(), realPSModelObject, "getGenerationModePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "kbmode", realPSModelObject.getKnowledgeBaseMode(), realPSModelObject, "getKnowledgeBaseMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "kbmodepsdefid", realPSModelObject.getKnowledgeBaseModePSDEField(), realPSModelObject, "getKnowledgeBaseModePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "kbtagspsdefid", realPSModelObject.getKnowledgeBaseTagsPSDEField(), realPSModelObject, "getKnowledgeBaseTagsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxinputtokens", realPSModelObject.getMaxInputTokens(), realPSModelObject, "getMaxInputTokens");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxinputtokenspsdefid", realPSModelObject.getMaxInputTokensPSDEField(), realPSModelObject, "getMaxInputTokensPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxtokens", realPSModelObject.getMaxTokens(), realPSModelObject, "getMaxTokens");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxtokenspsdefid", realPSModelObject.getMaxTokensPSDEField(), realPSModelObject, "getMaxTokensPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "memorydoctagpsdefid", realPSModelObject.getMemoryDocTagPSDEField(), realPSModelObject, "getMemoryDocTagPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "memoryisolationmode", realPSModelObject.getMemoryIsolationMode(), realPSModelObject, "getMemoryIsolationMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "memoryisolationmodepsdefid", realPSModelObject.getMemoryIsolationModePSDEField(), realPSModelObject, "getMemoryIsolationModePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "memorykbtagpsdefid", realPSModelObject.getMemoryKBTagPSDEField(), realPSModelObject, "getMemoryKBTagPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "memorymaxturns", realPSModelObject.getMemoryMaxTurns(), realPSModelObject, "getMemoryMaxTurns");
		this.setDomainValue(iPSModelTranspileContext, domain, "memorymaxturnspsdefid", realPSModelObject.getMemoryMaxTurnsPSDEField(), realPSModelObject, "getMemoryMaxTurnsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "memorymode", realPSModelObject.getMemoryMode(), realPSModelObject, "getMemoryMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "memorymodepsdefid", realPSModelObject.getMemoryModePSDEField(), realPSModelObject, "getMemoryModePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "memorypsdeid", realPSModelObject.getMemoryPSDataEntity(), realPSModelObject, "getMemoryPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "messagepsdeid", realPSModelObject.getMessagePSDataEntity(), realPSModelObject, "getMessagePSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "namepsdefid", realPSModelObject.getNamePSDEField(), realPSModelObject, "getNamePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "ossimagevlprompt", realPSModelObject.getOSSImageVLPrompt(), realPSModelObject, "getOSSImageVLPrompt");
		this.setDomainValue(iPSModelTranspileContext, domain, "ossimagevlpromptpsdefid", realPSModelObject.getOSSImageVLPromptPSDEField(), realPSModelObject, "getOSSImageVLPromptPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicid", realPSModelObject.getPSDELogic(), realPSModelObject, "getPSDELogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuniresid", realPSModelObject.getPSSysUniRes(), realPSModelObject, "getPSSysUniRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "publishskill", realPSModelObject.getPublishSkill(), realPSModelObject, "getPublishSkill");
		this.setDomainValue(iPSModelTranspileContext, domain, "publishskillpsdefid", realPSModelObject.getPublishSkillPSDEField(), realPSModelObject, "getPublishSkillPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "readme", realPSModelObject.getReadme(), realPSModelObject, "getReadme");
		this.setDomainValue(iPSModelTranspileContext, domain, "readmepsdefid", realPSModelObject.getReadmePSDEField(), realPSModelObject, "getReadmePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "sessionpsdeid", realPSModelObject.getSessionPSDataEntity(), realPSModelObject, "getSessionPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "loadskillmodepsdefid", realPSModelObject.getSkillLoadModePSDEField(), realPSModelObject, "getSkillLoadModePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "skillprompt", realPSModelObject.getSkillPrompt(), realPSModelObject, "getSkillPrompt");
		this.setDomainValue(iPSModelTranspileContext, domain, "skillpromptpsdefid", realPSModelObject.getSkillPromptPSDEField(), realPSModelObject, "getSkillPromptPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "skilltagspsdefid", realPSModelObject.getSkillTagsPSDEField(), realPSModelObject, "getSkillTagsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "stream", realPSModelObject.getStream(), realPSModelObject, "getStream");
		this.setDomainValue(iPSModelTranspileContext, domain, "streampsdefid", realPSModelObject.getStreamPSDEField(), realPSModelObject, "getStreamPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "suggestionprompt", realPSModelObject.getSuggestionPrompt(), realPSModelObject, "getSuggestionPrompt");
		this.setDomainValue(iPSModelTranspileContext, domain, "suggestionpromptpsdefid", realPSModelObject.getSuggestionPromptPSDEField(), realPSModelObject, "getSuggestionPromptPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "systemprompt", realPSModelObject.getSystemPrompt(), realPSModelObject, "getSystemPrompt");
		this.setDomainValue(iPSModelTranspileContext, domain, "systempromptpsdefid", realPSModelObject.getSystemPromptPSDEField(), realPSModelObject, "getSystemPromptPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "temperature", realPSModelObject.getTemperature(), realPSModelObject, "getTemperature");
		this.setDomainValue(iPSModelTranspileContext, domain, "temperaturepsdefid", realPSModelObject.getTemperaturePSDEField(), realPSModelObject, "getTemperaturePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "toolexceedmessage", realPSModelObject.getToolExceedMessage(), realPSModelObject, "getToolExceedMessage");
		this.setDomainValue(iPSModelTranspileContext, domain, "toolexceedmessagepsdefid", realPSModelObject.getToolExceedMessagePSDEField(), realPSModelObject, "getToolExceedMessagePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "toolmaxcalls", realPSModelObject.getToolMaxCalls(), realPSModelObject, "getToolMaxCalls");
		this.setDomainValue(iPSModelTranspileContext, domain, "toolmaxcallspsdefid", realPSModelObject.getToolMaxCallsPSDEField(), realPSModelObject, "getToolMaxCallsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "topp", realPSModelObject.getTopP(), realPSModelObject, "getTopP");
		this.setDomainValue(iPSModelTranspileContext, domain, "topppsdefid", realPSModelObject.getTopPPSDEField(), realPSModelObject, "getTopPPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "trimmingstrategy", realPSModelObject.getTrimmingStrategy(), realPSModelObject, "getTrimmingStrategy");
		this.setDomainValue(iPSModelTranspileContext, domain, "trimmingstrategypsdefid", realPSModelObject.getTrimmingStrategyPSDEField(), realPSModelObject, "getTrimmingStrategyPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "typepsdefid", realPSModelObject.getTypePSDEField(), realPSModelObject, "getTypePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "uniquetagpsdefid", realPSModelObject.getUniqueTagPSDEField(), realPSModelObject, "getUniqueTagPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "welcomemessage", realPSModelObject.getWelcomeMessage(), realPSModelObject, "getWelcomeMessage");
		this.setDomainValue(iPSModelTranspileContext, domain, "welcomemessagepsdefid", realPSModelObject.getWelcomeMessagePSDEField(), realPSModelObject, "getWelcomeMessagePSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAIPLATFORMPSDEFIELD, domain, "aiplatformpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAIPLATFORMTYPE, domain, "aiplatformtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTGROUPTAGSPSDEFIELD, domain, "agentgrouptagspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTINFO, domain, "agentinfo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTPARAMS, domain, "aichatagentparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTTAG, domain, "aichatagenttag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTTAG2, domain, "aichatagenttag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGENTTYPE, domain, "aichatagenttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMCODEPSDEFIELD, domain, "customcodepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTFLAGPSDEFIELD, domain, "defaultflagpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDIGESTPROMPT, domain, "digestprompt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNAMICMODE, domain, "dynamicmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLESEARCHING, domain, "enablesearching", java.lang.Boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLESEARCHINGPSDEFIELD, domain, "enablesearchingpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLESUGGESTEDQUESTIONS, domain, "enablesuggestedquestions", java.lang.Boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLESUGGESTEDQUESTIONSPSDEFIELD, domain, "esqpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLETHINKING, domain, "enablethinking", java.lang.Boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLETHINKINGPSDEFIELD, domain, "enablethinkingpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLETOOLS, domain, "enabletools", java.lang.Boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLETOOLSPSDEFIELD, domain, "enabletoolspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGENERATIONMODE, domain, "generationmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGENERATIONMODEPSDEFIELD, domain, "generationmodepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETKNOWLEDGEBASEMODE, domain, "kbmode", java.lang.String.class, new String[]{"default"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETKNOWLEDGEBASEMODEPSDEFIELD, domain, "kbmodepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETKNOWLEDGEBASETAGSPSDEFIELD, domain, "kbtagspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXINPUTTOKENS, domain, "maxinputtokens", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXINPUTTOKENSPSDEFIELD, domain, "maxinputtokenspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXTOKENS, domain, "maxtokens", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXTOKENSPSDEFIELD, domain, "maxtokenspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMORYDOCTAGPSDEFIELD, domain, "memorydoctagpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMORYISOLATIONMODE, domain, "memoryisolationmode", java.lang.String.class, new String[]{"none"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMORYISOLATIONMODEPSDEFIELD, domain, "memoryisolationmodepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMORYKBTAGPSDEFIELD, domain, "memorykbtagpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMORYMAXTURNS, domain, "memorymaxturns", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMORYMAXTURNSPSDEFIELD, domain, "memorymaxturnspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMORYMODE, domain, "memorymode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMORYMODEPSDEFIELD, domain, "memorymodepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMORYPSDATAENTITY, domain, "memorypsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMESSAGEPSDATAENTITY, domain, "messagepsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAMEPSDEFIELD, domain, "namepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOSSIMAGEVLPROMPT, domain, "ossimagevlprompt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOSSIMAGEVLPROMPTPSDEFIELD, domain, "ossimagevlpromptpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDELOGIC, domain, "psdelogicid", net.ibizsys.model.dataentity.logic.IPSDELogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUNIRES, domain, "pssysuniresid", net.ibizsys.model.security.IPSSysUniRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPUBLISHSKILL, domain, "publishskill", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPUBLISHSKILLPSDEFIELD, domain, "publishskillpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREADME, domain, "readme", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREADMEPSDEFIELD, domain, "readmepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSESSIONPSDATAENTITY, domain, "sessionpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSKILLLOADMODEPSDEFIELD, domain, "loadskillmodepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSKILLPROMPT, domain, "skillprompt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSKILLPROMPTPSDEFIELD, domain, "skillpromptpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSKILLTAGSPSDEFIELD, domain, "skilltagspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTREAM, domain, "stream", java.lang.Boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTREAMPSDEFIELD, domain, "streampsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUGGESTIONPROMPT, domain, "suggestionprompt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUGGESTIONPROMPTPSDEFIELD, domain, "suggestionpromptpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYSTEMPROMPT, domain, "systemprompt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYSTEMPROMPTPSDEFIELD, domain, "systempromptpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEMPERATURE, domain, "temperature", java.lang.Double.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEMPERATUREPSDEFIELD, domain, "temperaturepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLEXCEEDMESSAGE, domain, "toolexceedmessage", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLEXCEEDMESSAGEPSDEFIELD, domain, "toolexceedmessagepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLMAXCALLS, domain, "toolmaxcalls", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLMAXCALLSPSDEFIELD, domain, "toolmaxcallspsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOPP, domain, "topp", java.lang.Double.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOPPPSDEFIELD, domain, "topppsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRIMMINGSTRATEGY, domain, "trimmingstrategy", java.lang.String.class, new String[]{"oldest"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRIMMINGSTRATEGYPSDEFIELD, domain, "trimmingstrategypsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTYPEPSDEFIELD, domain, "typepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNIQUETAGPSDEFIELD, domain, "uniquetagpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWELCOMEMESSAGE, domain, "welcomemessage", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWELCOMEMESSAGEPSDEFIELD, domain, "welcomemessagepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}