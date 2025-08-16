package net.ibizsys.psmodel.core.util;

import java.util.List;


/**
 * 搜索组条件
 * @author Administrator
 *
 */
public interface ISearchGroupCond extends ISearchCond {

	/**
	 * 获取条件操作，值参考 net.ibizsys.runtime.util.Conditions 
	 * 
	 * @return
	 */
	String getCondOp();

	
	/**
	 * 获取查询过滤对象集合
	 * @return
	 */
	List<ISearchCond> getSearchConds();
	
	
	/**
	 * 是否为逻辑取反模式
	 * 
	 * @return
	 */
	boolean isNotMode();
	
	
	
	/**
	 * 获取查询条件，不存在时提供列表
	 * @return
	 */
	List<ISearchCond> getSearchCondsIf();
	
	
}
