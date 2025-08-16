package net.ibizsys.model.control.chart;



/**
 * 图表标题模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEChartDTO}运行时对象
 *
 */
public interface IPSChartTitle extends net.ibizsys.model.control.chart.IPSChartObject{

	
	
	/**
	 * 获取子标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartDTO#FIELD_SUBTITLE}
	 * @return
	 */
	java.lang.String getSubTitle();
	
	
	/**
	 * 获取子标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartDTO#FIELD_SUBTITLEPSLANRESID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartDTO#FIELD_LNPSLANRESID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartDTO#FIELD_TITLEPOS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartTitlePos}
	 * @return
	 */
	java.lang.String getTitlePos();
	
	
	/**
	 * 获取是否显示标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartDTO#FIELD_SHOWTITLE}
	 * @return
	 */
	boolean isShowTitle();
}