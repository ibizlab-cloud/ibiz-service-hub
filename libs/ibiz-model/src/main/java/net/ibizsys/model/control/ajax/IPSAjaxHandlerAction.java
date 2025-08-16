package net.ibizsys.model.control.ajax;



/**
 * 异步处理器行为模型对象接口
 *
 */
public interface IPSAjaxHandlerAction extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlHandlerAction
		,net.ibizsys.model.control.IPSControlAction{

	
	
	/**
	 * 获取行为描述
	 * @return
	 */
	java.lang.String getActionDesc();
	
	
	/**
	 * 获取行为类型
	 * @return
	 */
	java.lang.String getActionType();
	
	
	/**
	 * 获取处理超时时长（毫秒）
	 * @return
	 */
	int getTimeout();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}