package net.ibizsys.model.ba;



/**
 *
 */
public interface IPSSysBDTable extends net.ibizsys.model.ba.IPSBDTable
		,net.ibizsys.model.ba.IPSSysBDSchemeObject{

	
	
	/**
	 * 获取大数据表列族集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ba.IPSSysBDColSet> getAllPSSysBDColSets();
	
	/**
	 * 获取大数据表列族集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ba.IPSSysBDColSet getPSSysBDColSet(Object objKey, boolean bTryMode);
	
	/**
	 * 设置大数据表列族集合
	 * @param list 大数据表列族集合
	 */
	void setPSSysBDColSets(java.util.List<net.ibizsys.model.ba.IPSSysBDColSet> list);
	
	
	/**
	 * 获取大数据表列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ba.IPSSysBDColumn> getAllPSSysBDColumns();
	
	/**
	 * 获取大数据表列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ba.IPSSysBDColumn getPSSysBDColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置大数据表列集合
	 * @param list 大数据表列集合
	 */
	void setPSSysBDColumns(java.util.List<net.ibizsys.model.ba.IPSSysBDColumn> list);
	
	
	/**
	 * 获取大数据表关系集合（主表）
	 * @return
	 */
	java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> getMajorPSSysBDTableRSs();
	
	/**
	 * 获取大数据表关系集合（主表）的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ba.IPSSysBDTableRS getMajorPSSysBDTableRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置大数据表关系集合（主表）
	 * @param list 大数据表关系集合（主表）
	 */
	void setMajorPSSysBDTableRs(java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> list);
	
	
	/**
	 * 获取大数据表关系集合（从表）
	 * @return
	 */
	java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> getMinorPSSysBDTableRSs();
	
	/**
	 * 获取大数据表关系集合（从表）的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ba.IPSSysBDTableRS getMinorPSSysBDTableRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置大数据表关系集合（从表）
	 * @param list 大数据表关系集合（从表）
	 */
	void setMinorPSSysBDTableRs(java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> list);
}