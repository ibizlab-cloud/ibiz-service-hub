package net.ibizsys.model.control;



/**
 * 导航参数容器基础对象接口
 *
 */
public interface IPSNavigateParamContainer{

	
	
	/**
	 * 获取导航上下文集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSNavigateContext> getPSNavigateContexts();
	
	/**
	 * 获取导航上下文集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSNavigateContext getPSNavigateContext(Object objKey, boolean bTryMode);
	
	/**
	 * 设置导航上下文集合
	 * @param list 导航上下文集合
	 */
	void setPSNavigateContexts(java.util.List<net.ibizsys.model.control.IPSNavigateContext> list);
	
	
	/**
	 * 获取导航参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSNavigateParam> getPSNavigateParams();
	
	/**
	 * 获取导航参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSNavigateParam getPSNavigateParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置导航参数集合
	 * @param list 导航参数集合
	 */
	void setPSNavigateParams(java.util.List<net.ibizsys.model.control.IPSNavigateParam> list);
}