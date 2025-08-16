package net.ibizsys.psmodel.core.util;

import java.util.List;

public interface ISearchContext {

	/**
	 * 获取查询过滤对象集合
	 * @return
	 */
	List<ISearchCond> getSearchConds();
	
	/**
	 * 获取查询条件，不存在时提供列表
	 * @return
	 */
	List<ISearchCond> getSearchCondsIf();
	
}
