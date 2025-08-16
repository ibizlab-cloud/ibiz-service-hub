package net.ibizsys.central.control;

/**
 * 编辑器类型
 * @author lionlau
 *
 */
public class EditorTypes {

	public final static String AC = "AC";//自动填充
	public final static String AC_FS = "AC_FS";//自动填充（只能选择）
	public final static String AC_FS_NOBUTTON = "AC_FS_NOBUTTON";//自动填充（只能选择、无按钮）
	public final static String AC_NOBUTTON = "AC_NOBUTTON";//自动填充（无按钮）
	public final static String ADDRESSPICKUP = "ADDRESSPICKUP";//地址框（选择）
	public final static String ADDRESSPICKUP_AC = "ADDRESSPICKUP_AC";//地址框（支持选择、AC）
	public final static String CHECKBOX = "CHECKBOX";//选项框
	public final static String CHECKBOXLIST = "CHECKBOXLIST";//选项框列表
	public final static String DATEPICKER = "DATEPICKER";//时间选择器(新）
	public final static String DATEPICKEREX = "DATEPICKEREX";//时间选择控件
	public final static String DATEPICKEREX_HOUR = "DATEPICKEREX_HOUR";//时间选择控件_小时
	public final static String DATEPICKEREX_MINUTE = "DATEPICKEREX_MINUTE";//时间选择控件_分钟
	public final static String DATEPICKEREX_NODAY = "DATEPICKEREX_NODAY";//时间选择控件_无日期
	public final static String DATEPICKEREX_NODAY_NOSECOND = "DATEPICKEREX_NODAY_NOSECOND";//时间选择控件_无日期无秒钟
	public final static String DATEPICKEREX_NOTIME = "DATEPICKEREX_NOTIME";//时间选择控件_无小时
	public final static String DATEPICKEREX_SECOND = "DATEPICKEREX_SECOND";//时间选择控件_秒钟
	public final static String DROPDOWNLIST = "DROPDOWNLIST";//下拉列表框
	public final static String DROPDOWNLIST_100 = "DROPDOWNLIST_100";//下拉列表框（100宽度）
	public final static String FILEUPLOADER = "FILEUPLOADER";//文件上传控件
	public final static String FILEUPLOADER_ONE = "FILEUPLOADERONE";//文件上传控件（单项）
	public final static String HIDDEN = "HIDDEN";//隐藏表单项
	public final static String HTMLEDITOR = "HTMLEDITOR";//HTML编辑框
	public final static String IPADDRESSTEXTBOX = "IPADDRESSTEXTBOX";//IP地址输入框
	public final static String LISTBOX = "LISTBOX";//列表框
	public final static String LISTBOXPICKUP = "LISTBOXPICKUP";//列表框（选择）
	public final static String MDROPDOWNLIST = "MDROPDOWNLIST";//下拉列表框（多选）
	public final static String MOB2DBARCODEREADER = "MOB2DBARCODEREADER";//移动端二维码阅读器
	public final static String MOBBARCODEREADER = "MOBBARCODEREADER";//移动端条码阅读器
	public final static String MOBCHECKLIST = "MOBCHECKLIST";//移动端下拉列表(多选)
	public final static String MOBDATE = "MOBDATE";//移动端时间选择器
	public final static String MOBDROPDOWNLIST = "MOBDROPDOWNLIST";//移动端下拉列表(单选)
	public final static String MOBHTMLTEXT = "MOBHTMLTEXT";//移动端HTML编辑框
	public final static String MOBMPICKER = "MOBMPICKER";//移动端多数据选择
	public final static String MOBMULTIFILEUPLOAD = "MOBMULTIFILEUPLOAD";//移动端文件上传(多选)
	public final static String MOBNUMBER = "MOBNUMBER";//移动端数值框
	public final static String MOBPASSWORD = "MOBPASSWORD";//移动端密码框
	public final static String MOBPICKER = "MOBPICKER";//移动端数据选择
	public final static String MOBPICKER_DROPDOWNVIEW = "MOBPICKER_DROPDOWNVIEW";//移动端数据选择（下拉视图）
	public final static String MOBPICTURE = "MOBPICTURE";//移动端图片选择(单选)
	public final static String MOBPICTURELIST = "MOBPICTURELIST";//移动端图片选择(多选)
	public final static String MOBRADIOLIST = "MOBRADIOLIST";//移动端单选项列表
	public final static String MOBRATING = "MOBRATING";//移动端评分器
	public final static String MOBSINGLEFILEUPLOAD = "MOBSINGLEFILEUPLOAD";//移动端文件上传(单选)
	public final static String MOBSLIDER = "MOBSLIDER";//移动端滑动输入条
	public final static String MOBSTEPPER = "MOBSTEPPER";//移动端步进器
	public final static String MOBSWITCH = "MOBSWITCH";//移动端开关部件
	public final static String MOBTEXT = "MOBTEXT";//移动端文本框
	public final static String MOBTEXTAREA = "MOBTEXTAREA";//移动端多行文本
	public final static String NUMBER = "NUMBER";//数值框
	public final static String OFFICEEDITOR = "OFFICEEDITOR";//Office文档编辑器
	public final static String OFFICEEDITOR2 = "OFFICEEDITOR2";//Office文档编辑器2（弹出编辑，返回内容）
	public final static String PASSWORD = "PASSWORD";//密码框
	public final static String PICKER = "PICKER";//数据选择
	public final static String PICKEREX_DROPDOWNVIEW = "PICKEREX_DROPDOWNVIEW";//数据选择（下拉视图）
	public final static String PICKEREX_DROPDOWNVIEW_LINK = "PICKEREX_DROPDOWNVIEW_LINK";//数据选择（下拉视图、数据链接）
	public final static String PICKEREX_LINK = "PICKEREX_LINK";//数据选择（数据链接）
	public final static String PICKEREX_LINKONLY = "PICKEREX_LINKONLY";//数据链接
	public final static String PICKEREX_NOAC = "PICKEREX_NOAC";//数据选择（无AC）
	public final static String PICKEREX_NOAC_LINK = "PICKEREX_NOAC_LINK";//数据选择（无AC、数据链接）
	public final static String PICKEREX_NOBUTTON = "PICKEREX_NOBUTTON";//数据选择（无按钮）
	public final static String PICKEREX_TRIGGER = "PICKEREX_TRIGGER";//数据选择（下拉）
	public final static String PICKEREX_TRIGGER_LINK = "PICKEREX_TRIGGER_LINK";//数据选择（下拉、数据链接）
	public final static String PICKUPVIEW = "PICKUPVIEW";//数据选择（嵌入选择视图）
	public final static String PICTURE = "PICTURE";//图片控件
	public final static String PICTURE_ONE = "PICTURE_ONE";//图片控件（单项）
	public final static String RADIOBUTTONLIST = "RADIOBUTTONLIST";//单选项列表
	public final static String RATING = "RATING";//评分器
	public final static String RAW = "RAW";//直接内容
	public final static String SLIDER = "SLIDER";//滑动输入条
	public final static String SPAN = "SPAN";//标签
	public final static String SPANEX = "SPANEX";//标签(旧）
	public final static String SPAN_LINK = "SPAN_LINK";//标签(数据链接）
	public final static String STEPPER = "STEPPER";//步进器
	public final static String SWITCH = "SWITCH";//开关部件
	public final static String TEXTAREA = "TEXTAREA";//多行输入框
	public final static String TEXTAREA_10 = "TEXTAREA_10";//多行输入框（10行）
	public final static String TEXTBOX = "TEXTBOX";//文本框
	public final static String USERCONTROL = "USERCONTROL";//用户自定义
	
	public final static String MARKDOWN = "MARKDOWN";//markdown编辑器
	public final static String MOBMARKDOWN = "MOBMARKDOWN";//移动端 markdown编辑器
	
	public final static String CODE = "CODE";//代码编辑器
	public final static String MOBCODE = "MOBCODE";//移动端代码编辑器
	
	public final static String NUMBERRANGE = "NUMBERRANGE";//数值范围编辑器
	public final static String MOBNUMBERRANGE = "MOBNUMBERRANGE";//移动端数值范围编辑器
	
	public final static String DATERANGE = "DATERANGE";//日期范围编辑器
	public final static String MOBDATERANGE = "MOBDATERANGE";//移动端日期范围编辑器
	
}
