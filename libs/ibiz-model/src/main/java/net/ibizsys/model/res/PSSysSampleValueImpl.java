package net.ibizsys.model.res;



public class PSSysSampleValueImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysSampleValue{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETRANDOMVALUE = "randomValue";
	public final static String ATTR_GETVALUE = "value";
	public final static String ATTR_ISNULLVALUE = "nullValue";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
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


	public java.lang.String getRandomValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRANDOMVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isNullValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNULLVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}