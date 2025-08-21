package net.ibizsys.model.app.view;



/**
 * 应用实体报表视图模型对象接口
 * <P>
 * 扩展父接口类型[DEREPORTVIEW]
 *
 */
public interface IPSAppDEReportView extends net.ibizsys.model.app.view.IPSAppDEView
		,net.ibizsys.model.app.view.IPSAppDESearchView{

	
	
	/**
	 * 获取打开数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditViewMarkOpenDataMode}
	 * @return
	 */
	java.lang.String getMarkOpenDataMode();
}