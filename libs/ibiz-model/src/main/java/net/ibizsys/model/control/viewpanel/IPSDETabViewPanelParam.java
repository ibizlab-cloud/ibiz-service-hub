package net.ibizsys.model.control.viewpanel;



/**
 * 实体分页视图面板参数模型对象接口
 *
 */
public interface IPSDETabViewPanelParam extends net.ibizsys.model.control.viewpanel.IPSDEViewPanelParam{

	
	
	/**
	 * 获取导航过滤项
	 * @return
	 */
	java.lang.String getNavFilter();
	
	
	/**
	 * 获取导航关系名称
	 * @return
	 */
	java.lang.String getNavPSDERName();
	
	
	/**
	 * 获取访问操作标识
	 * @return
	 */
	java.lang.String getPSDEOPPrivId();
	
	
	/**
	 * 获取标题图标
	 * @return
	 */
	java.lang.String getPSSysImageId();
}