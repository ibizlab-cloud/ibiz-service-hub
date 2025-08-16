package net.ibizsys.model.app;



public class PSAppMethodDTOImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.IPSAppMethodDTO{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPMETHODDTOFIELDS = "getPSAppMethodDTOFields";
	public final static String ATTR_GETSOURCETYPE = "sourceType";
	public final static String ATTR_GETTAG = "tag";
	public final static String ATTR_GETTAG2 = "tag2";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.app.IPSAppMethodDTOField> psappmethoddtofields = null;
	public java.util.List<net.ibizsys.model.app.IPSAppMethodDTOField> getPSAppMethodDTOFields(){
		if(this.psappmethoddtofields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPMETHODDTOFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSAppMethodDTOField> list = new java.util.ArrayList<net.ibizsys.model.app.IPSAppMethodDTOField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSAppMethodDTOField obj = this.getPSModelObject(net.ibizsys.model.app.IPSAppMethodDTOField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPMETHODDTOFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.psappmethoddtofields = list;
		}
		return (this.psappmethoddtofields.size() == 0)? null : this.psappmethoddtofields;
	}

	public net.ibizsys.model.app.IPSAppMethodDTOField getPSAppMethodDTOField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSAppMethodDTOField.class, this.getPSAppMethodDTOFields(), objKey, bTryMode);
	}
	public void setPSAppMethodDTOFields(java.util.List<net.ibizsys.model.app.IPSAppMethodDTOField> list){
		this.psappmethoddtofields = list;
	}

	public java.lang.String getSourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSOURCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}