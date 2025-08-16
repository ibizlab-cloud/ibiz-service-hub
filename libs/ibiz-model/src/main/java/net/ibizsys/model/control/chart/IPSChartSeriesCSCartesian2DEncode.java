package net.ibizsys.model.control.chart;



/**
 * 图表序列直角坐标系编码模型对象接口
 * <P>
 * 扩展父接口类型[XY]
 *
 */
public interface IPSChartSeriesCSCartesian2DEncode extends net.ibizsys.model.control.chart.IPSChartSeriesEncode{

	
	
	/**
	 * 获取图表X坐标轴
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartXAxis getPSChartXAxis();


	/**
	 * 获取图表X坐标轴，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartXAxis getPSChartXAxisMust();
	
	
	/**
	 * 获取图表Y坐标轴
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartYAxis getPSChartYAxis();


	/**
	 * 获取图表Y坐标轴，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartYAxis getPSChartYAxisMust();
	
	
	/**
	 * 获取X轴维度集合
	 * @return
	 */
	java.lang.String[] getX();
	
	
	/**
	 * 获取Y轴维度集合
	 * @return
	 */
	java.lang.String[] getY();
}