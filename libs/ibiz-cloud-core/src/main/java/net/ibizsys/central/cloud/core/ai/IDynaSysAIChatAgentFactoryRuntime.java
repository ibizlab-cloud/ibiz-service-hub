package net.ibizsys.central.cloud.core.ai;

import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface IDynaSysAIChatAgentFactoryRuntime extends ISysAIChatAgentRuntime {

	/**
	 * 获取工厂中的聊天代理运行时集合
	 * @return
	 */
	List<ISysAIChatAgentRuntime> getSysAIChatAgentRuntimes();
	
	
	
	/**
	 * 建立聊天代理运行时
	 * @param modelNode
	 * @param tempMode，是否为临时模式
	 * @return
	 * @throws Throwable
	 */
	ISysAIChatAgentRuntime createSysAIChatAgentRuntime(ObjectNode modelNode, boolean tempMode) throws Throwable;
	
	
	
	
	/**
	 * 获取指定标记的聊天代理运行时
	 * @param agentTag
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	ISysAIChatAgentRuntime getSysAIChatAgentRuntime(String agentTag, boolean tryMode) throws Throwable;
	
	
	
	
	/**
	 * 移除指定标记的聊天代理运行时
	 * @param agentTag
	 * @throws Throwable
	 */
	void removeSysAIChatAgentRuntime(String agentTag) throws Throwable;
}
