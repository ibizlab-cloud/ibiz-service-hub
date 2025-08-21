package net.ibizsys.model.dataentity.action;



/**
 * 实体行为模型对象接口
 * <P>
 * 实体行为模型除了自身逻辑还包括了输入{@link #getPSDEActionInput}及返回{@link #getPSDEActionReturn}模型
 *
 */
public interface IPSDEAction extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.IPSModelSortable
		,net.ibizsys.model.res.IPSSysSFPluginSupportable{

	
	
	/**
	 * 获取行为持有者
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicHolder}
	 * @return
	 */
	int getActionHolder();
	
	
	/**
	 * 获取行为模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionMode}
	 * @return
	 */
	java.lang.String getActionMode();
	
	
	/**
	 * 获取行为动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getActionParams();
	
	
	/**
	 * 获取行为标记
	 * @return
	 */
	java.lang.String getActionTag();
	
	
	/**
	 * 获取行为标记2
	 * @return
	 */
	java.lang.String getActionTag2();
	
	
	/**
	 * 获取行为标记3
	 * @return
	 */
	java.lang.String getActionTag3();
	
	
	/**
	 * 获取行为标记4
	 * @return
	 */
	java.lang.String getActionTag4();
	
	
	/**
	 * 获取行为类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionType}
	 * @return
	 */
	java.lang.String getActionType();
	
	
	/**
	 * 获取执行后附加逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> getAfterPSDEActionLogics();
	
	/**
	 * 获取执行后附加逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionLogic getAfterPSDEActionLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置执行后附加逻辑集合
	 * @param list 执行后附加逻辑集合
	 */
	void setAfterPSDEActionLogics(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list);
	
	
	/**
	 * 获取批操作模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionBatchMode}
	 * @return
	 */
	int getBatchActionMode();
	
	
	/**
	 * 获取执行前附加逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> getBeforePSDEActionLogics();
	
	/**
	 * 获取执行前附加逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionLogic getBeforePSDEActionLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置执行前附加逻辑集合
	 * @param list 执行前附加逻辑集合
	 */
	void setBeforePSDEActionLogics(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list);
	
	
	/**
	 * 获取缓存超时
	 * @return
	 */
	int getCacheTimeout();
	
	
	/**
	 * 获取检查附加逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> getCheckPSDEActionLogics();
	
	/**
	 * 获取检查附加逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionLogic getCheckPSDEActionLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置检查附加逻辑集合
	 * @param list 检查附加逻辑集合
	 */
	void setCheckPSDEActionLogics(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取数据访问标识
	 * @return
	 */
	java.lang.String getDataAccessAction();
	
	
	/**
	 * 获取子系统扩展
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEExtendMode}
	 * @return
	 */
	int getExtendMode();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取行为次序
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取性能优化预警时长（ms）
	 * @return
	 */
	int getPOTime();
	
	
	/**
	 * 获取调用输入对象
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionInput getPSDEActionInput();


	/**
	 * 获取调用输入对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionInput getPSDEActionInputMust();
	
	
	/**
	 * 获取行为参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> getPSDEActionParams();
	
	/**
	 * 获取行为参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionParam getPSDEActionParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置行为参数集合
	 * @param list 行为参数集合
	 */
	void setPSDEActionParams(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> list);
	
	
	/**
	 * 获取调用返回对象
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionReturn getPSDEActionReturn();


	/**
	 * 获取调用返回对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionReturn getPSDEActionReturnMust();
	
	
	/**
	 * 获取行为附加值规则集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionVR> getPSDEActionVRs();
	
	/**
	 * 获取行为附加值规则集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionVR getPSDEActionVR(Object objKey, boolean bTryMode);
	
	/**
	 * 设置行为附加值规则集合
	 * @param list 行为附加值规则集合
	 */
	void setPSDEActionVRs(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionVR> list);
	
	
	/**
	 * 获取服务访问操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取服务访问操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
	
	
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
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取测试用例集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestCase> getPSSysTestCases();
	
	/**
	 * 获取测试用例集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestCase getPSSysTestCase(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试用例集合
	 * @param list 测试用例集合
	 */
	void setPSSysTestCases(java.util.List<net.ibizsys.model.testing.IPSSysTestCase> list);
	
	
	/**
	 * 获取缓存统一状态对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUniState getPSSysUniState();


	/**
	 * 获取缓存统一状态对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUniState getPSSysUniStateMust();
	
	
	/**
	 * 获取行为参数模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionParamMode}
	 * @return
	 */
	int getParamMode();
	
	
	/**
	 * 获取预定义类型
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取预定义类型参数
	 * @return
	 */
	java.lang.String getPredefinedTypeParam();
	
	
	/**
	 * 获取准备操作之前数据模式，由行为的附加逻辑决定{@link IPSDEActionLogic#isPrepareLast}（存在需要准备操作之前数据）
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionPrepareLastMode}
	 * @return
	 */
	int getPrepareLastMode();
	
	
	/**
	 * 获取准备附加逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> getPreparePSDEActionLogics();
	
	/**
	 * 获取准备附加逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionLogic getPreparePSDEActionLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置准备附加逻辑集合
	 * @param list 准备附加逻辑集合
	 */
	void setPreparePSDEActionLogics(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list);
	
	
	/**
	 * 获取实际执行行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getRealPSDEAction();


	/**
	 * 获取实际执行行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getRealPSDEActionMust();
	
	
	/**
	 * 获取同步事件
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionSyncEvent}
	 * @return
	 */
	int getSyncEvent();
	
	
	/**
	 * 获取临时数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TempDataMode}
	 * @return
	 */
	int getTempDataMode();
	
	
	/**
	 * 获取测试行为模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionTestActionMode}
	 * @return
	 */
	int getTestActionMode();
	
	
	/**
	 * 获取调用超时
	 * @return
	 */
	int getTimeOut();
	
	
	/**
	 * 获取事务模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionTSMode}
	 * @return
	 */
	java.lang.String getTransactionMode();
	
	
	/**
	 * 获取是否异步操作行为
	 * @return
	 */
	boolean isAsyncAction();
	
	
	/**
	 * 获取是否批操作行为
	 * @return
	 */
	boolean isBatchAction();
	
	
	/**
	 * 获取是否预置行为
	 * @return
	 */
	boolean isBuiltinAction();
	
	
	/**
	 * 获取是否自定义行为参数，是否有设置行为参数
	 * @return
	 */
	boolean isCustomParam();
	
	
	/**
	 * 获取是否启用访问审计
	 * @return
	 */
	boolean isEnableAudit();
	
	
	/**
	 * 获取是否支持后台执行，参考 {@link #getActionHolder}
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否启用缓存
	 * @return
	 */
	boolean isEnableCache();
	
	
	/**
	 * 获取是否支持前台执行，参考 {@link #getActionHolder}
	 * @return
	 */
	boolean isEnableFront();
	
	
	/**
	 * 获取是否支持临时数据
	 * @return
	 */
	boolean isEnableTempData();
	
	
	/**
	 * 获取是否准备操作之前数据，由行为的附加逻辑决定{@link IPSDEActionLogic#isPrepareLast}（存在需要准备操作之前数据）
	 * @return
	 */
	boolean isPrepareLast();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}