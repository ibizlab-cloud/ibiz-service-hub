package net.ibizsys.model.service;



public class PSSubSysServiceAPIDEImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.service.IPSSubSysServiceAPIDE
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETAPIMODE = "aPIMode";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETDETAG = "dETag";
	public final static String ATTR_GETDETAG2 = "dETag2";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMETHODSCRIPTCODE = "methodScriptCode";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDEFIELDS = "getPSSubSysServiceAPIDEFields";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDEMETHODS = "getPSSubSysServiceAPIDEMethods";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_ISMAJOR = "major";
	public final static String ATTR_ISNESTED = "nested";

	public int getAPIMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPIMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

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

	public java.lang.String getDETag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDETag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG2);
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

	public java.lang.String getMethodScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMETHODSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEField> pssubsysserviceapidefields = null;
	public java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEField> getPSSubSysServiceAPIDEFields(){
		if(this.pssubsysserviceapidefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEField> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSubSysServiceAPIDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSubSysServiceAPIDEField obj = this.getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSUBSYSSERVICEAPIDEFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.pssubsysserviceapidefields = list;
		}
		return (this.pssubsysserviceapidefields.size() == 0)? null : this.pssubsysserviceapidefields;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEField getPSSubSysServiceAPIDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDEField.class, this.getPSSubSysServiceAPIDEFields(), objKey, bTryMode);
	}
	public void setPSSubSysServiceAPIDEFields(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEField> list){
		this.pssubsysserviceapidefields = list;
	}

	private java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod> pssubsysserviceapidemethods = null;
	public java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod> getPSSubSysServiceAPIDEMethods(){
		if(this.pssubsysserviceapidemethods == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDEMETHODS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod obj = this.getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSUBSYSSERVICEAPIDEMETHODS);
				if(obj!=null)list.add(obj);
			}
			this.pssubsysserviceapidemethods = list;
		}
		return (this.pssubsysserviceapidemethods.size() == 0)? null : this.pssubsysserviceapidemethods;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod.class, this.getPSSubSysServiceAPIDEMethods(), objKey, bTryMode);
	}
	public void setPSSubSysServiceAPIDEMethods(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod> list){
		this.pssubsysserviceapidemethods = list;
	}
	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后端扩展插件");}
		return value;
	}


	public java.lang.String getServiceParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isMajor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAJOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNested(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNESTED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}