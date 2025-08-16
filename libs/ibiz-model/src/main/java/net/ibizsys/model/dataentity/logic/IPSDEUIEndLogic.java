package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑结束节点模型对象接口
 * <P>
 * 扩展父接口类型[END]
 *
 */
public interface IPSDEUIEndLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取返回参数属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM2}
	 * @return
	 */
	java.lang.String getDstFieldName();
	
	
	/**
	 * 获取返回直接值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM4}
	 * @return
	 */
	java.lang.String getRawValue();
	
	
	/**
	 * 获取直接值标准数据类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM7}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getRawValueStdDataType();
	
	
	/**
	 * 获取返回参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getReturnParam();


	/**
	 * 获取返回参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getReturnParamMust();
	
	
	/**
	 * 获取返回值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM1}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LogicReturnType}
	 * @return
	 */
	java.lang.String getReturnType();
}