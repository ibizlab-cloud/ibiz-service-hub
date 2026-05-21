package net.ibizsys.model.dataentity.search;



/**
 *
 */
public interface IPSDESearch extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取实体标记
	 * @return
	 */
	java.lang.String getDETag();
	
	
	/**
	 * 获取实体标记2
	 * @return
	 */
	java.lang.String getDETag2();
	
	
	/**
	 * 获取日志存储实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getLogPSDataEntity();


	/**
	 * 获取日志存储实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getLogPSDataEntityMust();
	
	
	/**
	 * 获取数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取文档模板
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl();


	/**
	 * 获取文档模板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust();
	
	
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
	 * 获取全文检索实体
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDE();


	/**
	 * 获取全文检索实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDEMust();
	
	
	/**
	 * 获取全文检索体系
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchScheme();


	/**
	 * 获取全文检索体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchSchemeMust();
	
	
	/**
	 * 获取状态值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEField();


	/**
	 * 获取状态值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEFieldMust();
	
	
	/**
	 * 获取线程模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicThreadRunMode}
	 * @return
	 */
	int getThreadMode();
	
	
	/**
	 * 获取是否启用联合键值
	 * @return
	 */
	boolean isEnableUnionKeyValue();
	
	
	/**
	 * 获取是否作为NoSQL存储
	 * @return
	 */
	boolean isNoSQLStorage();
	
	
	/**
	 * 获取是否定时触发模式
	 * @return
	 */
	boolean isTimerMode();
}