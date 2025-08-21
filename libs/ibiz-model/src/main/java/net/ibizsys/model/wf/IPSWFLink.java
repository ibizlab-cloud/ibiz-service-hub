package net.ibizsys.model.wf;



/**
 * 工作流处理连接模型对象接口
 *
 */
public interface IPSWFLink extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取自定义条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取源流程处理
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFProcess getFromPSWFProcess();


	/**
	 * 获取源流程处理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFProcess getFromPSWFProcessMust();
	
	
	/**
	 * 获取逻辑名称语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageRes();


	/**
	 * 获取逻辑名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageResMust();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取连接条件
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFLinkGroupCond getPSWFLinkGroupCond();


	/**
	 * 获取连接条件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFLinkGroupCond getPSWFLinkGroupCondMust();
	
	
	/**
	 * 获取目标流程处理
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFProcess getToPSWFProcess();


	/**
	 * 获取目标流程处理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFProcess getToPSWFProcessMust();
	
	
	/**
	 * 获取处理连接处理
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFLinkType}
	 * @return
	 */
	java.lang.String getWFLinkType();
	
	
	/**
	 * 获取是否启用自定义条件
	 * @return
	 */
	boolean isEnableCustomCond();
}