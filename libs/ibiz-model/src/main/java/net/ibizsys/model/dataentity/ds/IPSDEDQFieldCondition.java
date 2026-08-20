package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询属性条件模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSDEDQFieldCondition extends net.ibizsys.model.dataentity.ds.IPSDEDQCondition{

	
	
	/**
	 * 获取条件操作
	 * @return
	 */
	String getCondOp();
	
	
	/**
	 * 获取条件值
	 * @return
	 */
	String getCondValue();
	
	
	/**
	 * 获取属性名称，来源{@link #getPSDEField}.getName()
	 * @return
	 */
	String getFieldName();
	
	
	/**
	 * 获取属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取变量类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDQVarType}
	 * @return
	 */
	String getPSVARTypeId();
	
	
	/**
	 * 获取值函数代码标识
	 * @return
	 */
	String getValueFunc();
	
	
	/**
	 * 获取值函数标记
	 * @return
	 */
	String getValueFuncTag();
	
	
	/**
	 * 获取值函数标记2
	 * @return
	 */
	String getValueFuncTag2();
	
	
	/**
	 * 获取是否忽略空值
	 * @return
	 */
	boolean isIgnoreEmpty();
	
	
	/**
	 * 获取是否忽略外部参数
	 * @return
	 */
	boolean isIgnoreOthers();
}