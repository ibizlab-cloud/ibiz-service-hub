package net.ibizsys.central.cloud.core.service.util;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;

/**
 * 系统服务接口AI功能组件接口
 * @author lionlau
 *
 */
public interface ISysServiceAPIAIUtils {

	/**
	 * 交谈聊天请求中涉及的实体服务接口运行时
	 * @param strAIPlatformType
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	List<IDEServiceAPIRuntime> chatDEServiceAPIRuntimes(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable;
	
	
	
	
	
	/**
	 * 交谈获取请求涉及调用的实体服务接口方法及入参等
	 * @param strAIPlatformType
	 * @param chatCompletionRequest
	 * @return
	 * @throws Throwable
	 */
	List<Map<String, Object>> chatDEServiceAPIMethods(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable;
}
