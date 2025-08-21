package net.ibizsys.model.control.viewpanel;



/**
 * 实体分页视图面板模型对象接口
 *
 */
public interface IPSDETabViewPanel extends net.ibizsys.model.control.viewpanel.IPSDEViewPanel
		,net.ibizsys.model.control.expbar.IPSTabExpPage{

	
	
	/**
	 * 获取计数器标识
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取导航过滤项
	 * @return
	 */
	java.lang.String getNavFilter();
	
	
	/**
	 * 获取导航关系对象
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDER();


	/**
	 * 获取导航关系对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDERMust();
	
	
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
	 * 获取访问操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取访问操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
	
	
	/**
	 * 获取标题图标
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取标题图标，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
}