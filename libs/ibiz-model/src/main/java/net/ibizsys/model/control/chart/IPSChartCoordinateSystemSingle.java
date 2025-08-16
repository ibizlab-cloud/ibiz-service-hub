package net.ibizsys.model.control.chart;



/**
 * 图表单坐标系模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSChartCoordinateSystemSingle extends net.ibizsys.model.control.chart.IPSChartCoordinateSystem{

	
	
	/**
	 * 获取单坐标系界面对象
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartSingle getPSChartSingle();


	/**
	 * 获取单坐标系界面对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartSingle getPSChartSingleMust();
}