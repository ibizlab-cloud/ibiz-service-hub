package net.ibizsys.model.control.form;



/**
 * 实体表单成员模型基础对象接口
 *
 */
public interface IPSDEFormDetail extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
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
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取列水平对齐
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getColumnAlign();
	
	
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
	 * 获取成员直接样式
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取成员样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailStyle}
	 * @return
	 */
	java.lang.String getDetailStyle();
	
	
	/**
	 * 获取成员类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormDetailType}
	 * @return
	 */
	java.lang.String getDetailType();
	
	
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
	 * 获取成员标签样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCss();


	/**
	 * 获取成员标签样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCssMust();
	
	
	/**
	 * 获取模型状态
	 * @return
	 */
	int getModelState();
	
	
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
	 * 获取表单成员动态逻辑
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFDCatGroupLogic> getPSDEFDGroupLogics();
	
	/**
	 * 获取表单成员动态逻辑的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFDCatGroupLogic getPSDEFDCatGroupLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表单成员动态逻辑
	 * @param list 表单成员动态逻辑
	 */
	void setPSDEFDCatGroupLogics(java.util.List<net.ibizsys.model.control.form.IPSDEFDCatGroupLogic> list);
	
	
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
	 * 获取布局位置
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPos();


	/**
	 * 获取布局位置，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPosMust();
	
	
	/**
	 * 获取成员样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取成员样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取成员图标
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取成员图标，不存在时抛出异常
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
	 * 获取显示更多管理者，成员配置显式更多模式为受控内容(1)时获取配置为管理容器(2)的从父成员
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormDetail getShowMoreMgrPSDEFormDetail();


	/**
	 * 获取显示更多管理者，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormDetail getShowMoreMgrPSDEFormDetailMust();
	
	
	/**
	 * 获取显示更多模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormDetailShowMoreMode}
	 * @return
	 */
	int getShowMoreMode();
	
	
	/**
	 * 获取宽度
	 * @return
	 */
	double getWidth();
	
	
	/**
	 * 获取是否重复输出内容
	 * @return
	 */
	boolean isRepeatContent();
	
	
	/**
	 * 获取是否显示标题
	 * @return
	 */
	boolean isShowCaption();
}