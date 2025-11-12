package net.ibizsys.model.service;



public class PSSubSysServiceAPIMethodInputImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput{

	public final static String ATTR_GETKEYPSSUBSYSSERVICEAPIFIELD = "getKeyPSSubSysServiceAPIField";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDTO = "getPSSubSysServiceAPIDTO";
	public final static String ATTR_GETTYPE = "type";
	private net.ibizsys.model.service.IPSSubSysServiceAPIDEField keypssubsysserviceapifield;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEField getKeyPSSubSysServiceAPIField(){
		if(this.keypssubsysserviceapifield != null) return this.keypssubsysserviceapifield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSSUBSYSSERVICEAPIFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod ipssubsysserviceapidemethod = getParentPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod.class);
		this.keypssubsysserviceapifield = ipssubsysserviceapidemethod.getPSSubSysServiceAPIDEMust().getPSSubSysServiceAPIDEField(value, false);
		return this.keypssubsysserviceapifield;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEField getKeyPSSubSysServiceAPIFieldMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDEField value = this.getKeyPSSubSysServiceAPIField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外部服务接口主键属性");}
		return value;
	}

	public void setKeyPSSubSysServiceAPIField(net.ibizsys.model.service.IPSSubSysServiceAPIDEField keypssubsysserviceapifield){
		this.keypssubsysserviceapifield = keypssubsysserviceapifield;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPIDTO pssubsysserviceapidto;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDTO getPSSubSysServiceAPIDTO(){
		if(this.pssubsysserviceapidto != null) return this.pssubsysserviceapidto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class);
		this.pssubsysserviceapidto = ipssubsysserviceapi.getPSSubSysServiceAPIDTO(value, false);
		return this.pssubsysserviceapidto;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDTO getPSSubSysServiceAPIDTOMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDTO value = this.getPSSubSysServiceAPIDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外部服务接口DTO对象");}
		return value;
	}

	public void setPSSubSysServiceAPIDTO(net.ibizsys.model.service.IPSSubSysServiceAPIDTO pssubsysserviceapidto){
		this.pssubsysserviceapidto = pssubsysserviceapidto;
	}


	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}