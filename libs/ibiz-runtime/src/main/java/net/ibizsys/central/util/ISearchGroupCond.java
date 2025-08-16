package net.ibizsys.central.util;


/**
 * 搜索条件组对象接口
 * @author lionlau
 *
 */
public interface ISearchGroupCond extends ISearchGroupCondBase {

	/**
	 * 新建一个AND子组
	 * @return
	 */
	ISearchGroupCond and();
	
	
	/**
	 * 新建一个OR子组
	 * @return
	 */
	ISearchGroupCond or();
	
	
	/**
	 * 取反当前组
	 * @return
	 */
	ISearchGroupCond not();
	
	
	/**
	 * 设置属性条件
	 * @param strFieldName
	 * @param strCondOp
	 * @param objValue
	 * @return
	 */
	ISearchGroupCond setFieldCond(String strFieldName, String strCondOp, Object objValue);
	
	
	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCond eq(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	 ISearchGroupCond ne(String strFieldName, Object objValue);
	 
	 
	
	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCond gt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCond gte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCond lt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCond lte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCond like(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchGroupCond ll(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	 ISearchGroupCond rl(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	ISearchGroupCond nvl(String strFieldName);
	
	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	ISearchGroupCond nn(String strFieldName);

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	ISearchGroupCond in(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	ISearchGroupCond ni(String strFieldName, Object objValue);
	
	/**
	 * 添加自定义条件
	 * @param strCustomCond
	 */
	ISearchGroupCond custom(String strCustomCond);
	
	
	/**
	 * 加入预定义条件
	 * @param strPredefinedCond
	 * @param strPredefinedType
	 * @return
	 */
	ISearchGroupCond predefined(String strPredefinedCond, String strPredefinedType);
	
	
	
}
