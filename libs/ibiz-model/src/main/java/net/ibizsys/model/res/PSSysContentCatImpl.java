package net.ibizsys.model.res;



public class PSSysContentCatImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysContentCat{

	public final static String ATTR_GETCATTAG = "catTag";
	public final static String ATTR_GETCATTAG2 = "catTag2";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSCONTENTS = "getPSSysContents";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";

	public java.lang.String getCatTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCATTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCatTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCATTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.res.IPSSysContent> pssyscontents = null;
	public java.util.List<net.ibizsys.model.res.IPSSysContent> getPSSysContents(){
		if(this.pssyscontents == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCONTENTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysContent> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysContent>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysContent obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysContent.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSCONTENTS);
				if(obj!=null)list.add(obj);
			}
			this.pssyscontents = list;
		}
		return (this.pssyscontents.size() == 0)? null : this.pssyscontents;
	}

	public net.ibizsys.model.res.IPSSysContent getPSSysContent(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysContent.class, this.getPSSysContents(), objKey, bTryMode);
	}
	public void setPSSysContents(java.util.List<net.ibizsys.model.res.IPSSysContent> list){
		this.pssyscontents = list;
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

}