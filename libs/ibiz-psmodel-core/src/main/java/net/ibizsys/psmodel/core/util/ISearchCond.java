package net.ibizsys.psmodel.core.util;




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
	 * 获取条件类型
	 * 
	 * @return
	 */
	String getCondType();
	
	
}
