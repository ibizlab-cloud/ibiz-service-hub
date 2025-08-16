package net.ibizsys.model.control.chart;



/**
 * 实体图表逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEChartLogicDTO}运行时对象
 *
 */
public interface IPSDEChartLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取图表坐标轴名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartLogicDTO#FIELD_PSDECHARTAXESNAME}
	 * @return
	 */
	java.lang.String getPSDEChartAxesName();
	
	
	/**
	 * 获取图表序列名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartLogicDTO#FIELD_PSDECHARTPARAMNAME}
	 * @return
	 */
	java.lang.String getPSDEChartSeriesName();
}