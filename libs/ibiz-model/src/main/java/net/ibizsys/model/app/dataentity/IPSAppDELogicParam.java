package net.ibizsys.model.app.dataentity;



/**
 * 应用实体处理逻辑参数模型对象接口
 *
 */
public interface IPSAppDELogicParam extends net.ibizsys.model.dataentity.logic.IPSDELogicParam{

	
	
	/**
	 * 获取参数应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getParamPSAppDataEntity();


	/**
	 * 获取参数应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getParamPSAppDataEntityMust();
}