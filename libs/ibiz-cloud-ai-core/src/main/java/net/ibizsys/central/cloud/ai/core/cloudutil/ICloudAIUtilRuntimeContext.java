package net.ibizsys.central.cloud.ai.core.cloudutil;

import net.ibizsys.central.cloud.ai.core.addin.IAIAccessAgent;
import net.ibizsys.central.cloud.ai.core.addin.IMcpServerAgent;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.runtime.util.ActionSession;

public interface ICloudAIUtilRuntimeContext extends ICloudUtilRuntimeContext{

	/**
	 * 获取云体系AI功能对象
	 * @return
	 */
	ICloudAIUtilRuntime getModelRuntime();
	
	/**
	 * 获取云体系AI功能对象（旧版本）
	 * @return
	 */
	default ICloudAIUtilRuntime getCloudAIUtilRuntime() {
		return getModelRuntime();
	}
	
	
	/**
	 * 获取McpServer代理
	 * @param strMcpServerId
	 * @return
	 * @throws Throwable
	 */
	IMcpServerAgent getMcpServerAgent(String strMcpServerId) throws Throwable;
	
	/**
	 * 判断是否取消传入聊天交互
	 * @param actionSession
	 * @return
	 */
	boolean isCancelChatCompletion(ActionSession actionSession);

	
	
	/**
	 * 获取AI应用代理
	 * @param strAIAccessId
	 * @param requestData
	 * @return
	 * @throws Throwable
	 */
	IAIAccessAgent getAIAccessAgent(String strAIAccessId, Object requestData) throws Throwable;
	
}
