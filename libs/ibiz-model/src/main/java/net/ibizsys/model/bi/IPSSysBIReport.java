package net.ibizsys.model.bi;



/**
 * 智能报表模型对象接口
 *
 */
public interface IPSSysBIReport extends net.ibizsys.model.bi.IPSBIReport
		,net.ibizsys.model.bi.IPSSysBISchemeObject{

	
	
	/**
	 * 获取报表维度集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBIReportDimension> getAllPSSysBIReportDimensions();
	
	/**
	 * 获取报表维度集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBIReportDimension getPSSysBIReportDimension(Object objKey, boolean bTryMode);
	
	/**
	 * 设置报表维度集合
	 * @param list 报表维度集合
	 */
	void setPSSysBIReportDimensions(java.util.List<net.ibizsys.model.bi.IPSSysBIReportDimension> list);
	
	
	/**
	 * 获取报表指标集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBIReportMeasure> getAllPSSysBIReportMeasures();
	
	/**
	 * 获取报表指标集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBIReportMeasure getPSSysBIReportMeasure(Object objKey, boolean bTryMode);
	
	/**
	 * 设置报表指标集合
	 * @param list 报表指标集合
	 */
	void setPSSysBIReportMeasures(java.util.List<net.ibizsys.model.bi.IPSSysBIReportMeasure> list);
	
	
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