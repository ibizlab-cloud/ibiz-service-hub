package net.ibizsys.central.cloud.core.ai;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.expression.ExpressionUtils;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.model.ai.PSSysAIChatAgentImpl;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.util.DataTypeUtils;


public abstract class DynaDEDataSetSysAIChatAgentRuntimeBase extends SysAIChatAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DynaDEDataSetSysAIChatAgentRuntimeBase.class);
	private Map<String, ISysAIChatAgentRuntime> realSysAIChatAgentRuntimeMap = new HashMap<String, ISysAIChatAgentRuntime>();
	public final static String AIAGENTTAG = "srfaiagenttag";
	/**
	 * 功能参数：配置标识，支持{param}
	 */
	public final static String AIAGENTCONFIGID = "aiagentconfigid";
	
	private String strAIAgentConfigIdFormat = "";
	
	@Override
	protected void onInit() throws Exception {
		
		this.strAIAgentConfigIdFormat = this.getSysAIFactoryRuntimeContext().getParam(strAIAgentConfigIdFormat, "{system}-ai--{key}");
		this.getPSModelObject().getPSDEDataSetMust();
		this.getPSModelObject().getUniqueTagPSDEFieldMust();
		
		super.onInit();
		
		if(this.getDataEntityRuntime() == null) {
			throw new Exception("实体运行时无效");
		}
		
		this.reloadRealSysAIChatAgentRuntimes();
	}
	
	protected synchronized void reloadRealSysAIChatAgentRuntimes() throws Exception {
		this.realSysAIChatAgentRuntimeMap.clear();
		ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext().all().count(false);
		List<IEntityDTO> agentEntityDTOList = this.getDataEntityRuntime().selectDataSet(this.getPSModelObject().getPSDEDataSetMust(), iSearchContextDTO);
		if(ObjectUtils.isEmpty(agentEntityDTOList)) {
			log.warn(String.format("动态聊天代理[%1$s]未包含任何数据", this.getPSModelObject().getName()));
			return;
		}
		
		IPSDEField namePSDEField = this.getPSModelObject().getNamePSDEField();
		if(namePSDEField == null) {
			namePSDEField = this.getDataEntityRuntime().getMajorPSDEField();
		}
		
		IPSDEField defaultFlagPSDEField = this.getPSModelObject().getDefaultFlagPSDEField();
		IPSDEField enableSuggestedQuestionsPSDEField = this.getPSModelObject().getEnableSuggestedQuestionsPSDEField();
		IPSDEField enableThinkingPSDEField = this.getPSModelObject().getEnableThinkingPSDEField();
		IPSDEField enableToolsPSDEField = this.getPSModelObject().getEnableToolsPSDEField();
		IPSDEField generationModePSDEField = this.getPSModelObject().getGenerationModePSDEField();
		IPSDEField maxInputTokensPSDEField = this.getPSModelObject().getMaxInputTokensPSDEField();
		IPSDEField maxTokensPSDEField = this.getPSModelObject().getMaxTokensPSDEField();
		IPSDEField memoryMaxTurnsPSDEField = this.getPSModelObject().getMemoryMaxTurnsPSDEField();
		IPSDEField memoryModePSDEField = this.getPSModelObject().getMemoryModePSDEField();
		IPSDEField streamPSDEField = this.getPSModelObject().getStreamPSDEField();
		IPSDEField suggestionPromptPSDEField = this.getPSModelObject().getSuggestionPromptPSDEField();
		IPSDEField systemPromptPSDEField = this.getPSModelObject().getSystemPromptPSDEField();
		IPSDEField temperaturePSDEField = this.getPSModelObject().getTemperaturePSDEField();
		IPSDEField toolExceedMessagePSDEField = this.getPSModelObject().getToolExceedMessagePSDEField();
		IPSDEField toolMaxCallsPSDEField = this.getPSModelObject().getToolMaxCallsPSDEField();
		IPSDEField topPPSDEField = this.getPSModelObject().getTopPPSDEField();
		IPSDEField trimmingStrategyPSDEField = this.getPSModelObject().getTrimmingStrategyPSDEField();
		IPSDEField welcomeMessagePSDEField = this.getPSModelObject().getWelcomeMessagePSDEField();
		IPSDEField aiPlatformPSDEField = this.getPSModelObject().getAIPlatformPSDEField();
		
		
		for(IEntityDTO agentEntityDTO : agentEntityDTOList) {
			ObjectNode agentObjectNode = this.getPSModelObject().getObjectNode().deepCopy();
			//关闭动态模式
			agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETDYNAMICMODE, 0);
			//移除插件
			agentObjectNode.remove(PSSysAIChatAgentImpl.ATTR_GETPSSYSSFPLUGIN);
			if(namePSDEField != null) {
				Object name = agentEntityDTO.get(namePSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(name)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETNAME, String.valueOf(name));
				}
			}
			
			Object uniqueTag = agentEntityDTO.get(this.getPSModelObject().getUniqueTagPSDEFieldMust().getLowerCaseName());
			if(ObjectUtils.isEmpty(uniqueTag)) {
				log.error(String.format("未定义标记值，忽略"));
				continue;
			}
			agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETCODENAME, String.valueOf(uniqueTag));
			
			
//			/**
//			 * 获取默认标志值属性
//			 * @return
//			 */
//			IPSDEField defaultFlagPSDEField = this.getPSModelObject().getDefaultFlagPSDEField();


			
			if(enableSuggestedQuestionsPSDEField!=null) {
				Boolean enableSuggestedQuestions = DataTypeUtils.asBoolean(agentEntityDTO.get(enableSuggestedQuestionsPSDEField.getLowerCaseName()), this.getPSModelObject().getEnableSuggestedQuestions());
				if(enableSuggestedQuestions != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETENABLESUGGESTEDQUESTIONS, enableSuggestedQuestions);
				}
			}
			
			if(enableThinkingPSDEField != null) {
				Boolean enableThinking = DataTypeUtils.asBoolean(agentEntityDTO.get(enableThinkingPSDEField.getLowerCaseName()), this.getPSModelObject().getEnableThinking());
				if(enableThinking != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETENABLETHINKING, enableThinking);
				}
			}

			if(enableToolsPSDEField != null) {
				Boolean enableTools = DataTypeUtils.asBoolean(agentEntityDTO.get(enableToolsPSDEField.getLowerCaseName()), this.getPSModelObject().getEnableTools());
				if(enableTools != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETENABLETOOLS, enableTools);
				}
			}
			
			if(generationModePSDEField != null) {
				String generationMode = DataTypeUtils.asString(agentEntityDTO.get(generationModePSDEField.getLowerCaseName()), this.getPSModelObject().getGenerationMode());
				if(StringUtils.hasLength(generationMode)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETGENERATIONMODE, generationMode);
				}
			}
			
			if(maxInputTokensPSDEField != null) {
				Integer maxInputTokens = DataTypeUtils.asInteger(agentEntityDTO.get(maxInputTokensPSDEField.getLowerCaseName()), this.getPSModelObject().getMaxInputTokens());
				if(maxInputTokens != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETMAXINPUTTOKENS, maxInputTokens);
				}
			}
	
			if(maxTokensPSDEField != null) {
				Integer maxTokens = DataTypeUtils.asInteger(agentEntityDTO.get(maxTokensPSDEField.getLowerCaseName()), this.getPSModelObject().getMaxTokens());
				if(maxTokens != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETMAXTOKENS, maxTokens);
				}
			}
			
			if(memoryMaxTurnsPSDEField != null) {
				Integer memoryMaxTurns = DataTypeUtils.asInteger(agentEntityDTO.get(memoryMaxTurnsPSDEField.getLowerCaseName()), this.getPSModelObject().getMemoryMaxTurns());
				if(memoryMaxTurns != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETMEMORYMAXTURNS, memoryMaxTurns);
				}
			}
			
			if(memoryModePSDEField != null) {
				String memoryMode = DataTypeUtils.asString(agentEntityDTO.get(memoryModePSDEField.getLowerCaseName()), this.getPSModelObject().getMemoryMode());
				if(StringUtils.hasLength(memoryMode)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETMEMORYMODE, memoryMode);
				}
			}
		
			if(streamPSDEField != null) {
				Boolean stream = DataTypeUtils.asBoolean(agentEntityDTO.get(streamPSDEField.getLowerCaseName()), this.getPSModelObject().getStream());
				if(stream != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETSTREAM, stream);
				}
			}
			
			if(suggestionPromptPSDEField != null) {
				String suggestionPrompt = DataTypeUtils.asString(agentEntityDTO.get(suggestionPromptPSDEField.getLowerCaseName()), this.getPSModelObject().getSuggestionPrompt());
				if(StringUtils.hasLength(suggestionPrompt)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETSUGGESTIONPROMPT, suggestionPrompt);
				}
			}
		
			if(systemPromptPSDEField != null) {
				String systemPrompt = DataTypeUtils.asString(agentEntityDTO.get(systemPromptPSDEField.getLowerCaseName()), this.getPSModelObject().getSystemPrompt());
				if(StringUtils.hasLength(systemPrompt)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETSYSTEMPROMPT, systemPrompt);
				}
			}
		
			if(temperaturePSDEField != null) {
				Double temperature = DataTypeUtils.asDouble(agentEntityDTO.get(temperaturePSDEField.getLowerCaseName()), this.getPSModelObject().getTemperature());
				if(temperature != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETTEMPERATURE, temperature);
				}
			}
			
			if(toolExceedMessagePSDEField != null) {
				String toolExceedMessage = DataTypeUtils.asString(agentEntityDTO.get(toolExceedMessagePSDEField.getLowerCaseName()), this.getPSModelObject().getToolExceedMessage());
				if(StringUtils.hasLength(toolExceedMessage)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETTOOLEXCEEDMESSAGE, toolExceedMessage);
				}
			}
			
		
			if(toolMaxCallsPSDEField != null) {
				Integer toolMaxCalls = DataTypeUtils.asInteger(agentEntityDTO.get(toolMaxCallsPSDEField.getLowerCaseName()), this.getPSModelObject().getToolMaxCalls());
				if(toolMaxCalls != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETTOOLMAXCALLS, toolMaxCalls);
				}
			}
			
			if(topPPSDEField != null) {
				Double topP = DataTypeUtils.asDouble(agentEntityDTO.get(topPPSDEField.getLowerCaseName()), this.getPSModelObject().getTopP());
				if(topP != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETTOPP, topP);
				}
			}
			
			if(trimmingStrategyPSDEField != null) {
				String trimmingStrategy = DataTypeUtils.asString(agentEntityDTO.get(trimmingStrategyPSDEField.getLowerCaseName()), this.getPSModelObject().getTrimmingStrategy());
				if(StringUtils.hasLength(trimmingStrategy)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETTRIMMINGSTRATEGY, trimmingStrategy);
				}
			}
			
			if(welcomeMessagePSDEField != null) {
				String welcomeMessage = DataTypeUtils.asString(agentEntityDTO.get(welcomeMessagePSDEField.getLowerCaseName()), this.getPSModelObject().getWelcomeMessage());
				if(StringUtils.hasLength(welcomeMessage)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETWELCOMEMESSAGE, welcomeMessage);
				}
			}
			
			if(aiPlatformPSDEField != null) {
				String aiPlatformType = DataTypeUtils.asString(agentEntityDTO.get(aiPlatformPSDEField.getLowerCaseName()), this.getPSModelObject().getAIPlatformType());
				if(StringUtils.hasLength(aiPlatformType)) {
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("key", aiPlatformType);
					params.put("system", this.getSystemRuntime().getDeploySystemId());
					if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
						IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
						if(StringUtils.hasLength(iServiceSystemRuntime.getMainSystemId())) {
							params.put("system", iServiceSystemRuntime.getMainSystemId());
						}
					}
					String strRealConfigId = ExpressionUtils.getValue(getAIAgentConfigIdFormat(), params).toLowerCase();
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETAIPLATFORMTYPE, strRealConfigId);
				}
			}
			
			this.onFillRealAgentObjectNode(agentObjectNode, agentEntityDTO);
			
			IPSSysAIChatAgent subPSSysAIChatAgent = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject(this.getPSModelObject().getParentPSModelObject(), IPSSysAIChatAgent.class, agentObjectNode);
			ISysAIChatAgentRuntime subSysAIChatAgentRuntime = this.getSysAIFactoryRuntimeContext().createSysAIChatAgentRuntime(subPSSysAIChatAgent);
			try {
				subSysAIChatAgentRuntime.init(this.getSysAIFactoryRuntimeContext(), subPSSysAIChatAgent);
				realSysAIChatAgentRuntimeMap.put(subPSSysAIChatAgent.getCodeName().toUpperCase(), subSysAIChatAgentRuntime);
			}
			catch (Throwable ex) {
				log.error(String.format("初始化聊天代理运行时[%1$s]发生异常，%2$s", subPSSysAIChatAgent.getName(), ex.getMessage()));
			}
		}
	}
	
	protected void onFillRealAgentObjectNode(ObjectNode agentObjectNode, IEntityDTO agentEntityDTO) {
		
	}
	
	protected String getAIAgentConfigIdFormat() {
		return this.strAIAgentConfigIdFormat;
	}
	
	@Override
	protected void onReload() throws Throwable {
		reloadRealSysAIChatAgentRuntimes();
		super.onReload();
	}
	
	protected ISysAIChatAgentRuntime getRealSysAIChatAgentRuntime(String strAIAgentTag, boolean bTryMode) throws Exception {
		ISysAIChatAgentRuntime realSysAIChatAgentRuntime = this.realSysAIChatAgentRuntimeMap.get(strAIAgentTag.toUpperCase());
		if(realSysAIChatAgentRuntime != null || bTryMode) {
			return realSysAIChatAgentRuntime;
		}
		throw new Exception(String.format("无法获取AI聊天代理[%1$s]", strAIAgentTag));
	}

	@Override
	public List<ChatMessage> getHistories(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
		if(body instanceof Map) {
			String strAIAgentTag = (String)((Map)body).get(AIAGENTTAG);
			if(StringUtils.hasLength(strAIAgentTag)) {
				ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
				if(iSysAIChatAgentRuntime != null) {
					return iSysAIChatAgentRuntime.getHistories(dataOrKeys, body, params);
				}
			}
		}
		return super.getHistories(dataOrKeys, body, params);
	}

	@Override
	public ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.chatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
			}
		}
		return super.chatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
	}

	@Override
	public ChatCompletionResult chatSuggestion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.chatSuggestion(dataOrKeys, chatCompletionRequest, params);
			}
		}
		return super.chatSuggestion(dataOrKeys, chatCompletionRequest, params);
	}

	@Override
	public PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.asyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
			}
		}
		return super.asyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
	}

	@Override
	public List<ChatMessage> getSuggestionMessages(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.getSuggestionMessages(dataOrKeys, chatCompletionRequest, params);
			}
		}
		return super.getSuggestionMessages(dataOrKeys, chatCompletionRequest, params);
	}

	@Override
	public SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.sseChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
			}
		}
		return super.sseChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
	}
	
	
}
