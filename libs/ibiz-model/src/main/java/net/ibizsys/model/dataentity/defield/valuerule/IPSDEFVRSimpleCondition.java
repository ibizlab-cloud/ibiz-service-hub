package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则标准条件模型对象接口
 * <P>
 * 扩展父接口类型[SIMPLE]
 *
 */
public interface IPSDEFVRSimpleCondition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition{

	
	
	/**
	 * 获取条件操作
	 * @return
	 */
	String getCondOp();
	
	
	/**
	 * 获取参数类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFVRParamType}
	 * @return
	 */
	String getParamType();
	
	
	/**
	 * 获取参数值
	 * @return
	 */
	String getParamValue();
}