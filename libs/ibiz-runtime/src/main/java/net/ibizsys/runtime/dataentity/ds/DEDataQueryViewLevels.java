package net.ibizsys.runtime.dataentity.ds;

public class DEDataQueryViewLevels {

	/**
	 * 不指定，使用支持查询输出的属性
	 */
	public final static int UNKNOWN = -1;

	/**
	 * 全部数据，整形类型，可用于 switch 或 == 比较
	 */
	public final static int ALL = 0;
	
	/**
	 * 2级（无行外数据），整形类型，可用于 switch 或 == 比较
	 */
	public final static int LEVEL1 = 1;
	
	/**
	 * 3级（关键数据），整形类型，可用于 switch 或 == 比较
	 */
	public final static int LEVEL2 = 2;
	
	/**
	 * 4级（个别字段），整形类型，可用于 switch 或 == 比较
	 */
	public final static int LEVEL3 = 3;
	
	/**
	 * 指定属性组，整形类型，可用于 switch 或 == 比较
	 */
	public final static int DEFGROUP = 100;

}
