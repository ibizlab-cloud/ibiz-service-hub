package net.ibizsys.model.app;



public class PSAppMethodDTOFieldImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.IPSAppMethodDTOField{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETJSONFORMAT = "jsonFormat";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETREFPSAPPDEMETHODDTO = "getRefPSAppDEMethodDTO";
	public final static String ATTR_GETREFPSAPPDATAENTITY = "getRefPSAppDataEntity";
	public final static String ATTR_GETREFPSAPPMETHODDTO = "getRefPSAppMethodDTO";
	public final static String ATTR_GETSOURCETYPE = "sourceType";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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
	private net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO refpsappdemethoddto;

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getRefPSAppDEMethodDTO(){
		if(this.refpsappdemethoddto != null) return this.refpsappdemethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSAPPDEMETHODDTO);
		if(value == null){
			return null;
		}
		this.refpsappdemethoddto = this.getRefPSAppDataEntityMust().getPSAppDEMethodDTO(value, false);
		return this.refpsappdemethoddto;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getRefPSAppDEMethodDTOMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO value = this.getRefPSAppDEMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用应用实体方法DTO对象");}
		return value;
	}

	public void setRefPSAppDEMethodDTO(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO refpsappdemethoddto){
		this.refpsappdemethoddto = refpsappdemethoddto;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity refpsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getRefPSAppDataEntity(){
		if(this.refpsappdataentity != null) return this.refpsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.refpsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETREFPSAPPDATAENTITY);
		return this.refpsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getRefPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getRefPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用应用实体对象");}
		return value;
	}

	public void setRefPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity refpsappdataentity){
		this.refpsappdataentity = refpsappdataentity;
	}

	private net.ibizsys.model.app.IPSAppMethodDTO refpsappmethoddto;

	public net.ibizsys.model.app.IPSAppMethodDTO getRefPSAppMethodDTO(){
		if(this.refpsappmethoddto != null) return this.refpsappmethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSAPPMETHODDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.refpsappmethoddto = ipsapplication.getPSAppMethodDTO(value, false);
		return this.refpsappmethoddto;
	}

	public net.ibizsys.model.app.IPSAppMethodDTO getRefPSAppMethodDTOMust(){
		net.ibizsys.model.app.IPSAppMethodDTO value = this.getRefPSAppMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用应用方法DTO对象");}
		return value;
	}

	public void setRefPSAppMethodDTO(net.ibizsys.model.app.IPSAppMethodDTO refpsappmethoddto){
		this.refpsappmethoddto = refpsappmethoddto;
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
}