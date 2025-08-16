package net.ibizsys.model.app.dataentity;



/**
 * 应用实体映射行为模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEMapActionDTO}运行时对象
 *
 */
public interface IPSAppDEMapAction extends net.ibizsys.model.dataentity.datamap.IPSDEMapAction{

	
	
	/**
	 * 获取目标应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEAction();


	/**
	 * 获取目标应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEActionMust();
	
	
	/**
	 * 获取源应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getSrcPSAppDEAction();


	/**
	 * 获取源应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getSrcPSAppDEActionMust();
}