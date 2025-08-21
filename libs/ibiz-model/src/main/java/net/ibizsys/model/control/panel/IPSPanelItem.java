package net.ibizsys.model.control.panel;



/**
 * 面板项模型对象基础接口
 *
 */
public interface IPSPanelItem extends net.ibizsys.model.control.panel.IPSPanelObject
		,net.ibizsys.model.control.IPSControlItem
		,net.ibizsys.model.control.layout.IPSLayoutItem{

	
	
	/**
	 * 获取标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取内容高度
	 * @return
	 */
	double getContentHeight();
	
	
	/**
	 * 获取内容宽度
	 * @return
	 */
	double getContentWidth();
	
	
	/**
	 * 获取计数器标识
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取计数器模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeCounterMode}
	 * @return
	 */
	int getCounterMode();
	
	
	/**
	 * 获取项直接样式
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取动态样式表
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取高度
	 * @return
	 */
	double getHeight();
	
	
	/**
	 * 获取成员样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailStyle}
	 * @return
	 */
	java.lang.String getItemStyle();
	
	
	/**
	 * 获取成员类型
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取标签直接样式
	 * @return
	 */
	java.lang.String getLabelCssStyle();
	
	
	/**
	 * 获取标签动态样式表
	 * @return
	 */
	java.lang.String getLabelDynaClass();
	
	
	/**
	 * 获取标签样式表对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCss();


	/**
	 * 获取标签样式表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCssMust();
	
	
	/**
	 * 获取应用计数器引用
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();


	/**
	 * 获取应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	
	/**
	 * 获取布局设置
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayout getPSLayout();


	/**
	 * 获取布局设置，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayout getPSLayoutMust();
	
	
	/**
	 * 获取位置
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPos();


	/**
	 * 获取位置，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPosMust();
	
	
	/**
	 * 获取面板成员动态逻辑
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.panel.IPSPanelItemCatGroupLogic> getPSPanelItemGroupLogics();
	
	/**
	 * 获取面板成员动态逻辑的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.panel.IPSPanelItemCatGroupLogic getPSPanelItemCatGroupLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置面板成员动态逻辑
	 * @param list 面板成员动态逻辑
	 */
	void setPSPanelItemCatGroupLogics(java.util.List<net.ibizsys.model.control.panel.IPSPanelItemCatGroupLogic> list);
	
	
	/**
	 * 获取界面样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取图片对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图片对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
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
	 * 获取宽度
	 * @return
	 */
	double getWidth();
	
	
	/**
	 * 获取是否显示标题
	 * @return
	 */
	boolean isShowCaption();
}