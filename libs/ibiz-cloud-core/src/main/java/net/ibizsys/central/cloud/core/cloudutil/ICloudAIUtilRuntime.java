package net.ibizsys.central.cloud.core.cloudutil;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;

/**
 * 云体系AI功能组件接口
 * @author lionlau
 *
 */
public interface ICloudAIUtilRuntime extends ICloudUtilRuntime{

	
	/**
	 * AI平台插件前缀
	 */
	public final static String ADDIN_AIPLATFORM_PREFIX = "AIPLATFORM:";
	
	
	/**
	 * McpServer插件前缀
	 */
	public final static String ADDIN_MCPSERVER_PREFIX = "MCPSERVER:";
	
	
	/**
	 * AI平台：OPENAI 接口兼容平台
	 */
	public final static String AIPLATFORM_OPENAI = "OPENAI";
	
	
	/**
	 * AI平台：GPT3
	 */
	public final static String AIPLATFORM_GPT3 = "GPT3";
	
	
	/**
	 * AI平台：LangChain-Chatchat
	 */
	public final static String AIPLATFORM_LANGCHAIN_CHATCHAT = "LANGCHAIN_CHATCHAT";
	
	
	/**
	 * AI平台：百川大模型
	 */
	public final static String AIPLATFORM_BAICHUAN = "BAICHUAN";
	
	
	/**
	 * AI平台：Ollama
	 */
	public final static String AIPLATFORM_OLLAMA = "OLLAMA";
	
	
	/**
	 * AI平台：SIMPLE
	 */
	public final static String AIPLATFORM_SIMPLE = "SIMPLE";
	
	/**
	 * AI平台：QWEN
	 */
	public final static String AIPLATFORM_QWEN = "QWEN";
	
	/**
	 * AI平台：RAGFLOW
	 */
	public final static String AIPLATFORM_RAGFLOW = "RAGFLOW";
	
	/**
	 * AI平台：默认，由Cloud平台默认AI引擎提供服务
	 */
	public final static String AIPLATFORM_DEFAULT = "DEFAULT";
	
	
	/**
	 * McpServer：默认，由Cloud平台默认McpServer提供服务
	 */
	public final static String MCPSERVER_DEFAULT = "DEFAULT";
	
	
	/**
	 * 交谈补全
	 * @param type
	 * @param chatCompletionRequest
	 * @return
	 */
	ChatCompletionResult chatCompletion(String type, ChatCompletionRequest chatCompletionRequest);
	
	
	
	/**
	 * 交谈补全，异步
	 * @param type
	 * @param chatCompletionRequest
	 * @return
	 */
	PortalAsyncAction asyncChatCompletion(String type, ChatCompletionRequest chatCompletionRequest);
	
	
	
	/**
	 * 交谈补全，异步
	 * @param type
	 * @param chatCompletionRequest
	 * @return
	 */
	SseEmitter sseChatCompletion(String type, ChatCompletionRequest chatCompletionRequest);
	
	
	
	/**
	 * 补全
	 * @param type
	 * @param completionRequest
	 * @return
	 */
	CompletionResult completion(String type, CompletionRequest completionRequest);
	
	
	
	/**
	 * 补全，异步
	 * @param type
	 * @param completionRequest
	 * @return
	 */
	PortalAsyncAction asyncCompletion(String type, CompletionRequest completionRequest);
	
	
	
	/**
	 * 补全，异步
	 * @param type
	 * @param completionRequest
	 * @return
	 */
	SseEmitter sseCompletion(String type, CompletionRequest completionRequest);
	
	
	
	/**
	 *embedding 处理
	 * @param type
	 * @param embeddingRequest
	 * @return
	 */
	EmbeddingResult embedding(String type, EmbeddingRequest embeddingRequest);
}



