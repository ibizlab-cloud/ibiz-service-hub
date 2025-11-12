package net.ibizsys.model.dataentity.logic;



public class PSDELogicImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDELogic
		,net.ibizsys.model.app.dataentity.IPSAppDELogic
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETATTACHMODE = "attachMode";
	public final static String ATTR_GETATTACHTOPSDEACTION = "getAttachToPSDEAction";
	public final static String ATTR_GETATTACHTOPSDEDATASET = "getAttachToPSDEDataSet";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEBUGMODE = "debugMode";
	public final static String ATTR_GETDEFAULTPARAMNAME = "defaultParamName";
	public final static String ATTR_GETEVENTMODEL = "eventModel";
	public final static String ATTR_GETEVENTS = "events";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETLOGICSUBTYPE = "logicSubType";
	public final static String ATTR_GETLOGICTAG = "logicTag";
	public final static String ATTR_GETLOGICTAG2 = "logicTag2";
	public final static String ATTR_GETLOGICTAG3 = "logicTag3";
	public final static String ATTR_GETLOGICTAG4 = "logicTag4";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDELOGICNODES = "getPSDELogicNodes";
	public final static String ATTR_GETPSDELOGICPARAMS = "getPSDELogicParams";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETSTARTPSDELOGICNODE = "getStartPSDELogicNode";
	public final static String ATTR_GETTHREADMODE = "threadMode";
	public final static String ATTR_GETTIMERPOLICY = "timerPolicy";
	public final static String ATTR_ISCUSTOMCODE = "customCode";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISENABLEFRONT = "enableFront";
	public final static String ATTR_ISIGNOREEXCEPTION = "ignoreException";
	public final static String ATTR_ISTEMPLATE = "template";
	public final static String ATTR_ISVALID = "valid";

	public java.lang.String getAttachMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTACHMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction attachtopsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getAttachToPSDEAction(){
		if(this.attachtopsdeaction != null) return this.attachtopsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTACHTOPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.attachtopsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.attachtopsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getAttachToPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getAttachToPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定附加到指定行为");}
		return value;
	}

	public void setAttachToPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction attachtopsdeaction){
		this.attachtopsdeaction = attachtopsdeaction;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet attachtopsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getAttachToPSDEDataSet(){
		if(this.attachtopsdedataset != null) return this.attachtopsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTACHTOPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.attachtopsdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.attachtopsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getAttachToPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getAttachToPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定附加到指定数据集");}
		return value;
	}

	public void setAttachToPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet attachtopsdedataset){
		this.attachtopsdedataset = attachtopsdedataset;
	}


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDebugMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEBUGMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDefaultParamName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPARAMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEventModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEvents(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicSubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICSUBTYPE);
		if(value == null){
			return "NONE";
		}
		return value.asText();
	}

	public java.lang.String getLogicTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTAG4);
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

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNode> psdelogicnodes = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNode> getPSDELogicNodes(){
		if(this.psdelogicnodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGICNODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNode> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDELogicNode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDELogicNode obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicNode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDELOGICNODES);
				if(obj!=null)list.add(obj);
			}
			this.psdelogicnodes = list;
		}
		return (this.psdelogicnodes.size() == 0)? null : this.psdelogicnodes;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicNode getPSDELogicNode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicNode.class, this.getPSDELogicNodes(), objKey, bTryMode);
	}
	public void setPSDELogicNodes(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNode> list){
		this.psdelogicnodes = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicParam> psdelogicparams = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicParam> getPSDELogicParams(){
		if(this.psdelogicparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGICPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicParam> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDELogicParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDELogicParam obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDELOGICPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdelogicparams = list;
		}
		return (this.psdelogicparams.size() == 0)? null : this.psdelogicparams;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getPSDELogicParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, this.getPSDELogicParams(), objKey, bTryMode);
	}
	public void setPSDELogicParams(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicParam> list){
		this.psdelogicparams = list;
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

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}


	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogicNode startpsdelogicnode;

	public net.ibizsys.model.dataentity.logic.IPSDELogicNode getStartPSDELogicNode(){
		if(this.startpsdelogicnode != null) return this.startpsdelogicnode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTARTPSDELOGICNODE);
		if(value == null){
			return null;
		}
		this.startpsdelogicnode = this.getPSDELogicNode(value, false);
		return this.startpsdelogicnode;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicNode getStartPSDELogicNodeMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicNode value = this.getStartPSDELogicNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定开始处理节点");}
		return value;
	}

	public void setStartPSDELogicNode(net.ibizsys.model.dataentity.logic.IPSDELogicNode startpsdelogicnode){
		this.startpsdelogicnode = startpsdelogicnode;
	}


	public int getThreadMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHREADMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getTimerPolicy(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMERPOLICY);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCustomCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMCODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableBackend(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEBACKEND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFront(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFRONT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIgnoreException(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNOREEXCEPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isTemplate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTEMPLATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALID);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}