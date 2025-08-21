package net.ibizsys.model.wf;



/**
 * 工作流处理连接单项条件模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSWFLinkSingleCond extends net.ibizsys.model.wf.IPSWFLinkCond{

	
	
	/**
	 * 获取条件操作
	 * @return
	 */
	java.lang.String getCondOP();
	
	
	/**
	 * 获取目标属性
	 * @return
	 */
	java.lang.String getFieldName();
	
	
	/**
	 * 获取参数类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFVRParamType}
	 * @return
	 */
	java.lang.String getParamType();
	
	
	/**
	 * 获取条件值
	 * @return
	 */
	java.lang.String getParamValue();
}