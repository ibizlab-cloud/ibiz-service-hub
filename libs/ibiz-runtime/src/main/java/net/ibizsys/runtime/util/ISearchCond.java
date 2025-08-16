package net.ibizsys.runtime.util;




/**
 * 查询过滤条件
 * @author Administrator
 *
 */
public interface ISearchCond {
	
	/**
	 * 属性条件，单项条件
	 */
	final static String CONDTYPE_DEFIELD = "DEFIELD";

	/**
	 * 自定义条件，直接代码
	 */
	final static String CONDTYPE_CUSTOM = "CUSTOM";

	/**
	 * 组条件，包括一个或多个条件
	 */
	final static String CONDTYPE_GROUP = "GROUP";

	/**
	 * 预置条件，引擎预置的条件
	 */
	final static String CONDTYPE_PREDEFINED = "PREDEFINED";
	
	
	/**
	 * 子项条件，包括一个或多个子项条件
	 */
	final static String CONDTYPE_ITEMS = "ITEMS";
	
	/**
	 * 获取条件类型
	 * 
	 * @return
	 */
	String getCondType();
	
	
	
	
	/**
	 * 获取条件标记
	 * @return
	 */
	String getTag();
	
	
	/**
	 * 获取条件的分类
	 * 分类用于标记条件的用途
	 * @return
	 */
	String getCat();

	
}
