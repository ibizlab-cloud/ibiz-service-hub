package net.ibizsys.model.dataentity.ds;



public class PSDEDataQueryCodeCondImp extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond{

	public final static String ATTR_GETCONDTYPE = "condType";
	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETCUSTOMTYPE = "customType";

	public java.lang.String getCondType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMCOND);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}