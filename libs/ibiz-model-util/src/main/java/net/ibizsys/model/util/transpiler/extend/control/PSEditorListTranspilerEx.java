package net.ibizsys.model.util.transpiler.extend.control;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.codelist.IPSAppCodeList;
import net.ibizsys.model.app.dataentity.IPSAppDEACMode;
import net.ibizsys.model.app.dataentity.IPSAppDEDataSet;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.control.IPSEditor;
import net.ibizsys.model.control.IPSNavigateContext;
import net.ibizsys.model.control.IPSNavigateParam;
import net.ibizsys.model.control.IPSNavigateParamContainer;
import net.ibizsys.model.control.IPSTextBase;
import net.ibizsys.model.control.PSEditorImpl;
import net.ibizsys.model.control.PSEditorItemImpl;
import net.ibizsys.model.control.PSNavigateContextImpl;
import net.ibizsys.model.control.PSNavigateParamImpl;
import net.ibizsys.model.control.editor.IPSAutoComplete;
import net.ibizsys.model.control.editor.IPSCode;
import net.ibizsys.model.control.editor.IPSCodeListEditor;
import net.ibizsys.model.control.editor.IPSDatePicker;
import net.ibizsys.model.control.editor.IPSFileUploader;
import net.ibizsys.model.control.editor.IPSMailAddress;
import net.ibizsys.model.control.editor.IPSMarkdown;
import net.ibizsys.model.control.editor.IPSNumberEditor;
import net.ibizsys.model.control.editor.IPSPicker;
import net.ibizsys.model.control.editor.IPSPickerEditor;
import net.ibizsys.model.control.editor.IPSPicture;
import net.ibizsys.model.control.editor.IPSSpan;
import net.ibizsys.model.control.editor.IPSStepper;
import net.ibizsys.model.control.editor.IPSTextEditor;
import net.ibizsys.model.control.editor.IPSValueItemEditor;
import net.ibizsys.model.control.editor.PSAutoCompleteImpl;
import net.ibizsys.model.control.editor.PSCodeImpl;
import net.ibizsys.model.control.editor.PSCodeListEditorImpl;
import net.ibizsys.model.control.editor.PSDatePickerImpl;
import net.ibizsys.model.control.editor.PSFileUploaderImpl;
import net.ibizsys.model.control.editor.PSMailAddressImpl;
import net.ibizsys.model.control.editor.PSMarkdownImpl;
import net.ibizsys.model.control.editor.PSNumberEditorImpl;
import net.ibizsys.model.control.editor.PSPickerEditorImpl;
import net.ibizsys.model.control.editor.PSPickerImpl;
import net.ibizsys.model.control.editor.PSPictureImpl;
import net.ibizsys.model.control.editor.PSSpanImpl;
import net.ibizsys.model.control.editor.PSStepperImpl;
import net.ibizsys.model.control.editor.PSTextEditorImpl;
import net.ibizsys.model.control.editor.PSValueItemEditorImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.extend.app.view.PSAppViewListTranspilerEx;
import net.ibizsys.model.util.transpiler.extend.valuerule.PSSysValueRuleListTranspilerEx;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.psmodel.core.domain.PSDEFormDetail;
import net.ibizsys.psmodel.core.domain.PSEditorType;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSEditorListTranspilerEx extends net.ibizsys.model.util.transpiler.control.PSEditorListTranspiler{
	
	static Map<String, PSEditorType> PSEditorTypeMap = new HashMap<String, PSEditorType>();
	static {
		List<PSEditorType> PSEditorTypes = new ArrayList<PSEditorType>();
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
		
		for(PSEditorType psEditorType : PSEditorTypes) {
			PSEditorTypeMap.put(psEditorType.getId(), psEditorType);
		}
		
	}
	
	/**
	 * 编辑器参数，只读
	 */
	public final static String EDITORPARAM_READONLY = "READONLY";
	
	
	/**
	 * 编辑器参数，默认只读
	 */
	public final static String EDITORPARAM_DEFAULTREADONLY = "DEFAULTREADONLY";
	
	
	/**
	 * 编辑器参数，禁用
	 */
	public final static String EDITORPARAM_DISABLED = "DISABLED";
	
	
	/**
	 * 编辑器参数，默认禁用
	 */
	public final static String EDITORPARAM_DEFAULTDISABLED = "DEFAULTDISABLED";
	
	
	/**
	 * 编辑器参数，值类型
	 */
	public final static String EDITORPARAM_VALUETYPE = "VALUETYPE";
	
	
	/**
	 * 编辑器参数，默认值类型
	 */
	public final static String EDITORPARAM_DEFAULTVALUETYPE = "DEFAULTVALUETYPE";
	
	
	/**
	 * 编辑器参数，对象名称存储属性
	 */
	public final static String EDITORPARAM_OBJECTNAMEFIELD = "OBJECTNAMEFIELD";
	
	
	/**
	 * 编辑器参数，对象标识存储属性
	 */
	public final static String EDITORPARAM_OBJECTIDFIELD = "OBJECTIDFIELD";
	
	/**
	 * 编辑器参数，对象值存储属性
	 */
	public final static String EDITORPARAM_OBJECTVALUEFIELD = "OBJECTVALUEFIELD";
	
	
	/**
	 * 编辑器参数，默认对象名称存储属性
	 */
	public final static String EDITORPARAM_DEFAULTOBJECTNAMEFIELD = "DEFAULTOBJECTNAMEFIELD";
	
	
	/**
	 * 编辑器参数，默认对象标识存储属性
	 */
	public final static String EDITORPARAM_DEFAULTOBJECTIDFIELD = "DEFAULTOBJECTIDFIELD";
	
	/**
	 * 编辑器参数，默认对象值存储属性
	 */
	public final static String EDITORPARAM_DEFAULTOBJECTVALUEFIELD = "DEFAULTOBJECTVALUEFIELD";
	
	
	/**
	 * 编辑器参数，多项标识分隔符
	 */
	public final static String EDITORPARAM_VALUESEPARATOR = "VALUESEPARATOR";
	
	
	/**
	 * 编辑器参数，多项名称分隔符
	 */
	public final static String EDITORPARAM_TEXTSEPARATOR = "TEXTSEPARATOR";
	

	/**
	 * 编辑器参数，，默认多项值分隔符
	 */
	public final static String EDITORPARAM_DEFAULTVALUESEPARATOR = "DEFAULTVALUESEPARATOR";
	
	
	/**
	 * 编辑器参数，，默认多项文本分隔符
	 */
	public final static String EDITORPARAM_DEFAULTTEXTSEPARATOR = "DEFAULTTEXTSEPARATOR";
	
	
	/**
	 * 编辑器参数：最大长度
	 */
	public final static String EDITORPARAM_MAXLENGTH = "MAXLENGTH";
	
	
	/**
	 * 编辑器参数：最小长度
	 */
	public final static String EDITORPARAM_MINLENGTH = "MINLENGTH";
	
	
	/**
	 * 编辑器参数：默认最大长度
	 */
	public final static String EDITORPARAM_DEFAULTMAXLENGTH = "DEFAULTMAXLENGTH";
	
	
	/**
	 * 编辑器参数：默认最小长度
	 */
	public final static String EDITORPARAM_DEFAULTMINLENGTH = "DEFAULTMINLENGTH";
	
	
	
	/**
	 * 编辑器参数：显示最大长度
	 */
	public final static String EDITORPARAM_SHOWMAXLENGTH = "SHOWMAXLENGTH";
	
	
	/**
	 * 编辑器参数：最大值
	 */
	public final static String EDITORPARAM_MAXVALUE = "MAXVALUE";
	
	
	/**
	 * 编辑器参数：最小值
	 */
	public final static String EDITORPARAM_MINVALUE = "MINVALUE";
	
	/**
	 * 编辑器参数：浮点精度
	 */
	public final static String EDITORPARAM_PRECISION = "PRECISION";
	
	
	/**
	 * 编辑器参数：步骤值
	 */
	public final static String EDITORPARAM_STEPVALUE = "STEPVALUE";
	
	/**
	 * 编辑器参数：是否支持链接视图
	 */
	public final static String EDITORPARAM_LINKVIEW = "LINKVIEW";
	
	/**
	 * 编辑器参数：换行模式
	 */
	public final static String EDITORPARAM_WRAPMODE = "WRAPMODE";
	
	
	/**
	 * 编辑器参数：内容垂直对齐方式
	 */
	public final static String EDITORPARAM_VALIGN = "VALIGN";
	
	
	/**
	 * 编辑器参数：内容水平对齐方式
	 */
	public final static String EDITORPARAM_HALIGN = "HALIGN";
	
	
	/**
	 * 编辑器参数，使用直接内容存储
	 */
	public final static String EDITORPARAM_RAWCONTENT = "RAWCONTENT";
	
	/**
	 * 编辑器参数，必须选择
	 */
	public final static String EDITORPARAM_FORCESELECTION = "FORCESELECTION";
	
	/**
	 * 编辑器参数，显示下拉按钮
	 */
	public final static String EDITORPARAM_TRIGGER = "TRIGGER";
	
	
	/**
	 * 编辑器参数，自填触发最小字符数量
	 */
	public final static String EDITORPARAM_ACMINCHARS = "ACMINCHARS";
	
	
	public final static String EDITORPARAM_AC = "AC";
	
	/**
	 * 编辑器参数：模式 EDIT（编辑） | PREVIEW（预览） | SUBFIELD（编辑预览同屏）
	 */
	public final static String EDITORPARAM_MODE = "MODE";
	
	/**
	 * 编辑器参数：是否支持选择视图
	 */
	public final static String EDITORPARAM_PICKUPVIEW = "PICKUPVIEW";
	
	
	
	public final static String EDITORPARAM_MINFILECNT = "MINFILECNT";
	
	public final static String EDITORPARAM_FILEEXTS = "FILEEXTS";
	
	public final static String EDITORPARAM_MAXFILECNT = "MAXFILECNT";
	
	public final static String EDITORPARAM_MAXFILESIZE = "MAXFILESIZE";
	
	public final static String EDITORPARAM_OSSCAT = "OSSCAT";
	
	/**
	 * 编辑器参数：时间格式
	 */
	public final static String EDITORPARAM_TIMEFMT = "TIMEFMT";
	
	
	/**
	 * 编辑器参数：代码类型
	 */
	public final static String EDITORPARAM_CODETYPE = "CODETYPE";
	
	
	/**
	 * 编辑器值类型：简单值
	 */
	public final static String EDITORVALUETYPE_SIMPLE = "SIMPLE";
	
	
	/**
	 * 编辑器值类型：简单值数组
	 */
	public final static String EDITORVALUETYPE_SIMPLES = "SIMPLES";
	
	
	/**
	 * 编辑器值类型：对象值
	 */
	public final static String EDITORVALUETYPE_OBJECT = "OBJECT";
	
	
	/**
	 * 编辑器值类型：对象数组
	 */
	public final static String EDITORVALUETYPE_OBJECTS = "OBJECTS";
	
	/**
	 * 编辑器参数：输出全部项，未定义时为  FALSE 
	 */
	public final static String EDITORPARAM_ALLITEMS = "ALLITEMS";
	
	
	
	/**
	 * 编辑器参数：全部项文本 
	 */
	public final static String EDITORPARAM_ALLITEMSTEXT = "ALLITEMSTEXT";
	
	
	/**
	 * 视图参数中的导航上下文前缀
	 */
	public static final String VIEWPARAM_NAVCONTEXT = "SRFNAVCTX.";
	
	/**
	 * 视图参数中的导航参数前缀
	 */
	public static final String VIEWPARAM_NAVPARAM = "SRFNAVPARAM.";
	
	
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		//不调用基类，会写入ID
		//super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		this.getPSModelTranspiler(iPSModelTranspileContext, iPSModelObject).decompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		IPSEditor iPSEditor = (IPSEditor)iPSModelObject;
		
		if(domain instanceof PSDEFormDetail) {
			PSDEFormDetail psDEFormDetail = (PSDEFormDetail)domain;
			psDEFormDetail.setEditorType(iPSEditor.getEditorType());
			PSEditorType psEditorType = PSEditorTypeMap.get(iPSEditor.getEditorType());
			if(psEditorType!=null) {
				psDEFormDetail.set("editortypename", psEditorType.getName());
			}
			else {
				psDEFormDetail.set("editortypename", iPSEditor.getEditorType());
			}
			
			if(StringUtils.hasLength(iPSEditor.getEditorStyle())) {
				psDEFormDetail.set("editorstyle", iPSEditor.getEditorStyle());
			}
			
			if(iPSEditor.getPlaceHolder()!=null) {
				psDEFormDetail.setPlaceHolder(iPSEditor.getPlaceHolder());
			}
			
			if(iPSEditor.getCssStyle()!=null) {
				psDEFormDetail.setCtrlRawCssStyle(iPSEditor.getCssStyle());
			}
			
			if(iPSEditor.getDynaClass()!=null) {
				psDEFormDetail.setCtrlDynaClass(iPSEditor.getDynaClass());
			}
			
			if(iPSEditor.getPredefinedType()!=null) {
				psDEFormDetail.setPredefinedType(iPSEditor.getPredefinedType());
			}
			
			//psDEFormDetail.sete
			if(iPSEditor.getEditorWidth()>0) {
				psDEFormDetail.setCtrlWidth((int)iPSEditor.getEditorWidth());
			}
			if(iPSEditor.getEditorHeight()>0) {
				psDEFormDetail.setCtrlHeight((int)iPSEditor.getEditorHeight());
			}
			
			
			
			String strPSEditorParams = getPSEditorParams(iPSModelTranspileContext, iPSEditor);
			if(StringUtils.hasLength(strPSEditorParams)) {
				psDEFormDetail.setEditorParams(strPSEditorParams);
			}
			
			IPSSysValueRule iPSSysValueRule = null;
			
			if(iPSEditor instanceof IPSCodeListEditor) {
				IPSCodeListEditor iPSCodeListEditor = (IPSCodeListEditor)iPSEditor;
				if(iPSCodeListEditor.getPSAppCodeList()!=null) {
					psDEFormDetail.setPSCodeListId(iPSModelTranspileContext.getPSModelUniqueTag(iPSCodeListEditor.getPSAppCodeList()));
					psDEFormDetail.setPSCodeListName(iPSCodeListEditor.getPSAppCodeList().getName());
				}
			}
			
			if(iPSEditor instanceof IPSAutoComplete) {
				IPSAutoComplete iPSAutoComplete = (IPSAutoComplete)iPSEditor;
				if(iPSAutoComplete.getPSAppDataEntity()!=null && iPSAutoComplete.getPSAppDataEntity().getPSDataEntity()!=null) {
					psDEFormDetail.setRefPSDEId(iPSModelTranspileContext.getPSModelUniqueTag(iPSAutoComplete.getPSAppDataEntity().getPSDataEntity()));
					psDEFormDetail.setRefPSDEName(iPSAutoComplete.getPSAppDataEntity().getPSDataEntity().getName());
				}
				
				if(iPSAutoComplete.getPSAppDEACMode()!=null) {
					psDEFormDetail.setRefPSDEACModeId(iPSModelTranspileContext.getPSModelUniqueTag(iPSAutoComplete.getPSAppDEACMode()));
					psDEFormDetail.setRefPSDEACModeName(iPSAutoComplete.getPSAppDEACMode().getName());
				}
				
				if(iPSAutoComplete.getPSAppDEDataSet()!=null) {
					psDEFormDetail.setRefPSDEDataSetId(iPSModelTranspileContext.getPSModelUniqueTag(iPSAutoComplete.getPSAppDEDataSet()));
					psDEFormDetail.setRefPSDEDataSetName(iPSAutoComplete.getPSAppDEDataSet().getName());
				}
			}
			
			if(iPSEditor instanceof IPSValueItemEditor) {
				IPSValueItemEditor iPSValueItemEditor = (IPSValueItemEditor)iPSEditor;
				if(StringUtils.hasLength(iPSValueItemEditor.getValueItemName())) {
					psDEFormDetail.setValueItemName(iPSValueItemEditor.getValueItemName());
				}
			}
			
			if(iPSEditor instanceof IPSPickerEditor) {
				IPSPickerEditor iPSPickerEditor = (IPSPickerEditor)iPSEditor;
				if(iPSPickerEditor.getPickupPSAppView() instanceof IPSAppDEView) {
					psDEFormDetail.setPickupPSDEViewId(PSAppViewListTranspilerEx.getPSDEViewBaseId(iPSModelTranspileContext, (IPSAppDEView)iPSPickerEditor.getPickupPSAppView()));
					psDEFormDetail.setPickupPSDEViewName(iPSPickerEditor.getPickupPSAppView().getTitle());
				}
			}
			
			if(iPSEditor instanceof IPSPicker) {
				IPSPicker iPSPicker = (IPSPicker)iPSEditor;
				if(iPSPicker.getLinkPSAppView() instanceof IPSAppDEView) {
					psDEFormDetail.setLinkPSDEViewId(PSAppViewListTranspilerEx.getPSDEViewBaseId(iPSModelTranspileContext, (IPSAppDEView)iPSPicker.getLinkPSAppView()));
					psDEFormDetail.setLinkPSDEViewName(iPSPicker.getLinkPSAppView().getTitle());
				}
			}
			
			if(iPSEditor instanceof IPSSpan) {
				IPSSpan iPSSpan = (IPSSpan)iPSEditor;
				if(iPSSpan.getLinkPSAppView() instanceof IPSAppDEView) {
					psDEFormDetail.setLinkPSDEViewId(PSAppViewListTranspilerEx.getPSDEViewBaseId(iPSModelTranspileContext, (IPSAppDEView)iPSSpan.getLinkPSAppView()));
					psDEFormDetail.setLinkPSDEViewName(iPSSpan.getLinkPSAppView().getTitle());
				}
			}
			
			
			if(iPSEditor instanceof IPSTextEditor ) {
				iPSSysValueRule = ((IPSTextEditor)iPSEditor).getPSSysValueRule();
			}
			
			if(iPSEditor instanceof IPSNumberEditor ) {
				iPSSysValueRule = ((IPSNumberEditor)iPSEditor).getPSSysValueRule();
			}
			
			if(iPSSysValueRule != null) {
				psDEFormDetail.set("pssysvalueruleid", iPSModelTranspileContext.getPSModelUniqueTag(iPSSysValueRule));
				psDEFormDetail.set("pssysvaluerulename", iPSSysValueRule.getName());
			}
		}
	}
	
	public static String getPSEditorParams(IPSModelTranspileContext ipsModelTranspileContext, IPSEditor iPSEditor) throws Exception {
		Map<String, String> params = new LinkedHashMap<String, String>();
		
		ObjectNode objectNode = iPSEditor.getEditorParams();
		if(objectNode!=null) {
			java.util.Iterator<String> fieldNames = objectNode.fieldNames();
			if(fieldNames!=null) {
				while(fieldNames.hasNext()) {
					String strFieldName = fieldNames.next();
					JsonNode jsonNode = objectNode.get(strFieldName);
					if(jsonNode == null || jsonNode instanceof NullNode) {
						continue;
					}
					
					params.put(strFieldName, jsonNode.asText(""));
				}
			}
		}
		
		//根据编辑器进行附加
		if(iPSEditor.getValueType()!=null && !EDITORVALUETYPE_SIMPLE.contains(iPSEditor.getValueType())) {
			params.put(EDITORPARAM_VALUETYPE, iPSEditor.getValueType());
		}
		if(iPSEditor.getObjectIdField()!=null) {
			params.put(EDITORPARAM_OBJECTIDFIELD, iPSEditor.getObjectIdField());
		}
		if(iPSEditor.getObjectNameField()!=null) {
			params.put(EDITORPARAM_OBJECTNAMEFIELD, iPSEditor.getObjectNameField());
		}
		if(iPSEditor.getObjectValueField()!=null) {
			params.put(EDITORPARAM_OBJECTVALUEFIELD, iPSEditor.getObjectValueField());
		}
		if(iPSEditor.getValueSeparator()!=null) {
			params.put(EDITORPARAM_VALUESEPARATOR, iPSEditor.getValueSeparator());
		}
		
		if(iPSEditor.getTextSeparator()!=null) {
			params.put(EDITORPARAM_TEXTSEPARATOR, iPSEditor.getTextSeparator());
		}
		
		if(iPSEditor.getValueSeparator()!=null) {
			params.put(EDITORPARAM_VALUESEPARATOR, iPSEditor.getValueSeparator());
		}
		
		if(iPSEditor instanceof IPSTextEditor) {
			IPSTextEditor iPSTextEditor = (IPSTextEditor)iPSEditor;
			if(iPSTextEditor.getMaxLength()!=null && iPSTextEditor.getMaxLength()>0) {
				params.put(EDITORPARAM_MAXLENGTH, Integer.toString(iPSTextEditor.getMaxLength()));
			}
			
			if(iPSTextEditor.getMinLength()!=null && iPSTextEditor.getMinLength()>0) {
				params.put(EDITORPARAM_MINLENGTH, Integer.toString(iPSTextEditor.getMinLength()));
			}
			
			if(iPSTextEditor.isShowMaxLength()) {
				params.put(EDITORPARAM_SHOWMAXLENGTH, "TRUE");
			}
		}
		
		if(iPSEditor instanceof IPSNumberEditor) {
			IPSNumberEditor iPSTextBox = (IPSNumberEditor)iPSEditor;
			if(iPSTextBox.getMaxValue()!=null ) {
				params.put(EDITORPARAM_MAXVALUE, Double.toString(iPSTextBox.getMaxValue()));
			}
			
			if(iPSTextBox.getMinValue()!=null ) {
				params.put(EDITORPARAM_MINVALUE, Double.toString(iPSTextBox.getMinValue()));
			}
			
			if(iPSTextBox.getPrecision()!=null && iPSTextBox.getPrecision()>0) {
				params.put(EDITORPARAM_PRECISION, Integer.toString(iPSTextBox.getPrecision()));
			}
		}
		
		if(iPSEditor instanceof IPSTextBase) {
			IPSTextBase iPSTextBox = (IPSTextBase)iPSEditor;
			if(iPSTextBox.getWrapMode()!=null ) {
				params.put(EDITORPARAM_WRAPMODE, iPSTextBox.getWrapMode());
			}
			
			if(iPSTextBox.getHAlign()!=null ) {
				params.put(EDITORPARAM_HALIGN, iPSTextBox.getHAlign());
			}
			
			if(iPSTextBox.getVAlign()!=null ) {
				params.put(EDITORPARAM_VALIGN, iPSTextBox.getVAlign());
			}
		}
		
		if(iPSEditor instanceof IPSCodeListEditor) {
			IPSCodeListEditor iPSCodeListEditor = (IPSCodeListEditor)iPSEditor;
			if(iPSCodeListEditor.isAllItems()) {
				params.put(EDITORPARAM_ALLITEMS, "TRUE");
			}
			if(StringUtils.hasLength(iPSCodeListEditor.getAllItemsText())) {
				params.put(EDITORPARAM_ALLITEMSTEXT, iPSCodeListEditor.getAllItemsText());
			}
		}
		
		
		if(iPSEditor instanceof IPSAutoComplete) {
			IPSAutoComplete iPSAutoComplete = (IPSAutoComplete)iPSEditor;
			if(iPSAutoComplete.isEnableAC()) {
				params.put(EDITORPARAM_AC, "TRUE");
			}
			
			if(iPSAutoComplete.isForceSelection()) {
				params.put(EDITORPARAM_FORCESELECTION, "TRUE");
			}
			
			if(iPSAutoComplete.isShowTrigger()) {
				params.put(EDITORPARAM_TRIGGER, "TRUE");
			}
			
			if(iPSAutoComplete.getACMinChars() > 0) {
				params.put(EDITORPARAM_ACMINCHARS, Integer.toString(iPSAutoComplete.getACMinChars()));
			}
		}
		
		if(iPSEditor instanceof IPSPicture) {
			IPSPicture iPSTextBox = (IPSPicture)iPSEditor;
			if(iPSTextBox.isRawContent()) {
				params.put(EDITORPARAM_RAWCONTENT, "TRUE");
			}
			if(iPSTextBox.getOSSCat()!=null) {
				params.put(EDITORPARAM_OSSCAT, iPSTextBox.getOSSCat());
			}
		}
		
		
		if(iPSEditor instanceof IPSStepper) {
			IPSStepper iPSTextBox = (IPSStepper)iPSEditor;
			if(iPSTextBox.getStepValue()!=null ) {
				params.put(EDITORPARAM_STEPVALUE, Double.toString(iPSTextBox.getStepValue()));
			}
		}
		
		if(iPSEditor instanceof IPSSpan) {
			IPSSpan iPSSpan = (IPSSpan)iPSEditor;
			if(iPSSpan.isEnableLinkView()) {
				params.put(EDITORPARAM_LINKVIEW, "TRUE");
			}
			
			if(iPSSpan.getPrecision()!=null && iPSSpan.getPrecision()>0) {
				params.put(EDITORPARAM_PRECISION, Integer.toString(iPSSpan.getPrecision()));
			}
		}
		
		if(iPSEditor instanceof IPSMarkdown) {
			IPSMarkdown iPSMarkdown = (IPSMarkdown)iPSEditor;
			if(iPSMarkdown.getMode()!=null) {
				params.put(EDITORPARAM_MODE, iPSMarkdown.getMode());
			}
		}
		
		if(iPSEditor instanceof IPSMailAddress) {
			IPSMailAddress iPSMailAddress = (IPSMailAddress)iPSEditor;
			if(iPSMailAddress.isEnablePickupView()) {
				params.put(EDITORPARAM_PICKUPVIEW, "TRUE");
			}
		}
		
		if(iPSEditor instanceof IPSFileUploader) {
			IPSFileUploader iPSFileUploader = (IPSFileUploader)iPSEditor;
			if(iPSFileUploader.getFileExts()!=null) {
				params.put(EDITORPARAM_FILEEXTS, iPSFileUploader.getFileExts());
			}
			if(iPSFileUploader.getMaxFileCount()>0){
				params.put(EDITORPARAM_MAXFILECNT, Integer.toString(iPSFileUploader.getMaxFileCount()));
			}
			if(iPSFileUploader.getMinFileCount()>0){
				params.put(EDITORPARAM_MINFILECNT, Integer.toString(iPSFileUploader.getMinFileCount()));
			}
			if(iPSFileUploader.getMaxFileSize()>0){
				params.put(EDITORPARAM_MAXFILESIZE, Integer.toString(iPSFileUploader.getMaxFileSize()));
			}
			if(iPSFileUploader.getOSSCat()!=null) {
				params.put(EDITORPARAM_OSSCAT, iPSFileUploader.getOSSCat());
			}
		}
		
		if(iPSEditor instanceof IPSDatePicker) {
			IPSDatePicker iPSDatePicker = (IPSDatePicker)iPSEditor;
			if(iPSDatePicker.getDateTimeFormat()!=null) {
				params.put(EDITORPARAM_TIMEFMT, iPSDatePicker.getDateTimeFormat());
			}
		}
		
		if(iPSEditor instanceof IPSCode) {
			IPSCode iPSCode = (IPSCode)iPSEditor;
			if(iPSCode.getCodeType()!=null) {
				params.put(EDITORPARAM_CODETYPE, iPSCode.getCodeType());
			}
		}
		
		
		if(iPSEditor instanceof IPSNavigateParamContainer) {
			IPSNavigateParamContainer iPSNavigateParamContainer = (IPSNavigateParamContainer)iPSEditor;
			

			if(!ObjectUtils.isEmpty(iPSNavigateParamContainer.getPSNavigateParams())) {
				for(IPSNavigateParam iPSNavigateParam : iPSNavigateParamContainer.getPSNavigateParams()) {
					if(iPSNavigateParam.isRawValue()) {
						params.put(String.format("%1$s%2$s", VIEWPARAM_NAVPARAM, iPSNavigateParam.getKey()), iPSNavigateParam.getValue());
					}
					else {
						params.put(String.format("%1$s%2$s", VIEWPARAM_NAVPARAM, iPSNavigateParam.getKey()), String.format("%%%1$s%%", iPSNavigateParam.getValue()));
					}
				}
			}
			
			if(!ObjectUtils.isEmpty(iPSNavigateParamContainer.getPSNavigateContexts())) {
				for(IPSNavigateContext iPSNavigateContext : iPSNavigateParamContainer.getPSNavigateContexts()) {
					if(iPSNavigateContext.isRawValue()) {
						params.put(String.format("%1$s%2$s", VIEWPARAM_NAVCONTEXT, iPSNavigateContext.getKey()), iPSNavigateContext.getValue());
					}
					else {
						params.put(String.format("%1$s%2$s", VIEWPARAM_NAVCONTEXT, iPSNavigateContext.getKey()), String.format("%%%1$s%%", iPSNavigateContext.getValue()));
					}
				}
			}
		}
		
		
		
		if(ObjectUtils.isEmpty(params)) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		boolean bFirst = true;
		for(java.util.Map.Entry<String, String> entry: params.entrySet()){
			if(bFirst) {
				bFirst = false;
			}
			else {
				sb.append("\r\n");
			}
			
			sb.append(String.format("%1$s=%2$s", entry.getKey(), entry.getValue()));
			
		}
		
		return sb.toString();
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		objectNode.remove(PSEditorImpl.ATTR_GETID);
		objectNode.remove(PSEditorImpl.ATTR_GETCODENAME);
		
		
		String strEditorType = (String)domain.get("editortype");
		String strEditorStyle = (String)domain.get("editorstyle");
		objectNode.put(PSEditorImpl.ATTR_GETEDITORTYPE, strEditorType);
		if(StringUtils.hasLength(strEditorStyle)) {
			objectNode.put(PSEditorImpl.ATTR_GETEDITORSTYLE, strEditorStyle);
		}
		
		Map<String, String> editorItemMap = new LinkedHashMap<String, String>();
		
		if(domain instanceof PSDEFormDetail) {
			PSDEFormDetail psDEFormDetail = (PSDEFormDetail)domain;
			if(StringUtils.hasLength(psDEFormDetail.getPlaceHolder())) {
				objectNode.put(PSEditorImpl.ATTR_GETPLACEHOLDER, psDEFormDetail.getPlaceHolder());
			}
		
			if(StringUtils.hasLength(psDEFormDetail.getCtrlRawCssStyle())) {
				objectNode.put(PSEditorImpl.ATTR_GETCSSSTYLE, psDEFormDetail.getCtrlRawCssStyle());
			}
			
			if(StringUtils.hasLength(psDEFormDetail.getCtrlDynaClass())) {
				objectNode.put(PSEditorImpl.ATTR_GETDYNACLASS, psDEFormDetail.getCtrlDynaClass());
			}
			
			if(StringUtils.hasLength(psDEFormDetail.getPredefinedType())) {
				objectNode.put(PSEditorImpl.ATTR_GETPREDEFINEDTYPE, psDEFormDetail.getPredefinedType());
			}
		
			if(DataTypeUtils.getIntegerValue(psDEFormDetail.getCtrlWidth(), -1) > 0) {
				objectNode.put(PSEditorImpl.ATTR_GETEDITORWIDTH, psDEFormDetail.getCtrlWidth());
			}
			
			if(DataTypeUtils.getIntegerValue(psDEFormDetail.getCtrlHeight(), -1) > 0) {
				objectNode.put(PSEditorImpl.ATTR_GETEDITORHEIGHT, psDEFormDetail.getCtrlHeight());
			}
			
			String strPSEditorParams = psDEFormDetail.getEditorParams();
			if(StringUtils.hasLength(strPSEditorParams)) {
				setPSEditorParams(iPSModelTranspileContext, domain, objectNode, strPSEditorParams);
				//psDEFormDetail.setEditorParams(strPSEditorParams);
			}
			
			if(StringUtils.hasLength(psDEFormDetail.getPSCodeListId())) {
				objectNode.set(PSCodeListEditorImpl.ATTR_GETPSAPPCODELIST, iPSModelTranspileContext.getPSModelListTranspiler(IPSAppCodeList.class, false).getModelRef(iPSModelTranspileContext, psDEFormDetail.getPSCodeListId(), false, null));
			}
			
			if(StringUtils.hasLength(psDEFormDetail.getRefPSDEId())) {
				objectNode.set(PSAutoCompleteImpl.ATTR_GETPSAPPDATAENTITY, iPSModelTranspileContext.getPSModelListTranspiler(IPSAppDataEntity.class, false).getModelRef(iPSModelTranspileContext, psDEFormDetail.getRefPSDEId(), false, null));
			}
			
			if(StringUtils.hasLength(psDEFormDetail.getRefPSDEACModeId())) {
				objectNode.set(PSAutoCompleteImpl.ATTR_GETPSAPPDEACMODE, iPSModelTranspileContext.getPSModelListTranspiler(IPSAppDEACMode.class, false).getModelRef(iPSModelTranspileContext, psDEFormDetail.getRefPSDEACModeId(), false, null));
			}
			
			if(StringUtils.hasLength(psDEFormDetail.getRefPSDEDataSetId())) {
				objectNode.set(PSAutoCompleteImpl.ATTR_GETPSAPPDEDATASET, iPSModelTranspileContext.getPSModelListTranspiler(IPSAppDEDataSet.class, false).getModelRef(iPSModelTranspileContext, psDEFormDetail.getRefPSDEDataSetId(), false, null));
			}
			
			if(StringUtils.hasLength(psDEFormDetail.getValueItemName())) {
				objectNode.put(PSValueItemEditorImpl.ATTR_GETVALUEITEMNAME, psDEFormDetail.getValueItemName());
				editorItemMap.put(psDEFormDetail.getValueItemName(), "");
			}

			
			if(StringUtils.hasLength(psDEFormDetail.getPickupPSDEViewId())) {
				objectNode.set(PSPickerEditorImpl.ATTR_GETPICKUPPSAPPVIEW, iPSModelTranspileContext.getPSModelListTranspiler(IPSAppView.class, false).getModelRef(iPSModelTranspileContext, psDEFormDetail.getPickupPSDEViewId(), false, null));
			}
			
			if(StringUtils.hasLength(psDEFormDetail.getLinkPSDEViewId())) {
				objectNode.set(PSPickerImpl.ATTR_GETLINKPSAPPVIEW, iPSModelTranspileContext.getPSModelListTranspiler(IPSAppView.class, false).getModelRef(iPSModelTranspileContext, psDEFormDetail.getLinkPSDEViewId(), false, null));
			}
			
			String strPSSysValueRuleId = DataTypeUtils.asString(psDEFormDetail.get("pssysvalueruleid"), null);
			if(!ObjectUtils.isEmpty(strPSSysValueRuleId)) {
				objectNode.set(PSTextEditorImpl.ATTR_GETPSSYSVALUERULE, PSSysValueRuleListTranspilerEx.getPSAppValueRuleModel(iPSModelTranspileContext, strPSSysValueRuleId));
			}
			

			//额外输出编辑项
			if(!ObjectUtils.isEmpty(editorItemMap)) {
				ArrayNode editorItems = objectNode.putArray(PSEditorImpl.ATTR_GETPSEDITORITEMS);
				for(String item : editorItemMap.keySet()) {
					ObjectNode node = editorItems.addObject();
					node.put(PSEditorItemImpl.ATTR_GETNAME, item);
				}
			}
			
			

//			if(iPSEditor instanceof IPSPickerEditor) {
//				IPSPickerEditor iPSPickerEditor = (IPSPickerEditor)iPSEditor;
//				if(iPSPickerEditor.getPickupPSAppView() instanceof IPSAppDEView) {
//					psDEFormDetail.setPickupPSDEViewId(PSAppViewListTranspilerEx.getPSDEViewBaseId(iPSModelTranspileContext, (IPSAppDEView)iPSPickerEditor.getPickupPSAppView()));
//					psDEFormDetail.setPickupPSDEViewName(iPSPickerEditor.getPickupPSAppView().getTitle());
//				}
//			}
//			
//			if(iPSEditor instanceof IPSPicker) {
//				IPSPicker iPSPicker = (IPSPicker)iPSEditor;
//				if(iPSPicker.getLinkPSAppView() instanceof IPSAppDEView) {
//					psDEFormDetail.setLinkPSDEViewId(PSAppViewListTranspilerEx.getPSDEViewBaseId(iPSModelTranspileContext, (IPSAppDEView)iPSPicker.getLinkPSAppView()));
//					psDEFormDetail.setLinkPSDEViewName(iPSPicker.getLinkPSAppView().getTitle());
//				}
//			}
//			
//			if(iPSEditor instanceof IPSSpan) {
//				IPSSpan iPSSpan = (IPSSpan)iPSEditor;
//				if(iPSSpan.getLinkPSAppView() instanceof IPSAppDEView) {
//					psDEFormDetail.setLinkPSDEViewId(PSAppViewListTranspilerEx.getPSDEViewBaseId(iPSModelTranspileContext, (IPSAppDEView)iPSSpan.getLinkPSAppView()));
//					psDEFormDetail.setLinkPSDEViewName(iPSSpan.getLinkPSAppView().getTitle());
//				}
//			}
		}
	}
	
	public static void setPSEditorParams(IPSModelTranspileContext ipsModelTranspileContext, IPSModel domain, ObjectNode objectNode, String strPSEditorParams) throws Exception {
		Map<String, String> params = new LinkedHashMap<String, String>();
		
		InputStream inputStream = new ByteArrayInputStream(strPSEditorParams.getBytes("utf8"));
		Properties properties = new Properties();
		properties.load(inputStream);
		
		for(Object key : properties.keySet()) {
			String strValue = (String)properties.get(key);
			if(!StringUtils.hasLength(strValue)) {
				continue;
			}
			params.put((String)key, new String(strValue.getBytes("ISO-8859-1"), "utf8"));
		}
		
		ObjectNode editorParamsNode = objectNode.putObject(PSEditorImpl.ATTR_GETEDITORPARAMS);
		for(java.util.Map.Entry<String, String> entry : params.entrySet()) {
			editorParamsNode.put(entry.getKey(), entry.getValue());
		}
		
		//根据编辑器进行附加
		if(params.containsKey(EDITORPARAM_VALUETYPE)) {
			objectNode.put(PSEditorImpl.ATTR_GETVALUETYPE, params.get(EDITORPARAM_VALUETYPE));
		}
		
		if(params.containsKey(EDITORPARAM_OBJECTIDFIELD)) {
			objectNode.put(PSEditorImpl.ATTR_GETOBJECTIDFIELD, params.get(EDITORPARAM_OBJECTIDFIELD));
		}

		if(params.containsKey(EDITORPARAM_OBJECTNAMEFIELD)) {
			objectNode.put(PSEditorImpl.ATTR_GETOBJECTNAMEFIELD, params.get(EDITORPARAM_OBJECTNAMEFIELD));
		}
		
		if(params.containsKey(EDITORPARAM_OBJECTVALUEFIELD)) {
			objectNode.put(PSEditorImpl.ATTR_GETOBJECTVALUEFIELD, params.get(EDITORPARAM_OBJECTVALUEFIELD));
		}
		
		if(params.containsKey(EDITORPARAM_VALUESEPARATOR)) {
			objectNode.put(PSEditorImpl.ATTR_GETVALUESEPARATOR, params.get(EDITORPARAM_VALUESEPARATOR));
		}
		
		if(params.containsKey(EDITORPARAM_TEXTSEPARATOR)) {
			objectNode.put(PSEditorImpl.ATTR_GETTEXTSEPARATOR, params.get(EDITORPARAM_TEXTSEPARATOR));
		}
		
		
		if(params.containsKey(EDITORPARAM_MAXLENGTH)) {
			objectNode.put(PSTextEditorImpl.ATTR_GETMAXLENGTH, DataTypeUtils.getIntegerValue(params.get(EDITORPARAM_MAXLENGTH), null));
		}
		

		if(params.containsKey(EDITORPARAM_MINLENGTH)) {
			objectNode.put(PSTextEditorImpl.ATTR_GETMINLENGTH, DataTypeUtils.getIntegerValue(params.get(EDITORPARAM_MINLENGTH), null));
		}
		
		if(params.containsKey(EDITORPARAM_SHOWMAXLENGTH)) {
			objectNode.put(PSTextEditorImpl.ATTR_ISSHOWMAXLENGTH, DataTypeUtils.getBooleanValue(params.get(EDITORPARAM_SHOWMAXLENGTH), false));
		}
		
		if(params.containsKey(EDITORPARAM_MAXVALUE)) {
			objectNode.put(PSNumberEditorImpl.ATTR_GETMAXVALUE, DataTypeUtils.getDoubleValue(params.get(EDITORPARAM_MAXVALUE), null));
		}
		
		if(params.containsKey(EDITORPARAM_MINVALUE)) {
			objectNode.put(PSNumberEditorImpl.ATTR_GETMINVALUE, DataTypeUtils.getDoubleValue(params.get(EDITORPARAM_MINVALUE), null));
		}
		
		if(params.containsKey(EDITORPARAM_PRECISION)) {
			objectNode.put(PSNumberEditorImpl.ATTR_GETPRECISION, DataTypeUtils.getIntegerValue(params.get(EDITORPARAM_PRECISION), null));
		}
		
		
		if(params.containsKey(EDITORPARAM_WRAPMODE)) {
			objectNode.put(PSSpanImpl.ATTR_GETWRAPMODE, params.get(EDITORPARAM_WRAPMODE));
		}
		
		if(params.containsKey(EDITORPARAM_HALIGN)) {
			objectNode.put(PSSpanImpl.ATTR_GETHALIGN, params.get(EDITORPARAM_HALIGN));
		}
		
		if(params.containsKey(EDITORPARAM_VALIGN)) {
			objectNode.put(PSSpanImpl.ATTR_GETVALIGN, params.get(EDITORPARAM_VALIGN));
		}
		
		
		if(params.containsKey(EDITORPARAM_AC)) {
			objectNode.put(PSAutoCompleteImpl.ATTR_ISENABLEAC, DataTypeUtils.getBooleanValue(params.get(EDITORPARAM_AC), false));
		}
		
		if(params.containsKey(EDITORPARAM_FORCESELECTION)) {
			objectNode.put(PSAutoCompleteImpl.ATTR_ISFORCESELECTION, DataTypeUtils.getBooleanValue(params.get(EDITORPARAM_FORCESELECTION), false));
		}
		
		
		if(params.containsKey(EDITORPARAM_TRIGGER)) {
			objectNode.put(PSAutoCompleteImpl.ATTR_ISSHOWTRIGGER, DataTypeUtils.getBooleanValue(params.get(EDITORPARAM_TRIGGER), false));
		}
		
		if(params.containsKey(EDITORPARAM_ACMINCHARS)) {
			objectNode.put(PSAutoCompleteImpl.ATTR_GETACMINCHARS, DataTypeUtils.getIntegerValue(params.get(EDITORPARAM_ACMINCHARS), null));
		}
		
		if(params.containsKey(EDITORPARAM_RAWCONTENT)) {
			objectNode.put(PSPictureImpl.ATTR_ISRAWCONTENT, DataTypeUtils.getBooleanValue(params.get(EDITORPARAM_RAWCONTENT), false));
		}
		
		//此处包含了上传文件
		if(params.containsKey(EDITORPARAM_OSSCAT)) {
			objectNode.put(PSPictureImpl.ATTR_GETOSSCAT, params.get(EDITORPARAM_OSSCAT));
		}
		
		
		if(params.containsKey(EDITORPARAM_STEPVALUE)) {
			objectNode.put(PSStepperImpl.ATTR_GETSTEPVALUE, DataTypeUtils.getDoubleValue(params.get(EDITORPARAM_STEPVALUE), null));
		}
		
		

		if(params.containsKey(EDITORPARAM_LINKVIEW)) {
			objectNode.put(PSSpanImpl.ATTR_ISENABLELINKVIEW, DataTypeUtils.getBooleanValue(params.get(EDITORPARAM_LINKVIEW), false));
		}
		
		if(params.containsKey(EDITORPARAM_MODE)) {
			objectNode.put(PSMarkdownImpl.ATTR_GETMODE, params.get(EDITORPARAM_MODE));
		}
		
		
		if(params.containsKey(EDITORPARAM_PICKUPVIEW)) {
			objectNode.put(PSMailAddressImpl.ATTR_ISENABLEPICKUPVIEW, DataTypeUtils.getBooleanValue(params.get(EDITORPARAM_PICKUPVIEW), false));
		}
		
		

		if(params.containsKey(EDITORPARAM_FILEEXTS)) {
			objectNode.put(PSFileUploaderImpl.ATTR_GETFILEEXTS, params.get(EDITORPARAM_FILEEXTS));
		}
		
		
		if(params.containsKey(EDITORPARAM_MAXFILECNT)) {
			objectNode.put(PSFileUploaderImpl.ATTR_GETMAXFILECOUNT, DataTypeUtils.getIntegerValue(params.get(EDITORPARAM_MAXFILECNT), null));
		}
		
		
		if(params.containsKey(EDITORPARAM_MINFILECNT)) {
			objectNode.put(PSFileUploaderImpl.ATTR_GETMINFILECOUNT, DataTypeUtils.getIntegerValue(params.get(EDITORPARAM_MINFILECNT), null));
		}
		
		if(params.containsKey(EDITORPARAM_MAXFILESIZE)) {
			objectNode.put(PSFileUploaderImpl.ATTR_GETMAXFILESIZE, DataTypeUtils.getIntegerValue(params.get(EDITORPARAM_MAXFILESIZE), null));
		}
		
		

		if(params.containsKey(EDITORPARAM_TIMEFMT)) {
			objectNode.put(PSDatePickerImpl.ATTR_GETDATETIMEFORMAT, params.get(EDITORPARAM_TIMEFMT));
		}
		
		
		if(params.containsKey(EDITORPARAM_CODETYPE)) {
			objectNode.put(PSCodeImpl.ATTR_GETCODETYPE, params.get(EDITORPARAM_CODETYPE));
		}
		
		if(params.containsKey(EDITORPARAM_ALLITEMS)) {
			objectNode.put(PSCodeListEditorImpl.ATTR_ISALLITEMS, params.get(EDITORPARAM_ALLITEMS));
		}
		
		if(params.containsKey(EDITORPARAM_ALLITEMSTEXT)) {
			objectNode.put(PSCodeListEditorImpl.ATTR_GETALLITEMSTEXT, params.get(EDITORPARAM_ALLITEMSTEXT));
		}
		
		ArrayNode psNavigateContextArray = null;
		ArrayNode psNavigateParamArray = null;
		
		
		//构造导航上下文及参数
		for(java.util.Map.Entry<String, String> entry : params.entrySet()) {
			String strKey = entry.getKey();
			String strValue = entry.getValue();
			String strTag = strKey.toUpperCase();
			// 判断标记是否有导航视图上下文或是参数前缀
			if (strTag.indexOf(VIEWPARAM_NAVCONTEXT) == 0) {
				boolean bRawValue = true;
				strTag = strKey.substring(VIEWPARAM_NAVCONTEXT.length()).toUpperCase();
				if (!ObjectUtils.isEmpty(strValue)) {
					if ((strValue.charAt(0) == '%') && (strValue.charAt(strValue.length() - 1) == '%')) {
						strValue = strValue.replace("%", "");
						bRawValue = false;
					}
				}
				
				if(psNavigateContextArray == null) {
					psNavigateContextArray = objectNode.putArray(PSEditorImpl.ATTR_GETPSNAVIGATECONTEXTS);
				}
				
				ObjectNode psNavigateContextNode = psNavigateContextArray.addObject();
				psNavigateContextNode.put(PSNavigateContextImpl.ATTR_GETKEY, strTag);
				psNavigateContextNode.put(PSNavigateContextImpl.ATTR_GETNAME, strTag);
				psNavigateContextNode.put(PSNavigateContextImpl.ATTR_GETVALUE, strValue);
				psNavigateContextNode.put(PSNavigateContextImpl.ATTR_ISRAWVALUE, bRawValue);
				
				
				continue;
			}
			if (strTag.indexOf(VIEWPARAM_NAVPARAM) == 0) {
				boolean bRawValue = true;
				strTag = strKey.substring(VIEWPARAM_NAVPARAM.length()).toLowerCase();
				if (!ObjectUtils.isEmpty(strValue)) {
					if ((strValue.charAt(0) == '%') && (strValue.charAt(strValue.length() - 1) == '%')) {
						strValue = strValue.replace("%", "");
						bRawValue = false;
					}
				}
				
				if(psNavigateParamArray == null) {
					psNavigateParamArray = objectNode.putArray(PSEditorImpl.ATTR_GETPSNAVIGATEPARAMS);
				}
				
				ObjectNode psNavigateParamNode = psNavigateParamArray.addObject();
				psNavigateParamNode.put(PSNavigateParamImpl.ATTR_GETKEY, strTag);
				psNavigateParamNode.put(PSNavigateParamImpl.ATTR_GETNAME, strTag);
				psNavigateParamNode.put(PSNavigateParamImpl.ATTR_GETVALUE, strValue);
				psNavigateParamNode.put(PSNavigateParamImpl.ATTR_ISRAWVALUE, bRawValue);
				continue;
			}
		}
		
		
//		
//		if(iPSEditor instanceof IPSNavigateParamContainer) {
//			IPSNavigateParamContainer iPSNavigateParamContainer = (IPSNavigateParamContainer)iPSEditor;
//			
//
//			if(!ObjectUtils.isEmpty(iPSNavigateParamContainer.getPSNavigateParams())) {
//				for(IPSNavigateParam iPSNavigateParam : iPSNavigateParamContainer.getPSNavigateParams()) {
//					if(iPSNavigateParam.isRawValue()) {
//						params.put(String.format("%1$s%2$s", VIEWPARAM_NAVPARAM, iPSNavigateParam.getKey()), iPSNavigateParam.getValue());
//					}
//					else {
//						params.put(String.format("%1$s%2$s", VIEWPARAM_NAVPARAM, iPSNavigateParam.getKey()), String.format("%%%1$s%%", iPSNavigateParam.getValue()));
//					}
//				}
//			}
//			
//			if(!ObjectUtils.isEmpty(iPSNavigateParamContainer.getPSNavigateContexts())) {
//				for(IPSNavigateContext iPSNavigateContext : iPSNavigateParamContainer.getPSNavigateContexts()) {
//					if(iPSNavigateContext.isRawValue()) {
//						params.put(String.format("%1$s%2$s", VIEWPARAM_NAVCONTEXT, iPSNavigateContext.getKey()), iPSNavigateContext.getValue());
//					}
//					else {
//						params.put(String.format("%1$s%2$s", VIEWPARAM_NAVCONTEXT, iPSNavigateContext.getKey()), String.format("%%%1$s%%", iPSNavigateContext.getValue()));
//					}
//				}
//			}
//		}
//		
		
	}
}