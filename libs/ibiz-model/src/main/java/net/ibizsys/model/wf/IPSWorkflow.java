package net.ibizsys.model.wf;



/**
 * 工作流模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO}运行时对象
 *
 */
public interface IPSWorkflow extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取动态系统模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_ENABLEDYNASYS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DynaSysMode}
	 * @return
	 */
	int getDynaSysMode();
	
	
	/**
	 * 获取实体流程取消状态值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_WFCANCELVALUE}
	 * @return
	 */
	java.lang.String getEntityWFCancelState();
	
	
	/**
	 * 获取实体流程错误状态值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_WFERRORVALUE}
	 * @return
	 */
	java.lang.String getEntityWFErrorState();
	
	
	/**
	 * 获取实体流程结束状态值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_WFFINISHEVALUE}
	 * @return
	 */
	java.lang.String getEntityWFFinishState();
	
	
	/**
	 * 获取实体流程中状态值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_WFSTATEVALUE}
	 * @return
	 */
	java.lang.String getEntityWFState();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_PSWORKFLOWNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取名称语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_NAMEPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes();


	/**
	 * 获取名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust();
	
	
	/**
	 * 获取系统模块
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_PSMODULEID}
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取流程实体集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFDE> getPSWFDEs();
	
	/**
	 * 获取流程实体集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFDE getPSWFDE(Object objKey, boolean bTryMode);
	
	/**
	 * 设置流程实体集合
	 * @param list 流程实体集合
	 */
	void setPSWFDEs(java.util.List<net.ibizsys.model.wf.IPSWFDE> list);
	
	
	/**
	 * 获取流程版本集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFVersion> getPSWFVersions();
	
	/**
	 * 获取流程版本集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFVersion getPSWFVersion(Object objKey, boolean bTryMode);
	
	/**
	 * 设置流程版本集合
	 * @param list 流程版本集合
	 */
	void setPSWFVersions(java.util.List<net.ibizsys.model.wf.IPSWFVersion> list);
	
	
	/**
	 * 获取工作流唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
	
	
	/**
	 * 获取流程分类代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_WFCATCODE}
	 * @return
	 */
	java.lang.String getWFCatCode();
	
	
	/**
	 * 获取流程引擎类别
	 * @return
	 */
	java.lang.String getWFEngineCat();
	
	
	/**
	 * 获取流程引擎类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_WFENGINETYPE}
	 * @return
	 */
	java.lang.String getWFEngineType();
	
	
	/**
	 * 获取工作流代理模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_WFPROXYMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProxyMode}
	 * @return
	 */
	int getWFProxyMode();
	
	
	/**
	 * 获取工作流编号
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_WFSN}
	 * @return
	 */
	java.lang.String getWFSN();
	
	
	/**
	 * 获取工作流类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_WFTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFType}
	 * @return
	 */
	java.lang.String getWFType();
	
	
	/**
	 * 获取是否使用远程引擎
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO#FIELD_REMOTEENGINEFLAG}
	 * @return
	 */
	boolean isUseRemoteEngine();
	
	
	/**
	 * 获取是否使用工作流代理应用
	 * @return
	 */
	boolean isUseWFProxyApp();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}