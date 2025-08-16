package net.ibizsys.model.control.chart;



/**
 * 图表数据集属性模型对象接口
 *
 */
public interface IPSChartDataSetField extends net.ibizsys.model.control.chart.IPSChartObject{

	
	
	/**
	 * 获取分组模式
	 * @return
	 */
	java.lang.String getGroupMode();
	
	
	/**
	 * 获取代码表对象
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取是否分组属性
	 * @return
	 */
	boolean isGroupField();
}