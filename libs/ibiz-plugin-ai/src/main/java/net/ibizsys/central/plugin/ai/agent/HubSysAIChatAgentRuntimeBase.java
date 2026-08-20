package net.ibizsys.central.plugin.ai.agent;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

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
		this.strSkillAndAgentDetectionPrompt = this.getSystemRuntime().getResourceContent(HubSysAIChatAgentRuntimeBase.class, "SkillDetectionPrompt.en.md", false);
		
		if(this.getMasterAIChatAgentGroup(true) == null) {
			this.prepareMasterAIChatAgentGroup();
			this.getMasterAIChatAgentGroup(false);
		}
		
		super.onInit();
		
		
		
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
			//this.fillAIChatSkillDescMap(this.sysAIChatSkillDescMap);
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
	protected Map<String, String> getAIChatSkillDescs(boolean includeRemote) {
		
		Map<String, String> map = super.getAIChatSkillDescs(includeRemote);
		try {
			prepareChatAgentSysAIChatSkillMap();
		}
		catch (Exception ex) {
			log.error(String.format("准备聊天子代理技能描述发生异常，%1$s", ex.getMessage()), ex);
		}

		if(ObjectUtils.isEmpty(this.sysAIChatSkillDescMap)) {
			return map;
		}
		
		Map<String, String> skillDescMap = new LinkedHashMap<String, String>(map);
		skillDescMap.putAll(this.sysAIChatSkillDescMap);
		return Collections.unmodifiableMap(skillDescMap);
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
