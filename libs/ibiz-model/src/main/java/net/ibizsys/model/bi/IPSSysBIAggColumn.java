package net.ibizsys.model.bi;



/**
 * 智能报表聚合表列模型对象接口
 *
 */
public interface IPSSysBIAggColumn extends net.ibizsys.model.bi.IPSBIAggColumn
		,net.ibizsys.model.bi.IPSSysBIAggTableObject{

	
	
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
	
	
	/**
	 * 获取立方体指标
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasure();


	/**
	 * 获取立方体指标，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasureMust();
}