package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psmodel.core.domain.PSEditorType;
import net.ibizsys.psmodel.core.filter.PSEditorTypeFilter;
import net.ibizsys.psmodel.core.service.IPSEditorTypeService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;

public class PSEditorTypeRTService extends PSModelRTServiceBase<PSEditorType, PSEditorTypeFilter> implements IPSEditorTypeService {
	private static final Log log = LogFactory.getLog(PSEditorTypeRTService.class);

	private static List<PSEditorType> PSEditorTypes = new ArrayList<PSEditorType>();
	
	private static List<PSEditorType> WebPSEditorTypes = new ArrayList<PSEditorType>();
	
	
	private static List<PSEditorType> MobPSEditorTypes = new ArrayList<PSEditorType>();
	
	
	static {
		PSEditorTypes.add(new PSEditorType().id("TEXTBOX").validflag(1).name("文本框").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("NUMBER").validflag(1).name("数值框").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("PASSWORD").validflag(1).name("密码框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("HIDDEN").validflag(1).name("隐藏表单项").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("TEXTAREA").validflag(1).name("多行输入框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("TEXTAREA_10").validflag(1).name("多行输入框（10行）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("TEXTAREA"));
		PSEditorTypes.add(new PSEditorType().id("IPADDRESSTEXTBOX").validflag(1).name("IP地址输入框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("RAW").validflag(1).name("直接内容").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("STEPPER").validflag(1).name("步进器").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("RATING").validflag(1).name("评分器").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("SLIDER").validflag(1).name("滑动输入条").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("SPAN").validflag(1).name("标签").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("SPANEX").validflag(1).name("标签（旧）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("SPAN"));
		PSEditorTypes.add(new PSEditorType().id("SPAN_LINK").validflag(1).name("标签（数据链接）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("SPAN"));
		PSEditorTypes.add(new PSEditorType().id("DROPDOWNLIST").validflag(1).name("下拉列表框").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("DROPDOWNLIST_100").validflag(1).name("下拉列表框（100宽度）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DROPDOWNLIST"));
		PSEditorTypes.add(new PSEditorType().id("MDROPDOWNLIST").validflag(1).name("下拉列表框（多选）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("CHECKBOX").validflag(1).name("选项框").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("SWITCH").validflag(1).name("开关部件").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("RADIOBUTTONLIST").validflag(1).name("单选项列表").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("CHECKBOXLIST").validflag(1).name("选项框列表").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("LISTBOX").validflag(1).name("列表框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("LISTBOXPICKUP").validflag(1).name("列表框（选择）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("ADDRESSPICKUP").validflag(1).name("地址框（选择）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("ADDRESSPICKUP_AC").validflag(1).name("地址框（支持选择、AC）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("ADDRESSPICKUP"));
		PSEditorTypes.add(new PSEditorType().id("DATEPICKEREX").validflag(1).name("时间选择器（旧）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		PSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_NOTIME").validflag(1).name("时间选择器（YYYY-MM-DD）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		PSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_NODAY").validflag(1).name("时间选择器（HH:mm:ss）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		PSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_HOUR").validflag(1).name("时间选择器（YYYY-MM-DD HH）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		PSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_MINUTE").validflag(1).name("时间选择器（YYYY-MM-DD HH:mm）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		PSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_SECOND").validflag(1).name("时间选择器（YYYY-MM-DD HH:mm:ss）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		PSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_NODAY_NOSECOND").validflag(1).name("时间选择器（HH:mm）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		PSEditorTypes.add(new PSEditorType().id("DATEPICKER").validflag(1).name("时间选择器").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("PICKER").validflag(1).name("数据选择").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("PICKEREX_LINK").validflag(1).name("数据选择（数据链接）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		PSEditorTypes.add(new PSEditorType().id("PICKEREX_NOAC").validflag(1).name("数据选择（无AC）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		PSEditorTypes.add(new PSEditorType().id("PICKEREX_LINKONLY").validflag(1).name("数据链接").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		PSEditorTypes.add(new PSEditorType().id("PICKEREX_NOAC_LINK").validflag(1).name("数据选择（无AC、数据链接）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		PSEditorTypes.add(new PSEditorType().id("PICKEREX_TRIGGER").validflag(1).name("数据选择（下拉）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		PSEditorTypes.add(new PSEditorType().id("PICKEREX_TRIGGER_LINK").validflag(1).name("数据选择（下拉、数据链接）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		PSEditorTypes.add(new PSEditorType().id("PICKEREX_NOBUTTON").validflag(1).name("数据选择（无按钮）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		PSEditorTypes.add(new PSEditorType().id("PICKEREX_DROPDOWNVIEW").validflag(1).name("数据选择（下拉视图）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		PSEditorTypes.add(new PSEditorType().id("PICKEREX_DROPDOWNVIEW_LINK").validflag(1).name("数据选择（下拉视图、数据链接）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		PSEditorTypes.add(new PSEditorType().id("PICKUPVIEW").validflag(1).name("数据选择（嵌入选择视图）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("AC").validflag(1).name("自动填充").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("AC_FS").validflag(1).name("自动填充（只能选择）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("AC"));
		PSEditorTypes.add(new PSEditorType().id("AC_NOBUTTON").validflag(1).name("自动填充（无按钮）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("AC"));
		PSEditorTypes.add(new PSEditorType().id("AC_FS_NOBUTTON").validflag(1).name("自动填充（只能选择、无按钮）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("AC"));
		PSEditorTypes.add(new PSEditorType().id("HTMLEDITOR").validflag(1).name("HTML编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("CODE").validflag(1).name("代码编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MARKDOWN").validflag(1).name("Markdown编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("OFFICEEDITOR").validflag(1).name("Office文档编辑器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("OFFICEEDITOR2").validflag(1).name("Office文档编辑器2（弹出编辑，返回内容）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("PICTURE").validflag(1).name("图片控件").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("PICTURE_ONE").validflag(1).name("图片控件（单项）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("PICTURE"));
		PSEditorTypes.add(new PSEditorType().id("PICTURE_ONE_RAW").validflag(1).name("图片控件（单项、直接内容）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("PICTURE"));
		PSEditorTypes.add(new PSEditorType().id("PREDEFINED").validflag(1).name("预定义编辑器").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("FILEUPLOADER").validflag(1).name("文件控件").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("FILEUPLOADER_ONE").validflag(1).name("文件控件（单项）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("FILEUPLOADER"));
		PSEditorTypes.add(new PSEditorType().id("NUMBERRANGE").validflag(1).name("数值范围编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("DATERANGE").validflag(1).name("时间范围选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("DATERANGE_NOTIME").validflag(1).name("时间范围选择器（YYYY-MM-DD）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("DATERANGE"));
		PSEditorTypes.add(new PSEditorType().id("CASCADER").validflag(1).name("级联选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("ARRAY").validflag(1).name("数组编辑器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MAPPICKER").validflag(1).name("地图选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("COLORPICKER").validflag(1).name("颜色选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("USERCONTROL").validflag(1).name("用户自定义").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));

		PSEditorTypes.add(new PSEditorType().id("MOBTEXT").validflag(1).name("移动端文本框").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBNUMBER").validflag(1).name("移动端数值框").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBTEXTAREA").validflag(1).name("移动端多行文本").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBSWITCH").validflag(1).name("移动端开关部件").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBBARCODEREADER").validflag(1).name("移动端条码阅读器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBRADIOLIST").validflag(1).name("移动端单选项列表").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOB2DBARCODEREADER").validflag(1).name("移动端二维码阅读器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBDROPDOWNLIST").validflag(1).name("移动端下拉列表（单选）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBCHECKLIST").validflag(1).name("移动端下拉列表（多选）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBPICKER").validflag(1).name("移动端数据选择").mobfieditor(0).fieditor(0).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBPICKER_DROPDOWNVIEW").validflag(1).name("移动端数据选择（下拉视图）").mobfieditor(0).fieditor(0).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBMPICKER").validflag(1).name("移动端多数据选择").mobfieditor(0).fieditor(0).gceditor(1).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBDATE").validflag(1).name("移动端时间选择器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBDATE_HOUR").validflag(1).name("移动端时间选择器（YYYY-MM-DD HH）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		PSEditorTypes.add(new PSEditorType().id("MOBDATE_MINUTE").validflag(1).name("移动端时间选择器（YYYY-MM-DD HH:mm）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		PSEditorTypes.add(new PSEditorType().id("MOBDATE_NODAY").validflag(1).name("移动端时间选择器（HH:mm:ss）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		PSEditorTypes.add(new PSEditorType().id("MOBDATE_NODAY_NOSECOND").validflag(1).name("移动端时间选择器（HH:mm）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		PSEditorTypes.add(new PSEditorType().id("MOBDATE_NOTIME").validflag(1).name("移动端时间选择器（YYYY-MM-DD）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		PSEditorTypes.add(new PSEditorType().id("MOBDATE_SECOND").validflag(1).name("移动端时间选择器（YYYY-MM-DD HH:mm:ss）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		PSEditorTypes.add(new PSEditorType().id("MOBPICTURE").validflag(1).name("移动端图片控件（单项）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBSINGLEFILEUPLOAD").validflag(1).name("移动端文件控件（单项）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBPICTURE_RAW").validflag(1).name("移动端图片控件（单项、直接内容）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(0).standardeditor("MOBPICTURE"));
		PSEditorTypes.add(new PSEditorType().id("MOBPICTURELIST").validflag(1).name("移动端图片控件（多项）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBMULTIFILEUPLOAD").validflag(1).name("移动端文件控件（多项）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBPASSWORD").validflag(1).name("移动端密码框").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBSLIDER").validflag(1).name("移动端滑动输入条").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBSTEPPER").validflag(1).name("移动端步进器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBRATING").validflag(1).name("移动端评分器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBHTMLTEXT").validflag(1).name("移动端HTML编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBCODE").validflag(1).name("移动端代码编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBMARKDOWN").validflag(1).name("移动端Markdown编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBNUMBERRANGE").validflag(1).name("移动端数值范围编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBDATERANGE").validflag(1).name("移动端时间范围选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBDATERANGE_NOTIME").validflag(1).name("移动端时间范围选择器（YYYY-MM-DD）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("MOBDATERANGE"));
		PSEditorTypes.add(new PSEditorType().id("MOBCASCADER").validflag(1).name("移动端级联选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBARRAY").validflag(1).name("移动端数组编辑器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBMAPPICKER").validflag(1).name("移动端地图选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		PSEditorTypes.add(new PSEditorType().id("MOBCOLORPICKER").validflag(1).name("移动端颜色选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		
		
		WebPSEditorTypes.add(new PSEditorType().id("TEXTBOX").validflag(1).name("文本框").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("NUMBER").validflag(1).name("数值框").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("PASSWORD").validflag(1).name("密码框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("HIDDEN").validflag(1).name("隐藏表单项").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("TEXTAREA").validflag(1).name("多行输入框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("TEXTAREA_10").validflag(1).name("多行输入框（10行）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("TEXTAREA"));
		WebPSEditorTypes.add(new PSEditorType().id("IPADDRESSTEXTBOX").validflag(1).name("IP地址输入框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("RAW").validflag(1).name("直接内容").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("STEPPER").validflag(1).name("步进器").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("RATING").validflag(1).name("评分器").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("SLIDER").validflag(1).name("滑动输入条").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("SPAN").validflag(1).name("标签").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("SPANEX").validflag(1).name("标签（旧）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("SPAN"));
		WebPSEditorTypes.add(new PSEditorType().id("SPAN_LINK").validflag(1).name("标签（数据链接）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("SPAN"));
		WebPSEditorTypes.add(new PSEditorType().id("DROPDOWNLIST").validflag(1).name("下拉列表框").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("DROPDOWNLIST_100").validflag(1).name("下拉列表框（100宽度）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DROPDOWNLIST"));
		WebPSEditorTypes.add(new PSEditorType().id("MDROPDOWNLIST").validflag(1).name("下拉列表框（多选）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("CHECKBOX").validflag(1).name("选项框").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("SWITCH").validflag(1).name("开关部件").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("RADIOBUTTONLIST").validflag(1).name("单选项列表").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("CHECKBOXLIST").validflag(1).name("选项框列表").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("LISTBOX").validflag(1).name("列表框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("LISTBOXPICKUP").validflag(1).name("列表框（选择）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("ADDRESSPICKUP").validflag(1).name("地址框（选择）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("ADDRESSPICKUP_AC").validflag(1).name("地址框（支持选择、AC）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("ADDRESSPICKUP"));
		WebPSEditorTypes.add(new PSEditorType().id("DATEPICKEREX").validflag(1).name("时间选择器（旧）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_NOTIME").validflag(1).name("时间选择器（YYYY-MM-DD）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_NODAY").validflag(1).name("时间选择器（HH:mm:ss）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_HOUR").validflag(1).name("时间选择器（YYYY-MM-DD HH）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_MINUTE").validflag(1).name("时间选择器（YYYY-MM-DD HH:mm）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_SECOND").validflag(1).name("时间选择器（YYYY-MM-DD HH:mm:ss）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("DATEPICKEREX_NODAY_NOSECOND").validflag(1).name("时间选择器（HH:mm）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("DATEPICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("DATEPICKER").validflag(1).name("时间选择器").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("PICKER").validflag(1).name("数据选择").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("PICKEREX_LINK").validflag(1).name("数据选择（数据链接）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("PICKEREX_NOAC").validflag(1).name("数据选择（无AC）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("PICKEREX_LINKONLY").validflag(1).name("数据链接").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("PICKEREX_NOAC_LINK").validflag(1).name("数据选择（无AC、数据链接）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("PICKEREX_TRIGGER").validflag(1).name("数据选择（下拉）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("PICKEREX_TRIGGER_LINK").validflag(1).name("数据选择（下拉、数据链接）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("PICKEREX_NOBUTTON").validflag(1).name("数据选择（无按钮）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("PICKEREX_DROPDOWNVIEW").validflag(1).name("数据选择（下拉视图）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("PICKEREX_DROPDOWNVIEW_LINK").validflag(1).name("数据选择（下拉视图、数据链接）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("PICKER"));
		WebPSEditorTypes.add(new PSEditorType().id("PICKUPVIEW").validflag(1).name("数据选择（嵌入选择视图）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("AC").validflag(1).name("自动填充").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("AC_FS").validflag(1).name("自动填充（只能选择）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("AC"));
		WebPSEditorTypes.add(new PSEditorType().id("AC_NOBUTTON").validflag(1).name("自动填充（无按钮）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("AC"));
		WebPSEditorTypes.add(new PSEditorType().id("AC_FS_NOBUTTON").validflag(1).name("自动填充（只能选择、无按钮）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("AC"));
		WebPSEditorTypes.add(new PSEditorType().id("HTMLEDITOR").validflag(1).name("HTML编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("CODE").validflag(1).name("代码编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("MARKDOWN").validflag(1).name("Markdown编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("OFFICEEDITOR").validflag(1).name("Office文档编辑器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("OFFICEEDITOR2").validflag(1).name("Office文档编辑器2（弹出编辑，返回内容）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("PICTURE").validflag(1).name("图片控件").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("PICTURE_ONE").validflag(1).name("图片控件（单项）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("PICTURE"));
		WebPSEditorTypes.add(new PSEditorType().id("PICTURE_ONE_RAW").validflag(1).name("图片控件（单项、直接内容）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("PICTURE"));
		WebPSEditorTypes.add(new PSEditorType().id("PREDEFINED").validflag(1).name("预定义编辑器").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("FILEUPLOADER").validflag(1).name("文件控件").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("FILEUPLOADER_ONE").validflag(1).name("文件控件（单项）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("FILEUPLOADER"));
		WebPSEditorTypes.add(new PSEditorType().id("NUMBERRANGE").validflag(1).name("数值范围编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("DATERANGE").validflag(1).name("时间范围选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("DATERANGE_NOTIME").validflag(1).name("时间范围选择器（YYYY-MM-DD）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("DATERANGE"));
		WebPSEditorTypes.add(new PSEditorType().id("CASCADER").validflag(1).name("级联选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("ARRAY").validflag(1).name("数组编辑器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("MAPPICKER").validflag(1).name("地图选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("COLORPICKER").validflag(1).name("颜色选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		WebPSEditorTypes.add(new PSEditorType().id("USERCONTROL").validflag(1).name("用户自定义").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		
		MobPSEditorTypes.add(new PSEditorType().id("MOBTEXT").validflag(1).name("移动端文本框").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBNUMBER").validflag(1).name("移动端数值框").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBTEXTAREA").validflag(1).name("移动端多行文本").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBSWITCH").validflag(1).name("移动端开关部件").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBBARCODEREADER").validflag(1).name("移动端条码阅读器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBRADIOLIST").validflag(1).name("移动端单选项列表").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOB2DBARCODEREADER").validflag(1).name("移动端二维码阅读器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDROPDOWNLIST").validflag(1).name("移动端下拉列表（单选）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBCHECKLIST").validflag(1).name("移动端下拉列表（多选）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBPICKER").validflag(1).name("移动端数据选择").mobfieditor(0).fieditor(0).gceditor(1).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBPICKER_DROPDOWNVIEW").validflag(1).name("移动端数据选择（下拉视图）").mobfieditor(0).fieditor(0).gceditor(1).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBMPICKER").validflag(1).name("移动端多数据选择").mobfieditor(0).fieditor(0).gceditor(1).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDATE").validflag(1).name("移动端时间选择器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDATE_HOUR").validflag(1).name("移动端时间选择器（YYYY-MM-DD HH）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDATE_MINUTE").validflag(1).name("移动端时间选择器（YYYY-MM-DD HH:mm）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDATE_NODAY").validflag(1).name("移动端时间选择器（HH:mm:ss）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDATE_NODAY_NOSECOND").validflag(1).name("移动端时间选择器（HH:mm）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDATE_NOTIME").validflag(1).name("移动端时间选择器（YYYY-MM-DD）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDATE_SECOND").validflag(1).name("移动端时间选择器（YYYY-MM-DD HH:mm:ss）").mobfieditor(0).fieditor(1).gceditor(1).standardtype(0).standardeditor("MOBDATE"));
		MobPSEditorTypes.add(new PSEditorType().id("MOBPICTURE").validflag(1).name("移动端图片控件（单项）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBSINGLEFILEUPLOAD").validflag(1).name("移动端文件控件（单项）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBPICTURE_RAW").validflag(1).name("移动端图片控件（单项、直接内容）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(0).standardeditor("MOBPICTURE"));
		MobPSEditorTypes.add(new PSEditorType().id("MOBPICTURELIST").validflag(1).name("移动端图片控件（多项）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBMULTIFILEUPLOAD").validflag(1).name("移动端文件控件（多项）").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBPASSWORD").validflag(1).name("移动端密码框").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBSLIDER").validflag(1).name("移动端滑动输入条").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBSTEPPER").validflag(1).name("移动端步进器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBRATING").validflag(1).name("移动端评分器").mobfieditor(0).fieditor(0).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBHTMLTEXT").validflag(1).name("移动端HTML编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBCODE").validflag(1).name("移动端代码编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBMARKDOWN").validflag(1).name("移动端Markdown编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBNUMBERRANGE").validflag(1).name("移动端数值范围编辑框").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDATERANGE").validflag(1).name("移动端时间范围选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBDATERANGE_NOTIME").validflag(1).name("移动端时间范围选择器（YYYY-MM-DD）").mobfieditor(0).fieditor(1).gceditor(0).standardtype(0).standardeditor("MOBDATERANGE"));
		MobPSEditorTypes.add(new PSEditorType().id("MOBCASCADER").validflag(1).name("移动端级联选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBARRAY").validflag(1).name("移动端数组编辑器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBMAPPICKER").validflag(1).name("移动端地图选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("MOBCOLORPICKER").validflag(1).name("移动端颜色选择器").mobfieditor(0).fieditor(1).gceditor(0).standardtype(1));
		MobPSEditorTypes.add(new PSEditorType().id("USERCONTROL").validflag(1).name("用户自定义").mobfieditor(0).fieditor(1).gceditor(1).standardtype(1));
		
	}

	@Override
	public PSEditorType createDomain() {
		return new PSEditorType();
	}

	@Override
	public PSEditorTypeFilter createFilter() {
		return new PSEditorTypeFilter();
	}

	@Override
	public PSEditorType getDomain(Object params) {
		if(params instanceof PSEditorType) {
			return (PSEditorType)params;
		}
		return getMapper().convertValue(params, PSEditorType.class);
	}

	@Override
	public PSEditorTypeFilter getFilter(Object params) {
		if(params instanceof PSEditorTypeFilter) {
			return (PSEditorTypeFilter)params;
		}
		return getMapper().convertValue(params, PSEditorTypeFilter.class);
	}

	@Override
	public String getModelName(boolean single) {
		if (single) {
			return "PSEDITORTYPE";
		} else {
			return "PSEDITORTYPES";
		}
	}

	protected List<PSEditorType> getDomainList(String strDataSetName, PSEditorTypeFilter f) throws Exception {
		// 执行过滤操作
		Object mobfieditor = f.get("mobfieditor");
		if(mobfieditor!=null) {
			if("1".equals(mobfieditor)) {
				return filterDomainList(MobPSEditorTypes, strDataSetName, f);
			}
			else {
				return filterDomainList(WebPSEditorTypes, strDataSetName, f);
			}
		}
		
		return filterDomainList(PSEditorTypes, strDataSetName, f);
	}

	// @Override
	// protected IPSModelObject getPSModelObject(String key, boolean tryMode)
	// throws Exception {
	// return getPSModelObject(IPSSysEditorStyle.class
	// ,getPSModelObject(IPSDataEntity.class,
	// this.getPSSystemService().getPSSystem().getAllPSDataEntities(),
	// (String)getParentId(key), false).getAllPSSysEditorStyles()
	// ,key, tryMode);
	// }
	//
	// @Override
	// protected void doFillDomain(PSSysEditorStyle domain, IPSModelObject
	// iPSModelObject, boolean bFullMode) throws Exception {
	// IPSModel parentPSModel =
	// this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY,
	// getParentId(domain.getId()));
	// domain.setPSDEId(parentPSModel.getId());
	// domain.setPSDEName(parentPSModel.getName());
	// super.doFillDomain(domain, iPSModelObject, bFullMode);
	// }
}
