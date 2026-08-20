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
	String getDstField();
	
	
	/**
	 * 获取源值
	 * @return
	 */
	String getSrcValue();
	
	
	/**
	 * 获取源值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcParamValueType}
	 * @return
	 */
	String getSrcValueType();
	
	
	/**
	 * 获取处理角色数据
	 * @return
	 */
	String getUserData();
	
	
	/**
	 * 获取处理角色数据2
	 * @return
	 */
	String getUserData2();
}