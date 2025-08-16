package net.ibizsys.model.control.searchbar;



/**
 *
 */
public interface IPSSearchBarQuickSearch extends net.ibizsys.model.control.searchbar.IPSSearchBarItem{

	
	
	/**
	 * 获取属性搜索模式
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode();


	/**
	 * 获取属性搜索模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchModeMust();
}