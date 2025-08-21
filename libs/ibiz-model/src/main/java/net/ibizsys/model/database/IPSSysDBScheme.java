package net.ibizsys.model.database;



/**
 * 数据库体系对象接口
 *
 */
public interface IPSSysDBScheme extends net.ibizsys.model.service.IPSSubSysServiceAPIBase{

	
	
	/**
	 * 获取数据表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSSysDBTable> getAllPSSysDBTables();
	
	/**
	 * 获取数据表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSSysDBTable getPSSysDBTable(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据表集合
	 * @param list 数据表集合
	 */
	void setPSSysDBTables(java.util.List<net.ibizsys.model.database.IPSSysDBTable> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取数据库实例标记
	 * @return
	 */
	java.lang.String getDBInstTag();
	
	
	/**
	 * 获取对象名称转化
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBObjNameCaseMode}
	 * @return
	 */
	java.lang.String getDBObjNameCase();
	
	
	/**
	 * 获取默认数据源
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSourceLink}
	 * @return
	 */
	java.lang.String getDSLink();
	
	
	/**
	 * 获取系统模型组
	 * @return
	 */
	net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroup();


	/**
	 * 获取系统模型组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroupMust();
	
	
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
	 * 获取SaaS数据租户列
	 * @return
	 */
	java.lang.String getSaaSDCIdColumnName();
	
	
	/**
	 * 获取SaaS数据主键列
	 * @return
	 */
	java.lang.String getSaaSDataIdColumnName();
	
	
	/**
	 * 获取体系标记
	 * @return
	 */
	java.lang.String getSchemeTag();
	
	
	/**
	 * 获取体系标记2
	 * @return
	 */
	java.lang.String getSchemeTag2();
	
	
	/**
	 * 获取是否自动扩展结构
	 * @return
	 */
	boolean isAutoExtendModel();
	
	
	/**
	 * 获取是否现有数据结构
	 * @return
	 */
	boolean isExistingModel();
	
	
	/**
	 * 获取是否发布索引
	 * @return
	 */
	boolean isPubIndex();
}