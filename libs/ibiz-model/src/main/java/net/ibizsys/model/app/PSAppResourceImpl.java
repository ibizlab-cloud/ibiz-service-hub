package net.ibizsys.model.app;



public class PSAppResourceImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.IPSAppResource{

	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETRESTAG = "resTag";
	public final static String ATTR_GETRESOURCETYPE = "resourceType";

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
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

	public java.lang.String getResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getResourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESOURCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}