package net.ibizsys.model.bi;



public class PSSysBILevelImpl extends net.ibizsys.model.bi.PSSysBIHierarchyObjectImpl implements net.ibizsys.model.bi.IPSSysBILevel{

	public final static String ATTR_GETAGGCAPTION = "aggCaption";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETLEVELTAG = "levelTag";
	public final static String ATTR_GETLEVELTAG2 = "levelTag2";
	public final static String ATTR_GETLEVELTYPE = "levelType";
	public final static String ATTR_GETTEXTPSDEFIELD = "getTextPSDEField";
	public final static String ATTR_GETVALUEPSDEFIELD = "getValuePSDEField";
	public final static String ATTR_ISUNIQUEMEMBERS = "uniqueMembers";

	public java.lang.String getAggCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLevelTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEVELTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLevelTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEVELTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLevelType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEVELTYPE);
		if(value == null){
			return "COMMON";
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField textpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField(){
		if(this.textpsdefield != null) return this.textpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIHierarchy ipssysbihierarchy = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIHierarchy.class);
		this.textpsdefield = ipssysbihierarchy.getPSDataEntityMust().getPSDEField(value, false);
		return this.textpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTextPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定显示文本属性");}
		return value;
	}

	public void setTextPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField textpsdefield){
		this.textpsdefield = textpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField valuepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField(){
		if(this.valuepsdefield != null) return this.valuepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIHierarchy ipssysbihierarchy = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIHierarchy.class);
		this.valuepsdefield = ipssysbihierarchy.getPSDataEntityMust().getPSDEField(value, false);
		return this.valuepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值属性");}
		return value;
	}

	public void setValuePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField valuepsdefield){
		this.valuepsdefield = valuepsdefield;
	}


	public boolean isUniqueMembers(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUNIQUEMEMBERS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}