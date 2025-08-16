package net.ibizsys.model.control.form;



public class PSDEFDGroupLogicImpl extends net.ibizsys.model.control.form.PSDEFDLogicImpl implements net.ibizsys.model.control.form.IPSDEFDGroupLogic{

	public final static String ATTR_GETGROUPOP = "groupOP";
	public final static String ATTR_GETPSDEFDLOGICS = "getPSDEFDLogics";
	public final static String ATTR_ISNOTMODE = "notMode";

	public java.lang.String getGroupOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEFDLogic> psdefdlogics = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFDLogic> getPSDEFDLogics(){
		if(this.psdefdlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFDLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFDLogic> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFDLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFDLogic obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFDLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFDLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.psdefdlogics = list;
		}
		return (this.psdefdlogics.size() == 0)? null : this.psdefdlogics;
	}

	public net.ibizsys.model.control.form.IPSDEFDLogic getPSDEFDLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFDLogic.class, this.getPSDEFDLogics(), objKey, bTryMode);
	}
	public void setPSDEFDLogics(java.util.List<net.ibizsys.model.control.form.IPSDEFDLogic> list){
		this.psdefdlogics = list;
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}