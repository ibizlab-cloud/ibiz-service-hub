package net.ibizsys.model.control.chart;



/**
 * 图表坐标系模型基础对象接口
 * <P>
 * 子接口扩展识别值 {@link #getType}
 *
 */
public interface IPSChartCoordinateSystemControl extends net.ibizsys.model.control.chart.IPSChartObject{

	
	
	/**
	 * 获取基础配置Json内容
	 * @return
	 */
	java.lang.String getBaseOptionJOString();
	
	
	/**
	 * 获取图表坐标系统
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystem();


	/**
	 * 获取图表坐标系统，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystemMust();
	
	
	/**
	 * 获取部件类型
	 * @return
	 */
	java.lang.String getType();
}