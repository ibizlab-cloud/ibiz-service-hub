package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.expression.ExpressionUtils;
import net.ibizsys.model.PSModelEnums.MsgTemplEngine;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.model.ai.PSSysAIChatAgentImpl;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.logic.PSDELogicImpl;
import net.ibizsys.runtime.plugin.IModelRTAddin2;
import net.ibizsys.runtime.util.DataTypeUtils;


public abstract class DynaDEDataSetSysAIChatAgentRuntimeBase extends SysAIChatAgentRuntimeBase implements IDynaSysAIChatAgentFactoryRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DynaDEDataSetSysAIChatAgentRuntimeBase.class);
	private Map<String, ISysAIChatAgentRuntime> realSysAIChatAgentRuntimeMap = new ConcurrentHashMap<String, ISysAIChatAgentRuntime>();
	public final static String AIAGENTTAG = "srfaiagenttag";


	public final static String AGENTTAG_DEFAULT = "@@DEFAULT@@";



	@Override
	protected void onInit() throws Exception {


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

		IPSDEField keyPSDEField = this.getDataEntityRuntime().getKeyPSDEField();


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
		IPSDEField mcpServersTagsPSDEField = this.getPSModelObject().getMcpServerTagsPSDEField();
		IPSDEField knowledgeBaseTagsPSDEField = this.getPSModelObject().getKnowledgeBaseTagsPSDEField();
		IPSDEField typePSDEField = this.getPSModelObject().getTypePSDEField();
		IPSDEField knowledgeBaseModePSDEField = this.getPSModelObject().getKnowledgeBaseModePSDEField();
		IPSDEField memoryKBTagPSDEField = this.getPSModelObject().getMemoryKBTagPSDEField();
		IPSDEField memoryDocTagPSDEField = this.getPSModelObject().getMemoryDocTagPSDEField();
		IPSDEField ossImageVLPromptPSDEField = this.getPSModelObject().getOSSImageVLPromptPSDEField();
		IPSDEField enableSearchingPSDEField = this.getPSModelObject().getEnableSearchingPSDEField();
		IPSDEField publishSkillPSDEField = this.getPSModelObject().getPublishSkillPSDEField();
		IPSDEField skillPromptPSDEField = this.getPSModelObject().getSkillPromptPSDEField();
		IPSDEField scriptCodePSDEField = this.getPSModelObject().getCustomCodePSDEField();
		IPSDEField agentGroupTagsPSDEField = this.getPSModelObject().getAgentGroupTagsPSDEField();
		IPSDEField skillLoadModePSDEField = this.getPSModelObject().getSkillLoadModePSDEField();
		IPSDEField memoryIsolationModePSDEField = this.getPSModelObject().getMemoryIsolationModePSDEField();
		IPSDEField skillTagsPSDEField = this.getPSModelObject().getSkillTagsPSDEField();
		IPSDEField readmePSDEField = this.getPSModelObject().getReadmePSDEField();


		for(IEntityDTO agentEntityDTO : agentEntityDTOList) {
			ObjectNode agentObjectNode = this.getPSModelObject().getObjectNode().deepCopy();
			//关闭动态模式
			agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETDYNAMICMODE, 0);
			//设置freemarker模板
			agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETTEMPLENGINE, MsgTemplEngine.FREEMARKER.value);

			if(keyPSDEField != null) {
				Object key = agentEntityDTO.get(keyPSDEField.getLowerCaseName());
				if(!ObjectUtils.isEmpty(key)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETAGENTCONTEXTID, String.valueOf(key));
				}
			}
			//移除插件
			//agentObjectNode.remove(PSSysAIChatAgentImpl.ATTR_GETPSSYSSFPLUGIN);
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
			agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETAGENTSCOPE, this.getPSModelObject().getCodeName());

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

			if(mcpServersTagsPSDEField != null) {
				String mcpServersIds = DataTypeUtils.asString(agentEntityDTO.get(mcpServersTagsPSDEField.getLowerCaseName()), this.getPSModelObject().getMcpServerTags());
				if(StringUtils.hasLength(mcpServersIds)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETMCPSERVERTAGS, mcpServersIds);
				}
			}

			if(knowledgeBaseTagsPSDEField != null) {
				String knowledgeBaseIds = DataTypeUtils.asString(agentEntityDTO.get(knowledgeBaseTagsPSDEField.getLowerCaseName()), this.getPSModelObject().getKnowledgeBaseTags());
				if(StringUtils.hasLength(knowledgeBaseIds)) {
					String[] ids = knowledgeBaseIds.split("[,]");
					List<String> list = new ArrayList<String>();
					for(String tag : ids) {
						Map<String, Object> params = new HashMap<String, Object>();
						params.put("key", tag);
						params.put("system", this.getSystemRuntime().getDeploySystemId());
						if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
							IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
							if(StringUtils.hasLength(iServiceSystemRuntime.getMainSystemId())) {
								params.put("system", iServiceSystemRuntime.getMainSystemId());
							}
						}
						String strRealConfigId = ExpressionUtils.getValue(getKBAgentConfigIdFormat(), params).toLowerCase();
						list.add(strRealConfigId);
					}
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETKNOWLEDGEBASETAGS, StringUtils.collectionToDelimitedString(list, ","));
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

			if(typePSDEField != null) {
				String strType = DataTypeUtils.asString(agentEntityDTO.get(typePSDEField.getLowerCaseName()), this.getPSModelObject().getAgentType());
				if (StringUtils.hasLength(strType)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETAGENTTYPE, strType);
					if (strType.equals(net.ibizsys.model.PSModelEnums.AIChatAgentType.DE.value)) {
						ObjectNode logicObjectNode = this.getPSModelObject().getPSDELogicMust().getObjectNode().deepCopy();
						String logicCodeName = String.format("%1$s@%2$s", uniqueTag, this.getPSModelObject().getPSDELogicMust().getCodeName());
						logicObjectNode.put(PSDELogicImpl.ATTR_GETCODENAME,logicCodeName);
						agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETPSDELOGIC,logicObjectNode);
					}
				}
			}

			if(knowledgeBaseModePSDEField != null) {
				String strKnowledgeBaseMode = DataTypeUtils.asString(agentEntityDTO.get(knowledgeBaseModePSDEField.getLowerCaseName()), this.getPSModelObject().getKnowledgeBaseMode());
				if(StringUtils.hasLength(strKnowledgeBaseMode)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETKNOWLEDGEBASEMODE, strKnowledgeBaseMode);
				}
			}

			if(memoryKBTagPSDEField != null) {
				String strMemoryKBTag = DataTypeUtils.asString(agentEntityDTO.get(memoryKBTagPSDEField.getLowerCaseName()), this.getPSModelObject().getMemoryKBTag());
				if(StringUtils.hasLength(strMemoryKBTag)) {
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("key", strMemoryKBTag);
					params.put("system", this.getSystemRuntime().getDeploySystemId());
					if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
						IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
						if(StringUtils.hasLength(iServiceSystemRuntime.getMainSystemId())) {
							params.put("system", iServiceSystemRuntime.getMainSystemId());
						}
					}
					String strRealConfigId = ExpressionUtils.getValue(getKBAgentConfigIdFormat(), params).toLowerCase();
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETMEMORYKBTAG, strRealConfigId);
				}
			}

			if(memoryDocTagPSDEField != null) {
				String strMemoryDocTag = DataTypeUtils.asString(agentEntityDTO.get(memoryDocTagPSDEField.getLowerCaseName()), this.getPSModelObject().getMemoryDocTag());
				if(StringUtils.hasLength(strMemoryDocTag)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETMEMORYDOCTAG, strMemoryDocTag);
				}
			}

			if(ossImageVLPromptPSDEField != null) {
				String strOSSImageVLPrompt = DataTypeUtils.asString(agentEntityDTO.get(ossImageVLPromptPSDEField.getLowerCaseName()), this.getPSModelObject().getOSSImageVLPrompt());
				if(StringUtils.hasLength(strOSSImageVLPrompt)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETOSSIMAGEVLPROMPT, strOSSImageVLPrompt);
				}
			}

			if(enableSearchingPSDEField != null) {
				Boolean enableSearching = DataTypeUtils.asBoolean(agentEntityDTO.get(enableSearchingPSDEField.getLowerCaseName()), this.getPSModelObject().getEnableSearching());
				if(enableSearching != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETENABLESEARCHING, enableSearching);
				}
			}

			if(publishSkillPSDEField != null) {
				Integer publishSkill = DataTypeUtils.asInteger(agentEntityDTO.get(publishSkillPSDEField.getLowerCaseName()), this.getPSModelObject().getPublishSkill());
				if(publishSkill != null) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETPUBLISHSKILL, publishSkill);
				}
			}

			if(skillPromptPSDEField != null) {
				String strSkillPrompt = DataTypeUtils.asString(agentEntityDTO.get(skillPromptPSDEField.getLowerCaseName()), this.getPSModelObject().getSkillPrompt());
				if(StringUtils.hasLength(strSkillPrompt)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETSKILLPROMPT, strSkillPrompt);
				}
			}

			if(readmePSDEField != null) {
				String strReadme = DataTypeUtils.asString(agentEntityDTO.get(readmePSDEField.getLowerCaseName()), this.getPSModelObject().getReadme());
				if(StringUtils.hasLength(strReadme)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETREADME, strReadme);
				}
			}

			if(scriptCodePSDEField != null) {
				String strScriptCode = DataTypeUtils.asString(agentEntityDTO.get(scriptCodePSDEField.getLowerCaseName()), this.getPSModelObject().getScriptCode());
				if(StringUtils.hasLength(strScriptCode)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETSCRIPTCODE, strScriptCode);
				}
			}

			if(agentGroupTagsPSDEField != null) {
				String strAgentGroupsTag = DataTypeUtils.asString(agentEntityDTO.get(agentGroupTagsPSDEField.getLowerCaseName()), this.getPSModelObject().getAgentGroupTags());
				if(StringUtils.hasLength(strAgentGroupsTag)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETAGENTGROUPTAGS, strAgentGroupsTag);
				}
			}

			if(skillLoadModePSDEField != null) {
				String strSkillLoadMode = DataTypeUtils.asString(agentEntityDTO.get(skillLoadModePSDEField.getLowerCaseName()), this.getPSModelObject().getSkillLoadMode());
				if(StringUtils.hasLength(strSkillLoadMode)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETSKILLLOADMODE, strSkillLoadMode);
				}
			}

			if(memoryIsolationModePSDEField != null) {
				String strMemoryIsolationMode = DataTypeUtils.asString(agentEntityDTO.get(memoryIsolationModePSDEField.getLowerCaseName()), this.getPSModelObject().getMemoryIsolationMode());
				if(StringUtils.hasLength(strMemoryIsolationMode)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETMEMORYISOLATIONMODE, strMemoryIsolationMode);
				}
			}

			if(skillTagsPSDEField != null) {
				String strSkillTags = DataTypeUtils.asString(agentEntityDTO.get(skillTagsPSDEField.getLowerCaseName()), this.getPSModelObject().getSkillTags());
				if(StringUtils.hasLength(strSkillTags)) {
					agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETSKILLTAGS, strSkillTags);
				}
			}


			boolean defaultFlag = false;
			if(defaultFlagPSDEField != null) {
				defaultFlag = DataTypeUtils.asBoolean(agentEntityDTO.get(defaultFlagPSDEField.getLowerCaseName()), false);
			}

			agentObjectNode.put(PSSysAIChatAgentImpl.ATTR_GETPRIORITY, IModelRTAddin2.PRIORITY_PRIMARY);

			this.onFillRealAgentObjectNode(agentObjectNode, agentEntityDTO);

			IPSSysAIChatAgent subPSSysAIChatAgent = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject(this.getPSModelObject().getParentPSModelObject(), IPSSysAIChatAgent.class, agentObjectNode);
			ISysAIChatAgentRuntime subSysAIChatAgentRuntime = this.getSysAIFactoryRuntimeContext().createSysAIChatAgentRuntime(subPSSysAIChatAgent);
			try {
				subSysAIChatAgentRuntime.init(this.getSysAIFactoryRuntimeContext(), subPSSysAIChatAgent);
				this.realSysAIChatAgentRuntimeMap.put(subPSSysAIChatAgent.getCodeName().toUpperCase(), subSysAIChatAgentRuntime);
				if(defaultFlag && !this.realSysAIChatAgentRuntimeMap.containsKey(AGENTTAG_DEFAULT)) {
					this.realSysAIChatAgentRuntimeMap.put(AGENTTAG_DEFAULT, subSysAIChatAgentRuntime);
				}
			}
			catch (Throwable ex) {
				log.error(String.format("初始化聊天代理运行时[%1$s]发生异常，%2$s", subPSSysAIChatAgent.getName(), ex.getMessage()));
			}
		}

//		if( realSysAIChatAgentRuntimeMap.size() > 0 && !realSysAIChatAgentRuntimeMap.containsKey(AGENTTAG_DEFAULT)) {
//			for(java.util.Map.Entry<String, ISysAIChatAgentRuntime> entry : realSysAIChatAgentRuntimeMap.entrySet()) {
//				realSysAIChatAgentRuntimeMap.put(AGENTTAG_DEFAULT, entry.getValue());
//			}
//		}
	}

	protected void onFillRealAgentObjectNode(ObjectNode agentObjectNode, IEntityDTO agentEntityDTO) {

	}



	@Override
	protected String getHistoriesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "history").toLowerCase();
	}

	@Override
	protected String getSystemMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "system").toLowerCase();
	}

	@Override
	protected String getSuggestionMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "suggestion").toLowerCase();
	}

	protected String getToolsConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.json.tpl", File.separator, this.getAgentMode(), "tools").toLowerCase();
	}

	@Override
	protected String getDigestMessageConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.md.tpl", File.separator, this.getAgentMode(), "digest").toLowerCase();
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

	protected ISysAIChatAgentRuntime getDefaultSysAIChatAgentRuntime(boolean bTryMode) throws Exception {
		return this.getRealSysAIChatAgentRuntime(AGENTTAG_DEFAULT, bTryMode);
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
				log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
			}
			else {
				ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
				if(iSysAIChatAgentRuntime != null) {
					return iSysAIChatAgentRuntime.getHistories(dataOrKeys, body, params);
				}
			}
		}
		return super.getHistories(dataOrKeys, body, params);
	}

	@Override
	public void cancelChatCompletion(Object dataOrKeys, String asyncActionId, Object body) throws Throwable {
		if(body instanceof Map) {
			String strAIAgentTag = (String)((Map)body).get(AIAGENTTAG);
			if(StringUtils.hasLength(strAIAgentTag)) {
				ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
				if(iSysAIChatAgentRuntime != null) {
					iSysAIChatAgentRuntime.cancelChatCompletion(dataOrKeys, asyncActionId, body);
					return;
				}
				log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
			}
			else {
				ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
				if(iSysAIChatAgentRuntime != null) {
					iSysAIChatAgentRuntime.cancelChatCompletion(dataOrKeys, asyncActionId, body);
					return;
				}
			}
		}
		super.cancelChatCompletion(dataOrKeys, asyncActionId, body);
	}

	@Override
	public ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.chatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
			}
			log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
		}
		else {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
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
		else {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.chatSuggestion(dataOrKeys, chatCompletionRequest, params);
			}
		}
		return super.chatSuggestion(dataOrKeys, chatCompletionRequest, params);
	}

	@Override
	public ChatCompletionResult chatDigest(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest,	Map<String, Object> params) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.chatDigest(dataOrKeys, chatCompletionRequest, params);
			}
			log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
		}
		return super.chatDigest(dataOrKeys, chatCompletionRequest, params);
	}

	@Override
	public PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.asyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
			}
			log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
		}
		else {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
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
			log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
		}
		else {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.getSuggestionMessages(dataOrKeys, chatCompletionRequest, params);
			}
		}
		return super.getSuggestionMessages(dataOrKeys, chatCompletionRequest, params);
	}

	@Override
	public ChatMessage getDigestMessage(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest,	Map<String, Object> params) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.getDigestMessage(dataOrKeys, chatCompletionRequest, params);
			}
			log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
		}
		return super.getDigestMessage(dataOrKeys, chatCompletionRequest, params);
	}

	@Override
	public SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.sseChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
			}
			log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
		}
		else {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.sseChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
			}
		}
		return super.sseChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
	}


	@Override
	public Object beginChatSession(ChatCompletionRequest chatCompletionRequest) throws Throwable {
		String strAIAgentTag = (String)chatCompletionRequest.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.beginChatSession(chatCompletionRequest);
			}
			log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
		}
		else {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.beginChatSession(chatCompletionRequest);
			}
		}
		return super.beginChatSession(chatCompletionRequest);
	}


	@Override
	protected Page<Chunk> onFetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
		String strAIAgentTag = (String)iChunkSearchContext.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.fetchChunks(iChunkSearchContext);
			}
		}
		else {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.fetchChunks(iChunkSearchContext);
			}
		}
		return super.onFetchChunks(iChunkSearchContext);
	}

	@Override
	protected Page<Chunk> onFetchChunksByHistories(IChunkSearchContext iChunkSearchContext) throws Throwable {
		String strAIAgentTag = (String)iChunkSearchContext.get(AIAGENTTAG);
		if(StringUtils.hasLength(strAIAgentTag)) {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getRealSysAIChatAgentRuntime(strAIAgentTag, true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.fetchChunksByHistories(iChunkSearchContext);
			}
			log.warn(String.format("指定AI代理[%1$s]不存在，后续调用基类功能", strAIAgentTag));
		}
		else {
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getDefaultSysAIChatAgentRuntime(true);
			if(iSysAIChatAgentRuntime != null) {
				return iSysAIChatAgentRuntime.fetchChunksByHistories(iChunkSearchContext);
			}
		}
		return super.onFetchChunksByHistories(iChunkSearchContext);
	}

	@Override
	protected void onScheduleMemoryMaintenance(boolean bHasLeaderShip, Map<String, Object> params) throws Throwable {
		super.onScheduleMemoryMaintenance(bHasLeaderShip, params);

		Set<ISysAIChatAgentRuntime> sysAIChatAgentRuntimeList = new HashSet<ISysAIChatAgentRuntime>(this.realSysAIChatAgentRuntimeMap.values());
		for(ISysAIChatAgentRuntime iSysAIChatAgentRuntime : sysAIChatAgentRuntimeList) {
			try {
				iSysAIChatAgentRuntime.scheduleMemoryMaintenance(bHasLeaderShip, new HashMap<String, Object>());
			}
			catch (Throwable ex) {
				log.error(String.format("定时处理[%1$s]记忆维持发生异常，%2$s", iSysAIChatAgentRuntime.getName(), ex.getMessage()), ex);
			}
		}
	}


	@Override
	protected void onFillSkills(Map<String, Object> skills, Map<String, Object> params) throws Throwable {
		super.onFillSkills(skills, params);

		Set<ISysAIChatAgentRuntime> sysAIChatAgentRuntimeList = new HashSet<ISysAIChatAgentRuntime>(this.realSysAIChatAgentRuntimeMap.values());
		for(ISysAIChatAgentRuntime iSysAIChatAgentRuntime : sysAIChatAgentRuntimeList) {
			try {
				iSysAIChatAgentRuntime.fillSkills(skills, params);
			}
			catch (Throwable ex) {
				log.error(String.format("交谈代理[%1$s]填充技能发生异常，%2$s", iSysAIChatAgentRuntime.getName(), ex.getMessage()), ex);
			}
		}
	}

	@Override
	public List<ISysAIChatAgentRuntime> getSysAIChatAgentRuntimes() {
		try {
			return this.onGetSysAIChatAgentRuntimes();
		}
		catch (Throwable ex) {
			throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("获取交谈代理集合发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected List<ISysAIChatAgentRuntime> onGetSysAIChatAgentRuntimes() {
		Set<ISysAIChatAgentRuntime> sysAIChatAgentRuntimeList = new HashSet<ISysAIChatAgentRuntime>(this.realSysAIChatAgentRuntimeMap.values());
		return new ArrayList<ISysAIChatAgentRuntime>(sysAIChatAgentRuntimeList);
	}




	@Override
	public ISysAIChatAgentRuntime getSysAIChatAgentRuntime(String agentTag, boolean tryMode) throws Throwable {
		try {
			return this.onGetSysAIChatAgentRuntime(agentTag, tryMode);
		}
		catch (Throwable ex) {
			throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("获取指定交谈代理发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected ISysAIChatAgentRuntime onGetSysAIChatAgentRuntime(String agentTag, boolean tryMode) throws Throwable {
		return this.getRealSysAIChatAgentRuntime(agentTag, tryMode);
	}

	@Override
	public void removeSysAIChatAgentRuntime(String agentTag) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public ISysAIChatAgentRuntime createSysAIChatAgentRuntime(ObjectNode modelNode, boolean tempMode) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
