package net.ibizsys.model.service;



public class PSSubSysServiceAPIDTOFieldImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.service.IPSSubSysServiceAPIDTOField{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSCODELIST = "getPSCodeList";
	public final static String ATTR_GETREFPSSUBSYSSERVICEAPIDTO = "getRefPSSubSysServiceAPIDTO";
	public final static String ATTR_GETSOURCETYPE = "sourceType";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISREADONLY = "readOnly";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
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

	private net.ibizsys.model.service.IPSSubSysServiceAPIDTO refpssubsysserviceapidto;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDTO getRefPSSubSysServiceAPIDTO(){
		if(this.refpssubsysserviceapidto != null) return this.refpssubsysserviceapidto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSSUBSYSSERVICEAPIDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class);
		this.refpssubsysserviceapidto = ipssubsysserviceapi.getPSSubSysServiceAPIDTO(value, false);
		return this.refpssubsysserviceapidto;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDTO getRefPSSubSysServiceAPIDTOMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDTO value = this.getRefPSSubSysServiceAPIDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用服务接口DTO对象");}
		return value;
	}


	public java.lang.String getSourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSOURCETYPE);
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

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
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

	public boolean isReadOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREADONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}