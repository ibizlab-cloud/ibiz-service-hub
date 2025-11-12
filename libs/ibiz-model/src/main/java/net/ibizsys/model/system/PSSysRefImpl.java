package net.ibizsys.model.system;



public class PSSysRefImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.system.IPSSysRef{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETREFPARAM = "refParam";
	public final static String ATTR_GETREFPARAM2 = "refParam2";
	public final static String ATTR_GETREFPARAM3 = "refParam3";
	public final static String ATTR_GETREFPARAM4 = "refParam4";
	public final static String ATTR_GETREFPARAMS = "refParams";
	public final static String ATTR_GETREFSERVICEID = "refServiceId";
	public final static String ATTR_GETSYSCODENAME = "sysCodeName";
	public final static String ATTR_GETSYSNAME = "sysName";
	public final static String ATTR_GETSYSPKGNAME = "sysPkgName";
	public final static String ATTR_GETSYSREFTAG = "sysRefTag";
	public final static String ATTR_GETSYSREFTYPE = "sysRefType";
	public final static String ATTR_GETSYSSRVCODENAME = "sysSrvCodeName";
	public final static String ATTR_GETSYSVCNAME = "sysVCName";

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}


	public java.lang.String getRefParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefParam3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPARAM3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefParam4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPARAM4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getRefParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getRefServiceId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFSERVICEID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysPkgName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSPKGNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysRefTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSREFTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysRefType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSREFTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysSrvCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSSRVCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysVCName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSVCNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}