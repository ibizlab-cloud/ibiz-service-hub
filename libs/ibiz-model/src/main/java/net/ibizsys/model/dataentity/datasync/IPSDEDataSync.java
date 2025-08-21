package net.ibizsys.model.dataentity.datasync;



/**
 * 实体数据同步模型对象接口
 *
 */
public interface IPSDEDataSync extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.res.IPSSysSFPluginSupportable{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取事件类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSyncInformType}
	 * @return
	 */
	int getEventType();
	
	
	/**
	 * 获取导入实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getImportPSDEAction();


	/**
	 * 获取导入实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getImportPSDEActionMust();
	
	
	/**
	 * 获取输入数据集合
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getInPSDEDataSet();


	/**
	 * 获取输入数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getInPSDEDataSetMust();
	
	
	/**
	 * 获取输入系统数据同步代理对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getInPSSysDataSyncAgent();


	/**
	 * 获取输入系统数据同步代理对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getInPSSysDataSyncAgentMust();
	
	
	/**
	 * 获取输入调用脚本代码
	 * @return
	 */
	java.lang.String getInScriptCode();
	
	
	/**
	 * 获取输入判断实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getInTestPSDEAction();


	/**
	 * 获取输入判断实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getInTestPSDEActionMust();
	
	
	/**
	 * 获取输出数据集合
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getOutPSDEDataSet();


	/**
	 * 获取输出数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getOutPSDEDataSetMust();
	
	
	/**
	 * 获取输出系统数据同步代理对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getOutPSSysDataSyncAgent();


	/**
	 * 获取输出系统数据同步代理对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getOutPSSysDataSyncAgentMust();
	
	
	/**
	 * 获取输出调用脚本代码
	 * @return
	 */
	java.lang.String getOutScriptCode();
	
	
	/**
	 * 获取输出判断实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getOutTestPSDEAction();


	/**
	 * 获取输出判断实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getOutTestPSDEActionMust();
	
	
	/**
	 * 获取同步输出模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSyncOutMode}
	 * @return
	 */
	int getOutputMode();
	
	
	/**
	 * 获取同步方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSyncDir}
	 * @return
	 */
	java.lang.String getSyncDir();
	
	
	/**
	 * 获取是否导出全部
	 * @return
	 */
	boolean isExportFull();
	
	
	/**
	 * 获取是否自定义输入处理脚本
	 * @return
	 */
	boolean isInCustomCode();
	
	
	/**
	 * 获取是否自定义输出处理脚本
	 * @return
	 */
	boolean isOutCustomCode();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}