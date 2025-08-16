package net.ibizsys.model.bi;



/**
 * 智能报表指标项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysBIReportItemDTO}运行时对象
 * <P>
 * 扩展父接口类型[MEASURE]
 *
 */
public interface IPSSysBIReportMeasure extends net.ibizsys.model.bi.IPSSysBIReportItem
		,net.ibizsys.model.bi.IPSBIReportMeasure
		,net.ibizsys.model.bi.IPSSysBIReportObject{

	
	
	/**
	 * 获取立方体指标
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBIReportItemDTO#FIELD_PSSYSBICUBEMEASUREID}
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasure();


	/**
	 * 获取立方体指标，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasureMust();
}