package net.ibizsys.model.app.view;



/**
 * 移动端应用视图模型基础对象接口
 *
 */
public interface IPSAppMobView extends net.ibizsys.model.app.view.IPSAppView{

	
	
	/**
	 * 获取是否支持下拉刷新
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_VIEWPARAM9}
	 * @return
	 */
	boolean isEnablePullDownRefresh();
}