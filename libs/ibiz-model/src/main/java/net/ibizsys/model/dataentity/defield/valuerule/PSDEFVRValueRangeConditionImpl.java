package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRValueRangeConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRangeCondition{

	public final static String ATTR_GETEXTMAJORPSDEFIELD = "getExtMajorPSDEField";
	public final static String ATTR_GETEXTPSDEFIELD = "getExtPSDEField";
	public final static String ATTR_GETMAJORPSDEDATASET = "getMajorPSDEDataSet";
	public final static String ATTR_GETMAJORPSDATAENTITY = "getMajorPSDataEntity";
	public final static String ATTR_ISALWAYSCHECK = "alwaysCheck";
	public final static String ATTR_ISTRYMODE = "tryMode";
	private net.ibizsys.model.dataentity.defield.IPSDEField extmajorpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getExtMajorPSDEField(){
		if(this.extmajorpsdefield != null) return this.extmajorpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTMAJORPSDEFIELD);
		if(value == null){
			return null;
		}
		this.extmajorpsdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEXTMAJORPSDEFIELD);
		return this.extmajorpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getExtMajorPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getExtMajorPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定附加主实体属性对象");}
		return value;
	}

	public void setExtMajorPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField extmajorpsdefield){
		this.extmajorpsdefield = extmajorpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField extpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getExtPSDEField(){
		if(this.extpsdefield != null) return this.extpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTPSDEFIELD);
		if(value == null){
			return null;
		}
		this.extpsdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEXTPSDEFIELD);
		return this.extpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getExtPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getExtPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定附加属性对象");}
		return value;
	}

	public void setExtPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField extpsdefield){
		this.extpsdefield = extpsdefield;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet majorpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getMajorPSDEDataSet(){
		if(this.majorpsdedataset != null) return this.majorpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDEDATASET);
		if(value == null){
			return null;
		}
		this.majorpsdedataset = getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMAJORPSDEDATASET);
		return this.majorpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getMajorPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getMajorPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主实体结果集对象");}
		return value;
	}

	public void setMajorPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet majorpsdedataset){
		this.majorpsdedataset = majorpsdedataset;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity majorpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getMajorPSDataEntity(){
		if(this.majorpsdataentity != null) return this.majorpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.majorpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMAJORPSDATAENTITY);
		return this.majorpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getMajorPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getMajorPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主实体对象");}
		return value;
	}

	public void setMajorPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity majorpsdataentity){
		this.majorpsdataentity = majorpsdataentity;
	}


	public boolean isAlwaysCheck(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALWAYSCHECK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isTryMode(){
		return false;
	}
}