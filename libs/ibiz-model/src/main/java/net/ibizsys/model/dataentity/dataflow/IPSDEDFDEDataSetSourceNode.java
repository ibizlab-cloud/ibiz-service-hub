package net.ibizsys.model.dataentity.dataflow;



/**
 * 实体数据流实体数据集源节点模型对象接口
 * <P>
 * 扩展父接口类型[DFDEDATASETSOURCE]
 *
 */
public interface IPSDEDFDEDataSetSourceNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSourceNode{

	
	
	/**
	 * 获取目标实体数据集对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDEDATASETID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet();


	/**
	 * 获取目标实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust();
	
	
	/**
	 * 获取目标实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity();


	/**
	 * 获取目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust();
}