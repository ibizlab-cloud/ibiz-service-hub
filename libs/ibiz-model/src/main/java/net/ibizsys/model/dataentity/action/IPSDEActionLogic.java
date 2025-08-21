package net.ibizsys.model.dataentity.action;



/**
 * 实体行为附加逻辑模型对象接口
 *
 */
public interface IPSDEActionLogic extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取行为逻辑类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionLogicType}
	 * @return
	 */
	int getActionLogicType();
	
	
	/**
	 * 获取附加模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode}
	 * @return
	 */
	java.lang.String getAttachMode();
	
	
	/**
	 * 获取数据同步事件
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSyncInformType}
	 * @return
	 */
	int getDataSyncEvent();
	
	
	/**
	 * 获取目标实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDE();


	/**
	 * 获取目标实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDEMust();
	
	
	/**
	 * 获取目标实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction();


	/**
	 * 获取目标实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust();
	
	
	/**
	 * 获取目标实体数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet();


	/**
	 * 获取目标实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust();
	
	
	/**
	 * 获取目标实体逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogic();


	/**
	 * 获取目标实体逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogicMust();
	
	
	/**
	 * 获取错误代码
	 * @return
	 */
	int getErrorCode();
	
	
	/**
	 * 获取错误信息
	 * @return
	 */
	java.lang.String getErrorInfo();
	
	
	/**
	 * 获取错误信息语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getErrorInfoPSLanguageRes();


	/**
	 * 获取错误信息语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getErrorInfoPSLanguageResMust();
	
	
	/**
	 * 获取异常对象
	 * @return
	 */
	java.lang.String getExceptionObj();
	
	
	/**
	 * 获取行为逻辑动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getLogicParams();
	
	
	/**
	 * 获取主控关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getMajorPSDER();


	/**
	 * 获取主控关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getMajorPSDERMust();
	
	
	/**
	 * 获取实体数据同步
	 * @return
	 */
	net.ibizsys.model.dataentity.datasync.IPSDEDataSync getPSDEDataSync();


	/**
	 * 获取实体数据同步，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.datasync.IPSDEDataSync getPSDEDataSyncMust();
	
	
	/**
	 * 获取属性值规则
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRule();


	/**
	 * 获取属性值规则，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRuleMust();
	
	
	/**
	 * 获取属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取实体逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic();


	/**
	 * 获取实体逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogicMust();
	
	
	/**
	 * 获取实体主状态
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainState();


	/**
	 * 获取实体主状态，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainStateMust();
	
	
	/**
	 * 获取实体通知
	 * @return
	 */
	net.ibizsys.model.dataentity.notify.IPSDENotify getPSDENotify();


	/**
	 * 获取实体通知，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.notify.IPSDENotify getPSDENotifyMust();
	
	
	/**
	 * 获取系统预置逻辑
	 * @return
	 */
	net.ibizsys.model.res.IPSSysLogic getPSSysLogic();


	/**
	 * 获取系统预置逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysLogic getPSSysLogicMust();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取系统值序列
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSequence getPSSysSequence();


	/**
	 * 获取系统值序列，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSequence getPSSysSequenceMust();
	
	
	/**
	 * 获取系统值转换器
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator();


	/**
	 * 获取系统值转换器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust();
	
	
	/**
	 * 获取准备操作之前数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionPrepareLastMode}
	 * @return
	 */
	int getPrepareLastMode();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否克隆传入参数
	 * @return
	 */
	boolean isCloneParam();
	
	
	/**
	 * 获取是否支持后台执行
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否忽略异常
	 * @return
	 */
	boolean isIgnoreException();
	
	
	/**
	 * 获取是否内部逻辑，参考{@#link #getActionLogicType}
	 * @return
	 */
	boolean isInternalLogic();
	
	
	/**
	 * 获取是否准备操作之前数据
	 * @return
	 */
	boolean isPrepareLast();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}