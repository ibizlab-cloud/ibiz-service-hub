package net.ibizsys.central.plugin.ai.util;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import groovy.text.Template;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntimeContext;
import net.ibizsys.central.cloud.core.dataentity.logic.DELogicSysAIChatAgentNodeRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResultEx;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.runtime.util.JsonUtils;

public class AIChatUtils {

	public final static Pattern JSON_CODE_BLOCK_PATTERN = Pattern.compile("(?s)```json\\s*(.*?)\\s*```", Pattern.MULTILINE);

	public static String getJsonContent(String markdownContent) {
		Matcher matcher = JSON_CODE_BLOCK_PATTERN.matcher(markdownContent);
		while (matcher.find()) {
			return matcher.group(1);
		}
		return markdownContent;
	}

	public static Object getRealResult(ChatCompletionResult chatCompletionResult) throws Exception {
		if (chatCompletionResult instanceof ChatCompletionResultEx) {
			return ((ChatCompletionResultEx) chatCompletionResult).getResult();
		}
		if (chatCompletionResult == null || ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
			throw new Exception("返回AI交谈结果无效");
		}
		return chatCompletionResult.getChoices().get(0).getContent();
	}

	protected static ObjectNode getChatCategoryPromptNode(ChatCompletionRequest request, Map<String, String> categories) {
		ObjectNode promptNode = JsonUtils.createObjectNode();
		// promptNode.put("task", iPSDESysAIChatAgentLogic.getName());
		// if(StringUtils.hasLength(iPSDESysAIChatAgentLogic.getMemo())) {
		// promptNode.put("description", iPSDESysAIChatAgentLogic.getMemo());
		// }
		promptNode.put("prompt", String.format("请根据以下最近%1$s条对话消息，从可选 Agent列表中选择最适合处理当前用户请求的 Agent，并说明选择原因。要求输出为 JSON 格式，包含 agent_id'（选择的 Agent 标识）和 'reason'（选择原因）字段", request.getMessages().size()));
		ArrayNode messagesNode = promptNode.putArray("messages");
		for (ChatMessage message : request.getMessages()) {
			ObjectNode messageNode = messagesNode.addObject();
			messageNode.put(ChatMessage.FIELD_ROLE, message.getRole());
			messageNode.put(ChatMessage.FIELD_CONTENT, message.getContent());
		}
		ArrayNode agentsNode = promptNode.putArray("agents");
		for (java.util.Map.Entry<String, String> entry : categories.entrySet()) {
			ObjectNode agentNode = agentsNode.addObject();
			agentNode.put("id", entry.getKey());
			if (StringUtils.hasLength(entry.getValue())) {
				agentNode.put("description", entry.getValue());
			}
		}
		promptNode.set("output_format", DELogicSysAIChatAgentNodeRuntime.CHAT_CATEGORY_OUTPUT_FORMAT_JSON);

		return promptNode;
	}

	public static String chatCategory(ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext, ChatCompletionRequest chatCompletionRequest, int nHistoryCount, Map<String, String> categories) throws Throwable {
		// 获取逻辑节点的后续连接
		if (ObjectUtils.isEmpty(categories)) {
			throw new Exception("未定义分类");
		}

		ChatCompletionRequest data = new ChatCompletionRequest();
		// 放入历史消息
		if (nHistoryCount > 0 && !ObjectUtils.isEmpty(chatCompletionRequest.getMessages()) && chatCompletionRequest.getMessages().size() > nHistoryCount) {
			List<ChatMessage> list = chatCompletionRequest.getMessages().subList(chatCompletionRequest.getMessages().size() - nHistoryCount, chatCompletionRequest.getMessages().size());
			data.setMessages(list);
		} else {
			data.setMessages(chatCompletionRequest.getMessages());
		}

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("data", data);
		ObjectNode promptNode = getChatCategoryPromptNode(data, categories);
		params.put("prompt", promptNode);
		params.put("prompt_text", promptNode.toPrettyString());

		String strContent = null;
		String strTemplate = DELogicSysAIChatAgentNodeRuntime.PROMPT;
		Template template = iSysAIAgentRuntimeContext.getModelRuntime().getAIFactoryRuntime().getSystemRuntime().getGroovyTemplate(strTemplate);
		StringWriter sw = new StringWriter();
		template.make(params).writeTo(sw);
		strContent = sw.toString();

		ChatCompletionRequest realChatCompletionRequest = new ChatCompletionRequest();
		// chatCompletionRequest.setStreaming(EntityBase.BOOLEAN_FALSE);
		chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strContent).build());

		ChatCompletionResult chatCompletionResult = iSysAIAgentRuntimeContext.rawChatCompletion(realChatCompletionRequest);
		Object result = getRealResult(chatCompletionResult);
		Map map = null;
		if (result instanceof String) {
			String strJsonContent = getJsonContent((String) result);
			map = JsonUtils.asMap(strJsonContent);
		} else if (result instanceof Map) {
			map = (Map) result;
		} else
			throw new Exception(String.format("无法识别的返回数据[%1$s]", result));

		String strAgentId = (String) map.get(DELogicSysAIChatAgentNodeRuntime.JSON_AGENT_ID);
		if (ObjectUtils.isEmpty(strAgentId)) {
			throw new Exception(String.format("返回数据[%1$s]未指定代理标识", result));
		}

		if (categories.containsKey(strAgentId)) {
			return strAgentId;
		}

		throw new Exception(String.format("无法识别的代理标识[%1$s]", strAgentId));
	}
}
