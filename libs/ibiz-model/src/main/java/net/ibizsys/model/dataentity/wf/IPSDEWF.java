package net.ibizsys.model.dataentity.wf;



/**
 * 实体工作流配置模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWFDEDTO}运行时对象
 *
 */
public interface IPSDEWF extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取用户数据状态代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getEntityStatePSCodeList();


	/**
	 * 获取用户数据状态代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getEntityStatePSCodeListMust();
	
	
	/**
	 * 获取流程取消状态值
	 * @return
	 */
	java.lang.String getEntityWFCancelState();
	
	
	/**
	 * 获取流程错误状态值
	 * @return
	 */
	java.lang.String getEntityWFErrorState();
	
	
	/**
	 * 获取流程结束状态值
	 * @return
	 */
	java.lang.String getEntityWFFinishState();
	
	
	/**
	 * 获取流程状态值
	 * @return
	 */
	java.lang.String getEntityWFState();
	
	
	/**
	 * 获取错误跳转主状态，从实体主状态计算
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getErrorPSDEMainState();


	/**
	 * 获取错误跳转主状态，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getErrorPSDEMainStateMust();
	
	
	/**
	 * 获取流程完成实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_FINISHPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getFinishPSDEAction();


	/**
	 * 获取流程完成实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getFinishPSDEActionMust();
	
	
	/**
	 * 获取完成跳转主状态，从实体主状态计算
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getFinishPSDEMainState();


	/**
	 * 获取完成跳转主状态，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getFinishPSDEMainStateMust();
	
	
	/**
	 * 获取流程初始化实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_INITPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getInitPSDEAction();


	/**
	 * 获取流程初始化实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getInitPSDEActionMust();
	
	
	/**
	 * 获取我的数据标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_MYWFDATAPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getMyWFDataCapPSLanguageRes();


	/**
	 * 获取我的数据标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getMyWFDataCapPSLanguageResMust();
	
	
	/**
	 * 获取我的数据标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_MYWFDATA}
	 * @return
	 */
	java.lang.String getMyWFDataCaption();
	
	
	/**
	 * 获取我的工作标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_MYWFWORKPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getMyWFWorkCapPSLanguageRes();


	/**
	 * 获取我的工作标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getMyWFWorkCapPSLanguageResMust();
	
	
	/**
	 * 获取我的工作标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_MYWFWORK}
	 * @return
	 */
	java.lang.String getMyWFWorkCaption();
	
	
	/**
	 * 获取工作流对象
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflow();


	/**
	 * 获取工作流对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust();
	
	
	/**
	 * 获取父流程实例属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_PWFINSTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPWFInstPSDEField();


	/**
	 * 获取父流程实例属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPWFInstPSDEFieldMust();
	
	
	/**
	 * 获取处理中主状态，从实体主状态计算
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getProcessPSDEMainState();


	/**
	 * 获取处理中主状态，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getProcessPSDEMainStateMust();
	
	
	/**
	 * 获取代理数据存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_PROXYDATAPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getProxyDataPSDEField();


	/**
	 * 获取代理数据存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getProxyDataPSDEFieldMust();
	
	
	/**
	 * 获取代理模块存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getProxyModulePSDEField();


	/**
	 * 获取代理模块存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getProxyModulePSDEFieldMust();
	
	
	/**
	 * 获取用户状态属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_STATEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUDStatePSDEField();


	/**
	 * 获取用户状态属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUDStatePSDEFieldMust();
	
	
	/**
	 * 获取流程操作者属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFACTORPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFActorsPSDEField();


	/**
	 * 获取流程操作者属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFActorsPSDEFieldMust();
	
	
	/**
	 * 获取流程分类代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFCATCODE}
	 * @return
	 */
	java.lang.String getWFCatCode();
	
	
	/**
	 * 获取流程实例属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFINSTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFInstPSDEField();


	/**
	 * 获取流程实例属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFInstPSDEFieldMust();
	
	
	/**
	 * 获取流程模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFMODE}
	 * @return
	 */
	java.lang.String getWFMode();
	
	
	/**
	 * 获取工作流代理模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFPROXYMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProxyMode}
	 * @return
	 */
	int getWFProxyMode();
	
	
	/**
	 * 获取嵌入流程返回值存放属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFRETPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFRetPSDEField();


	/**
	 * 获取嵌入流程返回值存放属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFRetPSDEFieldMust();
	
	
	/**
	 * 获取开始流程名称
	 * @return
	 */
	java.lang.String getWFStartName();
	
	
	/**
	 * 获取流程状态属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFSTATEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFStatePSDEField();


	/**
	 * 获取流程状态属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFStatePSDEFieldMust();
	
	
	/**
	 * 获取流程步骤代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getWFStepPSCodeList();


	/**
	 * 获取流程步骤代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getWFStepPSCodeListMust();
	
	
	/**
	 * 获取流程步骤属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFSTEPPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFStepPSDEField();


	/**
	 * 获取流程步骤属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFStepPSDEFieldMust();
	
	
	/**
	 * 获取流程版本存放属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFVERPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFVerPSDEField();


	/**
	 * 获取流程版本存放属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFVerPSDEFieldMust();
	
	
	/**
	 * 获取工作流存放属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_WFIDPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWorkflowPSDEField();


	/**
	 * 获取工作流存放属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWorkflowPSDEFieldMust();
	
	
	/**
	 * 获取是否默认流程实体
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否支持用户启动
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_USERSTART}
	 * @return
	 */
	boolean isEnableUserStart();
	
	
	/**
	 * 获取是否使用工作流代理应用
	 * @return
	 */
	boolean isUseWFProxyApp();
}