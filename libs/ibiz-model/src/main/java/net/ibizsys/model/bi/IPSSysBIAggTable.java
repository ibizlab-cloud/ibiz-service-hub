package net.ibizsys.model.bi;



/**
 * 智能报表聚合表模型对象接口
 *
 */
public interface IPSSysBIAggTable extends net.ibizsys.model.bi.IPSBIAggTable
		,net.ibizsys.model.bi.IPSSysBISchemeObject{

	
	
	/**
	 * 获取聚合数据列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBIAggColumn> getAllPSSysBIAggColumns();
	
	/**
	 * 获取聚合数据列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBIAggColumn getPSSysBIAggColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置聚合数据列集合
	 * @param list 聚合数据列集合
	 */
	void setPSSysBIAggColumns(java.util.List<net.ibizsys.model.bi.IPSSysBIAggColumn> list);
	
	
	/**
	 * 获取智能报表立方体
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICube getPSSysBICube();


	/**
	 * 获取智能报表立方体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICube getPSSysBICubeMust();
}