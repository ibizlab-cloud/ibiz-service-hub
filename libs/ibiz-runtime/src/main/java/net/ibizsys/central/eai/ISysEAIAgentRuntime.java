package net.ibizsys.central.eai;

import java.util.List;

import net.ibizsys.central.service.ISubSysServiceAPIRuntimeBase;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;

public interface ISysEAIAgentRuntime extends ISysDataSyncAgentRuntime, ISubSysServiceAPIRuntimeBase, IModelRuntimeShutdownable{

	/**
	 * 指定消息代理类型
	 */
	public final static String PARAM_AGENTTYPE = "agenttype";
	
	
	/**
	 * 指定消息代理标题
	 */
	public final static String PARAM_TOPIC = "topic";
	
	
	/**
	 * 指定消息消费组标识
	 */
	public final static String PARAM_GROUPID = "groupid";
	
	
	/**
	 * 指定是否启用事务，未定义为 false 
	 */
	public final static String PARAM_TRANSACTED = "transacted";
	
	
	/**
	 * 获取主题数组
	 * @return
	 */
	List<String> getTopics();
	
	
	/**
	 * 获取默认主题
	 * @return
	 */
	String getDefaultTopic();
	
	
	/**
	 * 获取消费组标识
	 * @return
	 */
	String getGroupId();
	
	
	/**
	 * 是否定义分组标识
	 * @return
	 */
	boolean isGroupIdDefined();
	
	/**
	 * 直接发送数据
	 * @param strTopic
	 * @param strData
	 * @throws Throwable
	 */
	void send(String strTopic, String strData);
	
	
	
	/**
	 * 接收数据
	 * @param strTopic
	 * @param strData
	 * @throws Throwable
	 */
	void recv(String strTopic, String strData);
	
	
	
	/**
	 * 注册系统集成消息侦听器
	 * @param iSysEAIMsgListener
	 */
	void registerSysEAIMsgListener(ISysEAIMsgListener iSysEAIMsgListener);
	
	
	/**
	 * 注销系统集成消息侦听器
	 * @param iSysEAIMsgListener
	 */
	void unregisterSysEAIMsgListener(ISysEAIMsgListener iSysEAIMsgListener);
}
