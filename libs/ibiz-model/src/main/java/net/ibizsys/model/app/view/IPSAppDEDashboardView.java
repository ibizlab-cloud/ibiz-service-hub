package net.ibizsys.model.app.view;



/**
 * 应用实体数据看板视图模型对象接口
 * <P>
 * 扩展父接口类型[DEPORTALVIEW,DEPORTALVIEW9]
 *
 */
public interface IPSAppDEDashboardView extends net.ibizsys.model.app.view.IPSAppDEView
		,net.ibizsys.model.app.view.IPSAppDESearchView
		,net.ibizsys.model.app.view.IPSAppDESearchView2{

	
	
	/**
	 * 获取打开数据模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO#FIELD_VIEWPARAM13}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditViewMarkOpenDataMode}
	 * @return
	 */
	java.lang.String getMarkOpenDataMode();
	
	
	/**
	 * 获取是否显示信息栏
	 * @return
	 */
	boolean isShowDataInfoBar();
}