package net.ibizsys.model.wf;



public class PSWFWorkTimeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.wf.IPSWFWorkTime{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETUSERDATA = "userData";
	public final static String ATTR_GETUSERDATA2 = "userData2";
	public final static String ATTR_GETWFWORKTIMESN = "wFWorkTimeSN";

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

	public java.lang.String getWFWorkTimeSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFWORKTIMESN);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}