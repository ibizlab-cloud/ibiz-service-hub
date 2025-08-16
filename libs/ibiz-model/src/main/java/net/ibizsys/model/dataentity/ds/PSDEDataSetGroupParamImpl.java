package net.ibizsys.model.dataentity.ds;



public class PSDEDataSetGroupParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam{

	public final static String ATTR_GETAGGMODE = "aggMode";
	public final static String ATTR_GETALIAS = "alias";
	public final static String ATTR_GETGROUPCODE = "groupCode";
	public final static String ATTR_GETGROUPJOINCODE = "groupJoinCode";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETSELECTCODE = "selectCode";
	public final static String ATTR_GETSORTDIR = "sortDir";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_ISENABLEGROUP = "enableGroup";
	public final static String ATTR_ISENABLESORT = "enableSort";

	public java.lang.String getAggMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAlias(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALIAS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupJoinCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPJOINCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefield = ipsdataentity.getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}


	public java.lang.String getSelectCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSELECTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isEnableGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEGROUP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSort(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}