package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFMergeProcessNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowProcessNode{

	
	
	/**
	 * 获取数据源合并属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM2}
	 * @return
	 */
	java.lang.String getMergeField();
	
	
	/**
	 * 获取合并模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM1}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowMergeType}
	 * @return
	 */
	java.lang.String getMergeType();
	
	
	/**
	 * 获取是否仅拷贝不存在属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM9}
	 * @return
	 */
	boolean isCopyIfNotExists();
	
	
	/**
	 * 获取是否合并到指定属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM10}
	 * @return
	 */
	boolean isMergeIntoField();
}