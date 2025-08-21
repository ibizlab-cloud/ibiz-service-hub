package net.ibizsys.model.control.form;



/**
 * 实体编辑表单模型对象接口
 *
 */
public interface IPSDEEditForm extends net.ibizsys.model.control.form.IPSDEForm
		,net.ibizsys.model.control.IPSSDAjaxControl{

	
	
	/**
	 * 获取自动保存模式，视图部件模型{@link PSDEViewCtrlDTO#FIELD_CTRLPARAM5}优先定义
	 * @return
	 */
	int getAutoSaveMode();
	
	
	/**
	 * 获取建立数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getCreatePSControlAction();


	/**
	 * 获取建立数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getCreatePSControlActionMust();
	
	
	/**
	 * 获取表单数据类型
	 * @return
	 */
	java.lang.String getDataType();
	
	
	/**
	 * 获取获取草稿数据行为（拷贝）
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlAction();


	/**
	 * 获取获取草稿数据行为（拷贝），不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlActionMust();
	
	
	/**
	 * 获取获取草稿数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftPSControlAction();


	/**
	 * 获取获取草稿数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftPSControlActionMust();
	
	
	/**
	 * 获取获取数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetPSControlAction();


	/**
	 * 获取获取数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetPSControlActionMust();
	
	
	/**
	 * 获取导航栏样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getNavBarPSSysCss();


	/**
	 * 获取导航栏样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getNavBarPSSysCssMust();
	
	
	/**
	 * 获取导航栏位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NavBarPos}
	 * @return
	 */
	java.lang.String getNavBarPos();
	
	
	/**
	 * 获取导航栏样式
	 * @return
	 */
	java.lang.String getNavBarStyle();
	
	
	/**
	 * 获取导航栏宽度
	 * @return
	 */
	double getNavBarWidth();
	
	
	/**
	 * 获取导航栏高度
	 * @return
	 */
	double getNavbarHeight();
	
	
	/**
	 * 获取应用计数器引用
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();


	/**
	 * 获取应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	
	/**
	 * 获取删除数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getRemovePSControlAction();


	/**
	 * 获取删除数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getRemovePSControlActionMust();
	
	
	/**
	 * 获取更新数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUpdatePSControlAction();


	/**
	 * 获取更新数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUpdatePSControlActionMust();
	
	
	/**
	 * 获取是否支持自动保存
	 * @return
	 */
	boolean isEnableAutoSave();
	
	
	/**
	 * 获取是否支持自定义表单项
	 * @return
	 */
	boolean isEnableCustomized();
	
	
	/**
	 * 获取是否信息表单
	 * @return
	 */
	boolean isInfoFormMode();
	
	
	/**
	 * 获取是否显示表单导航栏
	 * @return
	 */
	boolean isShowFormNavBar();
}