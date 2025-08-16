package net.ibizsys.model.pub;



public class PSSysSFPubPkgImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.pub.IPSSysSFPubPkg{

	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPKGPARAM = "pkgParam";
	public final static String ATTR_GETPKGPARAM2 = "pkgParam2";
	public final static String ATTR_GETPKGPARAM3 = "pkgParam3";
	public final static String ATTR_GETPKGPARAM4 = "pkgParam4";
	public final static String ATTR_GETVERPARAM = "verParam";
	public final static String ATTR_GETVERTAG = "verTag";
	public final static String ATTR_GETVERTAG2 = "verTag2";

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getPkgParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPKGPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPkgParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPKGPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPkgParam3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPKGPARAM3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPkgParam4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPKGPARAM4);
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