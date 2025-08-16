package net.ibizsys.model.dataentity.service;



public class PSDEServiceAPIMethodReturnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn{

	public final static String ATTR_GETPSDEMETHODDTO = "getPSDEMethodDTO";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTYPE = "type";
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