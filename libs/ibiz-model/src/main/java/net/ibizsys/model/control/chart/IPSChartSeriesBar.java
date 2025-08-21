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
	 * @return
	 */
	java.lang.Object getBarCategoryGap();
	
	
	/**
	 * 获取不同系列柱间距离
	 * @return
	 */
	java.lang.Object getBarGap();
	
	
	/**
	 * 获取柱条最大宽度
	 * @return
	 */
	java.lang.Object getBarMaxWidth();
	
	
	/**
	 * 获取柱条最小高度
	 * @return
	 */
	java.lang.Integer getBarMinHeight();
	
	
	/**
	 * 获取柱条最小宽度
	 * @return
	 */
	java.lang.Object getBarMinWidth();
	
	
	/**
	 * 获取柱条宽度
	 * @return
	 */
	java.lang.Object getBarWidth();
	
	
	/**
	 * 获取是否数据堆叠
	 * @return
	 */
	boolean isStack();
}