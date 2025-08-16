package net.ibizsys.model.control.ajax;



/**
 * 异步处理界面部件处理器模型对象接口
 *
 */
public interface IPSAjaxControlHandler extends net.ibizsys.model.control.IPSControlHandler
		,net.ibizsys.model.control.ajax.IPSAjaxHandler{

	
	
	/**
	 * 获取缓存范围
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlHandlerCacheScope}
	 * @return
	 */
	int getCacheScope();
	
	
	/**
	 * 获取缓存超时时长（毫秒）
	 * @return
	 */
	int getCacheTimeout();
	
	
	/**
	 * 获取统一状态监控属性
	 * @return
	 */
	java.lang.String getUniStateField();
	
	
	/**
	 * 获取缓存统一状态主键属性
	 * @return
	 */
	java.lang.String getUniStateKeyValue();
	
	
	/**
	 * 获取是否支持缓存
	 * @return
	 */
	boolean isEnableCache();
	
	
	/**
	 * 获取是否支持属性级权限
	 * @return
	 */
	boolean isEnableDEFieldPrivilege();
}