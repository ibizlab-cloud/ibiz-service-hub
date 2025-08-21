package net.ibizsys.model.app.control;



/**
 * 应用计数器模型对象接口
 *
 */
public interface IPSAppCounter extends net.ibizsys.model.control.counter.IPSSysCounter
		,net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取计算应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getGetPSAppDEAction();


	/**
	 * 获取计算应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getGetPSAppDEActionMust();
	
	
	/**
	 * 获取计算应用实体数据集
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getGetPSAppDEDataSet();


	/**
	 * 获取计算应用实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getGetPSAppDEDataSetMust();
	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
}