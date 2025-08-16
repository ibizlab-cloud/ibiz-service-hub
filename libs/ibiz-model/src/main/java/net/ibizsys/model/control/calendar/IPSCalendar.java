package net.ibizsys.model.control.calendar;



/**
 * 日历部件模型基础对象接口
 *
 */
public interface IPSCalendar extends net.ibizsys.model.control.IPSMDAjaxControl
		,net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.IPSControlNavigatable
		,net.ibizsys.model.control.IPSMDControl2{

	
	
	/**
	 * 获取日历样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CALENDARSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CalendarStyle}
	 * @return
	 */
	java.lang.String getCalendarStyle();
	
	
	/**
	 * 获取无值显示内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_EMPTYTEXT}
	 * @return
	 */
	java.lang.String getEmptyText();
	
	
	/**
	 * 获取无值内容语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_EMPTYTEXTPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes();


	/**
	 * 获取无值内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust();
	
	
	/**
	 * 获取是否支持编辑，由部件参数{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_CTRLPARAM6}定义
	 * @return
	 */
	boolean isEnableEdit();
}