package net.ibizsys.model.wf;



/**
 * 工作流处理节点参数模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWFProcParamDTO}运行时对象
 *
 */
public interface IPSWFProcessParam extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取目标属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcParamDTO#FIELD_CUSTOMDSTDEFNAME}、{@link net.ibizsys.centralstudio.dto.PSWFProcParamDTO#FIELD_PSDEFNAME}
	 * @return
	 */
	java.lang.String getDstField();
	
	
	/**
	 * 获取源值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcParamDTO#FIELD_SRCVALUE}
	 * @return
	 */
	java.lang.String getSrcValue();
	
	
	/**
	 * 获取源值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcParamDTO#FIELD_SRCVALUETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcParamValueType}
	 * @return
	 */
	java.lang.String getSrcValueType();
	
	
	/**
	 * 获取处理角色数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcParamDTO#FIELD_USERDATA}
	 * @return
	 */
	java.lang.String getUserData();
	
	
	/**
	 * 获取处理角色数据2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcParamDTO#FIELD_USERDATA2}
	 * @return
	 */
	java.lang.String getUserData2();
}