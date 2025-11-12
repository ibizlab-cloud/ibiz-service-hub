package net.ibizsys.model.requirement;



public class PSSysReqModuleImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.requirement.IPSSysReqModule{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMODULESN = "moduleSN";
	public final static String ATTR_GETMODULETAG = "moduleTag";
	public final static String ATTR_GETMODULETAG2 = "moduleTag2";
	public final static String ATTR_GETPSSYSREQITEMS = "getPSSysReqItems";
	public final static String ATTR_GETPSSYSREQMODULES = "getPSSysReqModules";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPARENTPSSYSREQMODULE = "getParentPSSysReqModule";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULESN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> pssysreqitems = null;
	public java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> getPSSysReqItems(){
		if(this.pssysreqitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSREQITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> list = new java.util.ArrayList<net.ibizsys.model.requirement.IPSSysReqItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.requirement.IPSSysReqItem obj = this.getPSModelObject(net.ibizsys.model.requirement.IPSSysReqItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSREQITEMS);
				if(obj!=null)list.add(obj);
			}
			this.pssysreqitems = list;
		}
		return (this.pssysreqitems.size() == 0)? null : this.pssysreqitems;
	}

	public net.ibizsys.model.requirement.IPSSysReqItem getPSSysReqItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.requirement.IPSSysReqItem.class, this.getPSSysReqItems(), objKey, bTryMode);
	}
	public void setPSSysReqItems(java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> list){
		this.pssysreqitems = list;
	}

	private java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> pssysreqmodules = null;
	public java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> getPSSysReqModules(){
		if(this.pssysreqmodules == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSREQMODULES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> list = new java.util.ArrayList<net.ibizsys.model.requirement.IPSSysReqModule>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.requirement.IPSSysReqModule obj = this.getPSModelObject(net.ibizsys.model.requirement.IPSSysReqModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSREQMODULES);
				if(obj!=null)list.add(obj);
			}
			this.pssysreqmodules = list;
		}
		return (this.pssysreqmodules.size() == 0)? null : this.pssysreqmodules;
	}

	public net.ibizsys.model.requirement.IPSSysReqModule getPSSysReqModule(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.requirement.IPSSysReqModule.class, this.getPSSysReqModules(), objKey, bTryMode);
	}
	public void setPSSysReqModules(java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> list){
		this.pssysreqmodules = list;
	}
	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}

	public void setPSSystemModule(net.ibizsys.model.system.IPSSystemModule pssystemmodule){
		this.pssystemmodule = pssystemmodule;
	}

	private net.ibizsys.model.requirement.IPSSysReqModule parentpssysreqmodule;

	public net.ibizsys.model.requirement.IPSSysReqModule getParentPSSysReqModule(){
		if(this.parentpssysreqmodule != null) return this.parentpssysreqmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTPSSYSREQMODULE);
		if(value == null){
			return null;
		}
		this.parentpssysreqmodule = getPSModelObject(net.ibizsys.model.requirement.IPSSysReqModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPARENTPSSYSREQMODULE);
		return this.parentpssysreqmodule;
	}

	public net.ibizsys.model.requirement.IPSSysReqModule getParentPSSysReqModuleMust(){
		net.ibizsys.model.requirement.IPSSysReqModule value = this.getParentPSSysReqModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父模块");}
		return value;
	}

	public void setParentPSSysReqModule(net.ibizsys.model.requirement.IPSSysReqModule parentpssysreqmodule){
		this.parentpssysreqmodule = parentpssysreqmodule;
	}

}