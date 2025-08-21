package net.ibizsys.model.control.chart;



/**
 * 图表标题模型对象接口
 *
 */
public interface IPSChartTitle extends net.ibizsys.model.control.chart.IPSChartObject{

	
	
	/**
	 * 获取子标题
	 * @return
	 */
	java.lang.String getSubTitle();
	
	
	/**
	 * 获取子标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubTitlePSLanguageRes();


	/**
	 * 获取子标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubTitlePSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取标题位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartTitlePos}
	 * @return
	 */
	java.lang.String getTitlePos();
	
	
	/**
	 * 获取是否显示标题
	 * @return
	 */
	boolean isShowTitle();
}