package net.ibizsys.model.dataentity.service;



public class PSDEMethodDTOFieldImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldBaseImpl implements net.ibizsys.model.dataentity.service.IPSDEMethodDTOField{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETDEFAULTVALUETYPE = "defaultValueType";
	public final static String ATTR_GETFIELDTAG = "fieldTag";
	public final static String ATTR_GETFIELDTAG2 = "fieldTag2";
	public final static String ATTR_GETJSONFORMAT = "jsonFormat";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSDER = "getPSDER";
	public final static String ATTR_GETREFPSDEMETHODDTO = "getRefPSDEMethodDTO";
	public final static String ATTR_GETREFPSDATAENTITY = "getRefPSDataEntity";
	public final static String ATTR_GETRELATEDPSDEMETHODDTO = "getRelatedPSDEMethodDTO";
	public final static String ATTR_GETRELATEDPSDEMETHODDTOFIELD = "getRelatedPSDEMethodDTOField";
	public final static String ATTR_GETRELATEDPSDATAENTITY = "getRelatedPSDataEntity";
	public final static String ATTR_GETSOURCETYPE = "sourceType";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISIGNOREOUTPUT = "ignoreOutput";
	public final static String ATTR_ISLISTMAP = "listMap";
	public final static String ATTR_ISREADONLY = "readOnly";
	
	private String lowerCaseName = null;
	public String getLowerCaseName(){
		if(this.lowerCaseName == null){
			this.lowerCaseName = this.getName().toLowerCase();
		}
		return this.lowerCaseName;
	}

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

	private net.ibizsys.model.dataentity.der.IPSDERBase psder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDER(){
		if(this.psder != null) return this.psder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDER);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psder = ipsdataentity.getMajorPSDERBase(value, false);
		return this.psder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌套数据主关系");}
		return value;
	}

	public void setPSDER(net.ibizsys.model.dataentity.der.IPSDERBase psder){
		this.psder = psder;
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

	public void setRefPSDEMethodDTO(net.ibizsys.model.dataentity.service.IPSDEMethodDTO refpsdemethoddto){
		this.refpsdemethoddto = refpsdemethoddto;
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

	public void setRefPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity refpsdataentity){
		this.refpsdataentity = refpsdataentity;
	}

	private net.ibizsys.model.dataentity.service.IPSDEMethodDTO relatedpsdemethoddto;

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRelatedPSDEMethodDTO(){
		if(this.relatedpsdemethoddto != null) return this.relatedpsdemethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRELATEDPSDEMETHODDTO);
		if(value == null){
			return null;
		}
		this.relatedpsdemethoddto = this.getRelatedPSDataEntityMust().getPSDEMethodDTO(value, false);
		return this.relatedpsdemethoddto;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRelatedPSDEMethodDTOMust(){
		net.ibizsys.model.dataentity.service.IPSDEMethodDTO value = this.getRelatedPSDEMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关的DTO对象");}
		return value;
	}

	public void setRelatedPSDEMethodDTO(net.ibizsys.model.dataentity.service.IPSDEMethodDTO relatedpsdemethoddto){
		this.relatedpsdemethoddto = relatedpsdemethoddto;
	}

	private net.ibizsys.model.dataentity.service.IPSDEMethodDTOField relatedpsdemethoddtofield;

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTOField getRelatedPSDEMethodDTOField(){
		if(this.relatedpsdemethoddtofield != null) return this.relatedpsdemethoddtofield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRELATEDPSDEMETHODDTOFIELD);
		if(value == null){
			return null;
		}
		this.relatedpsdemethoddtofield = this.getRelatedPSDEMethodDTOMust().getPSDEMethodDTOField(value, false);
		return this.relatedpsdemethoddtofield;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTOField getRelatedPSDEMethodDTOFieldMust(){
		net.ibizsys.model.dataentity.service.IPSDEMethodDTOField value = this.getRelatedPSDEMethodDTOField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关的DTO属性对象");}
		return value;
	}

	public void setRelatedPSDEMethodDTOField(net.ibizsys.model.dataentity.service.IPSDEMethodDTOField relatedpsdemethoddtofield){
		this.relatedpsdemethoddtofield = relatedpsdemethoddtofield;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity relatedpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getRelatedPSDataEntity(){
		if(this.relatedpsdataentity != null) return this.relatedpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRELATEDPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.relatedpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETRELATEDPSDATAENTITY);
		return this.relatedpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getRelatedPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getRelatedPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关的实体对象");}
		return value;
	}

	public void setRelatedPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity relatedpsdataentity){
		this.relatedpsdataentity = relatedpsdataentity;
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

	public boolean isIgnoreOutput(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNOREOUTPUT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isListMap(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLISTMAP);
		if(value == null){
			return false;
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