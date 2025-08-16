package net.ibizsys.model.dts;



/**
 *
 */
public interface IPSSysDTSQueue extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取取消操作实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getCancelPSDEAction();


	/**
	 * 获取取消操作实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getCancelPSDEActionMust();
	
	
	/**
	 * 获取取消超时时长（毫秒）
	 * @return
	 */
	int getCancelTimeout();
	
	
	/**
	 * 获取已取消状态值
	 * @return
	 */
	java.lang.String getCancelledState();
	
	
	/**
	 * 获取确认操作实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getConfirmPSDEAction();


	/**
	 * 获取确认操作实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getConfirmPSDEActionMust();
	
	
	/**
	 * 获取已建立状态值
	 * @return
	 */
	java.lang.String getCreatedState();
	
	
	/**
	 * 获取错误属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getErrorPSDEField();


	/**
	 * 获取错误属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getErrorPSDEFieldMust();
	
	
	/**
	 * 获取处理失败状态值
	 * @return
	 */
	java.lang.String getFailedState();
	
	
	/**
	 * 获取已完成状态值
	 * @return
	 */
	java.lang.String getFinishedState();
	
	
	/**
	 * 获取历史数据实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getHistoryPSDataEntity();


	/**
	 * 获取历史数据实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getHistoryPSDataEntityMust();
	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取处理中状态值
	 * @return
	 */
	java.lang.String getProcessingState();
	
	
	/**
	 * 获取推送实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPushPSDEAction();


	/**
	 * 获取推送实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPushPSDEActionMust();
	
	
	/**
	 * 获取刷新实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getRefreshPSDEAction();


	/**
	 * 获取刷新实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getRefreshPSDEActionMust();
	
	
	/**
	 * 获取刷新间隔时长（毫秒）
	 * @return
	 */
	int getRefreshTimer();
	
	
	/**
	 * 获取状态属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEField();


	/**
	 * 获取状态属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEFieldMust();
	
	
	/**
	 * 获取时间属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTimePSDEField();


	/**
	 * 获取时间属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTimePSDEFieldMust();
}