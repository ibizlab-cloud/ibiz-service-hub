package net.ibizsys.model.control.drctrl;



/**
 * 数据关系部件模型基础对象接口
 *
 */
public interface IPSDRCtrl extends net.ibizsys.model.control.IPSAjaxControl{

	
	
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
}