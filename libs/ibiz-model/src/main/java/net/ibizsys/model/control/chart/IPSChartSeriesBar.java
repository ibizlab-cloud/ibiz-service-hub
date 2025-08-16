package net.ibizsys.model.control.chart;



/**
 * 图表柱状/条形图数据序列模型对象接口
 * <P>
 * 扩展父接口类型[bar,bar3d,column]
 *
 */
public interface IPSChartSeriesBar extends net.ibizsys.model.control.chart.IPSChartSeries{

	
	
	/**
	 * 获取同系列柱间距离
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_BARCATEGORYGAP}
	 * @return
	 */
	java.lang.Object getBarCategoryGap();
	
	
	/**
	 * 获取不同系列柱间距离
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_BARGAP}
	 * @return
	 */
	java.lang.Object getBarGap();
	
	
	/**
	 * 获取柱条最大宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_BARMAXWIDTH}
	 * @return
	 */
	java.lang.Object getBarMaxWidth();
	
	
	/**
	 * 获取柱条最小高度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_BARMINHEIGHT}
	 * @return
	 */
	java.lang.Integer getBarMinHeight();
	
	
	/**
	 * 获取柱条最小宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_BARMINWIDTH}
	 * @return
	 */
	java.lang.Object getBarMinWidth();
	
	
	/**
	 * 获取柱条宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_BARWIDTH}
	 * @return
	 */
	java.lang.Object getBarWidth();
	
	
	/**
	 * 获取是否数据堆叠
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_STACK}
	 * @return
	 */
	boolean isStack();
}