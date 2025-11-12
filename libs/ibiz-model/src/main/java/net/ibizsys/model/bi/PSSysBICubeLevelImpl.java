package net.ibizsys.model.bi;



public class PSSysBICubeLevelImpl extends net.ibizsys.model.bi.PSSysBICubeDimensionObjectImpl implements net.ibizsys.model.bi.IPSSysBICubeLevel{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETLEVELTAG = "levelTag";
	public final static String ATTR_GETLEVELTAG2 = "levelTag2";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSSYSBIHIERARCHY = "getPSSysBIHierarchy";
	public final static String ATTR_GETPSSYSBILEVEL = "getPSSysBILevel";
	public final static String ATTR_ISALLLEVEL = "allLevel";

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

	private net.ibizsys.model.bi.IPSSysBIHierarchy pssysbihierarchy;

	public net.ibizsys.model.bi.IPSSysBIHierarchy getPSSysBIHierarchy(){
		if(this.pssysbihierarchy != null) return this.pssysbihierarchy;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBIHIERARCHY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBICubeDimension ipssysbicubedimension = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBICubeDimension.class);
		this.pssysbihierarchy = ipssysbicubedimension.getPSSysBIDimensionMust().getPSSysBIHierarchy(value, false);
		return this.pssysbihierarchy;
	}

	public net.ibizsys.model.bi.IPSSysBIHierarchy getPSSysBIHierarchyMust(){
		net.ibizsys.model.bi.IPSSysBIHierarchy value = this.getPSSysBIHierarchy();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定智能报表维度架构");}
		return value;
	}

	public void setPSSysBIHierarchy(net.ibizsys.model.bi.IPSSysBIHierarchy pssysbihierarchy){
		this.pssysbihierarchy = pssysbihierarchy;
	}

	private net.ibizsys.model.bi.IPSSysBILevel pssysbilevel;

	public net.ibizsys.model.bi.IPSSysBILevel getPSSysBILevel(){
		if(this.pssysbilevel != null) return this.pssysbilevel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBILEVEL);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIHierarchy ipssysbihierarchy = this.getPSSysBIHierarchyMust();
		this.pssysbilevel = ipssysbihierarchy.getPSSysBILevel(value, false);
		return this.pssysbilevel;
	}

	public net.ibizsys.model.bi.IPSSysBILevel getPSSysBILevelMust(){
		net.ibizsys.model.bi.IPSSysBILevel value = this.getPSSysBILevel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定智能报表维度层级");}
		return value;
	}

	public void setPSSysBILevel(net.ibizsys.model.bi.IPSSysBILevel pssysbilevel){
		this.pssysbilevel = pssysbilevel;
	}


	public boolean isAllLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLLEVEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}