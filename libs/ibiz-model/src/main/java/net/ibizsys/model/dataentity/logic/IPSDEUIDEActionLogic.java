package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑调用实体行为节点模型对象接口
 * <P>
 * 扩展父接口类型[DEACTION]
 *
 */
public interface IPSDEUIDEActionLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取调用应用实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEAction();


	/**
	 * 获取调用应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEActionMust();
	
	
	/**
	 * 获取目标应用实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntity();


	/**
	 * 获取目标应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntityMust();
	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParamMust();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_RETPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getRetPSDEUILogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getRetPSDEUILogicParamMust();
}