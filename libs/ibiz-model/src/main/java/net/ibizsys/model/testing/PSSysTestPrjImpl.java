package net.ibizsys.model.testing;



public class PSSysTestPrjImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.testing.IPSSysTestPrj{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETPSAPPLICATION = "getPSApplication";
	public final static String ATTR_GETPSSYSSERVICEAPI = "getPSSysServiceAPI";
	public final static String ATTR_GETPSSYSTESTMODULES = "getPSSysTestModules";
	public final static String ATTR_GETPRJTAG = "prjTag";
	public final static String ATTR_GETPRJTAG2 = "prjTag2";
	public final static String ATTR_GETPRJTYPE = "prjType";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.IPSApplication psapplication;

	public net.ibizsys.model.app.IPSApplication getPSApplication(){
		if(this.psapplication != null) return this.psapplication;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPLICATION);
		if(value == null){
			return null;
		}
		this.psapplication = getPSModelObject(net.ibizsys.model.app.IPSApplication.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPLICATION);
		return this.psapplication;
	}

	public net.ibizsys.model.app.IPSApplication getPSApplicationMust(){
		net.ibizsys.model.app.IPSApplication value = this.getPSApplication();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统应用");}
		return value;
	}

	private net.ibizsys.model.service.IPSSysServiceAPI pssysserviceapi;

	public net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI(){
		if(this.pssysserviceapi != null) return this.pssysserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSERVICEAPI);
		if(value == null){
			return null;
		}
		this.pssysserviceapi = getPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSERVICEAPI);
		return this.pssysserviceapi;
	}

	public net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPIMust(){
		net.ibizsys.model.service.IPSSysServiceAPI value = this.getPSSysServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统服务接口");}
		return value;
	}


	private java.util.List<net.ibizsys.model.testing.IPSSysTestModule> pssystestmodules = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestModule> getPSSysTestModules(){
		if(this.pssystestmodules == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTMODULES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestModule> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestModule>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestModule obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSTESTMODULES);
				if(obj!=null)list.add(obj);
			}
			this.pssystestmodules = list;
		}
		return (this.pssystestmodules.size() == 0)? null : this.pssystestmodules;
	}

	public net.ibizsys.model.testing.IPSSysTestModule getPSSysTestModule(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestModule.class, this.getPSSysTestModules(), objKey, bTryMode);
	}
	public void setPSSysTestModules(java.util.List<net.ibizsys.model.testing.IPSSysTestModule> list){
		this.pssystestmodules = list;
	}

	public java.lang.String getPrjTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRJTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPrjTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRJTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPrjType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRJTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}