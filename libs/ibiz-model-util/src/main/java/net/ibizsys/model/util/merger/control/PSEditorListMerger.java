package net.ibizsys.model.util.merger.control;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSEditorListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.IPSEditor.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.IPSEditor.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.IPSEditor.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.IPSEditor.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("editorType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "AC":
			case "AC_FS":
			case "AC_FS_NOBUTTON":
			case "AC_NOBUTTON":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSAutoCompleteImpl.class, false);
			case "ADDRESSPICKUP":
			case "ADDRESSPICKUP_AC":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSMailAddressImpl.class, false);
			case "ARRAY":
			case "MOBARRAY":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSArrayImpl.class, false);
			case "CHECKBOX":
			case "MOBSWITCH":
			case "SWITCH":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSCheckBoxImpl.class, false);
			case "CHECKBOXLIST":
			case "MOBCHECKLIST":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSCheckBoxListImpl.class, false);
			case "CODE":
			case "MOBCODE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSCodeImpl.class, false);
			case "COLORPICKER":
			case "MOBCOLORPICKER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSColorPickerImpl.class, false);
			case "DATEPICKER":
			case "DATEPICKEREX":
			case "DATEPICKEREX_HOUR":
			case "DATEPICKEREX_MINUTE":
			case "DATEPICKEREX_NODAY":
			case "DATEPICKEREX_NODAY_NOSECOND":
			case "DATEPICKEREX_NOTIME":
			case "DATEPICKEREX_SECOND":
			case "MOBDATE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSDatePickerImpl.class, false);
			case "DATERANGE":
			case "MOBDATERANGE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSDateRangeImpl.class, false);
			case "DROPDOWNLIST":
			case "DROPDOWNLIST_100":
			case "MOBDROPDOWNLIST":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSDropDownListImpl.class, false);
			case "FILEUPLOADER":
			case "FILEUPLOADERONE":
			case "MOBMULTIFILEUPLOAD":
			case "MOBSINGLEFILEUPLOAD":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSFileUploaderImpl.class, false);
			case "HIDDEN":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSHiddenImpl.class, false);
			case "HTMLEDITOR":
			case "MOBHTMLTEXT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSHtmlImpl.class, false);
			case "IPADDRESSTEXTBOX":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSIPAddressImpl.class, false);
			case "LISTBOX":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSListBoxImpl.class, false);
			case "LISTBOXPICKUP":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSListBoxPickerImpl.class, false);
			case "MAPPICKER":
			case "MOBMAPPICKER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSMapPickerImpl.class, false);
			case "MARKDOWN":
			case "MOBMARKDOWN":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSMarkdownImpl.class, false);
			case "MDROPDOWNLIST":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSMDropDownListImpl.class, false);
			case "MOBMPICKER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSMPickerImpl.class, false);
			case "MOBNUMBER":
			case "NUMBER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSNumberEditorImpl.class, false);
			case "MOBNUMBERRANGE":
			case "NUMBERRANGE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSNumberRangeImpl.class, false);
			case "MOBPASSWORD":
			case "PASSWORD":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSPasswordImpl.class, false);
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
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSPickerImpl.class, false);
			case "MOBPICTURE":
			case "MOBPICTURELIST":
			case "PICTURE":
			case "PICTURE_ONE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSPictureImpl.class, false);
			case "MOBRADIOLIST":
			case "RADIOBUTTONLIST":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSRadioButtonListImpl.class, false);
			case "MOBRATING":
			case "RATING":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSRatingImpl.class, false);
			case "MOBSLIDER":
			case "SLIDER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSSliderImpl.class, false);
			case "MOBSTEPPER":
			case "STEPPER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSStepperImpl.class, false);
			case "MOBTEXT":
			case "TEXTBOX":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSTextBoxImpl.class, false);
			case "MOBTEXTAREA":
			case "TEXTAREA":
			case "TEXTAREA_10":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSTextAreaImpl.class, false);
			case "OFFICEEDITOR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSOfficeImpl.class, false);
			case "OFFICEEDITOR2":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSOffice2Impl.class, false);
			case "PICKUPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSPickupViewImpl.class, false);
			case "PREDEFINED":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSPredefinedImpl.class, false);
			case "RAW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSRawImpl.class, false);
			case "SPAN":
			case "SPANEX":
			case "SPAN_LINK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.editor.PSSpanImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.PSEditorImpl.class, false);
		}
	}
}