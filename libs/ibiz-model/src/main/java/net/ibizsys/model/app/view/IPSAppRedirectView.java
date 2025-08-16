package net.ibizsys.model.app.view;



/**
 * 应用重定向视图模型基础对象接口
 *
 */
public interface IPSAppRedirectView extends net.ibizsys.model.app.view.IPSAppView{

	
	
	/**
	 * 获取重定向视图引用集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> getRedirectPSAppViewRefs();
	
	/**
	 * 获取重定向视图引用集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewRef getRedirectPSAppViewRef(Object objKey, boolean bTryMode);
	
	/**
	 * 设置重定向视图引用集合
	 * @param list 重定向视图引用集合
	 */
	void setRedirectPSAppViewRefs(java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list);
}