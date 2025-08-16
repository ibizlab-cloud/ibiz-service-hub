package net.ibizsys.model.dataentity.action;



public class PSDEActionReturnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.action.IPSDEActionReturn{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDEDATAQUERY = "getPSDEDataQuery";
	public final static String ATTR_GETPSDEMETHODDTO = "getPSDEMethodDTO";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery psdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery(){
		if(this.psdedataquery != null) return this.psdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataquery = ipsdataentity.getPSDEDataQuery(value, false);
		return this.psdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性组关联查询");}
		return value;
	}

	public void setPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery psdedataquery){
		this.psdedataquery = psdedataquery;
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