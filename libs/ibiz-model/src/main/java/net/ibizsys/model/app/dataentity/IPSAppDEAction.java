package net.ibizsys.model.app.dataentity;



/**
 * 应用实体行为模型对象接口
 *
 */
public interface IPSAppDEAction extends net.ibizsys.model.app.dataentity.IPSAppDEMethod{

	
	
	/**
	 * 获取行为模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionMode}
	 * @return
	 */
	java.lang.String getActionMode();
	
	
	/**
	 * 获取行为标识
	 * @return
	 */
	java.lang.String getActionName();
	
	
	/**
	 * 获取行为标识
	 * @return
	 */
	java.lang.String getActionTag();
	
	
	/**
	 * 获取行为类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionType}
	 * @return
	 */
	java.lang.String getActionType();
	
	
	/**
	 * 获取执行之后代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AFTERCODE}
	 * @return
	 */
	java.lang.String getAfterCode();
	
	
	/**
	 * 获取批操作模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionBatchMode}
	 * @return
	 */
	int getBatchActionMode();
	
	
	/**
	 * 获取执行之前代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BEFORECODE}
	 * @return
	 */
	java.lang.String getBeforeCode();
	
	
	/**
	 * 获取实体处理逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic();


	/**
	 * 获取实体处理逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogicMust();
	
	
	/**
	 * 获取实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction();


	/**
	 * 获取实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust();
	
	
	/**
	 * 获取默认操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取默认操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否异步操作行为
	 * @return
	 */
	boolean isAsyncAction();
	
	
	/**
	 * 获取是否自定义代码
	 * @return
	 */
	boolean isCustomCode();
	
	
	/**
	 * 获取是否批操作行为
	 * @return
	 */
	boolean isEnableBatchAction();
	
	
	/**
	 * 获取是否启用判断执行方法
	 * @return
	 */
	boolean isEnableTestMethod();
}