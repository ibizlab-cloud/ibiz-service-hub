package net.ibizsys.model.control.form;



public class PSDEFormFormPartImpl extends net.ibizsys.model.control.form.PSDEFormBaseGroupPanelImpl implements net.ibizsys.model.control.form.IPSDEFormFormPart{

	public final static String ATTR_GETACTIONGROUPEXTRACTMODE = "actionGroupExtractMode";
	public final static String ATTR_GETBUILDINACTIONS = "buildInActions";
	public final static String ATTR_GETFORMPARTTYPE = "formPartType";
	public final static String ATTR_GETPSDEFORMDETAILS = "getPSDEFormDetails";
	public final static String ATTR_GETPSUIACTIONGROUP = "getPSUIActionGroup";
	public final static String ATTR_ISENABLEANCHOR = "enableAnchor";

	@Deprecated
	public java.lang.String getActionGroupExtractMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONGROUPEXTRACTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getBuildInActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUILDINACTIONS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getFormPartType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMPARTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> psdeformdetails = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> getPSDEFormDetails(){
		if(this.psdeformdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFormDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFormDetail obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFormDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFORMDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psdeformdetails = list;
		}
		return (this.psdeformdetails.size() == 0)? null : this.psdeformdetails;
	}

	public net.ibizsys.model.control.form.IPSDEFormDetail getPSDEFormDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFormDetail.class, this.getPSDEFormDetails(), objKey, bTryMode);
	}
	public void setPSDEFormDetails(java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> list){
		this.psdeformdetails = list;
	}
	private net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup;

	@Deprecated
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSUIActionGroup]返回空值");}
		return value;
	}

	public void setPSUIActionGroup(net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup){
		this.psuiactiongroup = psuiactiongroup;
	}


	@Deprecated
	public boolean isEnableAnchor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEANCHOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}