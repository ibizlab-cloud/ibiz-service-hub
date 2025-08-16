package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSubSysServiceAPISourceNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSourceNode{

	
	
	/**
	 * 获取外部服务接口
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSUBSYSSERVICEAPIID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSUBSYSSADETAILID}
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod();


	/**
	 * 获取外部服务接口方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethodMust();
}