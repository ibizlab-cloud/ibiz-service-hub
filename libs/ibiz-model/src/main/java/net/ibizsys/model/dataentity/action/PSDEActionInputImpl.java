package net.ibizsys.model.dataentity.action;



public class PSDEActionInputImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.action.IPSDEActionInput{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETKEYPSDEFIELD = "getKeyPSDEField";
	public final static String ATTR_GETPSDEACTIONPARAMS = "getPSDEActionParams";
	public final static String ATTR_GETPSDEMETHODDTO = "getPSDEMethodDTO";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISOUTPUT = "output";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField(){
		if(this.keypsdefield != null) return this.keypsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.keypsdefield = ipsdataentity.getPSDEField(value, false);
		return this.keypsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getKeyPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主键属性对象");}
		return value;
	}

	public void setKeyPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield){
		this.keypsdefield = keypsdefield;
	}


	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> psdeactionparams = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> getPSDEActionParams(){
		if(this.psdeactionparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTIONPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionParam obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEACTIONPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdeactionparams = list;
		}
		return (this.psdeactionparams.size() == 0)? null : this.psdeactionparams;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionParam getPSDEActionParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionParam.class, this.getPSDEActionParams(), objKey, bTryMode);
	}
	public void setPSDEActionParams(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> list){
		this.psdeactionparams = list;
	}
	private net.ibizsys.model.dataentity.service.IPSDEMethodDTO psdemethoddto;

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTO(){
		if(this.psdemethoddto != null) return this.psdemethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMETHODDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdemethoddto = ipsdataentity.getPSDEMethodDTO(value, false);
		return this.psdemethoddto;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTOMust(){
		net.ibizsys.model.dataentity.service.IPSDEMethodDTO value = this.getPSDEMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体方法DTO对象");}
		return value;
	}

	public void setPSDEMethodDTO(net.ibizsys.model.dataentity.service.IPSDEMethodDTO psdemethoddto){
		this.psdemethoddto = psdemethoddto;
	}


	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isOutput(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISOUTPUT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}