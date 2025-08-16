package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSortProcessNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowProcessNode{

	
	
	/**
	 * 获取获取记录数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM8}
	 * @return
	 */
	int getLimit();
	
	
	/**
	 * 获取跳过记录数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM7}
	 * @return
	 */
	int getSkip();
}