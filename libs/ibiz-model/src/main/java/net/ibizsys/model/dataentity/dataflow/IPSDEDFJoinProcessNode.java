package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFJoinProcessNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowProcessNode{

	
	
	/**
	 * 获取连接模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM1}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowJoinType}
	 * @return
	 */
	java.lang.String getJoinType();
	
	
	/**
	 * 获取连接模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM6}
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond getPSDEDFJoinGroupCond();


	/**
	 * 获取连接模型，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond getPSDEDFJoinGroupCondMust();
}