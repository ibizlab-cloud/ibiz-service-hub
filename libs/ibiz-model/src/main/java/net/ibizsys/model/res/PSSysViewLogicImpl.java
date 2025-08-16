package net.ibizsys.model.res;



public class PSSysViewLogicImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysViewLogic{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETLOGICTYPE = "logicType";
	public final static String ATTR_GETVIEWLOGICSTYLE = "viewLogicStyle";
	public final static String ATTR_GETVIEWLOGICTYPE = "viewLogicType";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getViewLogicStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWLOGICSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getViewLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWLOGICTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}