package net.ibizsys.model.dataentity.dts;



/**
 * 实体分布事务队列模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDTSQueueDTO}运行时对象
 *
 */
public interface IPSDEDTSQueue extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
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
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
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
	 * 获取系统异步处理队列
	 * @return
	 */
	net.ibizsys.model.dts.IPSSysDTSQueue getPSSysDTSQueue();


	/**
	 * 获取系统异步处理队列，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dts.IPSSysDTSQueue getPSSysDTSQueueMust();
	
	
	/**
	 * 获取后端模板插件对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后端模板插件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
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
	 * 获取是否默认异步处理队列
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDTSQueueDTO#FIELD_DEFAULTFLAG}
	 * @return
	 */
	boolean isDefault();
}