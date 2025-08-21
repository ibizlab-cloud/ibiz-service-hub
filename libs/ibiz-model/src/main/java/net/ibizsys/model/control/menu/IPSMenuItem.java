package net.ibizsys.model.control.menu;



/**
 * 菜单部件项模型对象基础接口
 *
 */
public interface IPSMenuItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取访问用户模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AccessUserMode}
	 * @return
	 */
	int getAccUserMode();
	
	
	/**
	 * 获取访问标识，优先使用配置的系统统一资源代码，未定义时使用应用功能访问标识
	 * @return
	 */
	java.lang.String getAccessKey();
	
	
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
	 * 获取项类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppMenuItemType}
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取操作提示信息
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取操作提示语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取操作提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
	
	
	/**
	 * 获取是否默认展开菜单
	 * @return
	 */
	boolean isExpanded();
	
	
	/**
	 * 获取是否隐藏
	 * @return
	 */
	boolean isHidden();
}