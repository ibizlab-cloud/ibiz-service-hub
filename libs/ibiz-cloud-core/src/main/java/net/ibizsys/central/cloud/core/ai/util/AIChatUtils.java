package net.ibizsys.central.cloud.core.ai.util;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsonrepairj.JsonRepair;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
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
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class AIChatUtils {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIChatUtils.class);
	
	public final static Pattern JSON_CODE_BLOCK_PATTERN = Pattern.compile("(?s)```json\\s*(.*?)\\s*```", Pattern.MULTILINE);
	
	public final static String THINK_BEGIN = "<think>";

	public final static String THINK_END = "</think>";

	protected final static Pattern thinkPattern = Pattern.compile("(?m)^</think>\\s*");
	
	public final static String TOOL_CALL_BEGIN = "<tool_call>";

	public final static String TOOL_CALL_END = "</tool_call>";
	
	protected final static Pattern toolCallPattern = Pattern.compile("(?m)^</tool_call>\\s*");
	
	public static JsonNode getJsonNode(ChatCompletionResult result){
		return getJsonNode(result, true);
	}
	

	public static String getJsonContent(ChatCompletionResult result){
		return getJsonContent(result, true);
	}
	
	public static JsonNode getJsonNode(ChatCompletionResult result, boolean autoRepaire){
		try {
			String strJsonContent = getJsonContent(result, autoRepaire);
			if(StringUtils.hasLength(strJsonContent)) {
				return JsonUtils.toJsonNode(strJsonContent);
			}
			return null;
		}
		catch (Throwable ex) {
			ExceptionUtils.rethrowRuntimeException(ex);
		}
		return null;
	}
	
//	protected static Object repairJson(String strContent) {
//		String strPythonCode = net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(AIChatUtils.class, "JsonRepair.md", false);
//		
//	        JepConfig config = new JepConfig();
//	        SharedInterpreter.setConfig(config);
//	        // 第一个解释器：动态创建共享模块
//	        try (SharedInterpreter interp1 = new SharedInterpreter()) {
//	            // 创建模块
//	        	interp1.set("broken_json", test9);
//	            interp1.exec(strPythonCode3);
//	            
//	            System.out.println("Processed: " + interp1.getValue("fixed_str"));
//	            System.out.println("Processed: " + interp1.getValue("data"));
//	            
//	            // 使用对象
//	           // interp1.exec("result = cloud_requests.processor.process('hello')");
//	            //System.out.println("Processed: " + interp1.getValue("result"));
//	        }
//	}

	public static String getJsonContent(ChatCompletionResult result, boolean autoRepair){
		try {
			String strContent = result.getChoices().get(0).getContent();
			strContent = removeToolCallContent(strContent);
			strContent = removeThinkingContent(strContent);
			return getJsonContent(strContent, autoRepair);
		}
		catch (Throwable ex) {
			ExceptionUtils.rethrowRuntimeException(ex);
		}
		return null;
	}
	
	public static JsonNode getJsonNode(String markdownContent){
		return getJsonNode(markdownContent, true);
	}
	
	public static JsonNode getJsonNode(String markdownContent, boolean autoRepair){
		try {
			String strJsonContent = getJsonContent(markdownContent, autoRepair);
			if(StringUtils.hasLength(strJsonContent)) {
				return JsonUtils.toJsonNode(strJsonContent);
			}
			return null;
		}
		catch (Throwable ex) {
			ExceptionUtils.rethrowRuntimeException(ex);
		}
		return null;
	}
	
	public static String getJsonContent(String markdownContent) {
		return getJsonContent(markdownContent, true);
	}
	
	public static String getJsonContent(String markdownContent, boolean autoRepair) {
		String strJson = getJsonContentSimple(markdownContent);
		if(StringUtils.hasLength(strJson)) {
			try {
				JsonNode jsonNode =	JsonUtils.toJsonNode(strJson);
				if(jsonNode != null) {
					return strJson;
				}
			}
			catch (Throwable ex) {
				log.error(ex);
//				if(autoRepair) {
//					try {
//						strJson = JsonRepair.repairJson(strJson);
//						JsonNode jsonNode =	JsonUtils.toJsonNode(strJson);
//						if(jsonNode != null) {
//							return strJson;
//						}
//					}
//					catch (Throwable ex2) {
//						log.error(ex2);
//					}
//				}
			}
		}
		//重新查找
		String ret = extractJson(markdownContent, autoRepair);
		if(!StringUtils.hasLength(ret) && StringUtils.hasLength(markdownContent) && autoRepair) {
			ret = JsonRepair.repairJson(markdownContent);
		}
		return ret;
	}
	
	private static String getJsonContentSimple(String markdownContent) {
		Matcher matcher = JSON_CODE_BLOCK_PATTERN.matcher(markdownContent);
		while (matcher.find()) {
			return matcher.group(1);
		}
		return markdownContent;
	}
	
	/**
     * 从文本中提取被```json和```包裹的JSON内容
     * 
     * @param text 输入的文本
     * @return 第一个有效的JSON内容字符串，如果未找到则返回null
     */
	private static String extractJson(String text, boolean autoRepair) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        
        final String startMarker = "```json";
        final String endMarker = "```";
        
        // 查找第一个```json的位置
        int startIdx = text.indexOf(startMarker);
        if (startIdx == -1) {
            return null; // 没有找到起始标记
        }
        
        // JSON内容的起始位置（跳过起始标记）
        int contentStart = startIdx + startMarker.length();
        
        // 查找所有```的位置
        List<Integer> endPositions = findAllEndMarkers(text, endMarker, contentStart);
        
        // 从后向前遍历结束标记位置
        for (int i = endPositions.size() - 1; i >= 0; i--) {
            int endIdx = endPositions.get(i);
            
            // 提取内容，并去除首尾空白字符
            String content = text.substring(contentStart, endIdx).trim();
            
            // 验证是否为有效JSON
            try {
				JsonNode jsonNode =	JsonUtils.toJsonNode(content);
				if(jsonNode != null) {
					return content;
				}
			}
			catch (Throwable ex) {
				log.error(ex);
				if(autoRepair) {
					try {
						content = JsonRepair.repairJson(content);
						JsonNode jsonNode =	JsonUtils.toJsonNode(content);
						if(jsonNode != null) {
							return content;
						}
					}
					catch (Throwable ex2) {
						log.error(ex2);
					}
				}
			}
        }
        
        return null; // 没有找到任何有效的JSON内容
    }
    
    /**
     * 查找文本中所有结束标记的位置
     * 
     * @param text 输入的文本
     * @param endMarker 结束标记
     * @param afterPosition 必须在该位置之后
     * @return 结束标记位置的列表
     */
    private static List<Integer> findAllEndMarkers(String text, String endMarker, int afterPosition) {
        List<Integer> positions = new ArrayList<>();
        int pos = text.indexOf(endMarker, afterPosition);
        
        while (pos != -1) {
            positions.add(pos);
            pos = text.indexOf(endMarker, pos + endMarker.length());
        }
        
        return positions;
    }
	
	public static String extractCodeWithCursor(String code, int line, int pos, int x, int y) {
		return extractCodeWithCursor(code, line, pos, x, y, null);
	}
	
	public static String extractCodeWithCursor(String code, int line, int pos, int x, int y, String cursorTag) {
		if(!StringUtils.hasLength(cursorTag)) {
			cursorTag = "<__CURSOR__>";
		}
        // 将代码按行分割[6,7](@ref)
        String[] lines = code.replace("\r\n", "\n").split("\n", -1); // 使用-1保留空行
        int totalLines = lines.length;
        
        // 计算提取的起始行和结束行（行号从1开始，使用max/min处理边界）
        int startLine = Math.max(1, line - x);          // 起始行号（最小为1）
        int endLine = Math.min(totalLines, line + y);  // 结束行号（最大为总行数）
        
        // 将行号转换为0基索引（用于数组索引）
        int startIdx = startLine - 1;  // 起始索引（包含）
        int endIdx = endLine;           // 结束索引（不包含，因此直接使用endLine）
        
        // 提取指定范围内的行
        List<String> extractedLines = new ArrayList<>();
        for (int i = startIdx; i < endIdx; i++) {
            extractedLines.add(lines[i]);
        }
        
        // 计算光标行在提取片段中的相对索引（0基）
        int relLineIndex = line - startLine;
        
        // 检查光标行和列号是否有效
        if (relLineIndex < 0 || relLineIndex >= extractedLines.size()) {
            throw new IllegalArgumentException("光标行不在提取范围内");
        }
        
        String cursorLine = extractedLines.get(relLineIndex);
        if (pos < 0 || pos > cursorLine.length()) {
            // 若列号无效，调整到行首或行尾
            pos = Math.max(0, Math.min(pos, cursorLine.length()));
        }
        
        // 在光标位置插入<CURSOR>标记[9,10](@ref)
        StringBuilder modifiedLine = new StringBuilder(cursorLine);
        modifiedLine.insert(pos, cursorTag);
        extractedLines.set(relLineIndex, modifiedLine.toString());
        
        // 重新组合为字符串并返回
        return String.join("\n", extractedLines);
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
		realChatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strContent).build());

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
	
	public static String chatTrimmingSummarizeOldest(ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext, List<ChatMessage> list) throws Throwable {
		return chatTrimmingSummarizeOldest(iSysAIAgentRuntimeContext, list, null);
	}
	
	public static String chatTrimmingSummarizeOldest(ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext, List<ChatMessage> list, Boolean thinking) throws Throwable {
		// 获取逻辑节点的后续连接
		if (ObjectUtils.isEmpty(list)) {
			throw new Exception("未传入历史消息");
		}

		List<Map> list2 = new ArrayList<Map>();
		for(ChatMessage message : list) {
			
			if(ObjectUtils.isEmpty(message.getRole())) {
				continue;
			}
			
			if(ChatMessageRole.ASSISTANT.getValue().equals(message.getRole()) || ChatMessageRole.USER.getValue().equals(message.getRole())) {
				Map<String, Object> item = new LinkedHashMap<String, Object>();
				item.put("role", message.getRole().toLowerCase());
				item.put("content", message.getRawContent());
				list2.add(item);
			}
		}
		
		if (ObjectUtils.isEmpty(list2)) {
			throw new Exception("未传入有效历史消息");
		}
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prompt_text", JsonUtils.toJsonNode(list2).toPrettyString());
		

		String strContent = null;
		String strTemplate = DELogicSysAIChatAgentNodeRuntime.CHAT_TRIMMING_SUMMARIZEOLDEST_PROMPT;
		Template template = iSysAIAgentRuntimeContext.getModelRuntime().getAIFactoryRuntime().getSystemRuntime().getGroovyTemplate(strTemplate);
		StringWriter sw = new StringWriter();
		template.make(params).writeTo(sw);
		strContent = sw.toString();

		ChatCompletionRequest realChatCompletionRequest = new ChatCompletionRequest();
		// chatCompletionRequest.setStreaming(EntityBase.BOOLEAN_FALSE);
		realChatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strContent).build());
		if(thinking!=null) {
			realChatCompletionRequest.setThinking(thinking?1:0);
		}
		ChatCompletionResult chatCompletionResult = iSysAIAgentRuntimeContext.rawChatCompletion(realChatCompletionRequest);
		Object result = getRealResult(chatCompletionResult);
		return String.valueOf(result);
	}
	
	
	public static String removeThinkingContent(String strContent) throws Exception {
		if (!StringUtils.hasLength(strContent) || !thinkPattern.matcher(strContent).find()) {
			return strContent;
		}

		List<String> list = null;
		try (BufferedReader reader = new BufferedReader(new StringReader(strContent))) {
			// 读取每行事件数据
			String line;
			while ((line = reader.readLine()) != null) {
				// 多次思考也是最后的内容
				if (StringUtils.hasLength(line)) {
					if (line.indexOf(THINK_END) == 0) {
						if (THINK_END.equalsIgnoreCase(line.trim())) {
							list = new ArrayList<String>();
							continue;
						}
					}
				}

				if (list == null) {
					continue;
				}

				if (!StringUtils.hasLength(line)) {
					if (list.size() == 0) {
						continue;
					}
				}

				list.add(line);
			}
		}

		if (ObjectUtils.isEmpty(list)) {
			return "";
		}

		return StringUtils.collectionToDelimitedString(list, "\n");
	}
	
	/**
	 * 提取字符串中位于特定标记之间的思考内容。
	 * 思考内容被定义为位于 "<think>" 和 "</think>" 之间的文本（不包括标记本身）。
	 * 如果字符串中没有完整的思考标记对，则返回空字符串。
	 * 
	 * @param strContent 待处理的输入字符串，可能包含思考标记
	 * @return 提取到的思考内容字符串；若无思考内容或输入无效则返回空字符串
	 * @throws Exception
	 */
	public static String getThinkingContent(String strContent) throws Exception {
	    // 检查输入字符串是否有效（非null、非空、非仅空白字符）
	    if (!StringUtils.hasLength(strContent)) {
	        return strContent;
	    }
	    
	    // 检查字符串中是否存在思考标记
	    if (!thinkPattern.matcher(strContent).find()) {
	        // 如果没有找到思考标记，直接返回空字符串
	        return strContent;
	    }
	    
	    // 用于存储提取的思考内容行
	    List<String> thinkingLines = new ArrayList<>();
	    // 标志位，表示是否已经开始收集思考内容（即是否已遇到"<think>"）
	    boolean isCollectingThinking = false;
	    
	    // 使用BufferedReader按行读取字符串
	    try (BufferedReader reader = new BufferedReader(new StringReader(strContent))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            // 检查是否遇到思考开始标记 "<think>"
	            if (line.indexOf(THINK_BEGIN) == 0) {
	                // 遇到开始标记，设置标志位开始收集后续行
	                isCollectingThinking = true;
	                continue;
	            }
	            
	            // 检查是否遇到思考结束标记 "</think>"
	            if (line.indexOf(THINK_END) == 0) {
	                // 如果遇到思考结束标记，停止收集
	                isCollectingThinking = false;
	                // 不跳出循环，因为可能有多个思考块
	                continue;
	            }
	            
	            // 如果当前正处于收集思考内容的状态，且当前行不是标记行，则将其加入结果列表
	            if (isCollectingThinking) {
	                thinkingLines.add(line);
	            }
	        }
	    }
	    
	    // 将收集到的思考内容行合并为一个字符串返回
	    return StringUtils.collectionToDelimitedString(thinkingLines, "\n");
	}
	
	/**
	 * 移除全部工具调用内容
	 * @param strContent
	 * @return
	 * @throws Exception
	 */
	public static String removeToolCallContent(String strContent) throws Exception {
		if (!StringUtils.hasLength(strContent) || !toolCallPattern.matcher(strContent).find()) {
			return strContent;
		}

		List<String> list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new StringReader(strContent))) {
			// 读取每行事件数据
			StringBuilder sb = new StringBuilder();
			String start = null;
			String line;
			
			while ((line = reader.readLine()) != null) {
				if (StringUtils.hasLength(line)) {
					//判断类型
					if(line.indexOf(TOOL_CALL_BEGIN) == 0) {
						if(StringUtils.hasLength(start)) {
							throw new Exception(String.format("已经出现开始标记[%1$s]", start));
						}
						if(sb != null) {
							list.add(sb.toString());
						}
						sb = null;
						start = TOOL_CALL_BEGIN;
						continue;
					}
					
					if(line.indexOf(TOOL_CALL_END) == 0) {
						if(!TOOL_CALL_BEGIN.equals(start)) {
							throw new Exception(String.format("未出现开始标记[%1$s]", TOOL_CALL_BEGIN));
						}
						
						start = null;
						sb = new StringBuilder();
						continue;
					}
					
					if(sb == null) {
						continue;
					}
					
					if(StringUtils.hasLength(sb.toString())){
						sb.append("\n");
					}
					sb.append(line);
				}
				else {
					if(sb != null) {
						sb.append("\n");
					}
				}
			}
		}

		if (ObjectUtils.isEmpty(list)) {
			return "";
		}

		return StringUtils.collectionToDelimitedString(list, "\n");
	}
	
	
	public static ChatMessage getLastChatMessage(ChatCompletionRequest request) {
		Assert.notNull(request, "传入聊天交互请求对象无效");
		Assert.notEmpty(request.getMessages(), "传入聊天交互请求对象未包含任何消息");
		
		return request.getMessages().get(request.getMessages().size() - 1);
	}
	
	public static List<ChatMessage> getLastChatMessages(ChatCompletionRequest request, int count) {
		return getLastChatMessages(request, count, false);
	}
	
	public static List<ChatMessage> getLastChatMessages(ChatCompletionRequest request, int count, boolean appendSystemMessage) {
		Assert.notNull(request, "传入聊天交互请求对象无效");
		Assert.notEmpty(request.getMessages(), "传入聊天交互请求对象未包含任何消息");
		List<ChatMessage> list = new ArrayList<ChatMessage>();
		for(int i = 1;i<= count; i++) {
			int nIndex = request.getMessages().size() - i;
			if(nIndex < 0) {
				break;
			}
			list.add(0, request.getMessages().get(nIndex));
		}
		
		if(appendSystemMessage) {
			if(ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(request.getMessages().get(0).getRole())) {
				if(list.size() != request.getMessages().size()) {
					list.add(0, request.getMessages().get(0));
				}
			}
		}
		else {
			if(list.size()>0) {
				if(ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(list.get(0).getRole())) {
					list.remove(0);
				}
			}
		}
		return list;
	}
	
}
