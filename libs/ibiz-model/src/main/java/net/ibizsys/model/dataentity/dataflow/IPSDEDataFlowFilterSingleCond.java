package net.ibizsys.model.dataentity.dataflow;



/**
 * 实体数据流过滤器单项条件模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSDEDataFlowFilterSingleCond extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond{

	
	
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
	 * 获取过滤属性名称
	 * @return
	 */
	java.lang.String getFilterField();
	
	
	/**
	 * 获取过滤属性归属
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowFieldScope}
	 * @return
	 */
	java.lang.String getFilterFieldScope();
	
	
	/**
	 * 获取简单数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
}