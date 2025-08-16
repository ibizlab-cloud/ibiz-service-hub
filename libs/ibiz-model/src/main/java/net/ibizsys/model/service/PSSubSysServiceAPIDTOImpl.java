package net.ibizsys.model.service;



public class PSSubSysServiceAPIDTOImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.service.IPSSubSysServiceAPIDTO{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDTOFIELDS = "getPSSubSysServiceAPIDTOFields";
	public final static String ATTR_GETTAG = "tag";
	public final static String ATTR_GETTAG2 = "tag2";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTOField> pssubsysserviceapidtofields = null;
	public java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTOField> getPSSubSysServiceAPIDTOFields(){
		if(this.pssubsysserviceapidtofields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDTOFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTOField> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSubSysServiceAPIDTOField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSubSysServiceAPIDTOField obj = this.getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDTOField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSUBSYSSERVICEAPIDTOFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.pssubsysserviceapidtofields = list;
		}
		return (this.pssubsysserviceapidtofields.size() == 0)? null : this.pssubsysserviceapidtofields;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDTOField getPSSubSysServiceAPIDTOField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDTOField.class, this.getPSSubSysServiceAPIDTOFields(), objKey, bTryMode);
	}
	public void setPSSubSysServiceAPIDTOFields(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTOField> list){
		this.pssubsysserviceapidtofields = list;
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
}