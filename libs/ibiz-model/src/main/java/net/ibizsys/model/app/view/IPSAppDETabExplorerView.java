package net.ibizsys.model.app.view;



/**
 * 应用实体分页导航视图模型对象接口
 * <P>
 * 扩展父接口类型[DETABEXPVIEW,DETABEXPVIEW9]
 * <P>
 * 导航部件以分页形式呈现，支持定义分页部件的放置位置
 *
 */
public interface IPSAppDETabExplorerView extends net.ibizsys.model.app.view.IPSAppDEExplorerView{

	
	
	/**
	 * 获取分页部件布局模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TabViewTabPos}
	 * @return
	 */
	java.lang.String getTabLayout();
}