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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO#FIELD_PSDBVALUEOPID}
	 * @return
	 */
	java.lang.String getCondOP();
	
	
	/**
	 * 获取目标属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO#FIELD_CUSTOMDSTPARAM}、{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO#FIELD_DSTPSDEFNAME}
	 * @return
	 */
	java.lang.String getFieldName();
	
	
	/**
	 * 获取参数类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO#FIELD_PARAMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFVRParamType}
	 * @return
	 */
	java.lang.String getParamType();
	
	
	/**
	 * 获取条件值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO#FIELD_CONDVALUE}
	 * @return
	 */
	java.lang.String getParamValue();
}