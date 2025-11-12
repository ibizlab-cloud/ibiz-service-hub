package net.ibizsys.model.control.form;



public class PSDEFormButtonListImpl extends net.ibizsys.model.control.form.PSDEFormDetailImpl implements net.ibizsys.model.control.form.IPSDEFormButtonList{

	public final static String ATTR_GETACTIONGROUPEXTRACTMODE = "actionGroupExtractMode";
	public final static String ATTR_GETBUTTONLISTTYPE = "buttonListType";
	public final static String ATTR_GETPSDEFORMBUTTONS = "getPSDEFormButtons";
	public final static String ATTR_GETPSUIACTIONGROUP = "getPSUIActionGroup";

	public java.lang.String getActionGroupExtractMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONGROUPEXTRACTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getButtonListType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONLISTTYPE);
		if(value == null){
			return "UIACTIONGROUP";
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEFormButton> psdeformbuttons = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFormButton> getPSDEFormButtons(){
		if(this.psdeformbuttons == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMBUTTONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFormButton> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFormButton>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFormButton obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFormButton.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFORMBUTTONS);
				if(obj!=null)list.add(obj);
			}
			this.psdeformbuttons = list;
		}
		return (this.psdeformbuttons.size() == 0)? null : this.psdeformbuttons;
	}

	public net.ibizsys.model.control.form.IPSDEFormButton getPSDEFormButton(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFormButton.class, this.getPSDEFormButtons(), objKey, bTryMode);
	}
	public void setPSDEFormButtons(java.util.List<net.ibizsys.model.control.form.IPSDEFormButton> list){
		this.psdeformbuttons = list;
	}
	private net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup;

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup(){
		if(this.psuiactiongroup != null) return this.psuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.psuiactiongroup = getPSModelObject(net.ibizsys.model.view.IPSUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSUIACTIONGROUP);
		return this.psuiactiongroup;
	}

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust(){
		net.ibizsys.model.view.IPSUIActionGroup value = this.getPSUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组对象");}
		return value;
	}

	public void setPSUIActionGroup(net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup){
		this.psuiactiongroup = psuiactiongroup;
	}

}