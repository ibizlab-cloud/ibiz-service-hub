package net.ibizsys.central.cloud.core.dataentity.logic;

public interface IDEAIChatLogicRuntimeBase {

	/**
	 * 聊天行为名称
	 */
	public final static String DELOGIC_AICHAT_PARAM_ACTION = "ACTION";
	
	/**
	 * 聊天请求
	 */
	public final static String DELOGIC_AICHAT_PARAM_CHATREQUEST = "CHATREQUEST";
	
	/**
	 * 聊天数据
	 */
	public final static String DELOGIC_AICHAT_PARAM_DATA = "DATA";
	
	
	/**
	 * AIChat行为，异步聊天
	 */
	public final static String DELOGIC_AICHAT_ACTION_ASYNCCHATCOMPLETION = "ASYNCCHATCOMPLETION";
	
	
	/**
	 * AIChat行为，异步聊天
	 */
	public final static String DELOGIC_AICHAT_ACTION_CHATCOMPLETION = "CHATCOMPLETION";
	
	
	/**
	 * 重置聊天会话
	 * @param sessionId
	 * @throws Throwable
	 */
	default void resetChatCompletion(String sessionId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	/**
	 * 取消当前聊天
	 * @param portalAsyncActionId
	 * @throws Throwable
	 */
	default void cancelChatCompletion(String portalAsyncActionId) throws Throwable {
		throw new Exception("没有实现");
	}
}
