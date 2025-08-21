package net.ibizsys.model.backservice;



/**
 * 系统后台服务模型对象接口
 *
 */
public interface IPSSysBackService extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取容器标记
	 * @return
	 */
	java.lang.String getContainerTag();
	
	
	/**
	 * 获取调用实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction();


	/**
	 * 获取调用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust();
	
	
	/**
	 * 获取目标数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取目标数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
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
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
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
	 * 获取预定义类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PredefinedBackendTaskType}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取服务容器
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BackendTaskContainer}
	 * @return
	 */
	java.lang.String getServiceContainer();
	
	
	/**
	 * 获取服务处理对象
	 * @return
	 */
	java.lang.String getServiceHandler();
	
	
	/**
	 * 获取服务次序
	 * @return
	 */
	int getServiceOrder();
	
	
	/**
	 * 获取服务参数
	 * @return
	 */
	java.lang.String getServiceParams();
	
	
	/**
	 * 获取服务策略
	 * @return
	 */
	java.lang.String getServicePolicy();
	
	
	/**
	 * 获取服务策略2
	 * @return
	 */
	java.lang.String getServicePolicy2();
	
	
	/**
	 * 获取服务标记
	 * @return
	 */
	java.lang.String getServiceTag();
	
	
	/**
	 * 获取服务标记2
	 * @return
	 */
	java.lang.String getServiceTag2();
	
	
	/**
	 * 获取启动模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BackendTaskStartMode}
	 * @return
	 */
	java.lang.String getStartMode();
	
	
	/**
	 * 获取任务类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BackendTaskType}
	 * @return
	 */
	java.lang.String getTaskType();
	
	
	/**
	 * 获取定时触发策略
	 * @return
	 */
	java.lang.String getTimerPolicy();
	
	
	/**
	 * 获取是否本地模式
	 * @return
	 */
	boolean isLocalMode();
	
	
	/**
	 * 获取是否不启用分布式
	 * @return
	 */
	boolean isStandalone();
	
	
	/**
	 * 获取是否定时触发模式
	 * @return
	 */
	boolean isTimerMode();
}