package net.ibizsys.model.control;



/**
 * 界面部件模型基础对象接口
 *
 */
public interface IPSControl extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取部件样式
	 * @return
	 */
	java.lang.String getControlStyle();
	
	
	/**
	 * 获取部件类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlType}
	 * @return
	 */
	java.lang.String getControlType();
	
	
	/**
	 * 获取动态系统模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ControlDynaSysMode}
	 * @return
	 */
	int getDynaSysMode();
	
	
	/**
	 * 获取控件高度
	 * @return
	 */
	double getHeight();
	
	
	/**
	 * 获取监控事件名称集合
	 * @return
	 */
	java.util.List<java.lang.String> getHookEventNames();
	
	
	/**
	 * 获取部件逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取部件注入属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlAttribute> getPSControlAttributes();
	
	/**
	 * 获取部件注入属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlAttribute getPSControlAttribute(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件注入属性集合
	 * @param list 部件注入属性集合
	 */
	void setPSControlAttributes(java.util.List<net.ibizsys.model.control.IPSControlAttribute> list);
	
	
	/**
	 * 获取部件处理
	 * @return
	 */
	net.ibizsys.model.control.IPSControlHandler getPSControlHandler();


	/**
	 * 获取部件处理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlHandler getPSControlHandlerMust();
	
	
	/**
	 * 获取部件逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlLogic> getPSControlLogics();
	
	/**
	 * 获取部件逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlLogic getPSControlLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件逻辑集合
	 * @param list 部件逻辑集合
	 */
	void setPSControlLogics(java.util.List<net.ibizsys.model.control.IPSControlLogic> list);
	
	
	/**
	 * 获取部件参数
	 * @return
	 */
	net.ibizsys.model.control.IPSControlParam getPSControlParam();


	/**
	 * 获取部件参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlParam getPSControlParamMust();
	
	
	/**
	 * 获取部件绘制器集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlRender> getPSControlRenders();
	
	/**
	 * 获取部件绘制器集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlRender getPSControlRender(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件绘制器集合
	 * @param list 部件绘制器集合
	 */
	void setPSControlRenders(java.util.List<net.ibizsys.model.control.IPSControlRender> list);
	
	
	/**
	 * 获取部件消息
	 * @return
	 */
	net.ibizsys.model.res.IPSCtrlMsg getPSCtrlMsg();


	/**
	 * 获取部件消息，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSCtrlMsg getPSCtrlMsgMust();
	
	
	/**
	 * 获取界面样式
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取界面样式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
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
	 * 获取部件优先级
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ControlPriority}
	 * @return
	 */
	int getPriority();
	
	
	/**
	 * 获取用户自定义行为2
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUser2PSControlAction();


	/**
	 * 获取用户自定义行为2，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUser2PSControlActionMust();
	
	
	/**
	 * 获取用户自定义行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUserPSControlAction();


	/**
	 * 获取用户自定义行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUserPSControlActionMust();
	
	
	/**
	 * 获取控件宽度
	 * @return
	 */
	double getWidth();
}