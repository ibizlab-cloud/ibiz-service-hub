package net.ibizsys.model.app.dataentity;



public class PSAppDEMethodDTOFieldImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETJSONFORMAT = "jsonFormat";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETREFPSAPPDEDATASET = "getRefPSAppDEDataSet";
	public final static String ATTR_GETREFPSAPPDEMETHODDTO = "getRefPSAppDEMethodDTO";
	public final static String ATTR_GETREFPSAPPDATAENTITY = "getRefPSAppDataEntity";
	public final static String ATTR_GETREFPICKUPPSAPPDEFIELD = "getRefPickupPSAppDEField";
	public final static String ATTR_GETSOURCETYPE = "sourceType";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISLISTMAP = "listMap";

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
	private net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(){
		if(this.psappdefield != null) return this.psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体属性");}
		return value;
	}

	public void setPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield){
		this.psappdefield = psappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet refpsappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getRefPSAppDEDataSet(){
		if(this.refpsappdedataset != null) return this.refpsappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		this.refpsappdedataset = this.getRefPSAppDataEntityMust().getPSAppDEDataSet(value, false);
		return this.refpsappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getRefPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getRefPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用应用实体的嵌套数据集");}
		return value;
	}

	public void setRefPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet refpsappdedataset){
		this.refpsappdedataset = refpsappdedataset;
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

	private net.ibizsys.model.app.dataentity.IPSAppDEField refpickuppsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getRefPickupPSAppDEField(){
		if(this.refpickuppsappdefield != null) return this.refpickuppsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPICKUPPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.refpickuppsappdefield = this.getRefPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.refpickuppsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getRefPickupPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getRefPickupPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用应用实体的连接属性");}
		return value;
	}

	public void setRefPickupPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField refpickuppsappdefield){
		this.refpickuppsappdefield = refpickuppsappdefield;
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

	public boolean isListMap(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLISTMAP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}