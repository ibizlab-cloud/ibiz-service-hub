package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSortProcessNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowProcessNode{

	
	
	/**
	 * 获取获取记录数
	 * @return
	 */
	int getLimit();
	
	
	/**
	 * 获取跳过记录数
	 * @return
	 */
	int getSkip();
}