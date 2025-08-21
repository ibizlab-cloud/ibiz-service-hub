package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSysSearchScheme extends net.ibizsys.model.search.IPSSearchScheme
		,net.ibizsys.model.service.IPSSubSysServiceAPIBase{

	
	
	/**
	 * 获取检索实体集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.search.IPSSysSearchDE> getAllPSSysSearchDEs();
	
	/**
	 * 获取检索实体集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDE(Object objKey, boolean bTryMode);
	
	/**
	 * 设置检索实体集合
	 * @param list 检索实体集合
	 */
	void setPSSysSearchDEs(java.util.List<net.ibizsys.model.search.IPSSysSearchDE> list);
	
	
	/**
	 * 获取检索文档集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.search.IPSSysSearchDoc> getAllPSSysSearchDocs();
	
	/**
	 * 获取检索文档集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDoc(Object objKey, boolean bTryMode);
	
	/**
	 * 设置检索文档集合
	 * @param list 检索文档集合
	 */
	void setPSSysSearchDocs(java.util.List<net.ibizsys.model.search.IPSSysSearchDoc> list);
	
	
	/**
	 * 获取对象名称转化
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBObjNameCaseMode}
	 * @return
	 */
	java.lang.String getDBObjNameCase();
	
	
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
}