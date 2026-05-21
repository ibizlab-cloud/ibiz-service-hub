package net.ibizsys.central.plugin.ai.agent;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.ai.ChatAgentSysAIChatSkill;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentGroup;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatSkill;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.plugin.ai.util.AIChatUtils;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class HubSysAIChatAgentRuntimeBase extends SkillSysAIChatAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(HubSysAIChatAgentRuntimeBase.class);
	
	
	
	private ISysAIChatAgentGroup masterSysAIChatAgentGroup = null;
	private String strSkillAndAgentDetectionPrompt = null;
	
	protected Map<String, ISysAIChatSkill> chatAgentSysAIChatSkillMap = null;
	private Map<String, String> sysAIChatSkillDescMap = new ConcurrentHashMap<String, String>();
	
	@Override
	protected void onInit() throws Exception {
		this.strSkillAndAgentDetectionPrompt = net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(HubSysAIChatAgentRuntimeBase.class, "SkillDetectionPrompt.en.md", false);
		super.onInit();
		
		if(this.getMasterAIChatAgentGroup(true) == null) {
			this.prepareMasterAIChatAgentGroup();
			this.getMasterAIChatAgentGroup(false);
		}
		
	}
	
	protected void prepareMasterAIChatAgentGroup() throws Exception {
		this.setMasterAIChatAgentGroup(this.getSysAIFactoryRuntimeContext().getAIChatAgentGroup(this.getPSModelObject().getCodeName()));
	}
	
	protected void setMasterAIChatAgentGroup(ISysAIChatAgentGroup masterSysAIChatAgentGroup) {
		this.masterSysAIChatAgentGroup = masterSysAIChatAgentGroup; 
	}
	
	protected ISysAIChatAgentGroup getMasterAIChatAgentGroup(boolean tryMode) throws Exception {
		if(this.masterSysAIChatAgentGroup != null || tryMode) {
			return this.masterSysAIChatAgentGroup;
		}
		throw new Exception("主控聊天代理组无效");
	}
	
//	@Override
//	protected void fillStringTemplates(Set<String> set) {
//		set.add(this.getSkillAndAgentDetectionPrompt());
//		super.fillStringTemplates(set);
//	}
	
	@Override
	protected void prepareAIChatAgentGroups() throws Exception {
		//关闭准备相关代理组
		//super.prepareAIChatAgentGroups();
	}
	
	protected String getSkillAndAgentDetectionPrompt() {
		return this.strSkillAndAgentDetectionPrompt;
	}
	
	protected synchronized void prepareChatAgentSysAIChatSkillMap() throws Exception{
		if(this.chatAgentSysAIChatSkillMap == null) {
			this.sysAIChatSkillDescMap.clear();
			this.fillAIChatSkillDescMap(this.sysAIChatSkillDescMap);
			this.chatAgentSysAIChatSkillMap = new LinkedHashMap<String, ISysAIChatSkill>();
			List<ISysAIChatAgentRuntime> sysAIChatAgentRuntimeList = getMasterAIChatAgentGroup(false).getAIChatAgents();
			if(!ObjectUtils.isEmpty(sysAIChatAgentRuntimeList)) {
				for(ISysAIChatAgentRuntime iSysAIChatAgentRuntime : sysAIChatAgentRuntimeList) {
					ISysAIChatSkill iSysAIChatSkill = new ChatAgentSysAIChatSkill();
					try {
						iSysAIChatSkill.init(this.getSysAIFactoryRuntimeContext(), iSysAIChatAgentRuntime);
						this.chatAgentSysAIChatSkillMap.put(iSysAIChatSkill.getId(), iSysAIChatSkill);
						if(!StringUtils.hasLength(iSysAIChatSkill.getDescription())) {
							log.error(String.format("交谈代理技能[%1$s]未指定描述，忽略", iSysAIChatAgentRuntime.getUniqueTag()));
							continue;
						}
						this.sysAIChatSkillDescMap.put(iSysAIChatSkill.getId(), iSysAIChatSkill.getDescription());
					}
					catch(Exception ex) {
						log.error(String.format("初始化交谈代理技能[%1$s]发生异常，%2$", iSysAIChatAgentRuntime.getUniqueTag(), ex.getMessage()), ex);
					}
				}
			}
		}
		
	}
	
	
	@Override
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params, boolean bTryMode) throws Throwable {
		if (!params.containsKey(TEMPLATE_PARAM_SKILLS)) {
			prepareChatAgentSysAIChatSkillMap();
			params.put(TEMPLATE_PARAM_SKILLS, JsonUtils.toString(this.sysAIChatSkillDescMap));
		}
		return super.getContent(data, strTemplateId, params, bTryMode);
	}
	
	@Override
	protected ISysAIChatSkill getAIChatSkill(String strSkillId, boolean tryMode) throws Exception {
		prepareChatAgentSysAIChatSkillMap();
		ISysAIChatSkill iSysAIChatSkill = this.chatAgentSysAIChatSkillMap.get(strSkillId);
		if(iSysAIChatSkill != null) {
			return iSysAIChatSkill;
		}
		return super.getAIChatSkill(strSkillId, tryMode);
	}
	
	
//	@Override
//	public ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
//		// TODO Auto-generated method stub
//		return super.chatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
//	}
//	
//	@Override
//	protected ChatCompletionResult onChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
//		//进行决策
//		List<ISysAIChatAgentRuntime> sysAIChatAgentRuntimeList = getMasterAIChatAgentGroup(false).getAIChatAgents();
//		if(!ObjectUtils.isEmpty(sysAIChatAgentRuntimeList)) {
//			
//			Map<String, String> skillPromptMap = new LinkedHashMap<String, String>();
//			Map<String, ISysAIChatAgentRuntime> sysAIChatAgentRuntimeMap = new LinkedHashMap<String, ISysAIChatAgentRuntime>();
//			//进一步填充
//			for(ISysAIChatAgentRuntime iSysAIChatAgentRuntime : sysAIChatAgentRuntimeList) {
//				if(StringUtils.hasLength(iSysAIChatAgentRuntime.getPSModelObject().getReadme())) {
//					skillPromptMap.put(String.format("%1$s@agent", iSysAIChatAgentRuntime.getUniqueTag()), iSysAIChatAgentRuntime.getPSModelObject().getReadme());
//					sysAIChatAgentRuntimeMap.put(String.format("%1$s@agent", iSysAIChatAgentRuntime.getUniqueTag()), iSysAIChatAgentRuntime);
//				}
//			}
//			
//			if(!ObjectUtils.isEmpty(skillPromptMap)) {
//				
//				String strRedirectAgentId = (String)ChatCompletionSessionHolder.peekMust().resetParam(AIAGENTTAG);
//				if(!StringUtils.hasLength(strRedirectAgentId)) {
//
//					Map<String, String> knowledgeBaseMap = new LinkedHashMap<String, String>();
//					//判断是否传入知识库
//					if(!ObjectUtils.isEmpty(chatCompletionRequest.getKnowledgeBases())) {
//						int nIndex = 0;
//						for(String strKBTag : chatCompletionRequest.getKnowledgeBases()) {
//							String strRealKBConfigId = this.getKBAgentConfigId(strKBTag);
//							try {
//								String strKBInfo = this.getSysKBUtilRuntime().getGuidancePrompt(strRealKBConfigId);
//								if(StringUtils.hasLength(strKBInfo)) {
//									knowledgeBaseMap.put(String.format("kb%1$s", nIndex), strKBInfo);
//									nIndex ++;
//								}
//							}
//							catch (Throwable ex) {
//								log.error(String.format("获取知识库[%1$s]引导信息发生异常，%2$s", strRealKBConfigId, ex.getMessage()), ex);
//							}
//						}
//					}
//					
//					//进一步填充
//					this.fillAIChatSkillPromptMap(skillPromptMap);
//					
//					
//					try {
//						List<String> list = detectSkillAndAgents(chatCompletionRequest, skillPromptMap, knowledgeBaseMap);
//						if (!ObjectUtils.isEmpty(list)) {
//							//判断列表
//							for(String strSkillId : list) {
//								if(strSkillId.indexOf("@agent") != -1) {
//									strRedirectAgentId = strSkillId;
//									break;
//								}
//							}
//						}
//						//填入已经做过的Skill清单，后续不要再做
//						chatCompletionRequest.set("_skills", list);
//					} catch (Throwable ex) {
//						log.error(String.format("检测技能发生异常，%1$s", ex.getMessage()), ex);
//					}
//				}
//				
//				if(StringUtils.hasLength(strRedirectAgentId)) {
//					ISysAIChatAgentRuntime iSysAIChatAgentRuntime = sysAIChatAgentRuntimeMap.get(strRedirectAgentId);
//					if(iSysAIChatAgentRuntime == null) {
//						log.error(String.format("返回的技能代理标识[%1$s]无效", strRedirectAgentId));
//					}
//					else {
//						//直接中断
//						if(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_CHATCOMPLETION.equals(ChatCompletionSessionHolder.peekMust().getAction())) {
//							return iSysAIChatAgentRuntime.chatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
//						}
//						else {
//							PortalAsyncAction portalAsyncAction = iSysAIChatAgentRuntime.asyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
//							try {
//								ChatCompletionResult result = this.doExecuteChatPortalAsyncActionOutput(portalAsyncAction);
//								//判断结果是否存在停止原因
//								String strStopReason = DataTypeUtils.asString(result.get("srfstopreason"));
//								if (DELogicSysAIChatAgentType.CHATINPUT.value.equals(strStopReason)) {
//									ChatCompletionSessionHolder.peekMust().setParam(AIAGENTTAG, strRedirectAgentId);
//								}
//								return result;
//							}
//							catch (Throwable ex) {
//								if(ex instanceof UserCancelException) {
//									try {
//										Map<String, Object> body = new HashMap<String, Object>();
//										body.putAll(chatCompletionRequest.any());
//										iSysAIChatAgentRuntime.cancelChatCompletion(new Entity(), portalAsyncAction.getAsyncAcitonId(), body);
//									} catch (Throwable ex2) {
//										log.error(ex2);
//									}
//								}
//								throw ex;				
//							}
//						}
//					}
//				}
//			}
//		}
//		return super.onChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
//	}
//	
//	@Override
//	protected List<String> detectSkills(ChatCompletionRequest request, Map<String, String> skillMap, Map<String, Object> templParams) throws Throwable {
//		Object skillIds = request.get("_skills");
//		if(skillIds instanceof List) {
//			request.reset("_skills");
//			return (List)skillIds;
//		}
//		return super.detectSkills(request, skillMap, templParams);
//	}
//	
//	protected List<String> detectSkillAndAgents(ChatCompletionRequest request, Map<String, String> skillMap, Map<String, String> knowledgeBaseMap) throws Throwable {
//		return this.detectSkillAndAgents(request, skillMap, knowledgeBaseMap, new HashMap<String, Object>());
//	}
//	
//	protected List<String> detectSkillAndAgents(ChatCompletionRequest request, Map<String, String> skillMap, Map<String, String> knowledgeBaseMap, Map<String, Object> templParams) throws Throwable {
//
//		List<ChatMessage> historeis = this.getRealChatMessages(request);
//		if (ObjectUtils.isEmpty(historeis)) {
//			return Collections.EMPTY_LIST;
//		}
//
//		Map<String, Object> params = new HashMap<String, Object>();
//		if(!ObjectUtils.isEmpty(templParams)) {
//			params.putAll(templParams);
//		}
//		if(!params.containsKey(TEMPLATE_PARAM_REQUEST_MESSAGES)) {
//			params.put(TEMPLATE_PARAM_REQUEST_MESSAGES, JsonUtils.toString(historeis));
//		}
//		if(!params.containsKey(TEMPLATE_PARAM_SKILLS)) {
//			params.put(TEMPLATE_PARAM_SKILLS, JsonUtils.toString(skillMap));
//		}
//		if(!params.containsKey(TEMPLATE_PARAM_KNOWLEDGE_BASES)) {
//			params.put(TEMPLATE_PARAM_KNOWLEDGE_BASES, JsonUtils.toString(knowledgeBaseMap));
//		}
//		
//		String strContent = this.getRawContent(Collections.EMPTY_LIST, this.getSkillAndAgentDetectionPrompt(), params);
//
//		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
//
//		List<ChatMessage> chatMessageList = ChatMessagesBuilder.create().xml(strContent).build();
//		if (!ObjectUtils.isEmpty(chatMessageList)) {
//			chatCompletionRequest.setMessages(chatMessageList);
//		} else {
//			chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strContent).build());
//		}
//
//		ChatCompletionResult result = this.rawChatCompletion(ISysAIUtilRuntime.AIPLATFORM_ANALYSIS, chatCompletionRequest);
//		JsonNode jsonNode = net.ibizsys.central.plugin.ai.util.AIChatUtils.getJsonNode(result);
//		if(jsonNode instanceof ArrayNode) {
//			return JsonUtils.asList(jsonNode);
//		}
//		
//		if(jsonNode instanceof ObjectNode) {
//			ObjectNode objectNode = (ObjectNode)jsonNode;
//			JsonNode user_intent = objectNode.path("user_intent");
//			if(!user_intent.isMissingNode()) {
//				if(ObjectUtils.isEmpty(request.getChunkQueries())) {
//					if(user_intent.isArray()) {
//						request.setChunkQueries(JsonUtils.asList(user_intent));
//					}
//					else {
//						request.setChunkQueries(Arrays.asList(user_intent.asText()));	
//					}
//				}
//			}
//			
//			JsonNode skill_list = objectNode.path("skill_list");
//			if(!skill_list.isMissingNode() && skill_list.isArray()) {
//				return JsonUtils.asList(skill_list);
//			}
//		}
//		
//		log.error(String.format("无法识别的结果对象：\r\n%1$s", jsonNode!=null?jsonNode.toPrettyString():null));
//		throw new Exception("无法识别的结果对象");
//	}
	
	
	@Override
	protected Object onToolCall(String strSkillId, String command, Map<String, Object> args, Map<String, Object> params) throws Throwable {
		if (!SKILLS_WORKSPACE.equalsIgnoreCase(strSkillId)) {
			if (COMMAND_EXECUTE_CHAT.equals(command)) {
				Object request = args.get(COMMAND_PARAM_EXECUTE_CHAT_REQUEST);
				if (!(request instanceof Map)) {
					throw new Exception("未传入请求参数");
				}
				
				ChatCompletionRequest chatCompletionRequest = AIChatUtils.fromOpenAIChatCompletionRequest((Map)request);
				//移除系统消息
				if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
					throw new Exception("传入请求参数未携带消息");
				}
				
				if(ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(chatCompletionRequest.getMessages().get(0).getRole())) {
					chatCompletionRequest.getMessages().remove(0);
				}
				
				Map dataMap = null;
				String strAIAgentTag = null;
				Object data = args.get(COMMAND_PARAM_EXECUTE_CHAT_DATA);
				if(data instanceof Map) {
					dataMap = (Map)data;
					strAIAgentTag = DataTypeUtils.asString(dataMap.get(ISysAIAgentRuntime.AIAGENTTAG));
				}
				
				if(StringUtils.hasLength(strAIAgentTag)) {
					chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, strAIAgentTag);
				}
				
				Object kb_query = args.get(COMMAND_PARAM_EXECUTE_CHAT_KB_QUERY);
				if(kb_query instanceof Map) {
					Map map = (Map)kb_query;
					Object kb_tags = map.get("kb_tags");
					if(kb_tags instanceof List) {
						//放入RAW知识库，不需要转化
						chatCompletionRequest.set(CHATCOMPLETIONREQUEST_RAWKNOWLEDGEBASES, (List)kb_tags);
					}
					
					Object queries = map.get("queries");
					if(queries instanceof List) {
						chatCompletionRequest.setChunkQueries((List)queries);
					}
				}
				
				//获取Agent 
				ISysAIChatSkill iSysAIChatSkill = getAIChatSkill(strSkillId, true);
				if(iSysAIChatSkill == null || !(iSysAIChatSkill.getSkillData() instanceof ISysAIChatAgentRuntime)) {
					String[] items = strSkillId.split("[@]");
					if(items.length == 2) {
						ISysAIChatAgentRuntime iSysAIChatAgentRuntime =	this.getAIFactoryRuntime().getAIChatAgentRuntime(items[1], true);
						if(iSysAIChatAgentRuntime != null) {
							chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, items[0]);
							return JsonUtils.toString(iSysAIChatAgentRuntime.asyncChatCompletion(new Entity(dataMap), chatCompletionRequest, new HashMap<String, Object>(), true, false));
						}
					}
					else
						{
							ISysAIChatAgentRuntime iSysAIChatAgentRuntime =	this.getAIFactoryRuntime().getAIChatAgentRuntime(items[0], true);
							if(iSysAIChatAgentRuntime != null) {
								return JsonUtils.toString(iSysAIChatAgentRuntime.asyncChatCompletion(new Entity(dataMap), chatCompletionRequest, new HashMap<String, Object>(), true, false));
							}
						}
					
					return new Exception(String.format("指定AIAgent[%1$s]不存在", strSkillId));
				}
				
				
				
				String[] items = strSkillId.split("[@]");
				if(items.length == 3) {
					ISysAIChatAgentRuntime iSysAIChatAgentRuntime =	this.getAIFactoryRuntime().getAIChatAgentRuntime(items[1], true);
					if(iSysAIChatAgentRuntime != null) {
						chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, items[0]);
						return JsonUtils.toString(iSysAIChatAgentRuntime.asyncChatCompletion(new Entity(dataMap), chatCompletionRequest, new HashMap<String, Object>(), true, false));
					}
				}
				else
					{
						ISysAIChatAgentRuntime iSysAIChatAgentRuntime =	this.getAIFactoryRuntime().getAIChatAgentRuntime(items[0], true);
						if(iSysAIChatAgentRuntime != null) {
							return JsonUtils.toString(iSysAIChatAgentRuntime.asyncChatCompletion(new Entity(dataMap), chatCompletionRequest, new HashMap<String, Object>(), true, false));
						}
					}
						
				
				return JsonUtils.toString(((ISysAIChatAgentRuntime)iSysAIChatSkill.getSkillData()).asyncChatCompletion(new Entity(dataMap), chatCompletionRequest, new HashMap<String, Object>(), true, false));
			}
		}
		return super.onToolCall(strSkillId, command, args, params);
	}
	
	
	@Override
	protected boolean isRedirectToHub() {
		return false;
	}
	
}
