package net.ibizsys.model.control.panel;



/**
 * 面板项模型对象基础接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getItemType}
 *
 */
public interface IPSPanelItem extends net.ibizsys.model.control.panel.IPSPanelObject
		,net.ibizsys.model.control.IPSControlItem
		,net.ibizsys.model.control.layout.IPSLayoutItem{

	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_CAPPSLANRESID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_CAPTION}
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
	 * 获取项直接样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_RAWCSSSTYLE}
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_DYNACLASS}
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取高度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_HEIGHT}
	 * @return
	 */
	double getHeight();
	
	
	/**
	 * 获取成员样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_DETAILSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailStyle}
	 * @return
	 */
	java.lang.String getItemStyle();
	
	
	/**
	 * 获取成员类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_ITEMTYPE}
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取标签直接样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_LABELRAWCSSSTYLE}
	 * @return
	 */
	java.lang.String getLabelCssStyle();
	
	
	/**
	 * 获取标签动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_LABELDYNACLASS}
	 * @return
	 */
	java.lang.String getLabelDynaClass();
	
	
	/**
	 * 获取标签样式表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_LABELPSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCss();


	/**
	 * 获取标签样式表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCssMust();
	
	
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_PSSYSCSSID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_PSSYSIMAGEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_WIDTH}
	 * @return
	 */
	double getWidth();
	
	
	/**
	 * 获取是否显示标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_SHOWCAPTION}
	 * @return
	 */
	boolean isShowCaption();
}