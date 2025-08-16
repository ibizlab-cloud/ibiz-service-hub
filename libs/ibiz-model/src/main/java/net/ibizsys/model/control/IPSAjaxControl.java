package net.ibizsys.model.control;



/**
 * 异步处理界面部件模型基础对象接口
 *
 */
public interface IPSAjaxControl extends net.ibizsys.model.control.IPSControl{

	
	
	/**
	 * 获取是否默认加载
	 * @return
	 */
	boolean isAutoLoad();
	
	
	/**
	 * 获取是否启用项权限
	 * @return
	 */
	boolean isEnableItemPrivilege();
	
	
	/**
	 * 获取是否显示处理提示
	 * @return
	 */
	boolean isShowBusyIndicator();
}