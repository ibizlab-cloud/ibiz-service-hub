package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.TextReRankRequest;
import net.ibizsys.central.cloud.core.util.domain.TextReRankResult;

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
	 * AI平台：Cloud默认分析引擎，针对具备复杂业务逻辑的复杂质检规则等分析需求的模型，支持自定义更细粒度的分析标准，具备更强的多轮上下文建模、深层语义理解与推理能力
	 */
	public final static String AIPLATFORM_ANALYSIS = "ANALYSIS";
	
	
	
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
	
	
	/**
	 * 进行嵌入值计算
	 * @param type
	 * @param embeddingRequest
	 * @return
	 */
	EmbeddingResult embedding(String type, EmbeddingRequest embeddingRequest);
	
	
	/**
	 * 进行嵌入值计算
	 * @param embeddingRequest
	 * @return
	 */
	default EmbeddingResult embedding(EmbeddingRequest embeddingRequest) {
		return embedding(null, embeddingRequest);
	}
	
	/**
	 * 文本重排序
	 * @param type
	 * @param textReRankRequest
	 * @return
	 */
	TextReRankResult textReRank(String type, TextReRankRequest textReRankRequest);
	
	/**
	 * 文本重排序
	 * @param textReRankRequest
	 * @return
	 */
	default TextReRankResult textReRank(TextReRankRequest textReRankRequest) {
		return textReRank(null, textReRankRequest);
	}
	
	/**
	 * 取消交互补全
	 * @param type
	 * @param asyncActionId
	 * @return
	 */
	void cancelChatCompletion(String type, String asyncActionId); 
}
