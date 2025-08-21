package net.ibizsys.model.control.counter;



/**
 * 系统计数器模型对象接口
 *
 */
public interface IPSSysCounter extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取计数器数据
	 * @return
	 */
	java.lang.String getCounterData();
	
	
	/**
	 * 获取计数器数据2
	 * @return
	 */
	java.lang.String getCounterData2();
	
	
	/**
	 * 获取计数器类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CounterType}
	 * @return
	 */
	java.lang.String getCounterType();
	
	
	/**
	 * 获取自定义查询条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取预置计数器标识
	 * @return
	 */
	java.lang.String getPSCounterId();
	
	
	/**
	 * 获取实体行为对象
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction();


	/**
	 * 获取实体行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust();
	
	
	/**
	 * 获取实体数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取实体数据集对象，不存在时抛出异常
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
	 * 获取前端模板插件对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端模板插件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
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
	 * 获取刷新间隔（ms）
	 * @return
	 */
	int getTimer();
	
	
	/**
	 * 获取计数器标记
	 * @return
	 */
	java.lang.String getUniqueTag();
}