package net.ibizsys.model.search;



public class PSSysSearchDocImpl extends net.ibizsys.model.search.PSSysSearchSchemeObjectImpl implements net.ibizsys.model.search.IPSSysSearchDoc{

	public final static String ATTR_GETALLPSSYSSEARCHFIELDS = "getAllPSSysSearchFields";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDOCPARAMS = "docParams";
	public final static String ATTR_GETDOCTAG = "docTag";
	public final static String ATTR_GETDOCTAG2 = "docTag2";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETREPLICAS = "replicas";
	public final static String ATTR_GETSHARDS = "shards";

	private java.util.List<net.ibizsys.model.search.IPSSysSearchField> allpssyssearchfields = null;
	public java.util.List<net.ibizsys.model.search.IPSSysSearchField> getAllPSSysSearchFields(){
		if(this.allpssyssearchfields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSEARCHFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.search.IPSSysSearchField> list = new java.util.ArrayList<net.ibizsys.model.search.IPSSysSearchField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.search.IPSSysSearchField obj = this.getPSModelObject(net.ibizsys.model.search.IPSSysSearchField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSEARCHFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyssearchfields = list;
		}
		return (this.allpssyssearchfields.size() == 0)? null : this.allpssyssearchfields;
	}

	public net.ibizsys.model.search.IPSSysSearchField getPSSysSearchField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.search.IPSSysSearchField.class, this.getAllPSSysSearchFields(), objKey, bTryMode);
	}
	public void setPSSysSearchFields(java.util.List<net.ibizsys.model.search.IPSSysSearchField> list){
		this.allpssyssearchfields = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getDocParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDOCPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getDocTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDOCTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDocTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDOCTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getReplicas(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPLICAS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getShards(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHARDS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}