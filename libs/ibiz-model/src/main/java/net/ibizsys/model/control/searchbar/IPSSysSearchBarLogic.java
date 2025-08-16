package net.ibizsys.model.control.searchbar;



/**
 * 系统搜索栏部件逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysSearchBarLogicDTO}运行时对象
 *
 */
public interface IPSSysSearchBarLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取搜索栏项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSearchBarLogicDTO#FIELD_PSSYSSEARCHBARITEMNAME}
	 * @return
	 */
	java.lang.String getPSSysSearchBarItemName();
}