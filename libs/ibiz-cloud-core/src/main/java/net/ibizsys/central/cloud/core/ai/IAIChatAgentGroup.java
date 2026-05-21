package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.util.List;

public interface IAIChatAgentGroup<T extends IAIChatAgentRuntimeBase> {

	/**
	 * 获取标识
	 * @return
	 */
	String getId();
	
	/**
	 * 获取名称
	 * @return
	 */
	String getName();
	
	
	/**
	 * 获取描述
	 * @return
	 */
	String getDescription();
	

	
	/**
	 * 获取代理组文件夹
	 * @return
	 */
	File getAgentGroupFolder();
	
	
	
	/**
	 * 注册聊天代理对象
	 * @param aiChatAgentRuntimeBase
	 */
	void registerAIChatAgent(T aiChatAgentRuntimeBase) throws Exception;
	
	
	/**
	 * 注销聊天代理对象
	 * @param aiChatAgentRuntimeBase
	 * @return
	 */
	boolean unregisterAIChatAgent(T aiChatAgentRuntimeBase);
	
	
	
	/**
	 * 获取指定AI交谈代理
	 * @param agentTag
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
	T getAIChatAgent(String agentTag, boolean tryMode) throws Exception;
	
	
	/**
	 * 获取成员
	 * @return
	 */
	List<T> getAIChatAgents();
}
