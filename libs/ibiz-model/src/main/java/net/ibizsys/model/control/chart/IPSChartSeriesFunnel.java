package net.ibizsys.model.control.chart;



/**
 * 图表漏斗图序列模型对象接口
 * <P>
 * 扩展父接口类型[funnel]
 *
 */
public interface IPSChartSeriesFunnel extends net.ibizsys.model.control.chart.IPSChartSeriesCSNone
		,net.ibizsys.model.control.chart.IPSChartPosition{

	
	
	/**
	 * 获取漏斗图方向
	 * @return
	 */
	java.lang.String getFunnelAlign();
	
	
	/**
	 * 获取最大面积
	 * @return
	 */
	java.lang.Object getMaxSize();
	
	
	/**
	 * 获取最大值
	 * @return
	 */
	java.lang.Integer getMaxValue();
	
	
	/**
	 * 获取最小面积
	 * @return
	 */
	java.lang.Object getMinSize();
	
	
	/**
	 * 获取最小值
	 * @return
	 */
	java.lang.Integer getMinValue();
}