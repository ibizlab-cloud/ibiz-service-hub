package net.ibizsys.model.dataentity.dataflow;



/**
 * 实体数据流连接单项条件模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSDEDFJoinSingleCond extends net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond{

	
	
	/**
	 * 获取条件值
	 * @return
	 */
	java.lang.String getCondValue();
	
	
	/**
	 * 获取条件值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowCondValueType}
	 * @return
	 */
	java.lang.String getCondValueType();
	
	
	/**
	 * 获取连接属性名称
	 * @return
	 */
	java.lang.String getJoinField();
	
	
	/**
	 * 获取连接属性归属
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowFieldScope}
	 * @return
	 */
	java.lang.String getJoinFieldScope();
	
	
	/**
	 * 获取简单数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
}