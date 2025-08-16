package net.ibizsys.runtime.util;

import java.util.List;


/**
 * 获取组条件
 * @author Administrator
 *
 */
public interface ISearchGroupCond extends ISearchCond {

	/**
	 * 分组分类：由快速查询条件构建的条件组
	 */
	final public static String CAT_QUERY = "QUERY";
	
	
	/**
	 * 分组分类：授权条件组
	 */
	final public static String CAT_AUTHORITY = "AUTHORITY";
	
	
	/**
	 * 分组分类：自定义搜索组
	 */
	final public static String CAT_SEARCHCONDS = "SEARCHCONDS";
	
	
	/**
	 * 分组分类：过滤器
	 */
	final public static String CAT_FILTER = "FILTER";
	
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
	
	
	/**
	 * 获取条件的分类
	 * 分类用于标记条件的用途
	 * @return
	 */
	String getCat();
	
	
//	/**
//	 * 设置条件分类
//	 * @param strCat
//	 */
//	void setCat(String strCat);
}
