package net.ibizsys.model.control.editor;



public class PSPickerImpl extends net.ibizsys.model.control.editor.PSPickerEditorImpl implements net.ibizsys.model.control.editor.IPSPicker{

	public final static String ATTR_GETDROPDOWNVIEWHEIGHT = "dropDownViewHeight";
	public final static String ATTR_GETDROPDOWNVIEWWIDTH = "dropDownViewWidth";
	public final static String ATTR_GETLINKPSAPPVIEW = "getLinkPSAppView";
	public final static String ATTR_ISDROPDOWNVIEW = "dropDownView";
	public final static String ATTR_ISENABLELINKVIEW = "enableLinkView";
	public final static String ATTR_ISENABLEPICKUPVIEW = "enablePickupView";
	public final static String ATTR_ISSINGLESELECT = "singleSelect";

	public java.lang.Integer getDropDownViewHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDROPDOWNVIEWHEIGHT);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getDropDownViewWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDROPDOWNVIEWWIDTH);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.view.IPSAppView linkpsappview;

	public net.ibizsys.model.app.view.IPSAppView getLinkPSAppView(){
		if(this.linkpsappview != null) return this.linkpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.linkpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETLINKPSAPPVIEW);
		return this.linkpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getLinkPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getLinkPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据链接视图");}
		return value;
	}

	public void setLinkPSAppView(net.ibizsys.model.app.view.IPSAppView linkpsappview){
		this.linkpsappview = linkpsappview;
	}


	public boolean isDropDownView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDROPDOWNVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableLinkView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLELINKVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnablePickupView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPICKUPVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSingleSelect(){
		return true;
	}
}