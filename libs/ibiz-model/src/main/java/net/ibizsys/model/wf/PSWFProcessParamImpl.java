package net.ibizsys.model.wf;



public class PSWFProcessParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.IPSWFProcessParam{

	public final static String ATTR_GETDSTFIELD = "dstField";
	public final static String ATTR_GETSRCVALUE = "srcValue";
	public final static String ATTR_GETSRCVALUETYPE = "srcValueType";
	public final static String ATTR_GETUSERDATA = "userData";
	public final static String ATTR_GETUSERDATA2 = "userData2";

	public java.lang.String getDstField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSrcValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSrcValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}