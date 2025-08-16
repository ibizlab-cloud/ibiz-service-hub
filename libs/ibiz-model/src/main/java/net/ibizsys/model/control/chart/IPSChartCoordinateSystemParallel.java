package net.ibizsys.model.control.chart;



/**
 * 图表平行坐标系模型对象接口
 * <P>
 * 扩展父接口类型[PARALLEL]
 * <P>
 * 平行坐标系（Parallel Coordinates） 是一种常用的可视化高维数据的图表。
 *
 */
public interface IPSChartCoordinateSystemParallel extends net.ibizsys.model.control.chart.IPSChartCoordinateSystem{

	
	
	/**
	 * 获取平行坐标系界面对象
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartParallel getPSChartParallel();


	/**
	 * 获取平行坐标系界面对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartParallel getPSChartParallelMust();
}