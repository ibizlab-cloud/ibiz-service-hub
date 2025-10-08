package net.ibizsys.central.cloud.core.dataentity.logic;

public interface IDELogicRuntime extends net.ibizsys.central.dataentity.logic.IDELogicRuntime{

	/**
	 * 聊天行为名称
	 */
	public final static String DELOGIC_AICHAT_PARAM_ACTION = "ACTION";
	
	/**
	 * 聊天请求
	 */
	public final static String DELOGIC_AICHAT_PARAM_CHATREQUEST = "CHATREQUEST";
	
	
	/**
	 * AIChat行为，异步聊天
	 */
	public final static String DELOGIC_AICHAT_ACTION_ASYNCCHATCOMPLETION = "ASYNCCHATCOMPLETION";
	
	
	/**
	 * AIChat行为，异步聊天
	 */
	public final static String DELOGIC_AICHAT_ACTION_CHATCOMPLETION = "CHATCOMPLETION";
}
