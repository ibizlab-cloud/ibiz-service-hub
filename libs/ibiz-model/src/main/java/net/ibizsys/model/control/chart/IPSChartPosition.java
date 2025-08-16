package net.ibizsys.model.control.chart;



/**
 * 图表位置模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO}运行时对象
 *
 */
public interface IPSChartPosition{

	
	
	/**
	 * 获取下方间隔
	 * @return
	 */
	java.lang.Object getBottom();
	
	
	/**
	 * 获取高度
	 * @return
	 */
	java.lang.Object getHeight();
	
	
	/**
	 * 获取左侧间隔
	 * @return
	 */
	java.lang.Object getLeft();
	
	
	/**
	 * 获取右侧间隔
	 * @return
	 */
	java.lang.Object getRight();
	
	
	/**
	 * 获取上方间隔
	 * @return
	 */
	java.lang.Object getTop();
	
	
	/**
	 * 获取宽度
	 * @return
	 */
	java.lang.Object getWidth();
}