package net.ibizsys.model.control.calendar;



/**
 * 系统日历部件逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysCalendarLogicDTO}运行时对象
 *
 */
public interface IPSSysCalendarLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取日历项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysCalendarLogicDTO#FIELD_PSSYSCALENDARITEMNAME}
	 * @return
	 */
	java.lang.String getPSSysCalendarItemName();
}