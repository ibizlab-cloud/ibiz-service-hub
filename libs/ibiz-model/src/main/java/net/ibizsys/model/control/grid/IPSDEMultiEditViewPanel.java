package net.ibizsys.model.control.grid;



/**
 * 实体多编辑视图面板部件模型对象接口
 *
 */
public interface IPSDEMultiEditViewPanel extends net.ibizsys.model.control.grid.IPSDEGrid{

	
	
	/**
	 * 获取嵌入应用视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getEmbeddedPSAppView();


	/**
	 * 获取嵌入应用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getEmbeddedPSAppViewMust();
	
	
	/**
	 * 获取面板样式
	 * @return
	 */
	java.lang.String getPanelStyle();
}