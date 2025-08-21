package net.ibizsys.model.control.toolbar;



/**
 * 工具栏项模型对象接口
 *
 */
public interface IPSDEToolbarItem extends net.ibizsys.model.IPSModelObject
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
	 * 获取项数据
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取动态样式表
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取工具栏项高度
	 * @return
	 */
	double getHeight();
	
	
	/**
	 * 获取项类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TBItemType}
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取系统样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取系统样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取图标资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图标资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取前端应用插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端应用插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取工具提示
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取提示语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
	
	
	/**
	 * 获取用户标记
	 * @return
	 */
	java.lang.String getUserTag();
	
	
	/**
	 * 获取用户标记2
	 * @return
	 */
	java.lang.String getUserTag2();
	
	
	/**
	 * 获取工具栏项宽度
	 * @return
	 */
	double getWidth();
	
	
	/**
	 * 获取是否显示标题
	 * @return
	 */
	boolean isShowCaption();
	
	
	/**
	 * 获取是否显示图标
	 * @return
	 */
	boolean isShowIcon();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}