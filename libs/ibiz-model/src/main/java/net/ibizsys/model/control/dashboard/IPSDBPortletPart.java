package net.ibizsys.model.control.dashboard;



/**
 * <P>
 * 子接口扩展识别值 {@link #getPortletType}
 * <P>
 * 扩展父接口类型[PORTLET]
 *
 */
public interface IPSDBPortletPart extends net.ibizsys.model.control.IPSControl
		,net.ibizsys.model.control.IPSAjaxControl
		,net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.IPSUserControl
		,net.ibizsys.model.control.layout.IPSLayoutItem{

	
	
	/**
	 * 获取界面行为组展开模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UGExtractMode}
	 * @return
	 */
	java.lang.String getActionGroupExtractMode();
	
	
	/**
	 * 获取内容部件
	 * @return
	 */
	net.ibizsys.model.control.IPSControl getContentPSControl();


	/**
	 * 获取内容部件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControl getContentPSControlMust();
	
	
	/**
	 * 获取动态样式表
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取部件位置
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPos();


	/**
	 * 获取部件位置，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPosMust();
	
	
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
	 * 获取系统统一资源
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取系统统一资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取界面行为组对象
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup();


	/**
	 * 获取界面行为组对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust();
	
	
	/**
	 * 获取门户部件类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PortletType}
	 * @return
	 */
	java.lang.String getPortletType();
	
	
	/**
	 * 获取抬头
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TITLE}
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取标题栏关闭模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TITLEBARCLOSEMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GroupTitleBarCloseMode}
	 * @return
	 */
	int getTitleBarCloseMode();
	
	
	/**
	 * 获取抬头语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TITLEPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();


	/**
	 * 获取抬头语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取是否启用锚点
	 * @return
	 */
	boolean isEnableAnchor();
	
	
	/**
	 * 获取是否显式标题栏
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SHOWTITLEBAR}
	 * @return
	 */
	boolean isShowTitleBar();
}