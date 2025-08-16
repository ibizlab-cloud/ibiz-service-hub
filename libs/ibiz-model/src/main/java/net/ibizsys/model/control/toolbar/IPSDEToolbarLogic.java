package net.ibizsys.model.control.toolbar;



/**
 * 实体工具栏逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEToolbarLogicDTO}运行时对象
 *
 */
public interface IPSDEToolbarLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取工具栏项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEToolbarLogicDTO#FIELD_PSDETBITEMNAME}
	 * @return
	 */
	java.lang.String getPSDEToolbarItemName();
}