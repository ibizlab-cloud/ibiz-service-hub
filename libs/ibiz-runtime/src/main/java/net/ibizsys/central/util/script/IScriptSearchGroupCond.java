package net.ibizsys.central.util.script;

/**
 * 脚本搜索分组条件集合
 * @author lionlau
 *
 */
public interface IScriptSearchGroupCond extends IScriptSearchGroupCondBase {

	/**
	 * 取反当前逻辑组
	 * @return
	 */
	IScriptSearchGroupCond not();
	
	/**
	 * 建立子组（AND）逻辑
	 * @return
	 */
	IScriptSearchGroupCond and();
	
	/**
	 * 建立子组（OR）逻辑
	 * @return
	 */
	IScriptSearchGroupCond or();
	
	
	/**
	 * 设置属性条件
	 * @param strFieldName
	 * @param strCondOp
	 * @param objValue
	 * @return
	 */
	IScriptSearchGroupCond field(String strFieldName, String strCondOp, Object objValue);
	
	
	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCond eq(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCond ne(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCond gt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCond gte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCond lt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCond lte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCond like(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCond ll(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 */
	IScriptSearchGroupCond rl(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	IScriptSearchGroupCond nvl(String strFieldName);
	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	IScriptSearchGroupCond nn(String strFieldName) ;

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	IScriptSearchGroupCond in(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	IScriptSearchGroupCond ni(String strFieldName, Object objValue);
	
	
	
}
