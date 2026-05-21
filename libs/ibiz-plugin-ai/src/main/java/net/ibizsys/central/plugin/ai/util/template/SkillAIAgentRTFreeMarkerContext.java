package net.ibizsys.central.plugin.ai.util.template;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntimeContext;
import net.ibizsys.central.plugin.ai.agent.IAIChatSkillAgentRuntimeBase;
import net.ibizsys.runtime.util.JsonUtils;

public class SkillAIAgentRTFreeMarkerContext extends AIAgentRTFreeMarkerContext{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SkillAIAgentRTFreeMarkerContext.class);
	
	private IAIChatSkillAgentRuntimeBase iAIChatSkillAgentRuntimeBase = null;
	public SkillAIAgentRTFreeMarkerContext(ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext) {
		super(iSysAIAgentRuntimeContext);
		this.iAIChatSkillAgentRuntimeBase = (IAIChatSkillAgentRuntimeBase)iSysAIAgentRuntimeContext.getModelRuntime();
	}
	
	
	public Object execute_bash(String skill_id, String command) {
		return execute_bash(skill_id, command, null, null);
	}
	
	public Object execute_bash(String skill_id, String command, String file_path, String content) {
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_BASH_COMMAND, command);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		if(StringUtils.hasLength(file_path)) {
			args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, file_path);
			args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT, content);
		}
		try {
			return this.iAIChatSkillAgentRuntimeBase.toolCall(IAIChatSkillAgentRuntimeBase.COMMAND_EXECUTE_BASH, args);
		} catch (Throwable ex) {
			log.error(ex);
			return ex.getMessage();
		}
	}
	
	
	public Object read_file(String skill_id, String file_path) {
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, file_path);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		try {
			return this.iAIChatSkillAgentRuntimeBase.toolCall(IAIChatSkillAgentRuntimeBase.COMMAND_READ_FILE, args);
		} catch (Throwable ex) {
			log.error(ex);
			return ex.getMessage();
		}
	}
	
	public Object write_file(String skill_id, String file_path, String content) {
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, file_path);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT, content);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		
		try {
			return this.iAIChatSkillAgentRuntimeBase.toolCall(IAIChatSkillAgentRuntimeBase.COMMAND_WRITE_FILE, args);
		} catch (Throwable ex) {
			log.error(ex);
			return ex.getMessage();
		}
	}
	
	public Object delete_file(String skill_id, String file_path) {
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, file_path);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		
		try {
			return this.iAIChatSkillAgentRuntimeBase.toolCall(IAIChatSkillAgentRuntimeBase.COMMAND_DELETE_FILE, args);
		} catch (Throwable ex) {
			log.error(ex);
			return ex.getMessage();
		}
	}
	
	
	public Object execute_cloud(String skill_id, String url, String method, String body) {
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_URL, url);
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_METHOD, method);
		if(StringUtils.hasLength(body)) {
			JsonNode node = JsonUtils.toJsonNode(body);
			if(node instanceof ObjectNode) {
				args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_BODY, JsonUtils.asMap(body));
			}
			else
				if(node instanceof ArrayNode) {
					args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_BODY, JsonUtils.asList(body));
				}
				else
					args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_BODY, body);
		}
		
		
		args.put(IAIChatSkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		
		try {
			return this.iAIChatSkillAgentRuntimeBase.toolCall(IAIChatSkillAgentRuntimeBase.COMMAND_EXECUTE_CLOUD, args);
		} catch (Throwable ex) {
			log.error(ex);
			return ex.getMessage();
		}
	}
	
}
