package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFPrepareProcessNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowProcessNode{

	
	
	/**
	 * 获取是否重新选择列
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM9}
	 * @return
	 */
	boolean isReselectColumn();
}