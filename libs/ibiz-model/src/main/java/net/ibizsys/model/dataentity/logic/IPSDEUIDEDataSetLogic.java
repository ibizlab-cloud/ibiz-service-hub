package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑获取实体数据集合节点模型对象接口
 * <P>
 * 扩展父接口类型[DEDATASET]
 *
 */
public interface IPSDEUIDEDataSetLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取应用实体数据集对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDstPSAppDEDataSet();


	/**
	 * 获取应用实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDstPSAppDEDataSetMust();
	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntityMust();
	
	
	/**
	 * 获取目标逻辑参数对象
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
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getRetPSDEUILogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getRetPSDEUILogicParamMust();
}