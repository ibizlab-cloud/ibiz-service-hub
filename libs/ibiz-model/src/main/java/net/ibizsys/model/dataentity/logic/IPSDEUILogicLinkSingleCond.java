package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑连接单项条件模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSDEUILogicLinkSingleCond extends net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond
		,net.ibizsys.model.dataentity.logic.IPSDELogicLinkSingleCondBase{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELLCondDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstLogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstLogicParamMust();
}