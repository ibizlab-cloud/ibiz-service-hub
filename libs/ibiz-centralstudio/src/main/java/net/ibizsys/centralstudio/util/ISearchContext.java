package net.ibizsys.centralstudio.util;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;



/**
 * 搜索上下文对象接口
 * @author lionlau
 *
 */
public interface ISearchContext extends IEntity{

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
	 * 请求参数：搜索条件集合
	 */
	final static String PARAM_SEARCHCONDS = "searchconds";
	
	
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
	 * 数据集：默认数据集
	 */
	final static String DATASET_DEFAULT = "DEFAULT";
	
	/**
	 * 数据集：视图数据集（全量字段）
	 */
	final static String DATASET_VIEW = "VIEW";
	
	
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
	 * 获取数据集名称
	 * @return
	 */
	String getDataSetName();
	
	/**
	 * 设置数据集名称
	 * @return
	 */
	void setDataSetName(String strDataSetName);
	
	/**
	 * 设置分页信息
	 * @param nPageNumber
	 * @param nPageSize
	 */
	void setPageable(int nPageNumber, int nPageSize);
	
	
	/**
	 * 获取分页排序信息
	 * @return
	 */
	Sort getPageSort();
	
	
	/**
	 * 设置分页排序信息
	 */
	void setPageSort(Sort sort);
	
	
	/**
	 * 设置分页排序信息
	 */
	void setPageSort(String strSortInfo);
	
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
	 * @return
	 */
	ISearchContext setFieldCond(String strFieldName, String strCondOp, Object objValue);
	
	
	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContext eq(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	 ISearchContext ne(String strFieldName, Object objValue);
	 
	 
	
	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContext gt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContext gte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContext lt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContext lte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContext like(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContext ll(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	 ISearchContext rl(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	ISearchContext nvl(String strFieldName);
	
	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	ISearchContext nn(String strFieldName);

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	ISearchContext in(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	ISearchContext ni(String strFieldName, Object objValue);
	
	
	/**
	 * 设置当前搜索是否计数
	 * @param bCount
	 * @return
	 */
	ISearchContext count(boolean bCount);
	
	
	/**
	 * 设置搜索排序信息
	 * @param strSortInfo
	 * @return
	 */
	ISearchContext sort(String strSortInfo);
	
	/**
	 * 设置搜索返回全部数据
	 * @return
	 */
	ISearchContext all();
	

	/**
	 * 设置搜索数据范围
	 * @return
	 */
	ISearchContext limit(int nSize);
	

	/**
	 * 增加直接变量
	 * @param strName
	 * @param objValue
	 * @return
	 */
	ISearchContext param(String strName, Object objValue);
	
	

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
