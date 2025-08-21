package net.ibizsys.model.bi;



/**
 * 智能报表体系模型对象接口
 *
 */
public interface IPSSysBIScheme extends net.ibizsys.model.bi.IPSBIScheme
		,net.ibizsys.model.service.IPSSubSysServiceAPIBase{

	
	
	/**
	 * 获取智能报表聚合数据表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBIAggTable> getAllPSSysBIAggTables();
	
	/**
	 * 获取智能报表聚合数据表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBIAggTable getPSSysBIAggTable(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能报表聚合数据表集合
	 * @param list 智能报表聚合数据表集合
	 */
	void setPSSysBIAggTables(java.util.List<net.ibizsys.model.bi.IPSSysBIAggTable> list);
	
	
	/**
	 * 获取智能报表立方体集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBICube> getAllPSSysBICubes();
	
	/**
	 * 获取智能报表立方体集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBICube getPSSysBICube(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能报表立方体集合
	 * @param list 智能报表立方体集合
	 */
	void setPSSysBICubes(java.util.List<net.ibizsys.model.bi.IPSSysBICube> list);
	
	
	/**
	 * 获取智能报表维度集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBIDimension> getAllPSSysBIDimensions();
	
	/**
	 * 获取智能报表维度集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBIDimension getPSSysBIDimension(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能报表维度集合
	 * @param list 智能报表维度集合
	 */
	void setPSSysBIDimensions(java.util.List<net.ibizsys.model.bi.IPSSysBIDimension> list);
	
	
	/**
	 * 获取智能报表智能报表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBIReport> getAllPSSysBIReports();
	
	/**
	 * 获取智能报表智能报表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBIReport getPSSysBIReport(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能报表智能报表集合
	 * @param list 智能报表智能报表集合
	 */
	void setPSSysBIReports(java.util.List<net.ibizsys.model.bi.IPSSysBIReport> list);
	
	
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