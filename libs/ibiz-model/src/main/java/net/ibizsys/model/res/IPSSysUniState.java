package net.ibizsys.model.res;



/**
 * 系统统一状态模型对象接口
 *
 */
public interface IPSSysUniState extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取缓存分类
	 * @return
	 */
	java.lang.String getCacheCat();
	
	
	/**
	 * 获取缓存超时
	 * @return
	 */
	int getCacheTimeout();
	
	
	/**
	 * 获取目录2属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder2PSDEField();


	/**
	 * 获取目录2属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder2PSDEFieldMust();
	
	
	/**
	 * 获取目录3属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder3PSDEField();


	/**
	 * 获取目录3属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder3PSDEFieldMust();
	
	
	/**
	 * 获取目录4属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder4PSDEField();


	/**
	 * 获取目录4属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder4PSDEFieldMust();
	
	
	/**
	 * 获取目录5属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder5PSDEField();


	/**
	 * 获取目录5属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder5PSDEFieldMust();
	
	
	/**
	 * 获取目录6属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder6PSDEField();


	/**
	 * 获取目录6属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder6PSDEFieldMust();
	
	
	/**
	 * 获取目录7属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder7PSDEField();


	/**
	 * 获取目录7属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder7PSDEFieldMust();
	
	
	/**
	 * 获取目录8属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder8PSDEField();


	/**
	 * 获取目录8属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolder8PSDEFieldMust();
	
	
	/**
	 * 获取目录属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolderPSDEField();


	/**
	 * 获取目录属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFolderPSDEFieldMust();
	
	
	/**
	 * 获取初始化逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getInitPSDELogic();


	/**
	 * 获取初始化逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getInitPSDELogicMust();
	
	
	/**
	 * 获取标识属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField();


	/**
	 * 获取标识属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust();
	
	
	/**
	 * 获取监控器格式化
	 * @return
	 */
	java.lang.String getMonitorFormat();
	
	
	/**
	 * 获取变更逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getOnChangePSDELogic();


	/**
	 * 获取变更逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getOnChangePSDELogicMust();
	
	
	/**
	 * 获取删除逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getOnDeletePSDELogic();


	/**
	 * 获取删除逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getOnDeletePSDELogicMust();
	
	
	/**
	 * 获取预载数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取预载数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
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
	 * 获取目录格式化
	 * @return
	 */
	java.lang.String getPathFormat();
	
	
	/**
	 * 获取刷新间隔（ms）
	 * @return
	 */
	int getReloadTimer();
	
	
	/**
	 * 获取状态2属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState2PSDEField();


	/**
	 * 获取状态2属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState2PSDEFieldMust();
	
	
	/**
	 * 获取状态3属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState3PSDEField();


	/**
	 * 获取状态3属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState3PSDEFieldMust();
	
	
	/**
	 * 获取状态4属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState4PSDEField();


	/**
	 * 获取状态4属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState4PSDEFieldMust();
	
	
	/**
	 * 获取状态5属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState5PSDEField();


	/**
	 * 获取状态5属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState5PSDEFieldMust();
	
	
	/**
	 * 获取状态6属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState6PSDEField();


	/**
	 * 获取状态6属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState6PSDEFieldMust();
	
	
	/**
	 * 获取状态7属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState7PSDEField();


	/**
	 * 获取状态7属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState7PSDEFieldMust();
	
	
	/**
	 * 获取状态8属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState8PSDEField();


	/**
	 * 获取状态8属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getState8PSDEFieldMust();
	
	
	/**
	 * 获取状态属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEField();


	/**
	 * 获取状态属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEFieldMust();
	
	
	/**
	 * 获取状态协同模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UniStateMode}
	 * @return
	 */
	java.lang.String getUniStateMode();
	
	
	/**
	 * 获取转换器动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getUniStateParams();
	
	
	/**
	 * 获取统一状态标记
	 * @return
	 */
	java.lang.String getUniStateTag();
	
	
	/**
	 * 获取统一状态标记2
	 * @return
	 */
	java.lang.String getUniStateTag2();
	
	
	/**
	 * 获取状态协同类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UniStateType}
	 * @return
	 */
	java.lang.String getUniStateType();
	
	
	/**
	 * 获取唯一业务标识
	 * @return
	 */
	java.lang.String getUniqueTag();
	
	
	/**
	 * 获取是否全部数据
	 * @return
	 */
	boolean isAllData();
	
	
	/**
	 * 获取是否删除作为更新操作
	 * @return
	 */
	boolean isDeleteAsUpdate();
}