package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑调用系统预置功能组件节点模型对象接口
 * <P>
 * 扩展父接口类型[SYSUTIL]
 *
 */
public interface IPSDESysUtilLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取系统预置功能组件对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUtil getPSSysUtil();


	/**
	 * 获取系统预置功能组件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUtil getPSSysUtilMust();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
	
	
	/**
	 * 获取执行功能操作
	 * @return
	 */
	java.lang.String getUtilAction();
}