package net.ibizsys.model.testing;



public class PSSysTestDataItemImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.testing.IPSSysTestDataItem{

	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETPSCODELIST = "getPSCodeList";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSSYSSAMPLEVALUE = "getPSSysSampleValue";
	public final static String ATTR_GETREFPSDEDATASET = "getRefPSDEDataSet";
	public final static String ATTR_GETREFPSDATAENTITY = "getRefPSDataEntity";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETVALUE = "value";
	public final static String ATTR_GETVALUETYPE = "valueType";
	public final static String ATTR_GETVALUES = "values";
	public final static String ATTR_ISNULLVALUE = "nullValue";

	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.codelist.IPSCodeList pscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeList(){
		if(this.pscodelist != null) return this.pscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCODELIST);
		if(value == null){
			return null;
		}
		this.pscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCODELIST);
		return this.pscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定代码表");}
		return value;
	}

	public void setPSCodeList(net.ibizsys.model.codelist.IPSCodeList pscodelist){
		this.pscodelist = pscodelist;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.testing.IPSSysTestData ipssystestdata = getParentPSModelObject(net.ibizsys.model.testing.IPSSysTestData.class);
		this.psdefield = ipssystestdata.getPSDataEntityMust().getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关实体属性");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}

	private net.ibizsys.model.res.IPSSysSampleValue pssyssamplevalue;

	public net.ibizsys.model.res.IPSSysSampleValue getPSSysSampleValue(){
		if(this.pssyssamplevalue != null) return this.pssyssamplevalue;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSAMPLEVALUE);
		if(value == null){
			return null;
		}
		this.pssyssamplevalue = getPSModelObject(net.ibizsys.model.res.IPSSysSampleValue.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSAMPLEVALUE);
		return this.pssyssamplevalue;
	}

	public net.ibizsys.model.res.IPSSysSampleValue getPSSysSampleValueMust(){
		net.ibizsys.model.res.IPSSysSampleValue value = this.getPSSysSampleValue();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统示例值");}
		return value;
	}

	public void setPSSysSampleValue(net.ibizsys.model.res.IPSSysSampleValue pssyssamplevalue){
		this.pssyssamplevalue = pssyssamplevalue;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet refpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSet(){
		if(this.refpsdedataset != null) return this.refpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSDEDATASET);
		if(value == null){
			return null;
		}
		this.refpsdedataset = this.getRefPSDataEntityMust().getPSDEDataSet(value, false);
		return this.refpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getRefPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体数据集");}
		return value;
	}

	public void setRefPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet refpsdedataset){
		this.refpsdedataset = refpsdedataset;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体");}
		return value;
	}

	public void setRefPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity refpsdataentity){
		this.refpsdataentity = refpsdataentity;
	}


	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private java.lang.String[] values = null;
	public java.lang.String[] getValues(){
		if(this.values == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.values = array;
		}
		return this.values;
	}

	public boolean isNullValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNULLVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}