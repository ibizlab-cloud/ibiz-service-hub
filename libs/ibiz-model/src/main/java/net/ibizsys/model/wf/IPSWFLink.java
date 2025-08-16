package net.ibizsys.model.wf;



/**
 * 工作流处理连接模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getWFLinkType}
 *
 */
public interface IPSWFLink extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取自定义条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO#FIELD_CUSTOMCOND}
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取源流程处理
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO#FIELD_FROMPSWFPROCID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO#FIELD_LNPSLANRESID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO#FIELD_LOGICNAME}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO#FIELD_TOPSWFPROCID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO#FIELD_WFLINKTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFLinkType}
	 * @return
	 */
	java.lang.String getWFLinkType();
	
	
	/**
	 * 获取是否启用自定义条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO#FIELD_CUSTOMCONDFLAG}
	 * @return
	 */
	boolean isEnableCustomCond();
}