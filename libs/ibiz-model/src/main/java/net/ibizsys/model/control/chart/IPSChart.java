package net.ibizsys.model.control.chart;



/**
 * 图表部件基础对象接口
 *
 */
public interface IPSChart extends net.ibizsys.model.control.IPSMDAjaxControl
		,net.ibizsys.model.control.IPSControlNavigatable{

	
	
	/**
	 * 获取坐标系统类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartCoordinateSystem}
	 * @return
	 */
	java.lang.String getCoordinateSystem();
	
	
	/**
	 * 获取无值显示内容
	 * @return
	 */
	java.lang.String getEmptyText();
	
	
	/**
	 * 获取无值内容语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes();


	/**
	 * 获取无值内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust();
	
	
	/**
	 * 获取angleAxis集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartAngleAxis> getPSChartAngleAxises();
	
	/**
	 * 获取angleAxis集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartAngleAxis getPSChartAngleAxis(Object objKey, boolean bTryMode);
	
	/**
	 * 设置angleAxis集合
	 * @param list angleAxis集合
	 */
	void setPSChartAngleAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartAngleAxis> list);
	
	
	/**
	 * 获取图表坐标系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> getPSChartCoordinateSystems();
	
	/**
	 * 获取图表坐标系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置图表坐标系集合
	 * @param list 图表坐标系集合
	 */
	void setPSChartCoordinateSystems(java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> list);
	
	
	/**
	 * 获取数据集分组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetGroup> getPSChartDataSetGroups();
	
	/**
	 * 获取数据集分组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartDataSetGroup getPSChartDataSetGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据集分组集合
	 * @param list 数据集分组集合
	 */
	void setPSChartDataSetGroups(java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetGroup> list);
	
	
	/**
	 * 获取数据集集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartDataSet> getPSChartDataSets();
	
	/**
	 * 获取数据集集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartDataSet getPSChartDataSet(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据集集合
	 * @param list 数据集集合
	 */
	void setPSChartDataSets(java.util.List<net.ibizsys.model.control.chart.IPSChartDataSet> list);
	
	
	/**
	 * 获取直角坐标表格集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartGrid> getPSChartGrids();
	
	/**
	 * 获取直角坐标表格集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartGrid getPSChartGrid(Object objKey, boolean bTryMode);
	
	/**
	 * 设置直角坐标表格集合
	 * @param list 直角坐标表格集合
	 */
	void setPSChartGrids(java.util.List<net.ibizsys.model.control.chart.IPSChartGrid> list);
	
	
	/**
	 * 获取paralleAxis集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartParallelAxis> getPSChartParallelAxises();
	
	/**
	 * 获取paralleAxis集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartParallelAxis getPSChartParallelAxis(Object objKey, boolean bTryMode);
	
	/**
	 * 设置paralleAxis集合
	 * @param list paralleAxis集合
	 */
	void setPSChartParallelAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartParallelAxis> list);
	
	
	/**
	 * 获取平行坐标部件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartParallel> getPSChartParallels();
	
	/**
	 * 获取平行坐标部件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartParallel getPSChartParallel(Object objKey, boolean bTryMode);
	
	/**
	 * 设置平行坐标部件集合
	 * @param list 平行坐标部件集合
	 */
	void setPSChartParallels(java.util.List<net.ibizsys.model.control.chart.IPSChartParallel> list);
	
	
	/**
	 * 获取极坐标部件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartPolar> getPSChartPolars();
	
	/**
	 * 获取极坐标部件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartPolar getPSChartPolar(Object objKey, boolean bTryMode);
	
	/**
	 * 设置极坐标部件集合
	 * @param list 极坐标部件集合
	 */
	void setPSChartPolars(java.util.List<net.ibizsys.model.control.chart.IPSChartPolar> list);
	
	
	/**
	 * 获取雷达部件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartRadar> getPSChartRadars();
	
	/**
	 * 获取雷达部件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartRadar getPSChartRadar(Object objKey, boolean bTryMode);
	
	/**
	 * 设置雷达部件集合
	 * @param list 雷达部件集合
	 */
	void setPSChartRadars(java.util.List<net.ibizsys.model.control.chart.IPSChartRadar> list);
	
	
	/**
	 * 获取radiusAxis集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartRadiusAxis> getPSChartRadiusAxises();
	
	/**
	 * 获取radiusAxis集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartRadiusAxis getPSChartRadiusAxis(Object objKey, boolean bTryMode);
	
	/**
	 * 设置radiusAxis集合
	 * @param list radiusAxis集合
	 */
	void setPSChartRadiusAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartRadiusAxis> list);
	
	
	/**
	 * 获取singleAxis集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartSingleAxis> getPSChartSingleAxises();
	
	/**
	 * 获取singleAxis集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartSingleAxis getPSChartSingleAxis(Object objKey, boolean bTryMode);
	
	/**
	 * 设置singleAxis集合
	 * @param list singleAxis集合
	 */
	void setPSChartSingleAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartSingleAxis> list);
	
	
	/**
	 * 获取单一坐标部件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartSingle> getPSChartSingles();
	
	/**
	 * 获取单一坐标部件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartSingle getPSChartSingle(Object objKey, boolean bTryMode);
	
	/**
	 * 设置单一坐标部件集合
	 * @param list 单一坐标部件集合
	 */
	void setPSChartSingles(java.util.List<net.ibizsys.model.control.chart.IPSChartSingle> list);
	
	
	/**
	 * 获取xAxis集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartXAxis> getPSChartXAxises();
	
	/**
	 * 获取xAxis集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartXAxis getPSChartXAxis(Object objKey, boolean bTryMode);
	
	/**
	 * 设置xAxis集合
	 * @param list xAxis集合
	 */
	void setPSChartXAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartXAxis> list);
	
	
	/**
	 * 获取yAxis集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartYAxis> getPSChartYAxises();
	
	/**
	 * 获取yAxis集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartYAxis getPSChartYAxis(Object objKey, boolean bTryMode);
	
	/**
	 * 设置yAxis集合
	 * @param list yAxis集合
	 */
	void setPSChartYAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartYAxis> list);
}