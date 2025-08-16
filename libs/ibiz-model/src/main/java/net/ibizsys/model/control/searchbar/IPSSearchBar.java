package net.ibizsys.model.control.searchbar;



/**
 * 搜索栏部件模型对象基础接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysSearchBarDTO}运行时对象
 *
 */
public interface IPSSearchBar extends net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.IPSControl{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取分组模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSearchBarDTO#FIELD_GROUPMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SearchBarGroupMode}
	 * @return
	 */
	java.lang.String getGroupMode();
	
	
	/**
	 * 获取更多分组显示文本
	 * @return
	 */
	java.lang.String getGroupMoreText();
	
	
	/**
	 * 获取应用计数器引用
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();


	/**
	 * 获取应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	
	/**
	 * 获取过滤项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarFilter> getPSSearchBarFilters();
	
	/**
	 * 获取过滤项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.searchbar.IPSSearchBarFilter getPSSearchBarFilter(Object objKey, boolean bTryMode);
	
	/**
	 * 设置过滤项集合
	 * @param list 过滤项集合
	 */
	void setPSSearchBarFilters(java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarFilter> list);
	
	
	/**
	 * 获取分组项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarGroup> getPSSearchBarGroups();
	
	/**
	 * 获取分组项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.searchbar.IPSSearchBarGroup getPSSearchBarGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置分组项集合
	 * @param list 分组项集合
	 */
	void setPSSearchBarGroups(java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarGroup> list);
	
	
	/**
	 * 获取快速搜索项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch> getPSSearchBarQuickSearchs();
	
	/**
	 * 获取快速搜索项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch getPSSearchBarQuickSearch(Object objKey, boolean bTryMode);
	
	/**
	 * 设置快速搜索项集合
	 * @param list 快速搜索项集合
	 */
	void setPSSearchBarQuickSearches(java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch> list);
	
	
	/**
	 * 获取快速分组显示数量
	 * @return
	 */
	int getQuickGroupCount();
	
	
	/**
	 * 获取快速搜索模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SearchBarQuickSearchMode}
	 * @return
	 */
	int getQuickSearchMode();
	
	
	/**
	 * 获取快速搜索框宽度
	 * @return
	 */
	int getQuickSearchWidth();
	
	
	/**
	 * 获取搜索栏样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SearchBarStyle}
	 * @return
	 */
	java.lang.String getSearchBarStyle();
	
	
	/**
	 * 获取是否支持过滤器
	 * @return
	 */
	boolean isEnableFilter();
	
	
	/**
	 * 获取是否支持数据分组
	 * @return
	 */
	boolean isEnableGroup();
	
	
	/**
	 * 获取是否支持快速搜索
	 * @return
	 */
	boolean isEnableQuickSearch();
	
	
	/**
	 * 获取是否移动端搜索栏
	 * @return
	 */
	boolean isMobileSearchBar();
}