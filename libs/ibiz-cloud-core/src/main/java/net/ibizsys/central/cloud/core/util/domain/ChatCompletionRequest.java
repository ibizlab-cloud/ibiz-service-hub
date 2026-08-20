package net.ibizsys.central.cloud.core.util.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 聊天补全请求数据对象
 * 
 * @author lionlau
 *
 */
public class ChatCompletionRequest extends EntityBase {

	public final static String FIELD_AGENTNAME = "agentname";

	public final static String FIELD_AGENTTAG = "agenttag";

	public final static String FIELD_MESSAGES = "messages";

	public final static String FIELD_SESSIONID = "sessionid";

	public final static String FIELD_MODEL = "model";

	public final static String FIELD_STREAMING = "streaming";

	/**
	 * 取值范围: [.0f, 1.0f]。 多样性，越高，多样性越好, 缺省 0.3
	 */
	public final static String FIELD_TEMPERATURE = "temperature";

	public final static String FIELD_TOPP = "topp";

	public final static String FIELD_TOOLS = "tools";

	public final static String FIELD_MAXTOKENS = "maxtokens";

	/**
	 * 最大输入词数
	 */
	public final static String FIELD_MAXINPUTTOKENS = "maxinputtokens";

	/**
	 * McpServer集合
	 */
	public final static String FIELD_MCPSERVERS = "mcpservers";

	/**
	 * 模式
	 */
	public final static String FIELD_MODE = "mode";

	/**
	 * 是否启用Thinking
	 */
	public final static String FIELD_THINKING = "thinking";

	/**
	 * 是否启用Searching
	 */
	public final static String FIELD_SEARCHING = "searching";

	/**
	 * 相关知识片段集合
	 */
	public final static String FIELD_CHUNKS = "chunks";

	/**
	 * 知识库集合
	 */
	public final static String FIELD_KNOWLEDGEBASES = "knowledgebases";

	/**
	 * 最大资料片段数
	 */
	public final static String FIELD_MAXCHUNKS = "maxchunks";

	/**
	 * 资料阈值 [.0f, 1.0f]。 越高，相似度越好, 缺省 0.3
	 */
	public final static String FIELD_CHUNKTHRESHOLD = "chunkthreshold";

	/**
	 * 资料重排序模式
	 */
	public final static String FIELD_CHUNKRERANK = "chunkrerank";

	/**
	 * 资料页面目录召回
	 */
	public final static String FIELD_CHUNKPAGEINDEX = "chunkpageindex";

	/**
	 * 资料查询数组
	 */
	public final static String FIELD_CHUNKQUERIES = "chunkqueries";
	
	/**
	 * 资料反查路径，禁用反查 `false` or `no`
	 */
	public final static String FIELD_CHUNKVIEWURL = "chunkviewurl";
	
	/**
	 * 资料使用提示词，禁用提示词 `false` or `no`
	 */
	public final static String FIELD_CHUNKPROMPT = "chunkprompt";
	
	/**
	 * 资料目录：remote,local,no
	 */
	public final static String FIELD_CHUNKSECTION = "chunksection";
	 
	/**
	 * OSS图片识别提示词
	 */
	public final static String FIELD_OSSIMAGEVLPROMPT = "ossimagevlprompt";
	
	
	/**
	 * 来源通道
	 */
	public final static String FIELD_SOURCECHANNEL = "sourcechannel";
	

	/**
	 * 技能集合
	 */
	public final static String FIELD_SKILLS = "skills";
	
	
//	/**
//	 * 业务范围，一般使用srfscope
//	 */
//	public final static String FIELD_BUSINESSSCOPE = "businessscope";
	
	
	/**
	 * 设置「消息集合」
	 *
	 * @param val
	 */
	// @JsonIgnore
	@JsonProperty(FIELD_MESSAGES)
	public ChatCompletionRequest setMessages(List<ChatMessage> val) {
		this.set(FIELD_MESSAGES, val);
		return this;
	}

	/**
	 * 获取「消息集合」值
	 *
	 */
	@JsonIgnore
	public List<ChatMessage> getMessages() {
		return (List<ChatMessage>) this.get(FIELD_MESSAGES);
	}

	/**
	 * 获取「消息集合」值
	 *
	 */
	@JsonIgnore
	public List<ChatMessage> getMessagesIf() {
		Object list = this.get(FIELD_MESSAGES);
		if (list == null) {
			list = new ArrayList<ChatMessage>();
			setMessages((List<ChatMessage>) list);
		}
		return (List<ChatMessage>) list;
	}

	/**
	 * 判断 「消息集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMessages() {
		return this.contains(FIELD_MESSAGES);
	}

	/**
	 * 重置 「消息集合」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetMessages() {
		this.reset(FIELD_MESSAGES);
		return this;
	}

	/**
	 * 设置「工具集合」
	 *
	 * @param val
	 */
	// @JsonIgnore
	@JsonProperty(FIELD_TOOLS)
	public ChatCompletionRequest setTools(List<ChatTool> val) {
		this.set(FIELD_TOOLS, val);
		return this;
	}

	/**
	 * 获取「工具集合」值
	 *
	 */
	@JsonIgnore
	public List<ChatTool> getTools() {
		return (List<ChatTool>) this.get(FIELD_TOOLS);
	}

	/**
	 * 判断 「工具集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTools() {
		return this.contains(FIELD_TOOLS);
	}

	/**
	 * 重置 「工具集合」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetTools() {
		this.reset(FIELD_TOOLS);
		return this;
	}

	/**
	 * 设置「会话标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setSessionId(String val) {
		this.set(FIELD_SESSIONID, val);
		return this;
	}

	/**
	 * 获取「会话标识」值
	 *
	 */
	@JsonIgnore
	public String getSessionId() {
		return (String) this.get(FIELD_SESSIONID);
	}

	/**
	 * 判断 「会话标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSessionId() {
		return this.contains(FIELD_SESSIONID);
	}

	/**
	 * 重置 「会话标识」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetSessionId() {
		this.reset(FIELD_SESSIONID);
		return this;
	}

	/**
	 * 设置「模型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setModel(String val) {
		this.set(FIELD_MODEL, val);
		return this;
	}

	/**
	 * 获取「模型」值
	 *
	 */
	@JsonIgnore
	public String getModel() {
		return (String) this.get(FIELD_MODEL);
	}

	/**
	 * 判断 「模型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsModel() {
		return this.contains(FIELD_MODEL);
	}

	/**
	 * 重置 「模型」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetModel() {
		this.reset(FIELD_MODEL);
		return this;
	}

	/**
	 * 设置「是否流式反馈」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setStreaming(Integer val) {
		this.set(FIELD_STREAMING, val);
		return this;
	}

	/**
	 * 获取「是否流式反馈」值
	 *
	 */
	@JsonIgnore
	public Integer getStreaming() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_STREAMING), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「是否流式反馈」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsStreaming() {
		return this.contains(FIELD_STREAMING);
	}

	/**
	 * 重置 「是否流式反馈」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetStreaming() {
		this.reset(FIELD_STREAMING);
		return this;
	}

	/**
	 * 设置「多样性参数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setTemperature(Float val) {
		this.set(FIELD_TEMPERATURE, val);
		return this;
	}

	/**
	 * 获取「多样性参数」值
	 *
	 */
	@JsonIgnore
	public Float getTemperature() {
		try {
			return DataTypeUtils.getFloatValue(this.get(FIELD_TEMPERATURE), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「多样性参数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTemperature() {
		return this.contains(FIELD_TEMPERATURE);
	}

	/**
	 * 重置 「多样性参数」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetTemperature() {
		this.reset(FIELD_TEMPERATURE);
		return this;
	}

	/**
	 * 设置「概率核采样」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setTopP(Float val) {
		this.set(FIELD_TOPP, val);
		return this;
	}

	/**
	 * 获取「概率核采样」值
	 *
	 */
	@JsonIgnore
	public Float getTopP() {
		try {
			return DataTypeUtils.getFloatValue(this.get(FIELD_TOPP), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「概率核采样」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTopP() {
		return this.contains(FIELD_TOPP);
	}

	/**
	 * 重置 「概率核采样」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetTopP() {
		this.reset(FIELD_TOPP);
		return this;
	}

	/**
	 * 设置「最大词量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setMaxTokens(Integer val) {
		this.set(FIELD_MAXTOKENS, val);
		return this;
	}

	/**
	 * 获取「最大词量」值
	 *
	 */
	@JsonIgnore
	public Integer getMaxTokens() {
		return DataTypeUtils.asInteger(this.get(FIELD_MAXTOKENS), null);
	}

	/**
	 * 判断 「最大词量」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMaxTokens() {
		return this.contains(FIELD_MAXTOKENS);
	}

	/**
	 * 重置 「最大词量」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetMaxTokens() {
		this.reset(FIELD_MAXTOKENS);
		return this;
	}

	/**
	 * 设置「McpServers」值
	 *
	 */
	@JsonIgnore
	public void setMcpServers(List<String> value) {
		this.set(FIELD_MCPSERVERS, value);
	}

	/**
	 * 获取「McpServers」值
	 *
	 */
	@JsonIgnore
	public List<String> getMcpServers() {
		Object objValue = this.get(FIELD_MCPSERVERS);
		if (objValue == null) {
			return null;
		}

		if (objValue instanceof String) {
			List list = Arrays.asList(objValue.toString().split("[,]"));
			this.set(FIELD_MCPSERVERS, list);
			return list;
		}

		return (List<String>) objValue;
	}

	/**
	 * 判断 「McpServers」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMcpServers() {
		return this.contains(FIELD_MCPSERVERS);
	}

	/**
	 * 重置 「McpServers」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetMcpServers() {
		this.reset(FIELD_MCPSERVERS);
		return this;
	}

	/**
	 * 设置「最大输入词量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setMaxInputTokens(Integer val) {
		this.set(FIELD_MAXINPUTTOKENS, val);
		return this;
	}

	/**
	 * 获取「最大输入词量」值
	 *
	 */
	@JsonIgnore
	public Integer getMaxInputTokens() {
		return DataTypeUtils.asInteger(this.get(FIELD_MAXINPUTTOKENS), null);
	}

	/**
	 * 判断 「最大输入词量」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMaxInputTokens() {
		return this.contains(FIELD_MAXINPUTTOKENS);
	}

	/**
	 * 重置 「最大输入词量」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetMaxInputTokens() {
		this.reset(FIELD_MAXINPUTTOKENS);
		return this;
	}

	/**
	 * 设置「模式」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setMode(String val) {
		this.set(FIELD_MODE, val);
		return this;
	}

	/**
	 * 获取「模式」值
	 *
	 */
	@JsonIgnore
	public String getMode() {
		return (String) this.get(FIELD_MODE);
	}

	/**
	 * 判断 「模式」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMode() {
		return this.contains(FIELD_MODE);
	}

	/**
	 * 重置 「模式」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetMode() {
		this.reset(FIELD_MODE);
		return this;
	}

	/**
	 * 设置「是否思考模式」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setThinking(Integer val) {
		this.set(FIELD_THINKING, val);
		return this;
	}

	/**
	 * 获取「是否思考模式」值
	 *
	 */
	@JsonIgnore
	public Integer getThinking() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_THINKING), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「是否思考模式」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsThinking() {
		return this.contains(FIELD_THINKING);
	}

	/**
	 * 重置 「是否思考模式」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetThinking() {
		this.reset(FIELD_THINKING);
		return this;
	}

	/**
	 * 设置「是否联网搜索」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setSearching(Integer val) {
		this.set(FIELD_SEARCHING, val);
		return this;
	}

	/**
	 * 获取「是否联网搜索」值
	 *
	 */
	@JsonIgnore
	public Integer getSearching() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_SEARCHING), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「是否联网搜索」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSearching() {
		return this.contains(FIELD_SEARCHING);
	}

	/**
	 * 重置 「是否联网搜索」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetSearching() {
		this.reset(FIELD_SEARCHING);
		return this;
	}

	/**
	 * 设置「资料片段集合」
	 *
	 * @param val
	 */
	// @JsonIgnore
	@JsonProperty(FIELD_CHUNKS)
	public ChatCompletionRequest setChunks(List<Chunk> val) {
		this.set(FIELD_CHUNKS, val);
		return this;
	}

	/**
	 * 获取「资料片段集合」值
	 *
	 */
	@JsonIgnore
	public List<Chunk> getChunks() {
		return (List<Chunk>) this.get(FIELD_CHUNKS);
	}

	/**
	 * 获取「资料片段集合」值
	 *
	 */
	@JsonIgnore
	public List<Chunk> getChunksIf() {
		Object list = this.get(FIELD_CHUNKS);
		if (list == null) {
			list = new ArrayList<Chunk>();
			setChunks((List<Chunk>) list);
		}
		return (List<Chunk>) list;
	}

	/**
	 * 判断 「资料片段集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChunks() {
		return this.contains(FIELD_CHUNKS);
	}

	/**
	 * 重置 「资料片段集合」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetChunks() {
		this.reset(FIELD_CHUNKS);
		return this;
	}

	/**
	 * 设置「KnowledgeBases」值
	 *
	 */
	@JsonIgnore
	public void setKnowledgeBases(List<String> value) {
		this.set(FIELD_KNOWLEDGEBASES, value);
	}

	/**
	 * 获取「KnowledgeBases」值
	 *
	 */
	@JsonIgnore
	public List<String> getKnowledgeBases() {
		Object objValue = this.get(FIELD_KNOWLEDGEBASES);
		if (objValue == null) {
			return null;
		}

		if (objValue instanceof String) {
			List list = Arrays.asList(objValue.toString().split("[,]"));
			this.set(FIELD_KNOWLEDGEBASES, list);
			return list;
		}

		return (List<String>) objValue;
	}

	/**
	 * 判断 「KnowledgeBases」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsKnowledgeBases() {
		return this.contains(FIELD_KNOWLEDGEBASES);
	}

	/**
	 * 重置 「KnowledgeBases」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetKnowledgeBases() {
		this.reset(FIELD_KNOWLEDGEBASES);
		return this;
	}

	/**
	 * 设置「最大资料片段数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setMaxChunks(Integer val) {
		this.set(FIELD_MAXCHUNKS, val);
		return this;
	}

	/**
	 * 获取「最大资料片段数」值
	 *
	 */
	@JsonIgnore
	public Integer getMaxChunks() {
		return DataTypeUtils.asInteger(this.get(FIELD_MAXCHUNKS), null);
	}

	/**
	 * 判断 「最大资料片段数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMaxChunks() {
		return this.contains(FIELD_MAXCHUNKS);
	}

	/**
	 * 重置 「最大资料片段数」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetMaxChunks() {
		this.reset(FIELD_MAXCHUNKS);
		return this;
	}

	/**
	 * 设置「资料阈值参数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setChunkThreshold(Float val) {
		this.set(FIELD_CHUNKTHRESHOLD, val);
		return this;
	}

	/**
	 * 获取「资料阈值参数」值
	 *
	 */
	@JsonIgnore
	public Float getChunkThreshold() {
		try {
			return DataTypeUtils.getFloatValue(this.get(FIELD_CHUNKTHRESHOLD), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「资料阈值参数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChunkThreshold() {
		return this.contains(FIELD_CHUNKTHRESHOLD);
	}

	/**
	 * 重置 「资料阈值参数」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetChunkThreshold() {
		this.reset(FIELD_CHUNKTHRESHOLD);
		return this;
	}

	/**
	 * 设置「资料重排序参数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setChunkReRank(Integer val) {
		this.set(FIELD_CHUNKRERANK, val);
		return this;
	}

	/**
	 * 获取「资料重排序参数」值
	 *
	 */
	@JsonIgnore
	public Integer getChunkReRank() {
		return DataTypeUtils.asInteger(this.get(FIELD_CHUNKRERANK), null);
	}

	/**
	 * 判断 「资料重排序参数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChunkReRank() {
		return this.contains(FIELD_CHUNKRERANK);
	}

	/**
	 * 重置 「资料重排序参数」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetChunkReRank() {
		this.reset(FIELD_CHUNKRERANK);
		return this;
	}

	/**
	 * 设置「资料树索引参数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setChunkPageIndex(Integer val) {
		this.set(FIELD_CHUNKPAGEINDEX, val);
		return this;
	}

	/**
	 * 获取「资料树索引参数」值
	 *
	 */
	@JsonIgnore
	public Integer getChunkPageIndex() {
		return DataTypeUtils.asInteger(this.get(FIELD_CHUNKPAGEINDEX), null);
	}

	/**
	 * 判断 「资料树索引参数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChunkPageIndex() {
		return this.contains(FIELD_CHUNKPAGEINDEX);
	}

	/**
	 * 重置 「资料树索引参数」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetChunkPageIndex() {
		this.reset(FIELD_CHUNKPAGEINDEX);
		return this;
	}

	/**
	 * 设置「OSS图片识别提示词」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setOSSImageVLPrompt(String val) {
		this.set(FIELD_OSSIMAGEVLPROMPT, val);
		return this;
	}

	/**
	 * 获取「OSS图片识别提示词」值
	 *
	 */
	@JsonIgnore
	public String getOSSImageVLPrompt() {
		return (String) this.get(FIELD_OSSIMAGEVLPROMPT);
	}

	/**
	 * 判断 「OSS图片识别提示词」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOSSImageVLPrompt() {
		return this.contains(FIELD_OSSIMAGEVLPROMPT);
	}

	/**
	 * 重置 「OSS图片识别提示词」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetOSSImageVLPrompt() {
		this.reset(FIELD_OSSIMAGEVLPROMPT);
		return this;
	}

	/**
	 * 设置「代理名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setAgentName(String val) {
		this.set(FIELD_AGENTNAME, val);
		return this;
	}

	/**
	 * 获取「代理名称」值
	 *
	 */
	@JsonIgnore
	public String getAgentName() {
		return (String) this.get(FIELD_AGENTNAME);
	}

	/**
	 * 判断 「代理名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAgentName() {
		return this.contains(FIELD_AGENTNAME);
	}

	/**
	 * 重置 「代理名称」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetAgentName() {
		this.reset(FIELD_AGENTNAME);
		return this;
	}

	/**
	 * 设置「代理标记」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setAgentTag(String val) {
		this.set(FIELD_AGENTTAG, val);
		return this;
	}

	/**
	 * 获取「代理标记」值
	 *
	 */
	@JsonIgnore
	public String getAgentTag() {
		return (String) this.get(FIELD_AGENTTAG);
	}

	/**
	 * 判断 「代理标记」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAgentTag() {
		return this.contains(FIELD_AGENTTAG);
	}

	/**
	 * 重置 「代理标记」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetAgentTag() {
		this.reset(FIELD_AGENTTAG);
		return this;
	}

	/**
	 * 设置「ChunkQueries」值
	 *
	 */
	@JsonIgnore
	public void setChunkQueries(List<String> value) {
		this.set(FIELD_CHUNKQUERIES, value);
	}

	/**
	 * 获取「ChunkQueries」值
	 *
	 */
	@JsonIgnore
	public List<String> getChunkQueries() {
		Object objValue = this.get(FIELD_CHUNKQUERIES);
		if (objValue == null) {
			return null;
		}

		if (objValue instanceof String) {
			List list = Arrays.asList(objValue.toString().split("[,]"));
			this.set(FIELD_CHUNKQUERIES, list);
			return list;
		}

		return (List<String>) objValue;
	}

	/**
	 * 判断 「ChunkQueries」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChunkQueries() {
		return this.contains(FIELD_CHUNKQUERIES);
	}

	/**
	 * 重置 「ChunkQueries」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetChunkQueries() {
		this.reset(FIELD_CHUNKQUERIES);
		return this;
	}

	
	/**
	 * 设置「资料使用提示词」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setChunkPrompt(String val) {
		this.set(FIELD_CHUNKPROMPT, val);
		return this;
	}

	/**
	 * 获取「资料使用提示词」值
	 *
	 */
	@JsonIgnore
	public String getChunkPrompt() {
		return (String) this.get(FIELD_CHUNKPROMPT);
	}

	/**
	 * 判断 「资料使用提示词」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChunkPrompt() {
		return this.contains(FIELD_CHUNKPROMPT);
	}

	/**
	 * 重置 「资料使用提示词」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetChunkPrompt() {
		this.reset(FIELD_CHUNKPROMPT);
		return this;
	}
	
	
	/**
	 * 设置「资料反查路径」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setChunkViewUrl(String val) {
		this.set(FIELD_CHUNKVIEWURL, val);
		return this;
	}

	/**
	 * 获取「资料反查路径」值
	 *
	 */
	@JsonIgnore
	public String getChunkViewUrl() {
		return (String) this.get(FIELD_CHUNKVIEWURL);
	}

	/**
	 * 判断 「资料反查路径」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChunkViewUrl() {
		return this.contains(FIELD_CHUNKVIEWURL);
	}

	/**
	 * 重置 「资料反查路径」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetChunkViewUrl() {
		this.reset(FIELD_CHUNKVIEWURL);
		return this;
	}
	
	
	/**
	 * 设置「输出资料目录」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionRequest setChunkSection(String val) {
		this.set(FIELD_CHUNKSECTION, val);
		return this;
	}

	/**
	 * 获取「输出资料目录」值
	 *
	 */
	@JsonIgnore
	public String getChunkSection() {
		return (String) this.get(FIELD_CHUNKSECTION);
	}

	/**
	 * 判断 「输出资料目录」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChunkSection() {
		return this.contains(FIELD_CHUNKSECTION);
	}
	
	/**
	 * 重置 「输出资料目录」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetChunkSection() {
		this.reset(FIELD_CHUNKSECTION);
		return this;
	}
	
	/**
	 * 设置「来源通道标识」（例如：XX@qq）
	 *
	 * @param val 来源通道标识
	 */
	@JsonProperty(FIELD_SOURCECHANNEL)
	public ChatCompletionRequest setSourceChannel(String val) {
		this.set(FIELD_SOURCECHANNEL, val);
		return this;
	}

	/**
	 * 获取「来源通道标识」值
	 *
	 */
	@JsonIgnore
	public String getSourceChannel() {
		return (String) this.get(FIELD_SOURCECHANNEL);
	}

	/**
	 * 判断 「来源通道标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSourceChannel() {
		return this.contains(FIELD_SOURCECHANNEL);
	}

	/**
	 * 重置 「来源通道标识」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetSourceChannel() {
		this.reset(FIELD_SOURCECHANNEL);
		return this;
	}
	
	
	/**
	 * 设置「Skills」值
	 *
	 */
	@JsonIgnore
	public void setSkills(List<String> value) {
		this.set(FIELD_SKILLS, value);
	}

	/**
	 * 获取「Skills」值
	 *
	 */
	@JsonIgnore
	public List<String> getSkills() {
		Object objValue = this.get(FIELD_SKILLS);
		if (objValue == null) {
			return null;
		}

		if (objValue instanceof String) {
			List list = Arrays.asList(objValue.toString().split("[,]"));
			this.set(FIELD_SKILLS, list);
			return list;
		}

		return (List<String>) objValue;
	}

	/**
	 * 判断 「Skills」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSkills() {
		return this.contains(FIELD_SKILLS);
	}

	/**
	 * 重置 「Skills」
	 *
	 */
	@JsonIgnore
	public ChatCompletionRequest resetSkills() {
		this.reset(FIELD_SKILLS);
		return this;
	}
//	
//	/**
//	 * 设置「业务范围」
//	 *
//	 * @param val 业务范围
//	 */
//	@JsonProperty(FIELD_BUSINESSSCOPE)
//	public ChatCompletionRequest setBusinessScope(String val) {
//		this.set(FIELD_BUSINESSSCOPE, val);
//		return this;
//	}
//
//	/**
//	 * 获取「业务范围」值
//	 *
//	 */
//	@JsonIgnore
//	public String getBusinessScope() {
//		return (String) this.get(FIELD_BUSINESSSCOPE);
//	}
//
//	/**
//	 * 判断 「业务范围」是否有值
//	 *
//	 */
//	@JsonIgnore
//	public boolean containsBusinessScope() {
//		return this.contains(FIELD_BUSINESSSCOPE);
//	}
//
//	/**
//	 * 重置 「业务范围」
//	 *
//	 */
//	@JsonIgnore
//	public ChatCompletionRequest resetBusinessScope() {
//		this.reset(FIELD_BUSINESSSCOPE);
//		return this;
//	}
//	
	
}
