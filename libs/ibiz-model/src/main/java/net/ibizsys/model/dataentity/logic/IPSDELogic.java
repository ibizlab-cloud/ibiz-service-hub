package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getLogicSubType}
 *
 */
public interface IPSDELogic extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.dataentity.logic.IPSDELogicBase
		,net.ibizsys.model.res.IPSSysSFPluginSupportable{

	
	
	/**
	 * 获取附加模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_ATTACHMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode}
	 * @return
	 */
	java.lang.String getAttachMode();
	
	
	/**
	 * 获取附加到指定行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_ATTACHTOPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getAttachToPSDEAction();


	/**
	 * 获取附加到指定行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getAttachToPSDEActionMust();
	
	
	/**
	 * 获取附加到指定数据集
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_ATTACHTOPSDEDATASETID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getAttachToPSDEDataSet();


	/**
	 * 获取附加到指定数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getAttachToPSDEDataSetMust();
	
	
	/**
	 * 获取调试模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_DEBUGMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicDebugMode}
	 * @return
	 */
	int getDebugMode();
	
	
	/**
	 * 获取默认参数名称
	 * @return
	 */
	java.lang.String getDefaultParamName();
	
	
	/**
	 * 获取监控事件模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_EVENTMODEL}
	 * @return
	 */
	java.lang.String getEventModel();
	
	
	/**
	 * 获取监控事件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_EVENTS}
	 * @return
	 */
	java.lang.String getEvents();
	
	
	/**
	 * 获取逻辑子类
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_LOGICSUBTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LogicSubType}
	 * @return
	 */
	java.lang.String getLogicSubType();
	
	
	/**
	 * 获取逻辑处理集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNode> getPSDELogicNodes();
	
	/**
	 * 获取逻辑处理集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicNode getPSDELogicNode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑处理集合
	 * @param list 逻辑处理集合
	 */
	void setPSDELogicNodes(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNode> list);
	
	
	/**
	 * 获取逻辑参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicParam> getPSDELogicParams();
	
	/**
	 * 获取逻辑参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getPSDELogicParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑参数集合
	 * @param list 逻辑参数集合
	 */
	void setPSDELogicParams(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicParam> list);
	
	
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
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取开始处理节点
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicNode getStartPSDELogicNode();


	/**
	 * 获取开始处理节点，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicNode getStartPSDELogicNodeMust();
	
	
	/**
	 * 获取线程模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_THREADRUNMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicThreadRunMode}
	 * @return
	 */
	int getThreadMode();
	
	
	/**
	 * 获取定时触发策略
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_TIMERPOLICY}
	 * @return
	 */
	java.lang.String getTimerPolicy();
	
	
	/**
	 * 获取是否自定义脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_CUSTOMMODE}
	 * @return
	 */
	boolean isCustomCode();
	
	
	/**
	 * 获取是否支持后台执行
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否支持前台执行
	 * @return
	 */
	boolean isEnableFront();
	
	
	/**
	 * 获取是否忽略异常
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_IGNOREEXCEPTION}
	 * @return
	 */
	boolean isIgnoreException();
	
	
	/**
	 * 获取是否模板逻辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_TEMPLFLAG}
	 * @return
	 */
	boolean isTemplate();
	
	
	/**
	 * 获取是否启用
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_VALIDFLAG}
	 * @return
	 */
	boolean isValid();
}