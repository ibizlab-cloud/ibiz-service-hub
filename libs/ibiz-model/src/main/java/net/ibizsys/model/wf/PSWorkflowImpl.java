package net.ibizsys.model.wf;



public class PSWorkflowImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.wf.IPSWorkflow{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNASYSMODE = "dynaSysMode";
	public final static String ATTR_GETENTITYWFCANCELSTATE = "entityWFCancelState";
	public final static String ATTR_GETENTITYWFERRORSTATE = "entityWFErrorState";
	public final static String ATTR_GETENTITYWFFINISHSTATE = "entityWFFinishState";
	public final static String ATTR_GETENTITYWFSTATE = "entityWFState";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETNAMEPSLANGUAGERES = "getNamePSLanguageRes";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPSWFDES = "getPSWFDEs";
	public final static String ATTR_GETPSWFVERSIONS = "getPSWFVersions";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_GETWFCATCODE = "wFCatCode";
	public final static String ATTR_GETWFENGINECAT = "wFEngineCat";
	public final static String ATTR_GETWFENGINETYPE = "wFEngineType";
	public final static String ATTR_GETWFPROXYMODE = "wFProxyMode";
	public final static String ATTR_GETWFSN = "wFSN";
	public final static String ATTR_GETWFTYPE = "wFType";
	public final static String ATTR_ISUSEREMOTEENGINE = "useRemoteEngine";
	public final static String ATTR_ISUSEWFPROXYAPP = "useWFProxyApp";
	public final static String ATTR_ISVALID = "valid";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDynaSysMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNASYSMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getEntityWFCancelState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYWFCANCELSTATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEntityWFErrorState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYWFERRORSTATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEntityWFFinishState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYWFFINISHSTATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEntityWFState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYWFSTATE);
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
	private net.ibizsys.model.res.IPSLanguageRes namepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes(){
		if(this.namepslanguageres != null) return this.namepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.namepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAMEPSLANGUAGERES);
		return this.namepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getNamePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定名称语言资源");}
		return value;
	}

	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}


	private java.util.List<net.ibizsys.model.wf.IPSWFDE> pswfdes = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFDE> getPSWFDEs(){
		if(this.pswfdes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFDES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFDE> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFDE>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFDE obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFDE.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFDES);
				if(obj!=null)list.add(obj);
			}
			this.pswfdes = list;
		}
		return (this.pswfdes.size() == 0)? null : this.pswfdes;
	}

	public net.ibizsys.model.wf.IPSWFDE getPSWFDE(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFDE.class, this.getPSWFDEs(), objKey, bTryMode);
	}
	public void setPSWFDEs(java.util.List<net.ibizsys.model.wf.IPSWFDE> list){
		this.pswfdes = list;
	}

	private java.util.List<net.ibizsys.model.wf.IPSWFVersion> pswfversions = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFVersion> getPSWFVersions(){
		if(this.pswfversions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFVERSIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFVersion> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFVersion>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFVersion obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFVersion.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFVERSIONS);
				if(obj!=null)list.add(obj);
			}
			this.pswfversions = list;
		}
		return (this.pswfversions.size() == 0)? null : this.pswfversions;
	}

	public net.ibizsys.model.wf.IPSWFVersion getPSWFVersion(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFVersion.class, this.getPSWFVersions(), objKey, bTryMode);
	}
	public void setPSWFVersions(java.util.List<net.ibizsys.model.wf.IPSWFVersion> list){
		this.pswfversions = list;
	}

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFCatCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFCATCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFEngineCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFENGINECAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFEngineType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFENGINETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getWFProxyMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFPROXYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getWFSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isUseRemoteEngine(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUSEREMOTEENGINE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUseWFProxyApp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUSEWFPROXYAPP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALID);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}