package net.ibizsys.model.control.calendar;



/**
 * 系统日历部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO}运行时对象
 *
 */
public interface IPSSysCalendar extends net.ibizsys.model.control.calendar.IPSDECalendar{

	
	
	/**
	 * 获取日历项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.calendar.IPSSysCalendarItem> getPSSysCalendarItems();
	
	/**
	 * 获取日历项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.calendar.IPSSysCalendarItem getPSSysCalendarItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置日历项集合
	 * @param list 日历项集合
	 */
	void setPSSysCalendarItems(java.util.List<net.ibizsys.model.control.calendar.IPSSysCalendarItem> list);
}