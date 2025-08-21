package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑连接单项条件模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSDELogicLinkSingleCond extends net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond
		,net.ibizsys.model.dataentity.logic.IPSDELogicLinkSingleCondBase{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstLogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstLogicParamMust();
}