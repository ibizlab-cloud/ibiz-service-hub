package net.ibizsys.model.dataentity.ds;



public class PSDEDataSetReturnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDEMETHODDTO = "getPSDEMethodDTO";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.service.IPSDEMethodDTO psdemethoddto;

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTO(){
		if(this.psdemethoddto != null) return this.psdemethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMETHODDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdemethoddto = ipsdataentity.getPSDEMethodDTO(value, false);
		return this.psdemethoddto;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTOMust(){
		net.ibizsys.model.dataentity.service.IPSDEMethodDTO value = this.getPSDEMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体方法DTO对象");}
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