package net.ibizsys.model.app.view;



/**
 * 应用实体编辑视图模型对象接口
 * <P>
 * 扩展父接口类型[DEOPTVIEW,DEEDITVIEW,DEEDITVIEW2,DEEDITVIEW3,DEEDITVIEW4]
 *
 */
public interface IPSAppDEEditView extends net.ibizsys.model.app.view.IPSAppDEView
		,net.ibizsys.model.app.view.IPSAppDataRelationView
		,net.ibizsys.model.app.view.IPSAppDEXDataView{

	
	
	/**
	 * 获取打开数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditViewMarkOpenDataMode}
	 * @return
	 */
	java.lang.String getMarkOpenDataMode();
	
	
	/**
	 * 获取内置多表单模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditViewMultiFormMode}
	 * @return
	 */
	int getMultiFormMode();
	
	
	/**
	 * 获取是否启用脏检查
	 * @return
	 */
	boolean isEnableDirtyChecking();
	
	
	/**
	 * 获取是否隐藏编辑表单
	 * @return
	 */
	boolean isHideEditForm();
	
	
	/**
	 * 获取是否手动附加表单
	 * @return
	 */
	boolean isManualAppendForms();
	
	
	/**
	 * 获取是否显示信息栏
	 * @return
	 */
	boolean isShowDataInfoBar();
}