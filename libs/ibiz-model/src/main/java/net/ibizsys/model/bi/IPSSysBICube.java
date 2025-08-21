package net.ibizsys.model.bi;



/**
 * 智能报表立方体模型对象接口
 *
 */
public interface IPSSysBICube extends net.ibizsys.model.bi.IPSSysBISchemeObject
		,net.ibizsys.model.bi.IPSBICube{

	
	
	/**
	 * 获取立方体维度集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBICubeDimension> getAllPSSysBICubeDimensions();
	
	/**
	 * 获取立方体维度集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBICubeDimension getPSSysBICubeDimension(Object objKey, boolean bTryMode);
	
	/**
	 * 设置立方体维度集合
	 * @param list 立方体维度集合
	 */
	void setPSSysBICubeDimensions(java.util.List<net.ibizsys.model.bi.IPSSysBICubeDimension> list);
	
	
	/**
	 * 获取立方体指标集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBICubeMeasure> getAllPSSysBICubeMeasures();
	
	/**
	 * 获取立方体指标集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasure(Object objKey, boolean bTryMode);
	
	/**
	 * 设置立方体指标集合
	 * @param list 立方体指标集合
	 */
	void setPSSysBICubeMeasures(java.util.List<net.ibizsys.model.bi.IPSSysBICubeMeasure> list);
}