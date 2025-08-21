package net.ibizsys.model.wf;



/**
 * 工作流处理节点参数模型对象接口
 *
 */
public interface IPSWFProcessParam extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取目标属性
	 * @return
	 */
	java.lang.String getDstField();
	
	
	/**
	 * 获取源值
	 * @return
	 */
	java.lang.String getSrcValue();
	
	
	/**
	 * 获取源值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcParamValueType}
	 * @return
	 */
	java.lang.String getSrcValueType();
	
	
	/**
	 * 获取处理角色数据
	 * @return
	 */
	java.lang.String getUserData();
	
	
	/**
	 * 获取处理角色数据2
	 * @return
	 */
	java.lang.String getUserData2();
}