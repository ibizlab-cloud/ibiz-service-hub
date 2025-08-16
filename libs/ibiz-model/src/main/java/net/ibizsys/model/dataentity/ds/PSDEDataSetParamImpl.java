package net.ibizsys.model.dataentity.ds;



public class PSDEDataSetParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDataSetParam{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEFSEARCHMODE = "getPSDEFSearchMode";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPARAMDESC = "paramDesc";
	public final static String ATTR_GETPARAMTAG = "paramTag";
	public final static String ATTR_GETPARAMTAG2 = "paramTag2";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETVALUE = "value";
	public final static String ATTR_GETVALUETYPE = "valueType";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISARRAY = "array";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEFSearchMode psdefsearchmode;

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode(){
		if(this.psdefsearchmode != null) return this.psdefsearchmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFSEARCHMODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.defield.IPSDEField ipsdefield = this.getPSDEFieldMust();
		this.psdefsearchmode = ipsdefield.getPSDEFSearchMode(value, false);
		return this.psdefsearchmode;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchModeMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFSearchMode value = this.getPSDEFSearchMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性搜索模式");}
		return value;
	}

	public void setPSDEFSearchMode(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode psdefsearchmode){
		this.psdefsearchmode = psdefsearchmode;
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


	public java.lang.String getParamDesc(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMDESC);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMTAG2);
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

	public boolean isAllowEmpty(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWEMPTY);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isArray(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISARRAY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}