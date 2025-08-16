package net.ibizsys.model.ba;



/**
 *
 */
public interface IPSSysBDScheme extends net.ibizsys.model.ba.IPSBDScheme
		,net.ibizsys.model.service.IPSSubSysServiceAPIBase{

	
	
	/**
	 * 获取大数据体系模块集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ba.IPSSysBDModule> getAllPSSysBDModules();
	
	/**
	 * 获取大数据体系模块集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ba.IPSSysBDModule getPSSysBDModule(Object objKey, boolean bTryMode);
	
	/**
	 * 设置大数据体系模块集合
	 * @param list 大数据体系模块集合
	 */
	void setPSSysBDModules(java.util.List<net.ibizsys.model.ba.IPSSysBDModule> list);
	
	
	/**
	 * 获取大数据体系分区集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ba.IPSSysBDPart> getAllPSSysBDParts();
	
	/**
	 * 获取大数据体系分区集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ba.IPSSysBDPart getPSSysBDPart(Object objKey, boolean bTryMode);
	
	/**
	 * 设置大数据体系分区集合
	 * @param list 大数据体系分区集合
	 */
	void setPSSysBDParts(java.util.List<net.ibizsys.model.ba.IPSSysBDPart> list);
	
	
	/**
	 * 获取大数据表关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> getAllPSSysBDTableRSs();
	
	/**
	 * 获取大数据表关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ba.IPSSysBDTableRS getPSSysBDTableRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置大数据表关系集合
	 * @param list 大数据表关系集合
	 */
	void setPSSysBDTableRs(java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> list);
	
	
	/**
	 * 获取大数据表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ba.IPSSysBDTable> getAllPSSysBDTables();
	
	/**
	 * 获取大数据表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTable(Object objKey, boolean bTryMode);
	
	/**
	 * 设置大数据表集合
	 * @param list 大数据表集合
	 */
	void setPSSysBDTables(java.util.List<net.ibizsys.model.ba.IPSSysBDTable> list);
	
	
	/**
	 * 获取对象名称转化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_OBJNAMECASE}
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
	
	
	/**
	 * 获取是否默认大数据体系
	 * @return
	 */
	boolean isDefaultMode();
}