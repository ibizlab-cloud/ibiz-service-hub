package net.ibizsys.model.control.panel;



/**
 * 系统面板部件逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO}运行时对象
 *
 */
public interface IPSSysPanelLogic2 extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取系统看板部件名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO#FIELD_PSSYSVIEWPANELITEMNAME}
	 * @return
	 */
	java.lang.String getPSSysPanelItemName();
}