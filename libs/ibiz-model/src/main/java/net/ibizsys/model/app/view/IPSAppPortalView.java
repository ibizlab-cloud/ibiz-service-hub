package net.ibizsys.model.app.view;



/**
 * 应用数据看板视图模型对象接口
 * <P>
 * 扩展父接口类型[APPPORTALVIEW]
 *
 */
public interface IPSAppPortalView extends net.ibizsys.model.app.view.IPSAppView
		,net.ibizsys.model.app.view.IPSAppMobView{

	
	
	/**
	 * 获取是否应用起始视图
	 * @return
	 */
	boolean isDefaultPage();
}