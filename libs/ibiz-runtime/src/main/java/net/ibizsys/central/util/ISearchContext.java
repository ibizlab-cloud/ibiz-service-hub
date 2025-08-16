package net.ibizsys.central.util;

import java.util.List;

import org.springframework.data.domain.Pageable;

import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchGroupCond;

public interface ISearchContext extends net.ibizsys.runtime.util.ISearchContext,IEntity,ISearchGroupCond {

	
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
	 * 请求参数：快速查询条件
	 */
	final static String PARAM_QUERYCONDS = "queryconds";
	
	
	/**
	 * 请求参数：是否请求计数
	 */
	final static String PARAM_COUNT = "count";
	
	
	/**
	 * 请求参数：搜索条件集合
	 */
	final static String PARAM_SEARCHCONDS = "searchconds";
	
	
	/**
	 * 请求参数：分组数据搜索条件集合
	 */
	final static String PARAM_GROUPDATACONDS = "groupdataconds";
	
	
	/**
	 * 请求参数：预定义条件
	 */
	final static String PARAM_PREDEFINEDCOND = "predefinedcond";
	
	
	
	/**
	 * 请求参数：数据钻取条件
	 */
	final static String PARAM_DRILLDOWNCOND = "drilldowncond";
	
	
	/**
	 * 请求参数：分组条件
	 */
	final static String PARAM_GROUPCOND = "groupcond";
	
	
	/**
	 * 请求参数：父实体标识（兼容旧版本）
	 */
	final static String PARAM_PARENTDENAME = "srfparentdename";
	
	
	/**
	 * 请求参数：父值（兼容旧版本）
	 */
	final static String PARAM_PARENTKEY = "srfparentkey";
	
	
	/**
	 * 获取分页对象
	 * @return
	 */
	Pageable getPageable();
	
	
	
	/**
	 * 设置分页对象
	 * @param pageable
	 */
	void setPageable(Pageable pageable);
	
	
	
	
	/**
	 * 是否支持计数
	 * @return
	 */
	boolean isCount();
	
	
	/**
	 * 设置是否支持计数
	 * @param bCount
	 */
	void setCount(boolean bCount);
	
	
	
	/**
	 * 设置分页信息
	 * @param nPageNumber
	 * @param nPageSize
	 * @param nOffset
	 */
	void setPageable(int nPageNumber, int nPageSize, long nOffset);
	
	
//	/**
//	 * 获取分页排序信息
//	 * @return
//	 */
//	Sort getSort();
//	
//	
//	/**
//	 * 设置分页排序信息
//	 */
//	void setPageSort(Sort sort);
	
//	/**
//	 * 获取参数
//	 * @param strName
//	 * @return
//	 */
//	Object get(String strName);
	
	
	
	
	/**
	 * 获取查询条件
	 * @return
	 */
	List<ISearchCond> getSearchConds();
	
	
	
	/**
	 * 获取查询条件，不存在时提供列表
	 * @return
	 */
	List<ISearchCond> getSearchCondsIf();
	
	
	/**
	 * 设置搜索过滤器上下文值
	 * @param strName
	 * @param objValue
	 */
	void set(String strName,Object objValue);
	
	
	
	/**
	 * 获取快速查询内容
	 * @return
	 */
	String getQuery();
	
	
	
	
	/**
	 * 获取数据钻取条件
	 * @return
	 */
	String getDrillDownCond();

	
	/**
	 * 获取数据分组条件
	 * @return
	 */
	String getGroupCond();
	
	
	/**
	 * 设置分页排序信息
	 * @param strPageSort
	 */
	void setPageSort(String strPageSort);
	
	
	/**
	 * 获取是否填充嵌套属性（过期方法，同isFillNestedFields）
	 * @return
	 */
	@Deprecated
	boolean isFillNestedField();
	
	
	/**
	 * 获取是否填充嵌套属性
	 * @return
	 */
	boolean isFillNestedFields();
	
	
	
	/**
	 * 设置是否填充嵌套属性
	 * @param bFillNestedField
	 */
	void setFillNestedFields(boolean bFillNestedFields);
	
	
	/**
	 * 是否转换属性值
	 * @return
	 */
	boolean isTranslateFields();
	
	
	
	/**
	 * 设置转换属性值
	 * @param bTranslateFields
	 */
	void setTranslateFields(boolean bTranslateFields);
	
	
	/**
	 * 获取数据查询条件，仅分组数据查询使用
	 * @return
	 */
	List<ISearchCond> getGroupDataConds();
	
	
	
	/**
	 * 获取数据查询条件，仅分组数据查询使用，不存在时提供列表
	 * @return
	 */
	List<ISearchCond> getGroupDataCondsIf();
}
