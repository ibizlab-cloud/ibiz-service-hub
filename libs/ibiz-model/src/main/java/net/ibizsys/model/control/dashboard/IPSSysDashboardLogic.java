package net.ibizsys.model.control.dashboard;



/**
 * 系统数据看板部件逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysDashboardLogicDTO}运行时对象
 *
 */
public interface IPSSysDashboardLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取系统看板部件名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDashboardLogicDTO#FIELD_PSSYSDBPARTNAME}
	 * @return
	 */
	java.lang.String getPSSysDashboardPartName();
}