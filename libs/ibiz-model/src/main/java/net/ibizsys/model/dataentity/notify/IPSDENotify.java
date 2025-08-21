package net.ibizsys.model.dataentity.notify;



/**
 * 实体通知模型对象接口
 *
 */
public interface IPSDENotify extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取开始时间值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getBeginTimePSDEField();


	/**
	 * 获取开始时间值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getBeginTimePSDEFieldMust();
	
	
	/**
	 * 获取通知检查间隔
	 * @return
	 */
	int getCheckTimer();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取自定义条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取结束时间值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEndTimePSDEField();


	/**
	 * 获取结束时间值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEndTimePSDEFieldMust();
	
	
	/**
	 * 获取监控事件模型
	 * @return
	 */
	java.lang.String getEventModel();
	
	
	/**
	 * 获取监控事件集
	 * @return
	 */
	java.lang.String getEvents();
	
	
	/**
	 * 获取监控变化属性集
	 * @return
	 */
	java.lang.String getFields();
	
	
	/**
	 * 获取过滤器模型
	 * @return
	 */
	java.lang.String getFilterModel();
	
	
	/**
	 * 获取发送通知类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.InfomMsgType}
	 * @return
	 */
	int getMsgType();
	
	
	/**
	 * 获取延后通知间隔
	 * @return
	 */
	int getNotifyEnd();
	
	
	/**
	 * 获取提前通知间隔
	 * @return
	 */
	int getNotifyStart();
	
	
	/**
	 * 获取通知子类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NotifySubType}
	 * @return
	 */
	java.lang.String getNotifySubType();
	
	
	/**
	 * 获取通知标记
	 * @return
	 */
	java.lang.String getNotifyTag();
	
	
	/**
	 * 获取通知标记2
	 * @return
	 */
	java.lang.String getNotifyTag2();
	
	
	/**
	 * 获取数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取通知目标集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotifyTarget> getPSDENotifyTargets();
	
	/**
	 * 获取通知目标集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.notify.IPSDENotifyTarget getPSDENotifyTarget(Object objKey, boolean bTryMode);
	
	/**
	 * 设置通知目标集合
	 * @param list 通知目标集合
	 */
	void setPSDENotifyTargets(java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotifyTarget> list);
	
	
	/**
	 * 获取系统消息队列
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgQueue getPSSysMsgQueue();


	/**
	 * 获取系统消息队列，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgQueue getPSSysMsgQueueMust();
	
	
	/**
	 * 获取系统消息模板
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl();


	/**
	 * 获取系统消息模板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust();
	
	
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
	 * 获取附加任务模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DENotifyTaskMode}
	 * @return
	 */
	int getTaskMode();
	
	
	/**
	 * 获取线程模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicThreadRunMode}
	 * @return
	 */
	int getThreadMode();
	
	
	/**
	 * 获取是否忽略异常
	 * @return
	 */
	boolean isIgnoreException();
	
	
	/**
	 * 获取是否模板逻辑
	 * @return
	 */
	boolean isTemplate();
	
	
	/**
	 * 获取是否定时触发模式
	 * @return
	 */
	boolean isTimerMode();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}