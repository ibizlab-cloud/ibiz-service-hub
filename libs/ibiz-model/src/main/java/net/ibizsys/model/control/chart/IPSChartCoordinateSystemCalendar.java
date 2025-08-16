package net.ibizsys.model.control.chart;



/**
 * 图表日历坐标系模型对象接口
 * <P>
 * 扩展父接口类型[CALENDAR]
 *
 */
public interface IPSChartCoordinateSystemCalendar extends net.ibizsys.model.control.chart.IPSChartCoordinateSystem{

	
	
	/**
	 * 获取地理坐标系组件
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartCalendar getPSChartCalendar();


	/**
	 * 获取地理坐标系组件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartCalendar getPSChartCalendarMust();
}