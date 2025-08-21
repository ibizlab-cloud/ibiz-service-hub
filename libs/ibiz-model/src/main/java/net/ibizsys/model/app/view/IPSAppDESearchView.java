package net.ibizsys.model.app.view;



/**
 * 应用实体搜索视图模型基础对象接口
 * <P>
 * 定义搜索视图的基本能力
 *
 */
public interface IPSAppDESearchView{

	
	
	/**
	 * 获取是否支持快速搜索
	 * @return
	 */
	boolean isEnableQuickSearch();
	
	
	/**
	 * 获取是否支持搜索，判断视图是否存在搜索表单或搜索栏
	 * @return
	 */
	boolean isEnableSearch();
	
	
	/**
	 * 获取是否默认展开搜索表单
	 * @return
	 */
	boolean isExpandSearchForm();
	
	
	/**
	 * 获取是否默认加载数据
	 * @return
	 */
	boolean isLoadDefault();
}