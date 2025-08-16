package net.ibizsys.model.service;



public class PSSysMethodDTOFieldImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldBaseImpl implements net.ibizsys.model.service.IPSSysMethodDTOField{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETDEFAULTVALUETYPE = "defaultValueType";
	public final static String ATTR_GETFIELDTAG = "fieldTag";
	public final static String ATTR_GETFIELDTAG2 = "fieldTag2";
	public final static String ATTR_GETJSONFORMAT = "jsonFormat";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETREFPSDEMETHODDTO = "getRefPSDEMethodDTO";
	public final static String ATTR_GETREFPSDATAENTITY = "getRefPSDataEntity";
	public final static String ATTR_GETREFPSSYSMETHODDTO = "getRefPSSysMethodDTO";
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

	public java.lang.String getDefaultValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUETYPE);
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

	public java.lang.String getJsonFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJSONFORMAT);
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
	private net.ibizsys.model.dataentity.service.IPSDEMethodDTO refpsdemethoddto;

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRefPSDEMethodDTO(){
		if(this.refpsdemethoddto != null) return this.refpsdemethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSDEMETHODDTO);
		if(value == null){
			return null;
		}
		this.refpsdemethoddto = getRefPSDataEntityMust().getPSDEMethodDTO(value, false);
		return this.refpsdemethoddto;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRefPSDEMethodDTOMust(){
		net.ibizsys.model.dataentity.service.IPSDEMethodDTO value = this.getRefPSDEMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体方法DTO对象");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体对象");}
		return value;
	}

	private net.ibizsys.model.service.IPSSysMethodDTO refpssysmethoddto;

	public net.ibizsys.model.service.IPSSysMethodDTO getRefPSSysMethodDTO(){
		if(this.refpssysmethoddto != null) return this.refpssysmethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSSYSMETHODDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.IPSSystem ipssystem = getParentPSModelObject(net.ibizsys.model.IPSSystem.class);
		this.refpssysmethoddto = ipssystem.getPSSysMethodDTO(value, false);
		return this.refpssysmethoddto;
	}

	public net.ibizsys.model.service.IPSSysMethodDTO getRefPSSysMethodDTOMust(){
		net.ibizsys.model.service.IPSSysMethodDTO value = this.getRefPSSysMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用系统方法DTO对象");}
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