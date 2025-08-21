package net.ibizsys.model.service;



/**
 * 外部系统服务接口实体行为模型对象接口
 *
 */
public interface IPSSubSysServiceAPIDEMethod extends net.ibizsys.model.service.IPSSubSysServiceAPIMethod{

	
	
	/**
	 * 获取输入对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getInPSSubSysServiceAPIDE();


	/**
	 * 获取输入对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getInPSSubSysServiceAPIDEMust();
	
	
	/**
	 * 获取输出对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getOutPSSubSysServiceAPIDE();


	/**
	 * 获取输出对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getOutPSSubSysServiceAPIDEMust();
	
	
	/**
	 * 获取外部接口实体对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE();


	/**
	 * 获取外部接口实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDEMust();
	
	
	/**
	 * 获取方法输入对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput getPSSubSysServiceAPIMethodInput();


	/**
	 * 获取方法输入对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput getPSSubSysServiceAPIMethodInputMust();
	
	
	/**
	 * 获取方法返回对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn getPSSubSysServiceAPIMethodReturn();


	/**
	 * 获取方法返回对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn getPSSubSysServiceAPIMethodReturnMust();
}