package net.ibizsys.model.control.panel;



/**
 * 面板按钮项模型对象接口
 * <P>
 * 扩展父接口类型[BUTTON]
 *
 */
public interface IPSPanelButton extends net.ibizsys.model.control.panel.IPSPanelItem
		,net.ibizsys.model.app.view.IPSUIActionItem
		,net.ibizsys.model.control.IPSButtonBase{

	
	
	/**
	 * 获取按钮行为类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PanelButtonActionType}
	 * @return
	 */
	java.lang.String getActionType();
	
	
	/**
	 * 获取动态标题绑定值项
	 * @return
	 */
	java.lang.String getCaptionItemName();
	
	
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
	 * 获取调用界面行为，除了显式指定界面行为，其它类型{@link #getActionType}也会被仿真为界面行为
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取调用界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
	/**
	 * 获取操作提示信息
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取界面行为操作目标
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionTarget}
	 * @return
	 */
	java.lang.String getUIActionTarget();
}