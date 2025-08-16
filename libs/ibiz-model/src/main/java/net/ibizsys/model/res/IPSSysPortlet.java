package net.ibizsys.model.res;



/**
 * 系统门户部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO}运行时对象
 *
 */
public interface IPSSysPortlet extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取界面行为组展开模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_GROUPEXTRACTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UGExtractMode}
	 * @return
	 */
	java.lang.String getActionGroupExtractMode();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取空白显示内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_EMPTYTEXT}
	 * @return
	 */
	java.lang.String getEmptyText();
	
	
	/**
	 * 获取空白内容语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_EMPTYTEXTPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes();


	/**
	 * 获取空白内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust();
	
	
	/**
	 * 获取高度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_HEIGHT}
	 * @return
	 */
	int getHeight();
	
	
	/**
	 * 获取系统界面样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_PSSYSCSSID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取系统图片，不存在时抛出异常
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
	 * 获取系统统一资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_PSSYSUNIRESID}
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取系统统一资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取部件动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_PORTLETPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getPortletParams();
	
	
	/**
	 * 获取预置样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_PORTLETSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailStyle}
	 * @return
	 */
	java.lang.String getPortletStyle();
	
	
	/**
	 * 获取部件类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_PORTLETTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PortletType}
	 * @return
	 */
	java.lang.String getPortletType();
	
	
	/**
	 * 获取刷新间隔（毫秒）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_RELOADTIMER}
	 * @return
	 */
	int getReloadTimer();
	
	
	/**
	 * 获取模板引擎
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_TEMPLENGINE}
	 * @return
	 */
	java.lang.String getTemplEngine();
	
	
	/**
	 * 获取抬头
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取抬头语言资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_TITLEPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();


	/**
	 * 获取抬头语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取抬头绘制应用插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getTitlePSSysPFPlugin();


	/**
	 * 获取抬头绘制应用插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getTitlePSSysPFPluginMust();
	
	
	/**
	 * 获取是否支持应用全局数据看板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_DASHBOARDSCOPE}
	 * @return
	 */
	boolean isEnableAppDashboard();
	
	
	/**
	 * 获取是否支持实体数据看板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_DASHBOARDSCOPE}
	 * @return
	 */
	boolean isEnableDEDashboard();
	
	
	/**
	 * 获取是否显示抬头栏
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO#FIELD_SHOWTITLEBAR}
	 * @return
	 */
	boolean isShowTitleBar();
}