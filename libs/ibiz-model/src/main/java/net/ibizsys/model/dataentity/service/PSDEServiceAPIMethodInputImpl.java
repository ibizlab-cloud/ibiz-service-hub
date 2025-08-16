package net.ibizsys.model.dataentity.service;



public class PSDEServiceAPIMethodInputImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput{

	public final static String ATTR_GETKEYPSDESERVICEAPIFIELD = "getKeyPSDEServiceAPIField";
	public final static String ATTR_GETPSDEMETHODDTO = "getPSDEMethodDTO";
	public final static String ATTR_GETTYPE = "type";
	private net.ibizsys.model.dataentity.service.IPSDEServiceAPIField keypsdeserviceapifield;

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIField getKeyPSDEServiceAPIField(){
		if(this.keypsdeserviceapifield != null) return this.keypsdeserviceapifield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSDESERVICEAPIFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.service.IPSDEServiceAPI ipsdeserviceapi = getParentPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class);
		this.keypsdeserviceapifield = ipsdeserviceapi.getPSDEServiceAPIField(value, false);
		return this.keypsdeserviceapifield;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIField getKeyPSDEServiceAPIFieldMust(){
		net.ibizsys.model.dataentity.service.IPSDEServiceAPIField value = this.getKeyPSDEServiceAPIField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体服务接口主键属性");}
		return value;
	}

	public void setKeyPSDEServiceAPIField(net.ibizsys.model.dataentity.service.IPSDEServiceAPIField keypsdeserviceapifield){
		this.keypsdeserviceapifield = keypsdeserviceapifield;
	}

	private net.ibizsys.model.dataentity.service.IPSDEMethodDTO psdemethoddto;

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTO(){
		if(this.psdemethoddto != null) return this.psdemethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMETHODDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.service.IPSDEServiceAPI ipsdeserviceapi = getParentPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class);
		this.psdemethoddto = ipsdeserviceapi.getPSDataEntityMust().getPSDEMethodDTO(value, false);
		return this.psdemethoddto;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTOMust(){
		net.ibizsys.model.dataentity.service.IPSDEMethodDTO value = this.getPSDEMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体服务接口DTO对象");}
		return value;
	}

	public void setPSDEMethodDTO(net.ibizsys.model.dataentity.service.IPSDEMethodDTO psdemethoddto){
		this.psdemethoddto = psdemethoddto;
	}


	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}