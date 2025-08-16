package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑抛出异常节点模型对象接口
 * <P>
 * 扩展父接口类型[THROWEXCEPTION]
 *
 */
public interface IPSDEThrowExceptionLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取错误代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM8}
	 * @return
	 */
	int getErrorCode();
	
	
	/**
	 * 获取错误信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM3}
	 * @return
	 */
	java.lang.String getErrorInfo();
	
	
	/**
	 * 获取异常对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM11}
	 * @return
	 */
	java.lang.String getExceptionObj();
	
	
	/**
	 * 获取异常参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getExceptionParam();


	/**
	 * 获取异常参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getExceptionParamMust();
}