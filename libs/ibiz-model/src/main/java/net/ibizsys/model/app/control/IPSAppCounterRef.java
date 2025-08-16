package net.ibizsys.model.app.control;



/**
 * 应用计数器引用模型对象接口
 *
 */
public interface IPSAppCounterRef extends net.ibizsys.model.control.counter.IPSSysCounterRef{

	
	
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