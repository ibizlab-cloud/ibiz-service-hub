package net.ibizsys.model.service;



public class PSSubSysServiceAPIDEFieldImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.service.IPSSubSysServiceAPIDEField
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETDATATYPE = "dataType";
	public final static String ATTR_GETFIELDTAG = "fieldTag";
	public final static String ATTR_GETFIELDTAG2 = "fieldTag2";
	public final static String ATTR_GETFIELDTYPE = "fieldType";
	public final static String ATTR_GETLENGTH = "length";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSCODELIST = "getPSCodeList";
	public final static String ATTR_GETPRECISION = "precision";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETREFPSSUBSYSSERVICEAPIDE = "getRefPSSubSysServiceAPIDE";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISARRAY = "array";
	public final static String ATTR_ISKEYDEFIELD = "keyDEField";
	public final static String ATTR_ISMAJORDEFIELD = "majorDEField";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTYPE);
		if(value == null){
			return "SIMPLE";
		}
		return value.asText();
	}

	public int getLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
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


	public int getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.service.IPSSubSysServiceAPIDE refpssubsysserviceapide;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getRefPSSubSysServiceAPIDE(){
		if(this.refpssubsysserviceapide != null) return this.refpssubsysserviceapide;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSSUBSYSSERVICEAPIDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class);
		this.refpssubsysserviceapide = ipssubsysserviceapi.getPSSubSysServiceAPIDE(value, false);
		return this.refpssubsysserviceapide;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getRefPSSubSysServiceAPIDEMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDE value = this.getRefPSSubSysServiceAPIDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用外部服务接口实体对象");}
		return value;
	}


	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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

	public boolean isKeyDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISKEYDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMajorDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAJORDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}