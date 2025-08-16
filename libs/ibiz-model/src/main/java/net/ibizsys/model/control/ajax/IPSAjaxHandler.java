package net.ibizsys.model.control.ajax;



/**
 * 异步处理器模型基础对象接口
 *
 */
public interface IPSAjaxHandler extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取处理对象基类
	 * @return
	 */
	java.lang.String getHandlerObj();
	
	
	/**
	 * 获取处理对象标记
	 * @return
	 */
	java.lang.String getHandlerTag();
	
	
	/**
	 * 获取处理对象标记2
	 * @return
	 */
	java.lang.String getHandlerTag2();
	
	
	/**
	 * 获取处理行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlHandlerAction> getPSHandlerActions();
	
	/**
	 * 获取处理行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlHandlerAction getPSControlHandlerAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置处理行为集合
	 * @param list 处理行为集合
	 */
	void setPSControlHandlerActions(java.util.List<net.ibizsys.model.control.IPSControlHandlerAction> list);
}