package net.ibizsys.model.control;



/**
 * 异步处理界面部件参数模型基础对象接口
 *
 */
public interface IPSAjaxControlParam extends net.ibizsys.model.control.IPSControlParam{

	
	
	/**
	 * 获取是否默认加载
	 * @return
	 */
	boolean isAutoLoad();
	
	
	/**
	 * 获取显示处理提示
	 * @return
	 */
	java.lang.Boolean isShowBusyIndicator();
}