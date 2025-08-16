package net.ibizsys.model.control.chart;



/**
 * 图表轴模型基础对象接口
 *
 */
public interface IPSChartAxis extends net.ibizsys.model.control.chart.IPSChartObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取基础配置Json内容
	 * @return
	 */
	java.lang.String getBaseOptionJOString();
	
	
	/**
	 * 获取标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取数据显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartAxisDataShowMode}
	 * @return
	 */
	int getDataShowMode();
	
	
	/**
	 * 获取ECharts位置
	 * @return
	 */
	java.lang.String getEChartsPos();
	
	
	/**
	 * 获取ECharts类型
	 * @return
	 */
	java.lang.String getEChartsType();
	
	
	/**
	 * 获取最大值
	 * @return
	 */
	java.lang.Double getMaxValue();
	
	
	/**
	 * 获取最小值
	 * @return
	 */
	java.lang.Double getMinValue();
	
	
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
	 * 获取位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartAxisPos}
	 * @return
	 */
	java.lang.String getPosition();
	
	
	/**
	 * 获取类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartAxisType}
	 * @return
	 */
	java.lang.String getType();
}