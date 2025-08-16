package net.ibizsys.model.dataentity.defield;



public abstract class PSDEFieldBaseImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.defield.IPSDEFieldBase{

	public final static String ATTR_GETMAXVALUESTRING = "maxValueString";
	public final static String ATTR_GETMINSTRINGLENGTH = "minStringLength";
	public final static String ATTR_GETMINVALUESTRING = "minValueString";
	public final static String ATTR_GETPRECISION = "precision";
	public final static String ATTR_GETSTRINGLENGTH = "stringLength";

	public java.lang.String getMaxValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMinStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMinValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}