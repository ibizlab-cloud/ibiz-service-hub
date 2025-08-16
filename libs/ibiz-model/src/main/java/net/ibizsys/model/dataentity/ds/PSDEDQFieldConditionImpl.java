package net.ibizsys.model.dataentity.ds;



public class PSDEDQFieldConditionImpl extends net.ibizsys.model.dataentity.ds.PSDEDQConditionImpl implements net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETCONDVALUE = "condValue";
	public final static String ATTR_GETFIELDNAME = "fieldName";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSVARTYPEID = "getPSVARTypeId";
	public final static String ATTR_GETVALUEFUNC = "valueFunc";
	public final static String ATTR_GETVALUEFUNCTAG = "valueFuncTag";
	public final static String ATTR_GETVALUEFUNCTAG2 = "valueFuncTag2";
	public final static String ATTR_ISIGNOREEMPTY = "ignoreEmpty";
	public final static String ATTR_ISIGNOREOTHERS = "ignoreOthers";

	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDNAME);
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
		net.ibizsys.model.dataentity.ds.IPSDEDQJoin ipsdedqjoin = getParentPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQJoin.class);
		this.psdefield = ipsdedqjoin.getJoinPSDataEntityMust().getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性对象");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}


	public java.lang.String getPSVARTypeId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSVARTYPEID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueFunc(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFUNC);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueFuncTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFUNCTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueFuncTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFUNCTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isIgnoreEmpty(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNOREEMPTY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIgnoreOthers(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNOREOTHERS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}