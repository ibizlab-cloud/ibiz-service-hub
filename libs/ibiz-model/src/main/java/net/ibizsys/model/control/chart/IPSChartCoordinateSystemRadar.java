package net.ibizsys.model.control.chart;



/**
 * 图表雷达图坐标系模型对象接口
 * <P>
 * 扩展父接口类型[RADAR]
 * <P>
 * 雷达图坐标系组件，只适用于雷达图。
 *
 */
public interface IPSChartCoordinateSystemRadar extends net.ibizsys.model.control.chart.IPSChartCoordinateSystem{

	
	
	/**
	 * 获取图表雷达部件
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartRadar getPSChartRadar();


	/**
	 * 获取图表雷达部件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartRadar getPSChartRadarMust();
}