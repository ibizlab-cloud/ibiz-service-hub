package net.ibizsys.model.control.form;



/**
 * 表单按钮成员模型对象接口
 * <P>
 * 扩展父接口类型[BUTTON]
 *
 */
public interface IPSDEFormButton extends net.ibizsys.model.control.form.IPSDEFormDetail
		,net.ibizsys.model.app.view.IPSUIActionItem
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取按钮行为类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormButtonActionType}
	 * @return
	 */
	java.lang.String getActionType();
	
	
	/**
	 * 获取边框样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BorderStyle}
	 * @return
	 */
	java.lang.String getBorderStyle();
	
	
	/**
	 * 获取按钮样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ButtonStyle}
	 * @return
	 */
	java.lang.String getButtonStyle();
	
	
	/**
	 * 获取动态标题绑定值项
	 * @return
	 */
	java.lang.String getCaptionItemName();
	
	
	/**
	 * 获取图标对齐
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ButtonIconAlign}
	 * @return
	 */
	java.lang.String getIconAlign();
	
	
	/**
	 * 获取界面行为（运行时内联）
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getInlinePSUIAction();


	/**
	 * 获取界面行为（运行时内联），不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getInlinePSUIActionMust();
	
	
	/**
	 * 获取调用表单项更新
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdate();


	/**
	 * 获取调用表单项更新，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdateMust();
	
	
	/**
	 * 获取调用界面行为
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取调用界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
	/**
	 * 获取参数选择视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getParamPickupPSAppView();


	/**
	 * 获取参数选择视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getParamPickupPSAppViewMust();
	
	
	/**
	 * 获取参数选择视图参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getParamViewParamJO();
	
	
	/**
	 * 获取操作提示信息
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取操作提示语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取操作提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
	
	
	/**
	 * 获取界面行为操作目标
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionTarget}
	 * @return
	 */
	java.lang.String getUIActionTarget();
}