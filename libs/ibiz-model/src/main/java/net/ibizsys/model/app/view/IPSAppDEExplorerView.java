package net.ibizsys.model.app.view;



/**
 * 应用实体导航视图视图模型基础对象接口
 *
 */
public interface IPSAppDEExplorerView extends net.ibizsys.model.app.view.IPSAppExplorerView
		,net.ibizsys.model.app.view.IPSAppDEView{

	
	
	/**
	 * 获取打开数据模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_VIEWPARAM13}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditViewMarkOpenDataMode}
	 * @return
	 */
	java.lang.String getMarkOpenDataMode();
	
	
	/**
	 * 获取是否默认加载数据
	 * @return
	 */
	boolean isLoadDefault();
	
	
	/**
	 * 获取是否显示信息栏
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_VIEWPARAM6}
	 * @return
	 */
	boolean isShowDataInfoBar();
}