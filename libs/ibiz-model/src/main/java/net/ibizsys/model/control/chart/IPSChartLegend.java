package net.ibizsys.model.control.chart;



/**
 * 图表部件图例对象模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEChartDTO}运行时对象
 *
 */
public interface IPSChartLegend extends net.ibizsys.model.control.chart.IPSChartObject{

	
	
	/**
	 * 获取图例位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartDTO#FIELD_LEGENDPOS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartTitlePos}
	 * @return
	 */
	java.lang.String getLegendPos();
	
	
	/**
	 * 获取是否显示图例
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartDTO#FIELD_SHOWLEGEND}
	 * @return
	 */
	boolean isShowLegend();
}