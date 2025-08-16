package net.ibizsys.model.system;



public class PSSystemModuleImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.system.IPSSystemModule
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETALLPSCODELISTS = "getAllPSCodeLists";
	public final static String ATTR_GETALLPSDATAENTITIES = "getAllPSDataEntities";
	public final static String ATTR_GETALLPSWORKFLOWS = "getAllPSWorkflows";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDSLINK = "dSLink";
	public final static String ATTR_GETMODULESN = "moduleSN";
	public final static String ATTR_GETMODULETAG = "moduleTag";
	public final static String ATTR_GETMODULETAG2 = "moduleTag2";
	public final static String ATTR_GETMODULETAG3 = "moduleTag3";
	public final static String ATTR_GETMODULETAG4 = "moduleTag4";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPKGCODENAME = "pKGCodeName";
	public final static String ATTR_GETPSSYSMODELGROUP = "getPSSysModelGroup";
	public final static String ATTR_GETPSSYSREF = "getPSSysRef";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETRUNTIMETYPE = "runtimeType";
	public final static String ATTR_GETSYSREFTYPE = "sysRefType";
	public final static String ATTR_GETUTILPARAMS = "utilParams";
	public final static String ATTR_GETUTILTAG = "utilTag";
	public final static String ATTR_GETUTILTYPE = "utilType";
	public final static String ATTR_ISDEFAULTMODULE = "defaultModule";
	public final static String ATTR_ISSUBSYSASCLOUD = "subSysAsCloud";
	public final static String ATTR_ISSUBSYSMODULE = "subSysModule";

	private java.util.List<net.ibizsys.model.codelist.IPSCodeList> allpscodelists = null;
	public java.util.List<net.ibizsys.model.codelist.IPSCodeList> getAllPSCodeLists(){
		if(this.allpscodelists == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSCODELISTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.codelist.IPSCodeList> list = new java.util.ArrayList<net.ibizsys.model.codelist.IPSCodeList>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.codelist.IPSCodeList obj = this.getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSCODELISTS);
				if(obj!=null)list.add(obj);
			}
			this.allpscodelists = list;
		}
		return (this.allpscodelists.size() == 0)? null : this.allpscodelists;
	}

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeList(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, this.getAllPSCodeLists(), objKey, bTryMode);
	}
	public void setPSCodeLists(java.util.List<net.ibizsys.model.codelist.IPSCodeList> list){
		this.allpscodelists = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> allpsdataentities = null;
	public java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> getAllPSDataEntities(){
		if(this.allpsdataentities == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDATAENTITIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> list = new java.util.ArrayList<net.ibizsys.model.dataentity.IPSDataEntity>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.IPSDataEntity obj = this.getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDATAENTITIES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdataentities = list;
		}
		return (this.allpsdataentities.size() == 0)? null : this.allpsdataentities;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, this.getAllPSDataEntities(), objKey, bTryMode);
	}
	public void setPSDataEntities(java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> list){
		this.allpsdataentities = list;
	}

	private java.util.List<net.ibizsys.model.wf.IPSWorkflow> allpsworkflows = null;
	public java.util.List<net.ibizsys.model.wf.IPSWorkflow> getAllPSWorkflows(){
		if(this.allpsworkflows == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSWORKFLOWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWorkflow> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWorkflow>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWorkflow obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSWORKFLOWS);
				if(obj!=null)list.add(obj);
			}
			this.allpsworkflows = list;
		}
		return (this.allpsworkflows.size() == 0)? null : this.allpsworkflows;
	}

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflow(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class, this.getAllPSWorkflows(), objKey, bTryMode);
	}
	public void setPSWorkflows(java.util.List<net.ibizsys.model.wf.IPSWorkflow> list){
		this.allpsworkflows = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDSLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSLINK);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULESN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULETAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULETAG4);
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

	public java.lang.String getPKGCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPKGCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.system.IPSSysModelGroup pssysmodelgroup;

	public net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroup(){
		if(this.pssysmodelgroup != null) return this.pssysmodelgroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMODELGROUP);
		if(value == null){
			return null;
		}
		this.pssysmodelgroup = getPSModelObject(net.ibizsys.model.system.IPSSysModelGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSMODELGROUP);
		return this.pssysmodelgroup;
	}

	public net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroupMust(){
		net.ibizsys.model.system.IPSSysModelGroup value = this.getPSSysModelGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模型组");}
		return value;
	}

	private net.ibizsys.model.system.IPSSysRef pssysref;

	public net.ibizsys.model.system.IPSSysRef getPSSysRef(){
		if(this.pssysref != null) return this.pssysref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSREF);
		if(value == null){
			return null;
		}
		this.pssysref = getPSModelObject(net.ibizsys.model.system.IPSSysRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSREF);
		return this.pssysref;
	}

	public net.ibizsys.model.system.IPSSysRef getPSSysRefMust(){
		net.ibizsys.model.system.IPSSysRef value = this.getPSSysRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统引用");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}


	public java.lang.String getRuntimeType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRUNTIMETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysRefType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSREFTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getUtilParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getUtilTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDefaultModule(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODULE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSubSysAsCloud(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSUBSYSASCLOUD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSubSysModule(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSUBSYSMODULE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}