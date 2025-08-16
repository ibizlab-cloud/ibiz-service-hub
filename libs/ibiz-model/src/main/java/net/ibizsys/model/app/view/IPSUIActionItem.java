package net.ibizsys.model.app.view;



/**
 * 界面行为项模型对象接口
 *
 */
public interface IPSUIActionItem extends net.ibizsys.model.app.view.IPSAppViewUIAction{

	
	
	/**
	 * 获取应用视图界面行为
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewUIAction getPSAppViewUIAction();


	/**
	 * 获取应用视图界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewUIAction getPSAppViewUIActionMust();
}