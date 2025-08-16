package net.ibizsys.model.control.chart;



/**
 * 图表地理坐标系模型对象接口
 * <P>
 * 扩展父接口类型[MAP]
 * <P>
 * 地理坐标系组件用于地图的绘制，支持在地理坐标系上绘制散点图，线集。
 *
 */
public interface IPSChartCoordinateSystemGeo extends net.ibizsys.model.control.chart.IPSChartCoordinateSystem{

	
	
	/**
	 * 获取地理坐标系组件
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGeo getPSChartGeo();


	/**
	 * 获取地理坐标系组件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGeo getPSChartGeoMust();
}