package net.ibizsys.model.dataentity.action;



/**
 * 实体行为附加逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO}运行时对象
 *
 */
public interface IPSDEActionLogic extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取行为逻辑类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_INTERNALLOGIC}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionLogicType}
	 * @return
	 */
	int getActionLogicType();
	
	
	/**
	 * 获取附加模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_ATTACHMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode}
	 * @return
	 */
	java.lang.String getAttachMode();
	
	
	/**
	 * 获取数据同步事件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_DATASYNCEVENT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSyncInformType}
	 * @return
	 */
	int getDataSyncEvent();
	
	
	/**
	 * 获取目标实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_DSTPSDEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_DSTPSDEACTIONID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_DSTPSDEDATASETID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_DSTPSDELOGICID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_ERRORCODE}
	 * @return
	 */
	int getErrorCode();
	
	
	/**
	 * 获取错误信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_ERRORMSG}
	 * @return
	 */
	java.lang.String getErrorInfo();
	
	
	/**
	 * 获取错误信息语言资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_ERRORPSLANRESID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_EXCEPTIONOBJ}
	 * @return
	 */
	java.lang.String getExceptionObj();
	
	
	/**
	 * 获取行为逻辑动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PROPERTYMAP}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getLogicParams();
	
	
	/**
	 * 获取主控关系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_MAJORPSDERID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSDEDATASYNCID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSDEFVALUERULEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSDEFID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSDELOGICID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSDEMAINSTATEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSDENOTIFYID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSSYSDELOGICNODEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSSYSSFPLUGINID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSSYSSEQUENCEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PSSYSTRANSLATORID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_PREPARELAST}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionPrepareLastMode}
	 * @return
	 */
	int getPrepareLastMode();
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否克隆传入参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_CLONEPARAMFLAG}
	 * @return
	 */
	boolean isCloneParam();
	
	
	/**
	 * 获取是否支持后台执行
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_LOGICHOLDER}
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否忽略异常
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_IGNOREEXCEPTION}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionLogicDTO#FIELD_VALIDFLAG}
	 * @return
	 */
	boolean isValid();
}