package net.ibizsys.model.er;



public class PSSysERMapImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.er.IPSSysERMap{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETERMAPSN = "eRMapSN";
	public final static String ATTR_GETPSSYSERMAPNODES = "getPSSysERMapNodes";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getERMapSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERMAPSN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.er.IPSSysERMapNode> pssysermapnodes = null;
	public java.util.List<net.ibizsys.model.er.IPSSysERMapNode> getPSSysERMapNodes(){
		if(this.pssysermapnodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSERMAPNODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.er.IPSSysERMapNode> list = new java.util.ArrayList<net.ibizsys.model.er.IPSSysERMapNode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.er.IPSSysERMapNode obj = this.getPSModelObject(net.ibizsys.model.er.IPSSysERMapNode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSERMAPNODES);
				if(obj!=null)list.add(obj);
			}
			this.pssysermapnodes = list;
		}
		return (this.pssysermapnodes.size() == 0)? null : this.pssysermapnodes;
	}

	public net.ibizsys.model.er.IPSSysERMapNode getPSSysERMapNode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.er.IPSSysERMapNode.class, this.getPSSysERMapNodes(), objKey, bTryMode);
	}
	public void setPSSysERMapNodes(java.util.List<net.ibizsys.model.er.IPSSysERMapNode> list){
		this.pssysermapnodes = list;
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

}