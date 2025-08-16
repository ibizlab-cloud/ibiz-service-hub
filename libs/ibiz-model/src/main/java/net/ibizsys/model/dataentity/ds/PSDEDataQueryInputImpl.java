package net.ibizsys.model.dataentity.ds;



public class PSDEDataQueryInputImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDEFILTERDTO = "getPSDEFilterDTO";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEFilterDTO psdefilterdto;

	public net.ibizsys.model.dataentity.ds.IPSDEFilterDTO getPSDEFilterDTO(){
		if(this.psdefilterdto != null) return this.psdefilterdto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFILTERDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefilterdto = (net.ibizsys.model.dataentity.ds.IPSDEFilterDTO)ipsdataentity.getPSDEMethodDTO(value, false);
		return this.psdefilterdto;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEFilterDTO getPSDEFilterDTOMust(){
		net.ibizsys.model.dataentity.ds.IPSDEFilterDTO value = this.getPSDEFilterDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体过滤器DTO");}
		return value;
	}

	public void setPSDEFilterDTO(net.ibizsys.model.dataentity.ds.IPSDEFilterDTO psdefilterdto){
		this.psdefilterdto = psdefilterdto;
	}


	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}