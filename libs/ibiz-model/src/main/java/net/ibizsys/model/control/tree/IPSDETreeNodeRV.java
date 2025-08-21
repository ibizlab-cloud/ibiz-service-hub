package net.ibizsys.model.control.tree;



/**
 * 实体树视图节点引用视图模型对象接口
 *
 */
public interface IPSDETreeNodeRV extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取引用视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getRefPSAppView();


	/**
	 * 获取引用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getRefPSAppViewMust();
}