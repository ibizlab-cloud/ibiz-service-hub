package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSubSysServiceAPISinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
	/**
	 * 获取外部服务接口
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPI();


	/**
	 * 获取外部服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPIMust();
	
	
	/**
	 * 获取外部服务接口实体
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE();


	/**
	 * 获取外部服务接口实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDEMust();
	
	
	/**
	 * 获取外部服务接口方法
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod();


	/**
	 * 获取外部服务接口方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethodMust();
}