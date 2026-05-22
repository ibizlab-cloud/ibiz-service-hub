package net.ibizsys.central.plugin.ai.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatContent;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.HtmlUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class AIChatUtils extends net.ibizsys.central.cloud.core.ai.util.AIChatUtils {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIChatUtils.class);

	public static String html2md(String strHtmlContent) {
		return HtmlUtils.toMarkdown(strHtmlContent);
	}

	public static boolean isHtml(String strHtmlContent) {
		return HtmlUtils.isHtml(strHtmlContent);
	}

	public static ChatCompletionRequest fromOpenAIChatCompletionRequest(Map<String, Object> body) {
		if (body == null) {
			return new ChatCompletionRequest();
		}

		ChatCompletionRequest request = new ChatCompletionRequest();

		// 1. 基础字段映射

		// model
		if (body.containsKey("model")) {
			request.setModel(DataTypeUtils.asString(body.get("model")));
		}

		// sessionid (OpenAI 标准中没有直接的 sessionid，通常由客户端传递或在元数据中，这里假设可能通过
		// "session_id" 或自定义传递)
		// 如果 OpenAI 原生请求不带此字段，可能需要从上下文获取，此处仅做映射演示
		if (body.containsKey("session_id")) {
			request.setSessionId(DataTypeUtils.asString(body.get("session_id")));
		}

		// streaming (OpenAI: boolean -> Custom: Integer 1/0)
		if (body.containsKey("stream")) {
			Boolean isStream = DataTypeUtils.asBoolean(body.get("stream"));
			request.setStreaming(isStream ? 1 : 0);
		}

		// temperature
		if (body.containsKey("temperature")) {
			request.setTemperature(DataTypeUtils.asFloat(body.get("temperature")));
		}

		// top_p
		if (body.containsKey("top_p")) {
			request.setTopP(DataTypeUtils.asFloat(body.get("top_p")));
		}

		// max_tokens
		if (body.containsKey("max_tokens")) {
			request.setMaxTokens(DataTypeUtils.asInteger(body.get("max_tokens")));
		}

		// max_input_tokens
		if (body.containsKey("max_input_tokens")) {
			request.setMaxInputTokens(DataTypeUtils.asInteger(body.get("max_input_tokens")));
		}

		// 2. 复杂对象列表映射：Messages

		if (body.containsKey("messages") && body.get("messages") instanceof List) {
			List<?> rawMessages = (List<?>) body.get("messages");
			List<ChatMessage> messages = new ArrayList<>();

			for (Object msgObj : rawMessages) {
				if (msgObj instanceof Map) {
					// 假设 ChatMessage 有一个 fromMap 静态方法，或者需要通过构造函数转换
					// 如果没有现成的 fromMap，需要在此处手动 new ChatMessage() 并 set 属性
					ChatMessage msg = fromOpenAIChatMessage((Map<String, Object>) msgObj);
					messages.add(msg);
				}
			}
			request.setMessages(messages);
		}

		// // 3. 复杂对象列表映射：Tools
		//
		// if (body.containsKey("tools") && body.get("tools") instanceof List) {
		// List<?> rawTools = (List<?>) body.get("tools");
		// List<ChatTool> tools = new ArrayList<>();
		//
		// for (Object toolObj : rawTools) {
		// if (toolObj instanceof Map) {
		// // 假设 ChatTool 有一个 fromMap 静态方法
		// ChatTool tool = ChatTool.fromMap((Map<String, Object>) toolObj);
		// tools.add(tool);
		// }
		// }
		// request.setTools(tools);
		// }

		// 4. 扩展字段映射 (根据你的类定义)
		Map<String, Object> metadata = null;
		if (body.get("metadata") instanceof Map) {
			metadata = (Map<String, Object>) body.get("metadata");
		}

		// mode
		if (metadata != null && metadata.containsKey("mode")) {
			request.setMode(DataTypeUtils.asString(metadata.get("mode")));
		}

		// agentname / agenttag (非标准，可能在自定义扩展中)
		if (metadata != null && metadata.containsKey("agent_name")) {
			request.setAgentName(DataTypeUtils.asString(metadata.get("agent_name")));
		}
		if (metadata != null && metadata.containsKey("agent_tag")) {
			request.setAgentTag(DataTypeUtils.asString(metadata.get("agent_tag")));
		}

		// thinking (假设对应 openai 的 "reasoning_effort" 或自定义字段，此处按自定义字段映射)
		if (body.containsKey("thinking")) {
			Object val = body.get("thinking");
			// 兼容 boolean 或 integer
			int iVal = (val instanceof Boolean) ? ((Boolean) val ? 1 : 0) : DataTypeUtils.asInteger(val);
			request.setThinking(iVal);
		}

		// searching (自定义字段)
		if (body.containsKey("searching")) {
			Object val = body.get("searching");
			int iVal = (val instanceof Boolean) ? ((Boolean) val ? 1 : 0) : DataTypeUtils.asInteger(val);
			request.setSearching(iVal);
		}

		// knowledgebases (自定义字段，可能是字符串数组或逗号分隔字符串)
		if (metadata != null && metadata.containsKey("knowledgebases")) {
			Object kbObj = metadata.get("knowledgebases");
			if (kbObj instanceof List) {
				List<String> kbs = new ArrayList<>();
				for (Object item : (List<?>) kbObj) {
					kbs.add(DataTypeUtils.asString(item));
				}
				request.setKnowledgeBases(kbs);
			} else if (kbObj instanceof String) {
				// 处理逗号分隔的情况，利用类中已有的逻辑或直接设置
				request.setKnowledgeBases(new ArrayList<>(java.util.Arrays.asList(((String) kbObj).split(","))));
			}
		}
		
		if (metadata != null && metadata.containsKey("kb_queries")) {
			Object kbQueries = metadata.get("kb_queries");
			if (kbQueries instanceof List) {
				List<String> queries = new ArrayList<>();
				for (Object item : (List<?>) kbQueries) {
					queries.add(DataTypeUtils.asString(item));
				}
				request.setChunkQueries(queries);
			} else if (kbQueries instanceof String) {
				// 处理逗号分隔的情况，利用类中已有的逻辑或直接设置
				request.setChunkQueries(new ArrayList<>(java.util.Arrays.asList(((String) kbQueries).split(","))));
			}
		}
		

		// chunks (自定义字段)
		if (metadata != null && metadata.containsKey("chunks") && metadata.get("chunks") instanceof List) {
			List<?> rawChunks = (List<?>) metadata.get("chunks");
			List<Chunk> chunks = new ArrayList<>();
			for (Object chunkObj : rawChunks) {
				if (chunkObj instanceof Map) {
					// 假设 Chunk 类也有 fromMap
					chunks.add(JsonUtils.as(chunkObj, Chunk.class));
				}
			}
			request.setChunks(chunks);
		}
		//
		// // maxchunks
		if (metadata != null && metadata.containsKey("max_chunks")) {
			request.setMaxChunks(DataTypeUtils.asInteger(metadata.get("max_chunks")));
		}
		//
		// chunkthreshold
		if (metadata != null && metadata.containsKey("chunk_threshold")) {
			request.setChunkThreshold(DataTypeUtils.asFloat(metadata.get("chunk_threshold")));
		}
		//
		// mcp servers
		if (metadata != null && metadata.containsKey("mcp_servers")) {
			Object mcpObj = metadata.get("mcp_servers");
			if (mcpObj instanceof List) {
				List<String> mcps = new ArrayList<>();
				for (Object item : (List<?>) mcpObj) {
					mcps.add(DataTypeUtils.asString(item));
				}
				request.setMcpServers(mcps);
			} else if (mcpObj instanceof String) {
				// 处理逗号分隔的情况，利用类中已有的逻辑或直接设置
				request.setMcpServers(new ArrayList<>(java.util.Arrays.asList(((String) mcpObj).split(","))));
			}

		}

		return request;
	}

	public static Map<String, Object> toOpenAIChatCompletionRequest(ChatCompletionRequest request) {
		if (request == null) {
			return new HashMap<>();
		}

		Map<String, Object> body = new HashMap<>();

		// 1. 基础字段映射

		if (request.containsSessionId()) { // 假设你有这个判断方法，或者检查 !isEmpty
			body.put("session_id", request.getSessionId());
		}

		// Model
		if (request.containsModel()) {
			body.put("model", request.getModel());
		}

		// Messages (核心部分)
		if (request.containsMessages()) {
			List<ChatMessage> messages = request.getMessages();
			List<Map<String, Object>> openAiMessages = new ArrayList<>();

			for (ChatMessage msg : messages) {
				if (msg != null) {
					// 假设 ChatMessage 也有一个 toOpenAIMessage() 方法
					// 如果没有，需要在 ChatMessage 类中补充类似逻辑
					openAiMessages.add(toOpenAIChatMessage(msg));
				}
			}
			body.put("messages", openAiMessages);
		}

		// Streaming (Integer 0/1 -> Boolean)
		if (request.containsStreaming()) {
			Integer streamVal = request.getStreaming();
			body.put("stream", streamVal != null && streamVal == 1);
		}

		// Temperature
		if (request.containsTemperature()) {
			body.put("temperature", request.getTemperature());
		}

		// Top P
		if (request.containsTopP()) {
			body.put("top_p", request.getTopP());
		}

		// Max Tokens
		if (request.containsMaxTokens()) {
			body.put("max_tokens", request.getMaxTokens());
		}

		// Max Input Tokens (OpenAI 标准通常没有 max_input_tokens 参数，通常是模型上下文限制)
		// 如果目标服务端支持扩展参数，可以放入 extra_body 或忽略
		if (request.containsMaxInputTokens()) {
			// 选项 A: 忽略
			// 选项 B: 放入自定义字段 (如果后端代理支持)
			body.put("max_input_tokens", request.getMaxInputTokens());
		}

		// 2. 工具映射 (Tools)
		// if (request.containsTools()) {
		// List<ChatTool> tools = request.getTools();
		// if (tools != null && !tools.isEmpty()) {
		// List<Map<String, Object>> openAiTools = new ArrayList<>();
		// for (ChatTool tool : tools) {
		// if (tool != null) {
		// // 假设 ChatTool 有 toOpenAITool() 方法
		// // 结构通常为: { "type": "function", "function": { "name": "...",
		// "parameters": {...} } }
		// openAiTools.add(tool.toOpenAITool());
		// }
		// }
		// if (!openAiTools.isEmpty()) {
		// body.put("tools", openAiTools);
		// }
		// }
		// }

		// 3. 扩展/自定义字段映射
		// 注意：以下字段不是 OpenAI 标准字段。
		// 策略：如果目标是标准 OpenAI API，这些字段应被忽略或预处理到 messages 中。
		// 如果目标是内部兼容 OpenAI 协议的网关，可以保留在顶层或放入 metadata。

		// Thinking (映射为 boolean 或放入 metadata)
		if (request.containsThinking()) {
			Integer val = request.getThinking();
			// 某些模型支持 reasoning_effort，或者作为自定义开关
			// 这里放入 metadata 以示区别，或者直接作为布尔值
			if (val != null && val == 1) {
				// 如果对接支持 thinking 的模型 (如 o1 系列或其他)，可能需要特定参数
				// 暂时放入自定义字段
				body.put("thinking", true);
			}
		}

		// Searching
		if (request.containsSearching()) {
			Integer val = request.getSearching();
			if (val != null && val == 1) {
				body.put("searching", true);
			}
		}

		// KnowledgeBases (转为逗号分隔字符串或数组，放入 metadata)
		if (request.containsKnowledgeBases()) {
			List<String> kbs = request.getKnowledgeBases();
			if (kbs != null) {
				// 放入 metadata 供后端网关处理 RAG 逻辑
				ensureMetadata(body).put("knowledgebases", kbs);
			}
		}
		
		// ChunkQueries (转为逗号分隔字符串或数组，放入 metadata)
		if (request.containsChunkQueries()) {
			List<String> queries = request.getChunkQueries();
			if (queries != null) {
				// 放入 metadata 供后端网关处理 RAG 逻辑
				ensureMetadata(body).put("kb_queries", queries);
			}
		}
				

		// McpServers
		if (request.containsMcpServers()) {
			List<String> servers = request.getMcpServers();
			if (servers != null) {
				ensureMetadata(body).put("mcp_servers", servers);
			}
		}
		//
		// Chunks (通常不需要发给 LLM，因为已经注入到 prompt 了。如果必须发，放 metadata)
		if (request.containsChunks()) {
			List<Chunk> chunks = request.getChunks();
			if (chunks != null && !chunks.isEmpty()) {
				// 转换为 Map 列表
				List<Map<String, Object>> chunkMaps = new ArrayList<>();
				for (Chunk chunk : chunks) {
					if (chunk != null) {
						// 假设 Chunk 有 toMap() 或直接序列化
						chunkMaps.add(JsonUtils.as(chunk, Map.class));
					}
				}
				ensureMetadata(body).put("chunks", chunkMaps);
			}
		}

		// ChunkThreshold, MaxChunks 等 RAG 参数
		if (request.containsChunkThreshold()) {
			ensureMetadata(body).put("chunk_threshold", request.getChunkThreshold());
		}
		if (request.containsMaxChunks()) {
			ensureMetadata(body).put("max_chunks", request.getMaxChunks());
		}

		// AgentName / AgentTag
		if (request.containsAgentName()) {
			ensureMetadata(body).put("agent_name", request.getAgentName());
		}
		if (request.containsAgentTag()) {
			ensureMetadata(body).put("agent_tag", request.getAgentTag());
		}

		// Mode
		if (request.containsMode()) {
			ensureMetadata(body).put("mode", request.getMode());
		}

		return body;
	}

	protected static Map<String, Object> ensureMetadata(Map<String, Object> body) {
		Object metadata = body.get("metadata");
		if (metadata instanceof Map) {
			return (Map) metadata;
		}
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		body.put("metadata", map);
		return map;
	}

	public static ChatMessage fromOpenAIChatMessage(Map<String, Object> body) {
		if (body == null) {
			return null;
		}

		ChatMessage msg = new ChatMessage();

		// 1. 映射 Role (system, user, assistant, tool)
		if (body.containsKey("role")) {
			msg.setRole(DataTypeUtils.asString(body.get("role"), "").toUpperCase());
		}

		// 2. 映射 Content (支持 String 或 List<ContentPart>)
		// ChatMessage.setContent(Object) 已经处理了类型存储，
		// 后续的 getChatContents() 会负责将其转换为 List<ChatContent>
		if (body.containsKey("content")) {
			msg.setContent(body.get("content"));
		}

		// 3. 映射 Name (OpenAI 可选字段，映射到 messagename)
		if (body.containsKey("name")) {
			msg.setMessageName(DataTypeUtils.asString(body.get("name")));
		}

		return msg;
	}

	/**
	 * 将自定义 ChatMessage 转换为 OpenAI 标准消息格式 Map
	 * 
	 * @param message
	 *            自定义 ChatMessage 对象
	 * @return OpenAI 风格的消息 Map
	 */
	public static Map<String, Object> toOpenAIChatMessage(ChatMessage message) {
		if (message == null) {
			return new HashMap<>();
		}

		Map<String, Object> msgMap = new HashMap<>();

		// 1. 映射 Role (必填)
		String role = message.getRole();
		if (role == null || role.isEmpty()) {
			role = "assistant";
		}
		msgMap.put("role", role.toLowerCase());

		// 2. 映射 Content
		// 优先尝试获取结构化内容 (List<ChatContent>)，用于多模态支持
		Object content = message.getRawContent();
		if (content instanceof List) {
			List<ChatContent> contents = message.getChatContents();
			if (contents != null && !contents.isEmpty()) {
				// 转换为 List<Map<String, Object>>
				List<Map<String, Object>> contentList = new ArrayList<>();
				for (ChatContent cc : contents) {
					if (cc != null) {
						// 将 ChatContent 对象转换为 Map
						Map<String, Object> ccMap = JsonUtils.as(cc, Map.class);
						if (ccMap != null) {
							contentList.add(ccMap);
						}
					}
				}
				if (!contentList.isEmpty()) {
					msgMap.put("content", contentList);
				} else {
					// 如果解析失败或为空，回退到纯文本
					String textContent = message.getContent();
					if (textContent != null) {
						msgMap.put("content", textContent);
					}
				}
			} else {
				// 没有结构化内容，直接使用字符串内容
				String textContent = message.getContent();
				if (textContent != null) {
					msgMap.put("content", textContent);
				}
			}
		} else {
			String textContent = message.getContent();
			if (textContent != null) {
				msgMap.put("content", textContent);
			}
		}

		// 3. 映射 Name (可选，OpenAI 允许 user/assistant 消息带 name)
		if (message.containsMessageName()) {
			msgMap.put("name", message.getMessageName());
		}

		// 4. 处理工具调用 (Tool Calls)
		// 场景：Assistant 回复要求调用工具
		// 条件：角色是 assistant 且 存在 toolCallId
		// if ("assistant".equals(role) && message.containsToolCallId()) {
		// List<Map<String, Object>> toolCalls = new ArrayList<>();
		// Map<String, Object> tcItem = new HashMap<>();
		//
		// // 设置 ID
		// tcItem.put("id", message.getToolCallId());
		// // 设置类型 (目前主要是 function)
		// tcItem.put("type", "function");
		//
		// // 构建 Function 对象
		// Map<String, Object> funcMap = new HashMap<>();
		//
		// // 设置函数名
		// if (message.containsToolName()) {
		// funcMap.put("name", message.getToolName());
		// }
		//
		// // 设置参数 (arguments 必须是 JSON 字符串)
		// Object argsObj = message.getData();
		// if (argsObj != null) {
		// if (argsObj instanceof String) {
		// // 已经是字符串，直接使用
		// funcMap.put("arguments", (String) argsObj);
		// } else {
		// // 对象需要序列化为 JSON 字符串
		// funcMap.put("arguments", JsonUtils.toString(argsObj));
		// }
		// } else {
		// // 如果没有参数，提供空对象字符串
		// funcMap.put("arguments", "{}");
		// }
		//
		// tcItem.put("function", funcMap);
		// toolCalls.add(tcItem);
		//
		// msgMap.put("tool_calls", toolCalls);
		// }

		// 5. 处理工具响应 (Tool Call Result)
		// 场景：Tool 执行完毕返回结果
		// 条件：角色是 tool 且 存在 toolCallId
		// if ("tool".equals(role) && message.containsToolCallId()) {
		// msgMap.put("tool_call_id", message.getToolCallId());
		// // 注意：tool 角色的 content 通常是执行结果的字符串表示
		// // 上面第 2 步已经处理了 content，这里不需要额外操作
		// }

		return msgMap;
	}

	public static ChatCompletionResult fromOpenAIChatCompletionResult(Map<String, Object> body) {
		if (body == null) {
			return new ChatCompletionResult();
		}

		ChatCompletionResult result = new ChatCompletionResult();

		// 1. 处理 Choices
		// OpenAI 结构: choices: [{ index: 0, message: { role, content, ... },
		// finish_reason: ... }]
		// 目标结构: choices: [ ChatMessage { role, content, ... } ]
		if (body.containsKey("choices")) {
			Object choicesObj = body.get("choices");
			if (choicesObj instanceof List) {
				List<?> rawChoices = (List<?>) choicesObj;
				List<ChatMessage> messages = new ArrayList<>();

				for (Object choiceObj : rawChoices) {
					if (choiceObj instanceof Map) {
						Map<?, ?> choice = (Map<?, ?>) choiceObj;

						// 提取内部的 message 对象
						if (choice.containsKey("message")) {
							Object messageObj = choice.get("message");
							if (messageObj instanceof Map) {
								// 复用 ChatMessage 的转换逻辑
								ChatMessage msg = fromOpenAIChatMessage((Map<String, Object>) messageObj);

								// 可选：将 finish_reason 存入 message 的 subtype 或
								// data 中，以便前端知道是否结束
								if (choice.containsKey("finish_reason") && msg != null) {
									msg.setSubType(DataTypeUtils.asString(choice.get("finish_reason")));
								}

								if (msg != null) {
									messages.add(msg);
								}
							}
						}
					}
				}

				if (!messages.isEmpty()) {
					result.setChoices(messages);
				}
			}
		}

		// 2. 处理 SessionId
		if (body.containsKey("session_id")) {
			// 兼容 camelCase 写法
			result.setSessionId(DataTypeUtils.asString(body.get("session_id")));
		}

		// 3. (可选) 存储原始 ID 或其他元数据
		// 如果需要保留 openai 的 response id (chatcmpl-xxx)，可以存入 data 字段
		// if (body.containsKey("id")) {
		// result.setData(body.get("id"));
		// // 或者创建一个专门的字段，如果 EntityBase 支持动态扩展，也可以直接 set("openai_id", ...)
		// }

		return result;
	}

	public static Map<String, Object> toOpenAIChatCompletionResult(ChatCompletionResult result) {
		Map<String, Object> response = new HashMap<>();

		// 1. 构建 Choices 列表
		List<Map<String, Object>> openAiChoices = new ArrayList<>();

		List<ChatMessage> choices = result.getChoices();
		if (choices != null) {
			int index = 0;
			for (ChatMessage msg : choices) {
				if (msg == null)
					continue;

				Map<String, Object> choiceItem = new HashMap<>();

				// 设置 index
				choiceItem.put("index", index++);

				// 设置 finish_reason (从 subType 映射)
				// OpenAI 常见值: "stop", "length", "tool_calls", "content_filter"
				// if (msg.containsSubType()) {
				// choiceItem.put("finish_reason", msg.getSubType());
				// } else {
				// // 默认如果没有指定，通常视为 stop
				//
				// }

				choiceItem.put("finish_reason", "stop");

				// 构建内部的 message 对象
				Map<String, Object> messageMap = new HashMap<>();

				// Role
				if (msg.containsRole()) {
					messageMap.put("role", msg.getRole().toLowerCase());
				} else {
					// 默认助手
					messageMap.put("role", "assistant");
				}

				// Content
				// ChatMessage.getContent() 会尝试将 List<ChatContent> 转回 String
				// (JSON字符串)
				// 但 OpenAI 期望 content 要么是 String，要么是 List<Map> (多模态)
				// 我们需要获取原始内容判断
				Object rawContent = msg.getRawContent();
				if (rawContent != null) {
					if (rawContent instanceof String) {
						// 去除think内容
						try {
							rawContent = removeThinkingContent((String) rawContent);
						} catch (Exception ex) {
							log.error(ex);
						}
						messageMap.put("content", rawContent);
					} else if (rawContent instanceof List) {
						// 如果是 List (即 ChatContent 列表)，需要转换为 Map 列表以便 Jackson
						// 序列化
						// 假设 ChatContent 是简单的 POJO 或 Map 结构
						List<?> contentList = (List<?>) rawContent;
						List<Map<String, Object>> serializedContent = new ArrayList<>();
						for (Object item : contentList) {
							if (item instanceof Map) {
								serializedContent.add((Map<String, Object>) item);
							} else if (item != null) {
								// 如果是对象，转为 Map
								// 注意：这里依赖 JsonUtils 或反射，视 ChatContent 具体定义而定
								// 简单起见，如果 ChatContent 有 toJSON 方法最好，否则用
								// JsonUtils
								serializedContent.add(JsonUtils.as(item, Map.class));
							}
						}
						messageMap.put("content", serializedContent);
					} else {
						messageMap.put("content", rawContent);
					}
				}

				// Name (如果有)
				if (msg.containsMessageName()) {
					messageMap.put("name", msg.getMessageName());
				}

				// // 工具调用处理 (Tool Calls)
				// // 如果消息中包含 toolName 和 toolCallId，且角色是 assistant，可能需要构建
				// tool_calls 数组
				// // 这通常用于模拟 AI 返回的工具调用请求
				// if ("assistant".equals(messageMap.get("role")) &&
				// msg.containsToolCallId()) {
				// List<Map<String, Object>> toolCalls = new ArrayList<>();
				// Map<String, Object> toolCallItem = new HashMap<>();
				//
				// toolCallItem.put("id", msg.getToolCallId());
				// toolCallItem.put("type", "function");
				//
				// Map<String, Object> functionMap = new HashMap<>();
				// if (msg.containsToolName()) {
				// functionMap.put("name", msg.getToolName());
				// }
				//
				// // 参数通常在 data 字段或者需要额外传入，这里假设如果 content 是 JSON 字符串且是工具参数
				// // 或者从 msg.getData() 获取
				// Object args = msg.getData();
				// if (args != null) {
				// if (args instanceof String) {
				// functionMap.put("arguments", args);
				// } else {
				// // 序列化为 JSON 字符串，因为 OpenAI 标准中 arguments 是 string
				// functionMap.put("arguments", JsonUtils.toString(args));
				// }
				// } else {
				// functionMap.put("arguments", "{}");
				// }
				//
				// toolCallItem.put("function", functionMap);
				// toolCalls.add(toolCallItem);
				//
				// messageMap.put("tool_calls", toolCalls);
				// }

				choiceItem.put("message", messageMap);
				openAiChoices.add(choiceItem);
			}
		}

		response.put("choices", openAiChoices);

		// 2. 处理 SessionId
		// 如果当前对象中有 sessionId，放入响应体 (OpenAI 标准没有，但这可能是你的业务需求)
		if (result.containsSessionId()) {
			response.put("session_id", result.getSessionId());
		}

		// 3. 处理其他元数据
		// 如果 data 中存储了 openai 的 id (如 chatcmpl-xxx)，放回去
		// if (this.containsData()) {
		// Object dataVal = this.getData();
		// if (dataVal instanceof String) {
		// response.put("id", dataVal);
		// }
		// // 如果 data 是 Map，可以合并进去，视具体需求而定
		// }

		// 补充标准字段 (可选，为了兼容性)
		response.put("object", "chat.completion");
		response.put("created", System.currentTimeMillis() / 1000);
		// model 字段通常需要外部传入，或者从 request 上下文中获取，这里暂不填充或从扩展字段取

		return response;
	}
	
	
	/**
     * 将输入字符串中的 {占位标识} 占位符按规则替换为 实际路径
     *
     * @param input 原始字符串（可能为 null）
     * @return 替换后的字符串
     */
    public static String replacePlaceHolderPath(String input, String placeHolder, String filePath) {
        if (input == null) {
            return null;
        }

        // 不区分大小写匹配 {placeHolder}
        Pattern pattern = Pattern.compile("\\{(?i)"+placeHolder+"\\}");
        Matcher matcher = pattern.matcher(input);

        StringBuilder result = new StringBuilder();
        int lastEnd = 0; // 上一次处理结束的位置

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end(); // 占位符结束索引

            // 添加占位符之前的普通文本
            result.append(input, lastEnd, start);

            // 决定替换内容和实际消耗的字符范围
            String replacement;
            int consumeEnd; // 本次实际要跳过的字符索引（包括可能被消耗的斜杠）

            if (end < input.length()) {
                char nextChar = input.charAt(end);
                if (nextChar == '/') {
                    // 场景1: {baseDir}/ → 替换为 /workfolder/ ，同时消耗掉这个斜杠
                    replacement = filePath+ "/";
                    consumeEnd = end + 1; // 跳过占位符和后面的斜杠
                } else if (nextChar != ' ') {
                    // 场景2: {baseDir} 后跟非空格、非斜杠、非结束 → 替换为 /workfolder/ ，不消耗后面的字符
                    replacement =  filePath+ "/";
                    consumeEnd = end; // 仅跳过占位符
                } else {
                    // 场景3: {baseDir} 后跟空格 → 替换为 /workfolder ，不消耗空格
                    replacement = filePath;
                    consumeEnd = end;
                }
            } else {
                // 字符串结束：{baseDir} 在末尾 → 替换为 /workfolder
                replacement = filePath;
                consumeEnd = end;
            }

            result.append(replacement);
            lastEnd = consumeEnd;
        }

        // 添加剩余未处理的文本
        result.append(input, lastEnd, input.length());
        return result.toString();
    }
}
