package net.ibizsys.model.app.view;



/**
 * 应用界面行为模型对象接口
 *
 */
public interface IPSAppUIAction extends net.ibizsys.model.view.IPSUIAction
		,net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取行为附加上下文Json字符串
	 * @return
	 */
	java.lang.String getContextJOString();
	
	
	/**
	 * 获取计数项标识
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取应用计数器
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounter getPSAppCounter();


	/**
	 * 获取应用计数器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounter getPSAppCounterMust();
}