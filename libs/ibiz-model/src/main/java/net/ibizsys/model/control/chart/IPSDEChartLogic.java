package net.ibizsys.model.control.chart;



/**
 * 实体图表逻辑模型对象接口
 *
 */
public interface IPSDEChartLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取图表坐标轴名称
	 * @return
	 */
	java.lang.String getPSDEChartAxesName();
	
	
	/**
	 * 获取图表序列名称
	 * @return
	 */
	java.lang.String getPSDEChartSeriesName();
}