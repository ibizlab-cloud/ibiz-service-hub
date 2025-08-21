package net.ibizsys.model.app.view;



/**
 * 应用实体边栏导航视图视图模型基础对象接口
 * <P>
 * 导航部件以边栏形式呈现，支持定义边栏的放置位置
 *
 */
public interface IPSAppDESideBarExplorerView extends net.ibizsys.model.app.view.IPSAppDEExplorerView{

	
	
	/**
	 * 获取导航边栏位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ExpBarPos}
	 * @return
	 */
	java.lang.String getSideBarLayout();
}