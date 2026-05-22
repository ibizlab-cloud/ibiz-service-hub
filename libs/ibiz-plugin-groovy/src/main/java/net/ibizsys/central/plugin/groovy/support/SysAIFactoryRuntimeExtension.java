package net.ibizsys.central.plugin.groovy.support;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.ai.IAIFactoryRuntimeBase;
import net.ibizsys.central.cloud.core.ai.IAISkillAgentRuntimeBase;
import net.ibizsys.central.cloud.core.ai.IAIWorkerAgentRuntimeBase;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.runtime.util.JsonUtils;

public class SysAIFactoryRuntimeExtension {

	public static String chatCompletion(IAIWorkerAgentRuntimeBase iAIWorkerAgentRuntimeBase, Object dataOrKeys) throws Throwable {
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		ChatCompletionResult chatCompletionResult = iAIWorkerAgentRuntimeBase.chatCompletion("default", dataOrKeys, chatCompletionRequest, null, true, true);
		return chatCompletionResult.getChoices().get(0).getContent();
	}
	
	public static String chatCompletion(IAIWorkerAgentRuntimeBase iAIWorkerAgentRuntimeBase, String strMode, Object dataOrKeys) throws Throwable {
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		ChatCompletionResult chatCompletionResult = iAIWorkerAgentRuntimeBase.chatCompletion(strMode, dataOrKeys, chatCompletionRequest, null, true, true);
		return chatCompletionResult.getChoices().get(0).getContent();
	}
	
	public static String chatCompletion(IAIWorkerAgentRuntimeBase iAIWorkerAgentRuntimeBase, String strMode, Object dataOrKeys, boolean bAppendSystemMessage) throws Throwable {
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		ChatCompletionResult chatCompletionResult = iAIWorkerAgentRuntimeBase.chatCompletion(strMode, dataOrKeys, chatCompletionRequest, null, bAppendSystemMessage, true);
		return chatCompletionResult.getChoices().get(0).getContent();
	}
	
	public static ISysAIChatAgentRuntime chatAgent(IAIFactoryRuntimeBase iAIFactoryRuntimeBase, String strAIChatAgentTag, boolean bTryMode) {
		return (ISysAIChatAgentRuntime)iAIFactoryRuntimeBase.getAIChatAgentRuntime(strAIChatAgentTag, bTryMode);
	}
	
	public static ISysAIChatAgentRuntime chatAgent(IAIFactoryRuntimeBase iAIFactoryRuntimeBase, String strAIChatAgentTag) {
		return (ISysAIChatAgentRuntime)iAIFactoryRuntimeBase.getAIChatAgentRuntime(strAIChatAgentTag, false);
	}
	
	
	public static Object executeBash(IAISkillAgentRuntimeBase iAISkillAgentRuntimeBase, String skill_id, String command) throws Throwable{
		return executeBash(iAISkillAgentRuntimeBase, skill_id, command, null, null);
	}
	
	public static Object executeBash(IAISkillAgentRuntimeBase iAISkillAgentRuntimeBase, String skill_id, String command, String file_path, String content) throws Throwable{
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_BASH_COMMAND, command);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		if(StringUtils.hasLength(file_path)) {
			args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, file_path);
			args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT, content);
		}
		return iAISkillAgentRuntimeBase.toolCall(IAISkillAgentRuntimeBase.COMMAND_EXECUTE_BASH, args);
	}
	
	
	public static Object readFile(IAISkillAgentRuntimeBase iAISkillAgentRuntimeBase, String skill_id, String file_path) throws Throwable{
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, file_path);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		return iAISkillAgentRuntimeBase.toolCall(IAISkillAgentRuntimeBase.COMMAND_READ_FILE, args);
	}
	
	public static Object writeFile(IAISkillAgentRuntimeBase iAISkillAgentRuntimeBase,String skill_id, String file_path, String content) throws Throwable{
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, file_path);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_WRITE_FILE_CONTENT, content);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		
		return iAISkillAgentRuntimeBase.toolCall(IAISkillAgentRuntimeBase.COMMAND_WRITE_FILE, args);
	}
	
	public static Object deleteFile(IAISkillAgentRuntimeBase iAISkillAgentRuntimeBase,String skill_id, String file_path) throws Throwable{
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_X_FILE_PATH, file_path);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		
		return iAISkillAgentRuntimeBase.toolCall(IAISkillAgentRuntimeBase.COMMAND_DELETE_FILE, args);
	}
	
	
	public static Object executeCloud(IAISkillAgentRuntimeBase iAISkillAgentRuntimeBase,String skill_id, String url, String method, String body) throws Throwable{
		Map<String, Object> args = new LinkedHashMap<String, Object>();
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_SKILL_ID, skill_id);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_URL, url);
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_METHOD, method);
		if(StringUtils.hasLength(body)) {
			JsonNode node = JsonUtils.toJsonNode(body);
			if(node instanceof ObjectNode) {
				args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_BODY, JsonUtils.asMap(body));
			}
			else
				if(node instanceof ArrayNode) {
					args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_BODY, JsonUtils.asList(body));
				}
				else
					args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_EXECUTE_CLOUD_BODY, body);
		}
		
		
		args.put(IAISkillAgentRuntimeBase.COMMAND_PARAM_FROM_TEMPLATE, "true");
		
		return iAISkillAgentRuntimeBase.toolCall(IAISkillAgentRuntimeBase.COMMAND_EXECUTE_CLOUD, args);
	}
}
