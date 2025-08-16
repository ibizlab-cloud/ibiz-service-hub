package net.ibizsys.model.dataentity.service;



public class PSDEMethodDTOImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.service.IPSDEMethodDTO{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSDEMETHODDTOFIELDS = "getPSDEMethodDTOFields";
	public final static String ATTR_GETSOURCETYPE = "sourceType";
	public final static String ATTR_GETSRCPSSYSMETHODDTO = "getSrcPSSysMethodDTO";
	public final static String ATTR_GETTAG = "tag";
	public final static String ATTR_GETTAG2 = "tag2";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> psdemethoddtofields = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> getPSDEMethodDTOFields(){
		if(this.psdemethoddtofields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMETHODDTOFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.service.IPSDEMethodDTOField obj = this.getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEMethodDTOField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMETHODDTOFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.psdemethoddtofields = list;
		}
		return (this.psdemethoddtofields.size() == 0)? null : this.psdemethoddtofields;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTOField getPSDEMethodDTOField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEMethodDTOField.class, this.getPSDEMethodDTOFields(), objKey, bTryMode);
	}
	public void setPSDEMethodDTOFields(java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> list){
		this.psdemethoddtofields = list;
	}

	public java.lang.String getSourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSOURCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.service.IPSSysMethodDTO srcpssysmethoddto;

	public net.ibizsys.model.service.IPSSysMethodDTO getSrcPSSysMethodDTO(){
		if(this.srcpssysmethoddto != null) return this.srcpssysmethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSSYSMETHODDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.IPSSystem ipssystem = getParentPSModelObject(net.ibizsys.model.IPSSystem.class);
		this.srcpssysmethoddto = ipssystem.getPSSysMethodDTO(value, false);
		return this.srcpssysmethoddto;
	}

	public net.ibizsys.model.service.IPSSysMethodDTO getSrcPSSysMethodDTOMust(){
		net.ibizsys.model.service.IPSSysMethodDTO value = this.getSrcPSSysMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源动态模型系统DTO");}
		return value;
	}

	public void setSrcPSSysMethodDTO(net.ibizsys.model.service.IPSSysMethodDTO srcpssysmethoddto){
		this.srcpssysmethoddto = srcpssysmethoddto;
	}


	public java.lang.String getTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}