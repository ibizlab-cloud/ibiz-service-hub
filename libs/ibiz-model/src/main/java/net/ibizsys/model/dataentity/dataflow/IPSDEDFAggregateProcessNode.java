package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFAggregateProcessNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowProcessNode{

	
	
	/**
	 * 获取聚合数据源属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM2}
	 * @return
	 */
	java.lang.String getAggregateField();
	
	
	/**
	 * 获取是否从属性数据源聚合
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM10}
	 * @return
	 */
	boolean isAggregateFromField();
}