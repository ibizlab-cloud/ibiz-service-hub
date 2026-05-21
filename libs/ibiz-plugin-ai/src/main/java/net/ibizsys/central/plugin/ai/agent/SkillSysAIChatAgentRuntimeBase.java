package net.ibizsys.central.plugin.ai.agent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.ai.IAIChatMemoryUtil;
import net.ibizsys.central.cloud.core.ai.IAIChatSkillUtil;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatSkill;
import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageType;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.plugin.ai.util.AIChatUtils;
import net.ibizsys.central.plugin.ai.util.ChatCompletionSessionHolder;
import net.ibizsys.central.plugin.ai.util.IChatCompletionSession;
import net.ibizsys.central.plugin.ai.util.template.AIAgentRTFreeMarkerContext;
import net.ibizsys.central.plugin.ai.util.template.SkillAIAgentRTFreeMarkerContext;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.model.PSModelEnums.AISkillLoadMode;
import net.ibizsys.model.ai.PSSysAIChatAgentImpl;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class SkillSysAIChatAgentRuntimeBase extends ProxySysAIChatAgentRuntimeBase implements IAIChatSkillAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SkillSysAIChatAgentRuntimeBase.class);

	public final static String TEMPLATE_PARAM_KNOWLEDGE_BASES = "knowledge_bases";
	public final static String TEMPLATE_PARAM_LAST_KNOWLEDGE_BASES = "last_knowledge_bases";
	
	private Map<String, ISysAIChatSkill> sysAIChatSkillMap = new ConcurrentHashMap<String, ISysAIChatSkill>();
	private Map<String, String> sysAIChatSkillDescMap = new ConcurrentHashMap<String, String>();
	private List<ChatTool> chatTools = null;
	//private String strToolCallBaseUrl = null;
	private String strSkillDetectionPrompt = null;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private String strChatToolsTemplate = null;
	private String strToolCallBaseUrl = null;
	private List<String> preloadSkillIdList = new ArrayList<String>();
	
	@Override
	protected void onInit() throws Exception {
		if(ObjectUtils.isEmpty(this.getSkillDetectionPrompt())) {
			this.setSkillDetectionPrompt(net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(SkillSysAIChatAgentRuntimeBase.class, "SkillDetectionPrompt.en.md", false));
		}
		if (ObjectUtils.isEmpty(this.getPSModelObject().getSystemPrompt())) {
			String strSystemPrompt = net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(SkillSysAIChatAgentRuntimeBase.class, "SystemPrompt.en.md", false);
			if (!ObjectUtils.isEmpty(strSystemPrompt)) {
				this.getPSModelObject().getObjectNode().put(PSSysAIChatAgentImpl.ATTR_GETSYSTEMPROMPT, strSystemPrompt);
			}
		}
		else {
			//判断是否有${original_prompt}
			String strSystemPrompt = this.getPSModelObject().getSystemPrompt();
			if(strSystemPrompt.indexOf("${original_prompt}") != -1) {
				String strOriginalSystemPrompt = net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(SkillSysAIChatAgentRuntimeBase.class, "SystemPrompt.en.md", false);
				strSystemPrompt = strSystemPrompt.replace("${original_prompt}", strOriginalSystemPrompt);
				//写回
				this.getPSModelObject().getObjectNode().put(PSSysAIChatAgentImpl.ATTR_GETSYSTEMPROMPT, strSystemPrompt);
			}
		}

		this.getPSModelObject().getObjectNode().put(PSSysAIChatAgentImpl.ATTR_GETENABLETOOLS, true);

		super.onInit();

		this.strChatToolsTemplate = net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(SkillSysAIChatAgentRuntimeBase.class, "Tools.json", false);

		this.strToolCallBaseUrl = String.format("lb://servicehub-%1$s/%1$s/ai/factories/%2$s/chats/%3$s", this.getSystemRuntime().getDeploySystemId(), this.getAIFactoryRuntime().getFullUniqueTag(), this.getUniqueTag());
		String strChatTools = this.strChatToolsTemplate.replace("${toolcall_base_url}", this.strToolCallBaseUrl).replace("${srfscope}", "").replace("${srfchatsessionid}", "");
		this.chatTools = JsonUtils.as(strChatTools, ChatToolListType);

		this.prepareSkills();
	}

	protected List<ISysAIChatSkill> getLoadAIChatSkills() {
		if(StringUtils.hasLength(this.getPSModelObject().getSkillLoadMode())) {
			if(AISkillLoadMode.SPECIFIED.value.equalsIgnoreCase(this.getPSModelObject().getSkillLoadMode())) {
				if(!StringUtils.hasLength(this.getPSModelObject().getSkillTags())) {
					return Collections.EMPTY_LIST;
				}
				
				List<ISysAIChatSkill> list = this.getAIFactoryRuntime().getAIChatSkills();
				if(ObjectUtils.isEmpty(list)) {
					return Collections.EMPTY_LIST;
				}
				
				Map<String, ISysAIChatSkill> map = new LinkedHashMap<String, ISysAIChatSkill>();
				for(ISysAIChatSkill iSysAIChatSkill : list) {
					map.put(iSysAIChatSkill.getId(), iSysAIChatSkill);
				}
				
				List<ISysAIChatSkill> loadedSkillList = new ArrayList<ISysAIChatSkill>();
				String[] tags = this.getPSModelObject().getSkillTags().split("[,]");
				for(String tag : tags) {
					ISysAIChatSkill iSysAIChatSkill = map.remove(tag);
					if(iSysAIChatSkill == null) {
						log.warn(String.format("指定技能[%1$s]不存在，忽略加载", tag));
						continue;
					}
					loadedSkillList.add(iSysAIChatSkill);
				}
				
				if(loadedSkillList.size() == 1) {
					preloadSkillIdList.add(loadedSkillList.get(0).getId());
				}
				return loadedSkillList;
			}
		}
		
		return this.getAIFactoryRuntime().getAIChatSkills();
	}
	
	protected void prepareSkills() throws Exception {
		Map<String, ISysAIChatSkill> tempAIChatSkillMap = new ConcurrentHashMap<String, ISysAIChatSkill>();
		Map<String, String> tempAIChatSkillDescMap = new ConcurrentHashMap<String, String>();

		List<ISysAIChatSkill> sysAIChatSkillList = this.getLoadAIChatSkills();
		
		// 根据当前代理的Skill加载模式
		if (!ObjectUtils.isEmpty(sysAIChatSkillList)) {
			for (ISysAIChatSkill iSysAIChatSkill : sysAIChatSkillList) {
				tempAIChatSkillMap.put(iSysAIChatSkill.getId(), iSysAIChatSkill);
				tempAIChatSkillDescMap.put(iSysAIChatSkill.getId(), iSysAIChatSkill.getDescription());
			}
		}

		this.sysAIChatSkillMap.clear();
		this.sysAIChatSkillMap.putAll(tempAIChatSkillMap);

		this.sysAIChatSkillDescMap.clear();
		this.sysAIChatSkillDescMap.putAll(tempAIChatSkillDescMap);
	}

	// protected Map<String, ISysAIChatSkill> getAIChatSkillMap() {
	// return this.sysAIChatSkillMap;
	// }
	
	protected void fillAIChatSkillDescMap(Map<String, String> aiChatSkillPromptMap) {
		aiChatSkillPromptMap.putAll(this.sysAIChatSkillDescMap);
	}
	
	protected void setSkillDetectionPrompt(String strSkillDetectionPrompt) {
		this.strSkillDetectionPrompt = strSkillDetectionPrompt;
	}

	protected String getSkillDetectionPrompt() {
		return this.strSkillDetectionPrompt;
	}

	
	@Override
	protected void fillStringTemplates(Set<String> set) {
		set.add(this.getSkillDetectionPrompt());
		super.fillStringTemplates(set);
	}
	
	@Override
	protected AIAgentRTFreeMarkerContext createAIAgentRTFreeMarkerContext() {
		return new SkillAIAgentRTFreeMarkerContext(this.getModelRuntimeContext());
	}

	@Override
	protected void onReload() throws Throwable {
		prepareSkills();
		super.onReload();
	}

	@Override
	protected void fillChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, Object dataOrKeys, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories, boolean bFillKnowledgeBases) throws Throwable {
		this.fillChatCompletionSkills(chatCompletionRequest);
		super.fillChatCompletionRequest(chatCompletionRequest, dataOrKeys, params, bAppendSystemMessage, bAppendHistories, bFillKnowledgeBases);
	}
	
	protected void fillChatCompletionSkills(ChatCompletionRequest chatCompletionRequest) {
		// 进行意图分析
		try {
			String strChatSessionId = null;
			IChatCompletionSession iChatCompletionSession = ChatCompletionSessionHolder.peek();
			if(iChatCompletionSession != null) {
				strChatSessionId = iChatCompletionSession.getChatSessionId();
			}
			if(ObjectUtils.isEmpty(strChatSessionId)) {
				strChatSessionId = chatCompletionRequest.getSessionId();
			}
			
			List<String> list = null;
			if(!ObjectUtils.isEmpty(this.preloadSkillIdList)) {
				list = Collections.unmodifiableList(this.preloadSkillIdList);
			}
			else {
				if(this.getSysAIFactoryRuntimeContext().isEnableSkillDetection()) {
					list = detectSkills(chatCompletionRequest, this.sysAIChatSkillDescMap);
				}
				else {
					//取上一次的skill_id
					if(!ObjectUtils.isEmpty(strChatSessionId)) {
						String strSkillId = this.getSysAIFactoryRuntimeContext().getSkillChatSessionContent(IAIChatSkillAgentRuntimeBase.SKILLWITHSESSIONFILE, chatCompletionRequest.getSessionId(), "");
						if(StringUtils.hasLength(strSkillId)) {
							list = Arrays.asList(strSkillId);
						}
					}
				}
			}
			
			
			if (!ObjectUtils.isEmpty(list)) {
				StringBuilder sb = new StringBuilder();
				sb.append("下面将预先提供相关技能的定义文件内容，后续使用到这些文件将无需再次调用获取\n");
				// 默认送入SKILL文件
				for (String strSkillId : list) {
					ISysAIChatSkill iSysAIChatSkill = this.getAIChatSkill(strSkillId, true);
					if (iSysAIChatSkill != null) {
						log.debug(String.format("检测技能[%1$s]", iSysAIChatSkill.getName()));
						sb.append(String.format("## %1$s`SKILL_SESSION.md`\n---\n%2$s\n\n## 会话记忆\n%3$s\n---", strSkillId, iSysAIChatSkill.getPrompt(), this.getSysAIFactoryRuntimeContext().getSkillChatSessionContent(strSkillId, strChatSessionId)));
					}
				}

				int nPos = 0;
				if (ChatMessageRole.SYSTEM.getValue().equals(chatCompletionRequest.getMessages().get(nPos).getRole())) {
					nPos = 1;
				}

				List<ChatMessage> insertMsgList = null;
				if (ChatMessageRole.ASSISTANT.getValue().equals(chatCompletionRequest.getMessages().get(nPos).getRole())) {
					insertMsgList = ChatMessagesBuilder.create().user(sb.toString()).build();
				} else {
					insertMsgList = ChatMessagesBuilder.create().assistant(sb.toString()).build();
				}
				
				if(!ObjectUtils.isEmpty(insertMsgList)) {
					for(ChatMessage chatMessage : insertMsgList) {
						chatMessage.setType(ChatMessageType.SYSTEM.getValue());
					}
					chatCompletionRequest.getMessages().addAll(nPos, insertMsgList);
				}
			}
		} catch (Throwable ex) {
			log.error(String.format("检测技能发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected List<String> detectSkills(ChatCompletionRequest request, Map<String, String> skillMap) throws Throwable {
		return this.detectSkills(request, skillMap, new HashMap<String, Object>());
	}

	protected List<String> detectSkills(ChatCompletionRequest request, Map<String, String> skillMap, Map<String, Object> templParams) throws Throwable {

		List<ChatMessage> historeis = this.getRealChatMessages(request);
		if (ObjectUtils.isEmpty(historeis)) {
			return Collections.EMPTY_LIST;
		}

		Map<String, Object> params = new HashMap<String, Object>();
		if(!ObjectUtils.isEmpty(templParams)) {
			params.putAll(templParams);
		}
		if(!params.containsKey(TEMPLATE_PARAM_REQUEST_MESSAGES))
			params.put(TEMPLATE_PARAM_REQUEST_MESSAGES, JsonUtils.toString(historeis));
		if(!params.containsKey(TEMPLATE_PARAM_SKILLS))
			params.put(TEMPLATE_PARAM_SKILLS, JsonUtils.toString(skillMap));
		

		String strContent = this.getRawContent(Collections.EMPTY_LIST, this.getSkillDetectionPrompt(), params);

		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();

		List<ChatMessage> chatMessageList = ChatMessagesBuilder.create().xml(strContent).build();
		if (!ObjectUtils.isEmpty(chatMessageList)) {
			chatCompletionRequest.setMessages(chatMessageList);
		} else {
			chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strContent).build());
		}

		ChatCompletionResult result = this.rawChatCompletion(ISysAIUtilRuntime.AIPLATFORM_ANALYSIS, chatCompletionRequest);
		JsonNode jsonNode = net.ibizsys.central.plugin.ai.util.AIChatUtils.getJsonNode(result);
		if(jsonNode instanceof ArrayNode) {
			return JsonUtils.asList(jsonNode);
		}
		
		if(jsonNode instanceof ObjectNode) {
			ObjectNode objectNode = (ObjectNode)jsonNode;
			JsonNode user_intent = objectNode.path("user_intent");
			if(!user_intent.isMissingNode()) {
				if(ObjectUtils.isEmpty(request.getChunkQueries())) {
					if(user_intent.isArray()) {
						request.setChunkQueries(JsonUtils.asList(user_intent));
					}
					else {
						request.setChunkQueries(Arrays.asList(user_intent.asText()));	
					}
				}
			}
			
			JsonNode skill_list = objectNode.path("skill_list");
			if(!skill_list.isMissingNode() && skill_list.isArray()) {
				return JsonUtils.asList(skill_list);
			}
		}
		
		log.error(String.format("无法识别的结果对象：\r\n%1$s", jsonNode!=null?jsonNode.toPrettyString():null));
		throw new Exception("无法识别的结果对象");
	}

	@Override
	protected List<ChatTool> onGetTools(Object dataOrKeys, Map<String, Object> params) throws Throwable {
		//获取当前会话
		IChatCompletionSession iChatCompletionSession = ChatCompletionSessionHolder.peek();
		if(iChatCompletionSession != null && (StringUtils.hasLength(iChatCompletionSession.getBusinessScope()) || StringUtils.hasLength(iChatCompletionSession.getChatSessionId()))) {
			String strChatTools = this.strChatToolsTemplate.replace("${toolcall_base_url}", this.strToolCallBaseUrl).replace("${srfscope}", DataTypeUtils.asString(iChatCompletionSession.getBusinessScope(), ""))
					.replace("${srfchatsessionid}", DataTypeUtils.asString(iChatCompletionSession.getChatSessionId(), ""));
			return JsonUtils.as(strChatTools, ChatToolListType);
		}
		
		return this.chatTools;
	}

	protected ISysAIChatSkill getAIChatSkill(String strSkillId, boolean tryMode) throws Exception {
		ISysAIChatSkill iSysAIChatSkill = this.sysAIChatSkillMap.get(strSkillId);
		if (iSysAIChatSkill != null || tryMode) {
			return iSysAIChatSkill;
		}
		throw new Exception(String.format("指定技能[%1$s]不存在", strSkillId));
	}

	@Override
	public Object toolCall(String command, Map<String, Object> args) throws Throwable {
		try {
			log.debug(String.format("执行工具[%1$s]\n%2$s", command, JsonUtils.toString(args)));
			if(!args.containsKey(COMMAND_PARAM_SKILL_ID)) {
				args.put(COMMAND_PARAM_SKILL_ID, SKILLS_WORKSPACE);
			}
			return this.onToolCall(command, args);
		} catch (Throwable ex) {
			log.error(String.format("执行工具[%1$s][%2$s]调用发生异常，%3$s", command, args, ex.getMessage()), ex);
			return String.format("执行工具调用发生异常，返回以下信息：\n%1$s", ex.getMessage());
		}
	}

	protected Object onToolCall(String command, Map<String, Object> args) throws Throwable {
		String strSkillId = DataTypeUtils.asString(args.get(COMMAND_PARAM_SKILL_ID));
		if (ObjectUtils.isEmpty(strSkillId)) {
			throw new Exception("未传入技能标识");
		}
		
		String strScope = null;
		String strChatSessionId = null;
		
		
		String strFromTemplate = DataTypeUtils.asString(args.get(COMMAND_PARAM_FROM_TEMPLATE));
		if(StringUtils.hasLength(strFromTemplate) && DataTypeUtils.asBoolean(strFromTemplate, false)) {
			//来自模板
			IChatCompletionSession iChatCompletionSession = ChatCompletionSessionHolder.peek();
			if(iChatCompletionSession!=null) {
				strScope = iChatCompletionSession.getBusinessScope();
				strChatSessionId = iChatCompletionSession.getChatSessionId();
			}
		}
		else {
			RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
			if (requestAttributes instanceof ServletRequestAttributes) {
				strScope = ((ServletRequestAttributes)requestAttributes).getRequest().getHeader(IAIChatSkillAgentRuntimeBase.HEADER_SCOPE);
				strChatSessionId = ((ServletRequestAttributes)requestAttributes).getRequest().getHeader(IAIChatSkillAgentRuntimeBase.HEADER_CHATSESSIONID);
			}
		}
		
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(IAIChatSkillAgentRuntimeBase.HEADER_SCOPE, strScope);
		params.put(IAIChatSkillAgentRuntimeBase.HEADER_CHATSESSIONID, strChatSessionId);
		params.put(ISysAIAgentRuntime.AIAGENTTAG, this.getUniqueTag());
		
		return this.onToolCall(strSkillId, command, args, params);
	}
	
	protected Object onToolCall(String strSkillId, String command, Map<String, Object> args, Map<String, Object> params) throws Throwable {
		
		boolean bFromTemplate = DataTypeUtils.asBoolean(args.get(COMMAND_PARAM_FROM_TEMPLATE), false);
		
		if (SKILLS_WORKSPACE.equalsIgnoreCase(strSkillId)) {
			if (COMMAND_WRITE_FILE.equals(command)) {
				// 判断文件是否存在
				String strFilePath = DataTypeUtils.asString(args.get(COMMAND_PARAM_X_FILE_PATH));
				if (ObjectUtils.isEmpty(strFilePath)) {
					return String.format("写入文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
				}

				String strContent = DataTypeUtils.asString(args.get(COMMAND_PARAM_WRITE_FILE_CONTENT), "");
				if(MEMORYFILE_RESIDENT.equalsIgnoreCase(strFilePath) || MEMORYFILE_REGULAR.equalsIgnoreCase(strFilePath)) {
					String strScope = DataTypeUtils.asString(params.get(IAIChatSkillAgentRuntimeBase.HEADER_SCOPE));
					IAIChatMemoryUtil iAIChatMemoryUtil = this.getSysAIFactoryRuntimeContext().getAIChatMemoryUtil(true);
					if(iAIChatMemoryUtil != null) {
						Map<String, Object> taskMap = new HashMap<String, Object>();
						
						taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_USER_ID, EmployeeContext.getCurrentMust().getUserid());
						
						if(StringUtils.hasLength(this.getPSModelObject().getMemoryKBTag())) {
							taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG, this.getPSModelObject().getMemoryKBTag());
						}
						if(StringUtils.hasLength(this.getPSModelObject().getMemoryDocTag())) {
							taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG, this.getPSModelObject().getMemoryDocTag());
						}
						
						taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE, this.getPSModelObject().getMemoryIsolationMode());
						if(StringUtils.hasLength(strScope)) {
							taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_BUSINESS_SCOPE, strScope);
						}
						
						if(MEMORYFILE_RESIDENT.equalsIgnoreCase(strFilePath)) {
							taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE, IAIChatMemoryUtil.MEMORY_TYPE_RESIDENT);
						}
						else
							if(MEMORYFILE_REGULAR.equalsIgnoreCase(strFilePath)) {
								taskMap.put(IAIChatMemoryUtil.MEMORYTASK_PREDEFINEDFIELD_MEMORY_TYPE, IAIChatMemoryUtil.MEMORY_TYPE_REGULAR);
							}
						
						//启动线程存储
						this.getSystemRuntime().threadRun(new Runnable() {
							public void run() {
								try {
									iAIChatMemoryUtil.writeMemory(taskMap, strContent);
								}
								catch (Throwable ex) {
									//log.error(String.format("写入记忆发生异常，返回以下信息：\n%1$s", ex.getMessage()), ex);
									log.error(String.format("写入记忆发生异常，返回以下信息：\n%1$s", ex.getMessage()));
								}
							}
						});
						
						return String.format("正在异步写入记忆，记忆生效需要2~3分钟");
					}
				}
			}
			
			if (COMMAND_FETCH_KBS.equals(command)) {
				String strChatSessionId = (String)params.get(IAIChatSkillAgentRuntimeBase.HEADER_CHATSESSIONID);
				Map<String, Object> body = new LinkedHashMap<String, Object>();
				Object queries = args.get(COMMAND_PARAM_FETCH_KBS_QUERIES);
				if(ObjectUtils.isEmpty(queries)) {
					throw new Exception("未传入查询关键字");
				}
				
				if(queries instanceof String) {
					queries = Arrays.asList(queries);
				}
				
				Object size = args.get(COMMAND_PARAM_FETCH_KBS_SIZE);
				
				body.put("queries", queries);
				body.put("size", size);
				IWebClient iWebClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_KB);
				
				try {
					String strRet = iWebClient.post("lb://ibizcloud-kb/kb/fetchkbs", body).getBody();
					if(!ObjectUtils.isEmpty(strChatSessionId)) {
						this.getSysAIFactoryRuntimeContext().updateSkillChatSessionContent(COMMAND_FETCH_KBS, strChatSessionId, strRet);
					}
					//记录
					if(ObjectUtils.isEmpty(strRet)) {
						if(bFromTemplate) {
							return "";
						}
						return String.format("查询知识库成功，未返回任何内容");
					}
					else {
						if(bFromTemplate) {
							return strRet;
						}
						return String.format("查询知识库成功，返回以下内容：\n%1$s", strRet);
					}
				} catch (Throwable ex) {
					return String.format("查询知识库调用发生错误，返回以下信息：\n%1$s", ex.getMessage());
				}
			}
			
			if (COMMAND_FETCH_KB_CHUNKS.equals(command)) {
				
				Map<String, Object> body = new LinkedHashMap<String, Object>();
				Map<String, Object> url_params = new LinkedHashMap<String, Object>();
				
				
				Object kb_tag = args.get(COMMAND_PARAM_FETCH_KB_CHUNKS_KB_TAG);
				if(ObjectUtils.isEmpty(kb_tag)) {
					throw new Exception("未传入查询知识库标记");
				}
				
				url_params.put(COMMAND_PARAM_FETCH_KB_CHUNKS_KB_TAG, kb_tag);
				
				
				Object queries = args.get(COMMAND_PARAM_FETCH_KBS_QUERIES);
				if(ObjectUtils.isEmpty(queries)) {
					throw new Exception("未传入查询关键字");
				}
				
				if(queries instanceof String) {
					queries = Arrays.asList(queries);
				}
				
				Object size = args.get(COMMAND_PARAM_FETCH_KBS_SIZE);
				body.put("queries", queries);
				if(size != null)
					body.put("size", size);
				
				Object similarity = args.get(COMMAND_PARAM_FETCH_KB_CHUNKS_SIMILARITY);
				if(similarity != null) {
					body.put("n_similarity_gtandeq", similarity);
				}
				
				Object rerank = args.get(COMMAND_PARAM_FETCH_KB_CHUNKS_RERANK);
				if(rerank != null) {
					body.put("n_rerank_eq", rerank);
				}
				else {
					body.put("n_rerank_eq", 2);
				}
				
				Object raptor = args.get(COMMAND_PARAM_FETCH_KB_CHUNKS_RAPTOR);
				if(raptor != null) {
					body.put("n_raptor_eq", raptor);
				}
				else {
					body.put("n_raptor_eq", 2);
				}
				
				Object doctopk = args.get(COMMAND_PARAM_FETCH_KB_CHUNKS_DOCTOPK);
				if(doctopk != null) {
					body.put("n_doctopk_eq", doctopk);
				}
				
				IWebClient iWebClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_KB);
				
				try {
					String strRet = iWebClient.post("lb://ibizcloud-kb/kb/{kb_tag}/fetchchunks", url_params, body).getBody();
					if(ObjectUtils.isEmpty(strRet)) {
						if(bFromTemplate) {
							return "";
						}
						return String.format("查询指定知识库片段成功，未返回任何内容");
					}
					else {
						if(bFromTemplate) {
							return strRet;
						}
						return String.format("查询指定知识库片段成功，返回以下内容：\n%1$s", strRet);
					}
				} catch (Throwable ex) {
					return String.format("查询指定知识库片段调用发生错误，返回以下信息：\n%1$s", ex.getMessage());
				}
			}
			
		}


		if (COMMAND_EXECUTE_CLOUD.equals(command)) {
			//ISysAIChatSkill iSysAIChatSkill = this.getAIChatSkill(strSkillId, false);
			
			String strUrl = DataTypeUtils.asString(args.get(COMMAND_PARAM_EXECUTE_CLOUD_URL));
			if (ObjectUtils.isEmpty(strUrl)) {
				throw new Exception("未传入地址");
			}

			String strMethod = DataTypeUtils.asString(args.get(COMMAND_PARAM_EXECUTE_CLOUD_METHOD));
			if (ObjectUtils.isEmpty(strMethod)) {
				throw new Exception("未指定请求方法");
			}

			Object body = args.get(COMMAND_PARAM_EXECUTE_CLOUD_BODY);
			IWebClient iWebClient = this.getSysCloudClientUtilRuntime().getServiceClient(strUrl);
			
			try {
				String strRet = iWebClient.execute(strMethod, strUrl, null, null, null, body, null, String.class, null).getBody();
				if(ObjectUtils.isEmpty(strRet)) {
					if(bFromTemplate) {
						return "";
					}
					return String.format("执行调用成功，未返回任何内容");
				}
				else {
					if(bFromTemplate) {
						return strRet;
					}
					return String.format("执行调用成功，返回以下内容：\n%1$s", strRet);
				}
			} catch (Throwable ex) {
				return String.format("执行调用发生错误，返回以下信息：\n%1$s", ex.getMessage());
			}
		}
		
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
		
		
		//判断是否为SKILL文件操作
		if (IAIChatSkillAgentRuntimeBase.COMMAND_READ_FILE.equals(command) 
				|| IAIChatSkillAgentRuntimeBase.COMMAND_WRITE_FILE.equals(command) 
				|| IAIChatSkillAgentRuntimeBase.COMMAND_DELETE_FILE.equals(command)) {
			
			String strChatSessionId = (String)params.get(IAIChatSkillAgentRuntimeBase.HEADER_CHATSESSIONID);
			
			if (!IAIChatSkillAgentRuntimeBase.SKILLS_WORKSPACE.equalsIgnoreCase(strSkillId)) {
				if (IAIChatSkillAgentRuntimeBase.COMMAND_READ_FILE.equals(command)) {
					// 判断文件是否存在
					String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
					if (ObjectUtils.isEmpty(strFilePath)) {
						return String.format("读取文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
					}
					
					try {
						ISysAIChatSkill iSysAIChatSkill = this.getAIChatSkill(strSkillId, false);
						if(IAIChatSkillAgentRuntimeBase.MEMORYFILE_SESSION.equals(strFilePath)) {
							return String.format("读取文件成功，内容如下：\n%1$s", this.getSysAIFactoryRuntimeContext().getSkillChatSessionContent(strSkillId, strChatSessionId));
						}

						if(IAIChatSkillAgentRuntimeBase.SKILLWITHSESSIONFILE.equals(strFilePath)) {
							//登记最后一次的ID
							if(!ObjectUtils.isEmpty(strChatSessionId)) {
								this.getSysAIFactoryRuntimeContext().updateSkillChatSessionContent(IAIChatSkillAgentRuntimeBase.SKILLWITHSESSIONFILE, strChatSessionId, strSkillId);
							}
							return String.format("读取文件成功，内容如下：\n%1$s\n\n## 会话记忆\n\n%2$s\n", iSysAIChatSkill.getPrompt(), this.getSysAIFactoryRuntimeContext().getSkillChatSessionContent(strSkillId, strChatSessionId));
						}
						
						return String.format("读取文件成功，内容如下：\n%1$s", iSysAIChatSkill.readFile(strFilePath));
					}
					catch (Throwable ex) {
						log.error(String.format("读取文件发生异常，%1$s", ex.getMessage()), ex);
						return String.format("读取文件发生异常，返回以下信息：\n%1$s", ex.getMessage());
					}
				}
				
				IAIChatSkillUtil iAIChatSkillUtil = this.getSysAIFactoryRuntimeContext().getAIChatSkillUtil(true);
				if(iAIChatSkillUtil != null) {
					if (IAIChatSkillAgentRuntimeBase.COMMAND_WRITE_FILE.equals(command)) {
						// 判断文件是否存在
						String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
						if (ObjectUtils.isEmpty(strFilePath)) {
							return String.format("写入文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
						}

						String strContent = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT), "");
						try {
							
							if(IAIChatSkillAgentRuntimeBase.MEMORYFILE_SESSION.equals(strFilePath)) {
								this.getSysAIFactoryRuntimeContext().updateSkillChatSessionContent(strSkillId, strChatSessionId, strContent);
								return String.format("写入文件成功" );
							}
							
							iAIChatSkillUtil.writeFile(strSkillId, strFilePath, strContent);
							this.getSystemRuntime().threadRun(new Runnable() {
								@Override
								public void run() {
									reload();
								}
							});
							Thread.sleep(2000);
							if(bFromTemplate) {
								return "";
							}
							
							return String.format("写入文件成功" );
						}
						catch (Throwable ex) {
							log.error(String.format("写入文件发生异常，%1$s", ex.getMessage()), ex);
							return String.format("写入文件发生异常，返回以下信息：\n%1$s", ex.getMessage());
						}
					}
					
					if (IAIChatSkillAgentRuntimeBase.COMMAND_DELETE_FILE.equals(command)) {
						// 判断文件是否存在
						String strFilePath = DataTypeUtils.asString(args.get(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH));
						if (ObjectUtils.isEmpty(strFilePath)) {
							return String.format("删除文件发生异常，返回以下信息：\n未传入文件路径`file_path`");
						}
						try {
							
							if(IAIChatSkillAgentRuntimeBase.MEMORYFILE_SESSION.equals(strFilePath)) {
								this.getSysAIFactoryRuntimeContext().updateSkillChatSessionContent(strSkillId, strChatSessionId, null);
								return String.format("删除文件成功" );
							}
							
							iAIChatSkillUtil.deleteFile(strSkillId, strFilePath);
							this.getSystemRuntime().threadRun(new Runnable() {
								@Override
								public void run() {
									reload();
								}
							});
							Thread.sleep(2000);
							if(bFromTemplate) {
								return "";
							}
							return String.format("删除文件成功" );
						}
						catch (Throwable ex) {
							log.error(String.format("删除文件发生异常，%1$s", ex.getMessage()), ex);
							return String.format("删除文件发生异常，返回以下信息：\n%1$s", ex.getMessage());
						}
					}
				}
			}
		}
		
		return this.getSysAIFactoryRuntimeContext().toolCall(command, args, params);
	}

	
	@Override
	protected List<ChatMessage> doGetSystemMessages(List entityList, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		//放入知识库提示词
		this.fillKnowledgeBaseTemplParams(entityList,  ChatCompletionRequestHolder.peek(), params, exTemplParams);
		return super.doGetSystemMessages(entityList, params, exTemplParams);
	}

	protected void fillKnowledgeBaseTemplParams(List entityList, ChatCompletionRequest request, Map<String, Object> params, Map<String, Object> exTemplParams) {
		if(!exTemplParams.containsKey(TEMPLATE_PARAM_KNOWLEDGE_BASES)) {
			if(request != null) {
				if(!ObjectUtils.isEmpty(request.getKnowledgeBases())) {
					Map<String, String> knowledgeBaseMap = new LinkedHashMap<String, String>();
					//判断是否传入知识库
					for(String strKBTag : request.getKnowledgeBases()) {
						try {
							String strKBInfo = this.getSysKBUtilRuntime().getGuidancePrompt(strKBTag);
							knowledgeBaseMap.put(strKBTag, StringUtils.hasLength(strKBInfo)?strKBInfo:"");
						}
						catch (Throwable ex) {
							log.error(String.format("获取知识库[%1$s]引导信息发生异常，%2$s", strKBTag, ex.getMessage()), ex);
						}
					}
					if(!ObjectUtils.isEmpty(knowledgeBaseMap)) {
						exTemplParams.put(TEMPLATE_PARAM_KNOWLEDGE_BASES, JsonUtils.toString(knowledgeBaseMap));
					}
				}
				else
					if(StringUtils.hasLength(request.getSessionId())) {
						if(!exTemplParams.containsKey(TEMPLATE_PARAM_LAST_KNOWLEDGE_BASES)) {
							String strRet = this.getSysAIFactoryRuntimeContext().getSkillChatSessionContent(COMMAND_FETCH_KBS, request.getSessionId(), "");
							if(StringUtils.hasLength(strRet)) {
								//转化为数组
								try {
									List last = JsonUtils.asList(strRet);
									if(!ObjectUtils.isEmpty(last)) {
										exTemplParams.put(TEMPLATE_PARAM_LAST_KNOWLEDGE_BASES, strRet);
									}
								}
								catch (Throwable ex) {
									
								}
							}
						}
					}
					
			}
		}
	}
	
	@Override
	protected List<ChatMessage> doGetSuggestionMessages(List entityList, ChatCompletionRequest request, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		this.fillKnowledgeBaseTemplParams(entityList, request, params, exTemplParams);
		return super.doGetSuggestionMessages(entityList, request, params, exTemplParams);
	}


	@Override
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params, boolean bTryMode) throws Throwable {
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		if (!params.containsKey(TEMPLATE_PARAM_SKILLS)) {
			params.put(TEMPLATE_PARAM_SKILLS, JsonUtils.toString(this.sysAIChatSkillDescMap));
		}
		if (!params.containsKey(TEMPLATE_PARAM_SKILLS_WORKSPACE)) {
			params.put(TEMPLATE_PARAM_SKILLS_WORKSPACE, this.getSysAIFactoryRuntimeContext().getSkillsWorkspace().getCanonicalPath());
		}
		
		if (!params.containsKey(TEMPLATE_PARAM_SKILL_RUNNER)) {
			Map<String, String> skillRunnerData = this.getSysAIFactoryRuntimeContext().getSkillRunnerData();
			if(!ObjectUtils.isEmpty(skillRunnerData)) {
				params.put(TEMPLATE_PARAM_SKILL_RUNNER, skillRunnerData);
			}
		}
		
		if (!params.containsKey(TEMPLATE_PARAM_SKILL_ENV)) {
			Map<String, Object> skillEnv = this.getSysAIFactoryRuntimeContext().getSkillEnv();
			if(!ObjectUtils.isEmpty(skillEnv)) {
				params.put(TEMPLATE_PARAM_SKILL_ENV, skillEnv);
			}
		}
		

		return super.getContent(data, strTemplateId, params, bTryMode);
	}
	
	
	@Override
	protected ChatCompletionResult doChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		//去除知识库
		chatCompletionRequest.resetKnowledgeBases();
		return super.doChatCompletion(strAIPlatformType, chatCompletionRequest);
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

}
