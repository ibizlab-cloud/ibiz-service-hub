package net.ibizsys.model.control.editor;



/**
 * 日期时间选择编辑器模型对象接口
 * <P>
 * 扩展父接口类型[MOBDATE,DATEPICKER,DATEPICKEREX,DATEPICKEREX_HOUR,DATEPICKEREX_NODAY,DATEPICKEREX_MINUTE,DATEPICKEREX_NOTIME,DATEPICKEREX_SECOND,DATEPICKEREX_NODAY_NOSECOND]
 *
 */
public interface IPSDatePicker extends net.ibizsys.model.control.IPSEditor{

	
	
	/**
	 * 获取日期时间格式
	 * @return
	 */
	java.lang.String getDateTimeFormat();
}