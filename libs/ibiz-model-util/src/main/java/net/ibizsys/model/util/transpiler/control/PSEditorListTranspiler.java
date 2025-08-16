package net.ibizsys.model.util.transpiler.control;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSEditorListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "AC":
			case "AC_FS":
			case "AC_FS_NOBUTTON":
			case "AC_NOBUTTON":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSAutoCompleteImpl.class, false);
			case "ADDRESSPICKUP":
			case "ADDRESSPICKUP_AC":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSMailAddressImpl.class, false);
			case "ARRAY":
			case "MOBARRAY":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSArrayImpl.class, false);
			case "CHECKBOX":
			case "MOBSWITCH":
			case "SWITCH":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSCheckBoxImpl.class, false);
			case "CHECKBOXLIST":
			case "MOBCHECKLIST":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSCheckBoxListImpl.class, false);
			case "CODE":
			case "MOBCODE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSCodeImpl.class, false);
			case "COLORPICKER":
			case "MOBCOLORPICKER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSColorPickerImpl.class, false);
			case "DATEPICKER":
			case "DATEPICKEREX":
			case "DATEPICKEREX_HOUR":
			case "DATEPICKEREX_MINUTE":
			case "DATEPICKEREX_NODAY":
			case "DATEPICKEREX_NODAY_NOSECOND":
			case "DATEPICKEREX_NOTIME":
			case "DATEPICKEREX_SECOND":
			case "MOBDATE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSDatePickerImpl.class, false);
			case "DATERANGE":
			case "MOBDATERANGE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSDateRangeImpl.class, false);
			case "DROPDOWNLIST":
			case "DROPDOWNLIST_100":
			case "MOBDROPDOWNLIST":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSDropDownListImpl.class, false);
			case "FILEUPLOADER":
			case "FILEUPLOADERONE":
			case "MOBMULTIFILEUPLOAD":
			case "MOBSINGLEFILEUPLOAD":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSFileUploaderImpl.class, false);
			case "HIDDEN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSHiddenImpl.class, false);
			case "HTMLEDITOR":
			case "MOBHTMLTEXT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSHtmlImpl.class, false);
			case "IPADDRESSTEXTBOX":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSIPAddressImpl.class, false);
			case "LISTBOX":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSListBoxImpl.class, false);
			case "LISTBOXPICKUP":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSListBoxPickerImpl.class, false);
			case "MAPPICKER":
			case "MOBMAPPICKER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSMapPickerImpl.class, false);
			case "MARKDOWN":
			case "MOBMARKDOWN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSMarkdownImpl.class, false);
			case "MDROPDOWNLIST":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSMDropDownListImpl.class, false);
			case "MOBMPICKER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSMPickerImpl.class, false);
			case "MOBNUMBER":
			case "NUMBER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSNumberEditorImpl.class, false);
			case "MOBNUMBERRANGE":
			case "NUMBERRANGE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSNumberRangeImpl.class, false);
			case "MOBPASSWORD":
			case "PASSWORD":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSPasswordImpl.class, false);
			case "MOBPICKER":
			case "MOBPICKER_DROPDOWNVIEW":
			case "PICKER":
			case "PICKEREX_DROPDOWNVIEW":
			case "PICKEREX_DROPDOWNVIEW_LINK":
			case "PICKEREX_LINK":
			case "PICKEREX_LINKONLY":
			case "PICKEREX_NOAC":
			case "PICKEREX_NOAC_LINK":
			case "PICKEREX_NOBUTTON":
			case "PICKEREX_TRIGGER":
			case "PICKEREX_TRIGGER_LINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSPickerImpl.class, false);
			case "MOBPICTURE":
			case "MOBPICTURELIST":
			case "PICTURE":
			case "PICTURE_ONE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSPictureImpl.class, false);
			case "MOBRADIOLIST":
			case "RADIOBUTTONLIST":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSRadioButtonListImpl.class, false);
			case "MOBRATING":
			case "RATING":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSRatingImpl.class, false);
			case "MOBSLIDER":
			case "SLIDER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSSliderImpl.class, false);
			case "MOBSTEPPER":
			case "STEPPER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSStepperImpl.class, false);
			case "MOBTEXT":
			case "TEXTBOX":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSTextBoxImpl.class, false);
			case "MOBTEXTAREA":
			case "TEXTAREA":
			case "TEXTAREA_10":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSTextAreaImpl.class, false);
			case "OFFICEEDITOR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSOfficeImpl.class, false);
			case "OFFICEEDITOR2":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSOffice2Impl.class, false);
			case "PICKUPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSPickupViewImpl.class, false);
			case "PREDEFINED":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSPredefinedImpl.class, false);
			case "RAW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSRawImpl.class, false);
			case "SPAN":
			case "SPANEX":
			case "SPAN_LINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.editor.PSSpanImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.PSEditorImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.IPSEditor iPSEditor = (net.ibizsys.model.control.IPSEditor)iPSModelObject;
		Object type = iPSEditor.getEditorType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("editortype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}