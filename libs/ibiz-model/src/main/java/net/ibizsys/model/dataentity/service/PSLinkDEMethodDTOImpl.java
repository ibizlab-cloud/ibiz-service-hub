package net.ibizsys.model.dataentity.service;



public class PSLinkDEMethodDTOImpl extends net.ibizsys.model.dataentity.service.PSDEMethodDTOImpl implements net.ibizsys.model.dataentity.service.IPSLinkDEMethodDTO{

	public final static String ATTR_GETREFPSDEMETHODDTO = "getRefPSDEMethodDTO";
	public final static String ATTR_GETREFPSDATAENTITY = "getRefPSDataEntity";
	private net.ibizsys.model.dataentity.service.IPSDEMethodDTO refpsdemethoddto;

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRefPSDEMethodDTO(){
		if(this.refpsdemethoddto != null) return this.refpsdemethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSDEMETHODDTO);
		if(value == null){
			return null;
		}
		this.refpsdemethoddto = this.getRefPSDataEntityMust().getPSDEMethodDTO(value, false);
		return this.refpsdemethoddto;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRefPSDEMethodDTOMust(){
		net.ibizsys.model.dataentity.service.IPSDEMethodDTO value = this.getRefPSDEMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体方法DTO对象");}
		return value;
	}

	public void setRefPSDEMethodDTO(net.ibizsys.model.dataentity.service.IPSDEMethodDTO refpsdemethoddto){
		this.refpsdemethoddto = refpsdemethoddto;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity refpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntity(){
		if(this.refpsdataentity != null) return this.refpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.refpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETREFPSDATAENTITY);
		return this.refpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getRefPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体对象");}
		return value;
	}

	public void setRefPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity refpsdataentity){
		this.refpsdataentity = refpsdataentity;
	}

}