package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑直接WEB请求节点模型对象接口
 * <P>
 * 扩展父接口类型[RAWWEBCALL]
 *
 */
public interface IPSDERawWebCallLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取请求内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceReqContentType}
	 * @return
	 */
	java.lang.String getBodyContentType();
	
	
	/**
	 * 获取目标逻辑参数对象
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
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPI();


	/**
	 * 获取外部服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPIMust();
	
	
	/**
	 * 获取请求模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.RequestMethod}
	 * @return
	 */
	java.lang.String getRequestMethod();
	
	
	/**
	 * 获取请求路径
	 * @return
	 */
	java.lang.String getRequestPath();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
	
	
	/**
	 * 获取是否返回响应数据对象
	 * @return
	 */
	boolean isReturnRepEntity();
}