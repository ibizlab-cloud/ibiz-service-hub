package net.ibizsys.central.util;

/**
 * Central 搜索分组条件基类
 * @author lionlau
 *
 */
public interface ISearchGroupCondBase extends net.ibizsys.runtime.util.ISearchGroupCond {

	/**
	 * 设置搜索条件组为与逻辑 
	 * @return
	 */
	ISearchGroupCondBase and();
	
	
	/**
	 * 设置搜索条件组为或逻辑
	 * @return
	 */
	ISearchGroupCondBase or();
	
	/**
	 * 设置属性条件
	 * @param strFieldName
	 * @param strCondOp
	 * @param objValue
	 * @return
	 */
	ISearchGroupCondBase setFieldCond(String strFieldName, String strCondOp, Object objValue);
	
	
	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCondBase eq(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	 ISearchGroupCondBase ne(String strFieldName, Object objValue);
	 
	 
	
	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCondBase gt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCondBase gte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCondBase lt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCondBase lte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCondBase like(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCondBase ll(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	 ISearchGroupCondBase rl(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	ISearchGroupCondBase nvl(String strFieldName);
	
	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	ISearchGroupCondBase nn(String strFieldName);

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	ISearchGroupCondBase in(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	ISearchGroupCondBase ni(String strFieldName, Object objValue);
	
	/**
	 * 添加自定义条件
	 * @param strCustomCond
	 */
	ISearchGroupCondBase custom(String strCustomCond);
	
	
	/**
	 * 加入预定义条件
	 * @param strPredefinedCond
	 * @param strPredefinedType
	 * @return
	 */
	ISearchGroupCondBase predefined(String strPredefinedCond, String strPredefinedType);

}
