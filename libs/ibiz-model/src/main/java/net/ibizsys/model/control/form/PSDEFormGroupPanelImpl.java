package net.ibizsys.model.control.form;



public class PSDEFormGroupPanelImpl extends net.ibizsys.model.control.form.PSDEFormBaseGroupPanelImpl implements net.ibizsys.model.control.form.IPSDEFormGroupPanel{

	public final static String ATTR_GETACTIONGROUPEXTRACTMODE = "actionGroupExtractMode";
	public final static String ATTR_GETBUILDINACTIONS = "buildInActions";
	public final static String ATTR_GETPSUIACTIONGROUP = "getPSUIActionGroup";
	public final static String ATTR_GETTITLEBARCLOSEMODE = "titleBarCloseMode";
	public final static String ATTR_ISINFOGROUPMODE = "infoGroupMode";

	public java.lang.String getActionGroupExtractMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONGROUPEXTRACTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getBuildInActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUILDINACTIONS);
		if(value == null){
			return 0;
		}
		return value.asInt();
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


	public int getTitleBarCloseMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEBARCLOSEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isInfoGroupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINFOGROUPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}