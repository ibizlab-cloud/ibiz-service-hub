package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFPredefinedSourceNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSourceNode{

	
	
	/**
	 * 获取预定义类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LOGICNODESUBTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowPredefinedSourceType}
	 * @return
	 */
	java.lang.String getPredefinedType();
}