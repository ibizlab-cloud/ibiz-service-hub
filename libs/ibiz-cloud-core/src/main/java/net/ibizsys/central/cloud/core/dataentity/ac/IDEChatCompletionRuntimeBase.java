package net.ibizsys.central.cloud.core.dataentity.ac;

import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;

/**
 * 实体聊天交互运行时对象基接口
 * @author lionlau
 *
 */
public interface IDEChatCompletionRuntimeBase {

	/**
	 * 方法：获取资源
	 */
	final static String METHOD_RESOURCES = "RESOURCES";
	
	
	/**
	 * 方法：获取历史数据
	 */
	final static String METHOD_HISTORIES = "HISTORIES";
	
	/**
	 * 方法：补全
	 */
	final static String METHOD_CHATCOMPLETION = "CHATCOMPLETION";
	
	/**
	 * 方法：异步补全
	 */
	final static String METHOD_ASYNCCHATCOMPLETION = "ASYNCCHATCOMPLETION";
	
	
	/**
	 * 方法：SSE补全
	 */
	final static String METHOD_SSECHATCOMPLETION = "SSECHATCOMPLETION";
	
	/**
	 * 方法：建议
	 */
	final static String METHOD_CHATSUGGESTION = "CHATSUGGESTION";
	
	
	/**
	 * 获取聊天资源内容
	 * @param dataOrKeys
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	String getResource(Object dataOrKeys,Map<String, Object> params) throws Throwable;
	
	/**
	 * 获取历史记录
	 * @param dataOrKeys 键值或数据对象
	 * @param body
	 * @parma templParams 模板参数
	 * @return
	 * @throws Throwable
	 */
	List<ChatMessage> getHistories(Object dataOrKeys, Object body) throws Throwable;
	
	
	/**
	 * 获取历史记录
	 * @param dataOrKeys 键值或数据对象
	 * @param body
	 * @return
	 * @throws Throwable
	 */
	List<ChatMessage> getHistories(Object dataOrKeys, Object body, Map<String, Object> templParams) throws Throwable;
	

	/**
	 * 获取建议
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	ChatCompletionResult chatSuggestion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest) throws Throwable;
	
	
	
	
	/**
	 * 同步聊天补全操作
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest)  throws Throwable;
	

	
	/**
	 * 异步聊天补全
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest)  throws Throwable;
	
	
	/**
	 * SSE 聊天补全
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest)  throws Throwable;
}
