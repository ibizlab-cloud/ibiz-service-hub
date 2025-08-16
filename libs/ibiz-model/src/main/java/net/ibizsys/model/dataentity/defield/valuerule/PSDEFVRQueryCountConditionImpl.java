package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRQueryCountConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRQueryCountCondition{

	public final static String ATTR_GETMAXVALUE = "maxValue";
	public final static String ATTR_GETMINVALUE = "minValue";
	public final static String ATTR_GETPSDEDATAQUERY = "getPSDEDataQuery";
	public final static String ATTR_ISALWAYSCHECK = "alwaysCheck";
	public final static String ATTR_ISINCLUDEMAXVALUE = "includeMaxValue";
	public final static String ATTR_ISINCLUDEMINVALUE = "includeMinValue";

	public java.lang.Integer getMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUE);
		if(value == null){
			return null;
		}
		return value.asInt();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据查询对象");}
		return value;
	}

	public void setPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery psdedataquery){
		this.psdedataquery = psdedataquery;
	}


	public boolean isAlwaysCheck(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALWAYSCHECK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIncludeMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEMAXVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIncludeMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEMINVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}