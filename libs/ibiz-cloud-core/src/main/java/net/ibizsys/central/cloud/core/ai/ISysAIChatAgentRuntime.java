package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.model.PSModelEnums.MsgTemplEngine;
import net.ibizsys.model.ai.IPSSysAIChatAgent;

/**
 * 系统AI交谈代理运行时
 * @author lionlau
 *
 */
public interface ISysAIChatAgentRuntime extends ISysAIAgentRuntime, IAIChatAgentRuntimeBase{

	public final static String SESSION_PREDEFINEDFIELD_AGENT_CONTEXT_ID = "AGENT_CONTEXT_ID";
	
	public final static String SESSION_PREDEFINEDFIELD_SESSION_ID = "SESSION_ID";
	
	public final static String SESSION_PREDEFINEDFIELD_USER_ID = "USER_ID";
	
	public final static String SESSION_PREDEFINEDFIELD_SEQUENCE = "SEQUENCE";

	public final static String SESSION_PREDEFINEDFIELD_STATUS = "STATUS";

	public final static String SESSION_PREDEFINEDFIELD_SCOPE = "SCOPE";

	public final static String SESSION_PREDEFINEDFIELD_TYPE = "TYPE";

	public final static String SESSION_PREDEFINEDFIELD_TITLE = "TITLE";

	public final static String SESSION_PREDEFINEDFIELD_LAST_ACTIVE_AT = "LAST_ACTIVE_AT";
	
	public final static String MESSAGE_PREDEFINEDFIELD_SESSION_ID = "SESSION_ID";
	
	public final static String MESSAGE_PREDEFINEDFIELD_CONTENT_TYPE = "CONTENT_TYPE";
	
	public final static String MESSAGE_PREDEFINEDFIELD_SENDER_TYPE = "SENDER_TYPE";
	
	public final static String MESSAGE_PREDEFINEDFIELD_CONTENT = "CONTENT";
	
	public final static String MESSAGE_PREDEFINEDFIELD_SEQUENCE = "SEQUENCE";

	public final static String MESSAGE_PREDEFINEDFIELD_STATUS = "STATUS";
	
	public final static String MESSAGE_SENDER_TYPE_USER = "user";
	
	public final static String MESSAGE_SENDER_TYPE_AGENT = "agent";
	
	public final static String MESSAGE_PREDEFINEDFIELD_TOOL_CALLS = "TOOL_CALLS";
	
	public final static String MESSAGE_PREDEFINEDFIELD_TOTAL_TOKENS = "TOTAL_TOKENS";
	
	public final static String MESSAGE_PREDEFINEDFIELD_OUTPUT_TOKENS = "OUTPUT_TOKENS";
	
	public final static String MESSAGE_PREDEFINEDFIELD_INPUT_TOKENS = "INPUT_TOKENS";

	public final static String MEMORYTASK_PREDEFINEDFIELD_NAME = "NAME";

	public final static String MEMORYTASK_PREDEFINEDFIELD_STATUS = "STATUS";

	public final static String MEMORYTASK_PREDEFINEDFIELD_SESSION_ID = "SESSION_ID";

	public final static String MEMORYTASK_PREDEFINEDFIELD_KNOWLEDGEBASE_TAG = "KNOWLEDGEBASE_TAG";

	public final static String MEMORYTASK_PREDEFINEDFIELD_DOCUMENT_TAG = "DOCUMENT_TAG";

	public final static String MEMORYTASK_PREDEFINEDFIELD_SCHEDULED_AT = "SCHEDULED_AT";

	public final static String MEMORYTASK_PREDEFINEDFIELD_TRIGGER_TYPE = "TRIGGER_TYPE";

	public final static String MEMORYTASK_PREDEFINEDFIELD_MEMORY_ISOLATION_MODE = "MEMORY_ISOLATION_MODE";

    public final static String MEMORYTASK_PREDEFINEDFIELD_AI_AGENT_CONTEXT_ID = "AI_AGENT_CONTEXT_ID";
	
	/**
	 * 聊天模式：代码
	 */
	public final static String CHATMODE_CODE = "code";
	
	/**
	 * 聊天摘要模式：标题摘要
	 */
	public final static String CHATDIGESTMODE_TITLE = "title";
	
	/**
	 * 聊天摘要模式：内容摘要
	 */
	public final static String CHATDIGESTMODE_CONTENT = "content";
	
	
	/**
	 * 消息状态：失败
	 */
	public final static String MESSAGE_STATUS_FAILED = "failed";
	
	/**
	 * 消息状态：取消
	 */
	public final static String MESSAGE_STATUS_CANCELED = "canceled";
    
	
	
	/**
	 * 初始化
	 * @param iSysAIFactoryRuntimeContext
	 * @param iPSSysAIChatAgent
	 * @throws Exception
	 */
	void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, IPSSysAIChatAgent iPSSysAIChatAgent) throws Exception;
	
	
	@Override
	IPSSysAIChatAgent getPSModelObject();
	
	
	/**
	 * 获取唯一标记
	 * @return
	 */
	String getUniqueTag();
	
	
	/**
	 * 获取工作目录
	 * @return
	 */
	File getWorkspace();
	
	/**
	 * 获取建议
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @param params 
	 * @return
	 * @throws Throwable
	 */
	ChatCompletionResult chatSuggestion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 获取建议的聊天记录
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest 聊天请求
	 * @param params 附加参数
	 * @return
	 * @throws Throwable
	 */
	List<ChatMessage> getSuggestionMessages(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 获取摘要信息
	 * @param dataOrKeys
	 * @param chatCompletionRequest
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	ChatMessage getDigestMessage(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable;
	
	/**
	 * 开始聊天会话
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	Object beginChatSession(ChatCompletionRequest chatCompletionRequest) throws Throwable;
	
	/**
	 * 结束聊天会话
	 * @param sessionData
	 * @throws Throwable
	 */
	void endChatSession(Object sessionData)throws Throwable;
	
	
	/**
	 * 附加聊天消息
	 * @param sessionData
	 * @param chatMessage
	 * @throws Throwable
	 */
	Object appendChatMessage(Object sessionData, ChatMessage chatMessage)throws Throwable;
	
	/**
	 * 附加聊天消息
	 * @param sessionData
	 * @param chatMessage
	 * @param bCancel
	 * @param bError
	 * @throws Throwable
	 */
	Object appendChatMessage(Object sessionData, ChatMessage chatMessage, boolean bCancel, boolean bError)throws Throwable;
	
	
	
	/**
	 * 获取聊天摘要
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @param params 
	 * @return
	 * @throws Throwable
	 */
	ChatCompletionResult chatDigest(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable;
	
	
	
	/**
	 * 获取当前Agent绑定的相关资料库片段
	 * @param iChunkSearchContext
	 * @return
	 */
	Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable;
	
	/**
	 * 获取当前Agent绑定的相关资料库片段
	 * @param iChunkSearchContext
	 * @return
	 */
	Page<Chunk> fetchChunksByHistories(IChunkSearchContext iChunkSearchContext) throws Throwable;
	
	
	
	/**
	 * 从搜索的片段中列出相关文档
	 * @param iChunkSearchContext
	 * @return
	 * @throws Throwable
	 */
	List<Document> listDocumentsByChunks(IChunkSearchContext iChunkSearchContext) throws Throwable;
	
	
	/**
	 * 定时处理记忆
	 * @param bHasLeaderShip 是否具备处理资格
	 * @param params 处理参数，可包含时间范围、内存类型等配置信息
	 */
	void scheduleMemoryMaintenance(boolean bHasLeaderShip, Map<String, Object> params) throws Throwable;
	
	/**
	 * 填充代理技能
	 * @param skills
	 * @param params
	 * @throws Throwable
	 */
	void fillSkills(Map<String, Object> skills, Map<String, Object> params) throws Throwable;
	
	
	
	/**
	 * 获取模板上下文对象
	 * @param msgTemplEngine 模板
	 * @return
	 */
	Object getTemplateContext(MsgTemplEngine msgTemplEngine);
}
