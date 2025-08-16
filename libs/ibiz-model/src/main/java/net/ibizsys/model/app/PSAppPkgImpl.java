package net.ibizsys.model.app;



public class PSAppPkgImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.IPSAppPkg{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETVERPARAM = "verParam";
	public final static String ATTR_GETVERPARAM2 = "verParam2";
	public final static String ATTR_GETVERPARAM3 = "verParam3";
	public final static String ATTR_GETVERPARAM4 = "verParam4";
	public final static String ATTR_GETVERTAG = "verTag";
	public final static String ATTR_GETVERTAG2 = "verTag2";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVerParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVERPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVerParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVERPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVerParam3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVERPARAM3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVerParam4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVERPARAM4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVerTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVerTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVERTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}