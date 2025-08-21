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
	 * @return
	 */
	int getErrorCode();
	
	
	/**
	 * 获取错误信息
	 * @return
	 */
	java.lang.String getErrorInfo();
	
	
	/**
	 * 获取异常对象
	 * @return
	 */
	java.lang.String getExceptionObj();
	
	
	/**
	 * 获取异常参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getExceptionParam();


	/**
	 * 获取异常参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getExceptionParamMust();
}