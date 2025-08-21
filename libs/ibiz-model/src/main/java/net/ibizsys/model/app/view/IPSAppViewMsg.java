package net.ibizsys.model.app.view;



/**
 * 应用视图消息模型对象接口
 *
 */
public interface IPSAppViewMsg extends net.ibizsys.model.view.IPSViewMsg
		,net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取启用判断操作标识
	 * @return
	 */
	java.lang.String getDataAccessAction();
	
	
	/**
	 * 获取动态模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgDynamicMode}
	 * @return
	 */
	int getDynamicMode();
	
	
	/**
	 * 获取视图消息启用模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgEnableMode}
	 * @return
	 */
	java.lang.String getEnableMode();
	
	
	/**
	 * 获取显示消息
	 * @return
	 */
	java.lang.String getMessage();
	
	
	/**
	 * 获取消息类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgType}
	 * @return
	 */
	java.lang.String getMessageType();
	
	
	/**
	 * 获取启用判断实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取启用判断实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取应用消息模板
	 * @return
	 */
	net.ibizsys.model.app.msg.IPSAppMsgTempl getPSAppMsgTempl();


	/**
	 * 获取应用消息模板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.msg.IPSAppMsgTempl getPSAppMsgTemplMust();
	
	
	/**
	 * 获取布局面板
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanel();


	/**
	 * 获取布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanelMust();
	
	
	/**
	 * 获取系统界面样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取系统界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取系统图片
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取系统图片，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取显示位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgPos}
	 * @return
	 */
	java.lang.String getPosition();
	
	
	/**
	 * 获取消息删除模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgRemoveMode}
	 * @return
	 */
	int getRemoveMode();
	
	
	/**
	 * 获取启用判断实体逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getTestPSAppDELogic();


	/**
	 * 获取启用判断实体逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getTestPSAppDELogicMust();
	
	
	/**
	 * 获取启用判断操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPriv();


	/**
	 * 获取启用判断操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPrivMust();
	
	
	/**
	 * 获取启用判断脚本
	 * @return
	 */
	java.lang.String getTestScriptCode();
	
	
	/**
	 * 获取抬头
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取抬头语言资源标记
	 * @return
	 */
	java.lang.String getTitleLanResTag();
	
	
	/**
	 * 获取抬头语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();


	/**
	 * 获取抬头语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取是否支持关闭
	 * @return
	 */
	boolean isEnableRemove();
}