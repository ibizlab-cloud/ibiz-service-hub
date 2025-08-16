package net.ibizsys.model.control.menu;



/**
 * 应用菜单部件逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppMenuLogicDTO}运行时对象
 *
 */
public interface IPSAppMenuLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取菜单项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppMenuLogicDTO#FIELD_PSAPPMENUITEMNAME}
	 * @return
	 */
	java.lang.String getPSAppMenuItemName();
}