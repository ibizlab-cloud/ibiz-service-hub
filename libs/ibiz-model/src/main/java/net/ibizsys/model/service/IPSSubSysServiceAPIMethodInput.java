package net.ibizsys.model.service;



/**
 * 外部系统服务接口实体行为输入模型对象接口
 *
 */
public interface IPSSubSysServiceAPIMethodInput extends net.ibizsys.model.dataentity.service.IPSDEMethodInput{

	
	
	/**
	 * 获取外部服务接口主键属性
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEField getKeyPSSubSysServiceAPIField();


	/**
	 * 获取外部服务接口主键属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEField getKeyPSSubSysServiceAPIFieldMust();
	
	
	/**
	 * 获取外部服务接口DTO对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDTO getPSSubSysServiceAPIDTO();


	/**
	 * 获取外部服务接口DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDTO getPSSubSysServiceAPIDTOMust();
}