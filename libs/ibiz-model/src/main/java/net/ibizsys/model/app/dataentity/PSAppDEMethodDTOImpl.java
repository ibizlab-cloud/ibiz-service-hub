package net.ibizsys.model.app.dataentity;



public class PSAppDEMethodDTOImpl extends net.ibizsys.model.app.dataentity.PSAppDataEntityObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPDEMETHODDTOFIELDS = "getPSAppDEMethodDTOFields";
	public final static String ATTR_GETREFPSAPPDEMETHODDTO = "getRefPSAppDEMethodDTO";
	public final static String ATTR_GETREFPSAPPDATAENTITY = "getRefPSAppDataEntity";
	public final static String ATTR_GETSOURCETYPE = "sourceType";
	public final static String ATTR_GETSRCPSAPPMETHODDTO = "getSrcPSAppMethodDTO";
	public final static String ATTR_GETTYPE = "type";

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

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField> psappdemethoddtofields = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField> getPSAppDEMethodDTOFields(){
		if(this.psappdemethoddtofields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMETHODDTOFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPDEMETHODDTOFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.psappdemethoddtofields = list;
		}
		return (this.psappdemethoddtofields.size() == 0)? null : this.psappdemethoddtofields;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField getPSAppDEMethodDTOField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField.class, this.getPSAppDEMethodDTOFields(), objKey, bTryMode);
	}
	public void setPSAppDEMethodDTOFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField> list){
		this.psappdemethoddtofields = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用应用实体DTO");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用应用实体");}
		return value;
	}

	public void setRefPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity refpsappdataentity){
		this.refpsappdataentity = refpsappdataentity;
	}


	public java.lang.String getSourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSOURCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.IPSAppMethodDTO srcpsappmethoddto;

	public net.ibizsys.model.app.IPSAppMethodDTO getSrcPSAppMethodDTO(){
		if(this.srcpsappmethoddto != null) return this.srcpsappmethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSAPPMETHODDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.srcpsappmethoddto = ipsapplication.getPSAppMethodDTO(value, false);
		return this.srcpsappmethoddto;
	}

	public net.ibizsys.model.app.IPSAppMethodDTO getSrcPSAppMethodDTOMust(){
		net.ibizsys.model.app.IPSAppMethodDTO value = this.getSrcPSAppMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源应用DTO");}
		return value;
	}

	public void setSrcPSAppMethodDTO(net.ibizsys.model.app.IPSAppMethodDTO srcpsappmethoddto){
		this.srcpsappmethoddto = srcpsappmethoddto;
	}


	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}