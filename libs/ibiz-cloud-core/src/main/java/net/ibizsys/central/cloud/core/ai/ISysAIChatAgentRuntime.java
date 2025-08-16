package net.ibizsys.central.cloud.core.ai;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.model.ai.IPSSysAIChatAgent;

/**
 * 系统AI交谈代理运行时
 * @author lionlau
 *
 */
public interface ISysAIChatAgentRuntime extends ISysAIAgentRuntime, IAIChatAgentRuntimeBase{

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
	

}
