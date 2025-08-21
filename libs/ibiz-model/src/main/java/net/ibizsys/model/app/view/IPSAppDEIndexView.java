package net.ibizsys.model.app.view;



/**
 * 应用实体首页视图模型对象接口
 * <P>
 * 扩展父接口类型[DEINDEXVIEW]
 *
 */
public interface IPSAppDEIndexView extends net.ibizsys.model.app.view.IPSAppDEView
		,net.ibizsys.model.app.view.IPSAppDataRelationView{

	
	
	/**
	 * 获取打开数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditViewMarkOpenDataMode}
	 * @return
	 */
	java.lang.String getMarkOpenDataMode();
}