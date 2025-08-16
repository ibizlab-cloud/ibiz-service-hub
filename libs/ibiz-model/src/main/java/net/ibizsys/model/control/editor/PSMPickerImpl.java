package net.ibizsys.model.control.editor;



public class PSMPickerImpl extends net.ibizsys.model.control.editor.PSPickerImpl implements net.ibizsys.model.control.editor.IPSMPicker{

	public final static String ATTR_ISSINGLESELECT = "singleSelect";

	public boolean isSingleSelect(){
		return false;
	}
}