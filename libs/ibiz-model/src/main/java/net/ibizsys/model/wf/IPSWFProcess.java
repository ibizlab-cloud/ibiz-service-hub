package net.ibizsys.model.wf;



/**
 * 工作流处理模型基础对象接口
 *
 */
public interface IPSWFProcess extends net.ibizsys.model.IPSObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取高度
	 * @return
	 */
	int getHeight();
	
	
	/**
	 * 获取左侧位置
	 * @return
	 */
	int getLeftPos();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取名称语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes();


	/**
	 * 获取名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust();
	
	
	/**
	 * 获取通知消息模板
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl();


	/**
	 * 获取通知消息模板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust();
	
	
	/**
	 * 获取处理连出集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFLink> getPSWFLinks();
	
	/**
	 * 获取处理连出集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFLink getPSWFLink(Object objKey, boolean bTryMode);
	
	/**
	 * 设置处理连出集合
	 * @param list 处理连出集合
	 */
	void setPSWFLinks(java.util.List<net.ibizsys.model.wf.IPSWFLink> list);
	
	
	/**
	 * 获取处理参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFProcessParam> getPSWFProcessParams();
	
	/**
	 * 获取处理参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFProcessParam getPSWFProcessParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置处理参数集合
	 * @param list 处理参数集合
	 */
	void setPSWFProcessParams(java.util.List<net.ibizsys.model.wf.IPSWFProcessParam> list);
	
	
	/**
	 * 获取流程工作时间
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFWorkTime getPSWFWorkTime();


	/**
	 * 获取流程工作时间，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFWorkTime getPSWFWorkTimeMust();
	
	
	/**
	 * 获取处理超时时长
	 * @return
	 */
	int getTimeout();
	
	
	/**
	 * 获取动态超时时长存放属性
	 * @return
	 */
	java.lang.String getTimeoutField();
	
	
	/**
	 * 获取处理超时单位
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFTimeoutType}
	 * @return
	 */
	java.lang.String getTimeoutType();
	
	
	/**
	 * 获取上方位置
	 * @return
	 */
	int getTopPos();
	
	
	/**
	 * 获取处理数据
	 * @return
	 */
	java.lang.String getUserData();
	
	
	/**
	 * 获取处理数据2
	 * @return
	 */
	java.lang.String getUserData2();
	
	
	/**
	 * 获取流程处理类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcessType}
	 * @return
	 */
	java.lang.String getWFProcessType();
	
	
	/**
	 * 获取流程步骤值
	 * @return
	 */
	java.lang.String getWFStepValue();
	
	
	/**
	 * 获取宽度
	 * @return
	 */
	int getWidth();
	
	
	/**
	 * 获取是否异步处理
	 * @return
	 */
	boolean isAsynchronousProcess();
	
	
	/**
	 * 获取是否启用处理超时
	 * @return
	 */
	boolean isEnableTimeout();
	
	
	/**
	 * 获取是否开始处理
	 * @return
	 */
	boolean isStartProcess();
	
	
	/**
	 * 获取是否终止处理
	 * @return
	 */
	boolean isTerminalProcess();
}