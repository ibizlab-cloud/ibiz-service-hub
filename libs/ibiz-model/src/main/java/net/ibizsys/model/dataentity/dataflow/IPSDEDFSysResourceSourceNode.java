package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSysResourceSourceNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSourceNode{

	
	
	/**
	 * 获取系统预置资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSRESOURCEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResource();


	/**
	 * 获取系统预置资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResourceMust();
}