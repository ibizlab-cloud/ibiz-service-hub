package net.ibizsys.central.util.script;

import net.ibizsys.runtime.util.script.IScriptObject;

/**
 * 脚本搜索分组条件集合
 * @author lionlau
 *
 */
public interface IScriptSearchGroupCondBase extends IScriptObject {

	/**
	 * 设置属性条件
	 * @param strFieldName
	 * @param strCondOp
	 * @param objValue
	 * @return
	 */
	IScriptSearchGroupCondBase field(String strFieldName, String strCondOp, Object objValue);
	
	
	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase eq(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase ne(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase gt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase gte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase lt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase lte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase like(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase ll(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase rl(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase nvl(String strFieldName);
	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase nn(String strFieldName) ;

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase in(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	IScriptSearchGroupCondBase ni(String strFieldName, Object objValue);
	
	
	
}
