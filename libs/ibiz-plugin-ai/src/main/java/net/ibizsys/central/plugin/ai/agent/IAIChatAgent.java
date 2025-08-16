package net.ibizsys.central.plugin.ai.agent;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import net.ibizsys.central.cloud.core.ai.IAIChatAgentRuntimeBase;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.util.domain.ACDataItem;

/**
 * AI 交谈代理
 * @author lionlau
 *
 */
public interface IAIChatAgent extends IAIAgent, IAIChatAgentRuntimeBase{


	/**
	 * 获取数据项分页结构
	 * @param objData 数据集合
	 * @param objTag
	 * @param params 附加参数
	 * @return
	 */
	Page<ACDataItem> fetchACItems(Object objData, Object body, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 获取聊天记录（非系统数据）
	 * @param dataOrKeys 键值或数据对象
	 * @param body
	 * @param params 附加参数
	 * @return
	 * @throws Throwable
	 */
	List<ChatMessage> getHistories(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 获取系统聊天记录
	 * @param dataOrKeys 键值或数据对象
	 * @param params 附加参数
	 * @return
	 * @throws Throwable
	 */
	List<ChatMessage> getSystemMessages(Object dataOrKeys, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 获取系统聊天记录
	 * @param dataOrKeys 键值或数据对象
	 * @param params 附加参数
	 * @return
	 * @throws Throwable
	 */
	List<ChatTool> getTools(Object dataOrKeys, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 同步聊天补全操作
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable;
	

	
	/**
	 * 异步聊天补全
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * SSE 聊天补全
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 同步聊天补全操作
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @param params
	 * @param bAppendSystemMessage 附加系统消息
	 * @param bAppendHistories 附加历史消息
	 * @return
	 * @throws Throwable
	 */
	ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable;
	

	
	/**
	 * 异步聊天补全
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @param params
	 * @param bAppendSystemMessage 附加系统消息
	 * @param bAppendHistories 附加历史消息
	 * @return
	 * @throws Throwable
	 */
	PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable;
	
	
	/**
	 * SSE 聊天补全
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
     * @param params
	 * @param bAppendSystemMessage 附加系统消息
	 * @param bAppendHistories 附加历史消息
	 * @return
	 * @throws Throwable
	 */
	SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable;
}
