package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.ai.core.cloudutil.ICloudAIUtilRuntimeContext;
import net.ibizsys.central.cloud.core.util.domain.AIAccess;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;

/**
 * AI访问代理
 * @author lionlau
 *
 */
public interface IAIAccessAgent extends ICloudAIUtilRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param aiAccess
	 * @throws Exception
	 */
	void init(ICloudAIUtilRuntimeContext ctx, AIAccess aiAccess) throws Exception;
	
	
	/**
	 * 开始代理
	 */
	void start() throws Exception;
	
	/**
	 * 停止代理
	 */
	void stop() throws Exception;
	
	
	/**
	 * 获取代理数据
	 * @return
	 */
	AIAccess getAgentData();

	
	/**
	 * 获取AI类型
	 * @return
	 */
	String getAIType();
	
	
	
	/**
	 * 交谈补全
	 * @param chatCompletionRequest
	 * @return
	 */
	ChatCompletionResult chatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable;
	
	/**
	 * 补全
	 * @param completionRequest
	 * @return
	 */
	CompletionResult completion(CompletionRequest completionRequest) throws Throwable;
	
	
	/**
	 *embedding 处理
	 * @param embeddingRequest
	 * @return
	 */
	EmbeddingResult embedding(EmbeddingRequest embeddingRequest) throws Throwable;
	
}
