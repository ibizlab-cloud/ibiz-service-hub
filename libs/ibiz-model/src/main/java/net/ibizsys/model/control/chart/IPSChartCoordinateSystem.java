package net.ibizsys.model.control.chart;



/**
 * 图表坐标系模型基础对象接口
 * <P>
 * 子接口扩展识别值 {@link #getType}
 *
 */
public interface IPSChartCoordinateSystem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取ECharts坐标系类型
	 * @return
	 */
	java.lang.String getEChartsType();
	
	
	/**
	 * 获取坐标系索引
	 * @return
	 */
	int getIndex();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取坐标系类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartCoordinateSystem}
	 * @return
	 */
	java.lang.String getType();
}