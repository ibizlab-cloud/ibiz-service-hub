package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;

/**
 * 系统AI功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysAIUtilRuntime extends ISysUtilRuntime{

	/**
	 * AI平台：默认，由Cloud平台默认AI引擎提供服务
	 */
	public final static String AIPLATFORM_DEFAULT = "DEFAULT";
	
	
	/**
	 * 获取默认的AI平台类型
	 * @return
	 */
	String getDefaultAIPlatformType();
	
	/**
	 * 交互补全
	 * @param chatCompletionRequest
	 * @return
	 */
	ChatCompletionResult chatCompletion(ChatCompletionRequest chatCompletionRequest);
	
	
	
	
	/**
	 * 异步交互补全
	 * @param chatCompletionRequest
	 * @return
	 */
	PortalAsyncAction asyncChatCompletion(ChatCompletionRequest chatCompletionRequest); 
	
	
	/**
	 * 交互补全
	 * @param type
	 * @param chatCompletionRequest
	 * @return
	 */
	ChatCompletionResult chatCompletion(String type, ChatCompletionRequest chatCompletionRequest);
	
	
	
	
	/**
	 * 异步交互补全
	 * @param type
	 * @param chatCompletionRequest
	 * @return
	 */
	PortalAsyncAction asyncChatCompletion(String type, ChatCompletionRequest chatCompletionRequest); 
}
