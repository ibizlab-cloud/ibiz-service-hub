package net.ibizsys.model.service;



public class PSSubSysServiceAPIMethodReturnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn{

	public final static String ATTR_GETPSSUBSYSSERVICEAPIDTO = "getPSSubSysServiceAPIDTO";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTYPE = "type";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体服务接口DTO对象");}
		return value;
	}

	public void setPSSubSysServiceAPIDTO(net.ibizsys.model.service.IPSSubSysServiceAPIDTO pssubsysserviceapidto){
		this.pssubsysserviceapidto = pssubsysserviceapidto;
	}


	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}