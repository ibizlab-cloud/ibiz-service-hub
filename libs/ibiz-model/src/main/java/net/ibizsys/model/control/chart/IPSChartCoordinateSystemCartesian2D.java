package net.ibizsys.model.control.chart;



/**
 * 图表二维的直角坐标系（也称笛卡尔坐标系）模型对象接口
 * <P>
 * 扩展父接口类型[XY]
 *
 */
public interface IPSChartCoordinateSystemCartesian2D extends net.ibizsys.model.control.chart.IPSChartCoordinateSystem{

	
	
	/**
	 * 获取直角坐标绘图网格对象
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGrid getPSChartGrid();


	/**
	 * 获取直角坐标绘图网格对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGrid getPSChartGridMust();
}