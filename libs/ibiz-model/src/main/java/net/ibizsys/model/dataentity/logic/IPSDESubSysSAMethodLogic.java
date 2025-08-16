package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑外部服务接口方法调用节点模型对象接口
 * <P>
 * 扩展父接口类型[SUBSYSSAMETHOD]
 *
 */
public interface IPSDESubSysSAMethodLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取外部服务接口
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSSUBSYSSERVICEAPIID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSSUBSYSSADETAILID}
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod();


	/**
	 * 获取外部服务接口方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethodMust();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_RETPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
}