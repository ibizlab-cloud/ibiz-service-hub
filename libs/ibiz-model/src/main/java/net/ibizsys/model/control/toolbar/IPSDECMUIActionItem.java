package net.ibizsys.model.control.toolbar;



/**
 * 上下文界面行为菜单项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO}运行时对象
 * <P>
 * 扩展父接口类型[DEUIACTION]
 *
 */
public interface IPSDECMUIActionItem extends net.ibizsys.model.control.toolbar.IPSDEContextMenuItem
		,net.ibizsys.model.app.view.IPSDEUIActionItem
		,net.ibizsys.model.app.view.IPSWFUIActionItem{

	
	
	/**
	 * 获取行为级别
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_ACTIONLEVEL}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionLevel}
	 * @return
	 */
	int getActionLevel();
	
	
	/**
	 * 获取界面行为组展开模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_GROUPEXTRACTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UGExtractMode}
	 * @return
	 */
	java.lang.String getGroupExtractMode();
	
	
	/**
	 * 获取界面行为对象，除了显式指定界面行为，其它类型{@link PSDETBItemDTO#FIELD_BTNACTIONTYPE}也会被仿真为界面行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_PSDEUIACTIONID}
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取界面行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
	/**
	 * 获取界面行为操作目标
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionTarget}
	 * @return
	 */
	java.lang.String getUIActionTarget();
	
	
	/**
	 * 获取是否启用点击切换模式
	 * @return
	 */
	boolean isEnableToggleMode();
	
	
	/**
	 * 获取是否隐藏
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_HIDDENITEM}
	 * @return
	 */
	boolean isHiddenItem();
}