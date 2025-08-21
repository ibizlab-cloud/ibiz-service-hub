package net.ibizsys.model.bi;



/**
 * 智能报表维度项模型对象接口
 * <P>
 * 扩展父接口类型[DIMENSION]
 *
 */
public interface IPSSysBIReportDimension extends net.ibizsys.model.bi.IPSSysBIReportItem
		,net.ibizsys.model.bi.IPSBIReportDimension
		,net.ibizsys.model.bi.IPSSysBIReportObject{

	
	
	/**
	 * 获取立方体维度
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICubeDimension getPSSysBICubeDimension();


	/**
	 * 获取立方体维度，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICubeDimension getPSSysBICubeDimensionMust();
}