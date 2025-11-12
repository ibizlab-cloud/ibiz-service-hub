package net.ibizsys.model.uml;



public class PSSysUCMapImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.uml.IPSSysUCMap{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSUCMAPNODES = "getPSSysUCMapNodes";
	public final static String ATTR_GETPSSYSUSECASERSS = "getPSSysUseCaseRSs";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETUCMAPSN = "uCMapSN";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.uml.IPSSysUCMapNode> pssysucmapnodes = null;
	public java.util.List<net.ibizsys.model.uml.IPSSysUCMapNode> getPSSysUCMapNodes(){
		if(this.pssysucmapnodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUCMAPNODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.uml.IPSSysUCMapNode> list = new java.util.ArrayList<net.ibizsys.model.uml.IPSSysUCMapNode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.uml.IPSSysUCMapNode obj = this.getPSModelObject(net.ibizsys.model.uml.IPSSysUCMapNode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSUCMAPNODES);
				if(obj!=null)list.add(obj);
			}
			this.pssysucmapnodes = list;
		}
		return (this.pssysucmapnodes.size() == 0)? null : this.pssysucmapnodes;
	}

	public net.ibizsys.model.uml.IPSSysUCMapNode getPSSysUCMapNode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.uml.IPSSysUCMapNode.class, this.getPSSysUCMapNodes(), objKey, bTryMode);
	}
	public void setPSSysUCMapNodes(java.util.List<net.ibizsys.model.uml.IPSSysUCMapNode> list){
		this.pssysucmapnodes = list;
	}

	private java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> pssysusecaserss = null;
	public java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> getPSSysUseCaseRSs(){
		if(this.pssysusecaserss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSECASERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> list = new java.util.ArrayList<net.ibizsys.model.uml.IPSSysUseCaseRS>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.uml.IPSSysUseCaseRS obj = this.getPSModelObject(net.ibizsys.model.uml.IPSSysUseCaseRS.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSUSECASERSS);
				if(obj!=null)list.add(obj);
			}
			this.pssysusecaserss = list;
		}
		return (this.pssysusecaserss.size() == 0)? null : this.pssysusecaserss;
	}

	public net.ibizsys.model.uml.IPSSysUseCaseRS getPSSysUseCaseRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.uml.IPSSysUseCaseRS.class, this.getPSSysUseCaseRSs(), objKey, bTryMode);
	}
	public void setPSSysUseCaseRs(java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> list){
		this.pssysusecaserss = list;
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


	public java.lang.String getUCMapSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUCMAPSN);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}