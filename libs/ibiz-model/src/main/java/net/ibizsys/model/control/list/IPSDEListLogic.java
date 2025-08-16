package net.ibizsys.model.control.list;



/**
 * 实体列表逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEListLogicDTO}运行时对象
 *
 */
public interface IPSDEListLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取列表项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListLogicDTO#FIELD_PSDELISTITEMNAME}
	 * @return
	 */
	java.lang.String getPSDEListItemName();
}