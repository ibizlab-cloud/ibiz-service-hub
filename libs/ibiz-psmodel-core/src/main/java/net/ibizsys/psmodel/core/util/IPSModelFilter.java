package net.ibizsys.psmodel.core.util;

import java.util.Map;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface IPSModelFilter {


	/**
	 * 起始页码
	 */
	final static int STARTPAGE = 0;
	
	
	/**
	 * 默认页大小
	 */
	final static int DEFAULTPAGESIZE = 1000;
	
	/**
	 * 请求参数：分页大小
	 */
	final static String PARAM_SIZE = "size";


	/**
	 * 请求参数：页码
	 */
	final static String PARAM_PAGE = "page";

	/**
	 * 请求参数：偏移
	 */
	final static String PARAM_OFFSET = "offset";

	/**
	 * 请求参数：排序
	 */
	final static String PARAM_SORT = "sort";
	
	
	/**
	 * 请求参数：快速查询
	 */
	final static String PARAM_QUERY = "query";
	
	
	/**
	 * 请求参数：是否请求计数
	 */
	final static String PARAM_COUNT = "count";
	
	
	
	/**
	 * 等于操作
	 */
	public final static String EQ = "EQ";

	/**
	 * 绝对等于（保留）
	 */
	public final static String ABSEQ = "ABSEQ";

	/**
	 * 大于操作
	 */
	public final static String GT = "GT";

	/**
	 * 大于等于操作
	 */
	public final static String GTANDEQ = "GTANDEQ";

	/**
	 * 小于操作
	 */
	public final static String LT = "LT";

	/**
	 * 小于等于操作
	 */
	public final static String LTANDEQ = "LTANDEQ";

	/**
	 * 不等于操作
	 */
	public final static String NOTEQ = "NOTEQ";

	/**
	 * 为空判断操作
	 */
	public final static String ISNULL = "ISNULL";

	/**
	 * 不为空判断操作
	 */
	public final static String ISNOTNULL = "ISNOTNULL";

	/**
	 * 文本包含
	 */
	public final static String USERLIKE = "USERLIKE";

	/**
	 * 文本包含
	 */
	public final static String LIKE = "LIKE";

	/**
	 * 文本左包含
	 */
	public final static String LEFTLIKE = "LEFTLIKE";

	/**
	 * 文本右包含
	 */
	public final static String RIGHTLIKE = "RIGHTLIKE";

	/**
	 * 空判断
	 */
	public final static String TESTNULL = "TESTNULL";

	/**
	 * 值包含在给定的范围中
	 */
	public final static String IN = "IN";

	/**
	 * 值不包含在给定的范围中
	 */
	public final static String NOTIN = "NOTIN";
	
	
	/**
	 * 值包含在给定的范围中（条件在子查询中）
	 */
	public final static String EXISTS = "EXISTS";

	/**
	 * 值不包含在给定的范围中（条件在子查询中）
	 */
	public final static String NOTEXISTS = "NOTEXISTS";
	

	/**
	 * 指定数据的子数据
	 */
	public final static String CHILDOF = "CHILDOF";

	/**
	 * 指定数据的父数据
	 */
	public final static String PARENTOF = "PARENTOF";

	/**
	 * 组逻辑操作，或处理
	 */
	public final static String OR = "OR";

	/**
	 * 组逻辑操作，与处理
	 */
	public final static String AND = "AND";
	
	
	/**
	 * 组逻辑操作，位与处理
	 */
	public final static String BITAND = "BITAND";
	
	
	/**
	 * 获取指定属性值
	 * @param strName
	 * @return
	 */
	Object get(String strName);
	
	
	/**
	 * 判断是否包含指定属性
	 * @param strName
	 * @return
	 */
	boolean contains(String strName);
	
	/**
	 * 设置指定属性值
	 * @param strName
	 * @param objValue
	 */
	void set(String strName,Object objValue);
	
	
	
	/**
	 * 移除属性值
	 * @param strName
	 */
	void reset(String strName);
	
	
	/**
	 * 重置数据对象
	 */
	void resetAll();
	

	
	/**
	 * 直接获取原始数据Map对象
	 * @return
	 */
	Map<String, Object> any();
	
	
	/**
	 * 设置属性条件
	 * @param strFieldName
	 * @param strCondOp
	 * @param objValue
	 */
	void setFieldCond(String strFieldName, String strCondOp, Object objValue);
	
	
	/**
	 * 获取属性条件
	 * @param strFieldName
	 * @param strCondOp
	 * @return
	 */
	Object getFieldCond(String strFieldName, String strCondOp);
	
	
	/**
	 * 填充数据对象
	 * @param map
	 */
	void putAll(Map<String, Object> map);
	
	
	
	/**
	 * 获取分页对象
	 * @return
	 */
	Pageable getPageable();
	
	
	/**
	 * 获取分页排序信息
	 * @return
	 */
	Sort getPageSort();
}
