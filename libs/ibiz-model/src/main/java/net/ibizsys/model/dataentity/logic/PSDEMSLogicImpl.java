package net.ibizsys.model.dataentity.logic;



public class PSDEMSLogicImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDEMSLogic
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTPSDEMSLOGICNODE = "getDefaultPSDEMSLogicNode";
	public final static String ATTR_GETDEFAULTPARAMNAME = "defaultParamName";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETLOGICTAG = "logicTag";
	public final static String ATTR_GETLOGICTAG2 = "logicTag2";
	public final static String ATTR_GETLOGICTAG3 = "logicTag3";
	public final static String ATTR_GETLOGICTAG4 = "logicTag4";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEMSLOGICNODES = "getPSDEMSLogicNodes";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode defaultpsdemslogicnode;

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getDefaultPSDEMSLogicNode(){
		if(this.defaultpsdemslogicnode != null) return this.defaultpsdemslogicnode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSDEMSLOGICNODE);
		if(value == null){
			return null;
		}
		this.defaultpsdemslogicnode = this.getPSDEMSLogicNode(value, false);
		return this.defaultpsdemslogicnode;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getDefaultPSDEMSLogicNodeMust(){
		net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode value = this.getDefaultPSDEMSLogicNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定开始默认状态节点");}
		return value;
	}

	public void setDefaultPSDEMSLogicNode(net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode defaultpsdemslogicnode){
		this.defaultpsdemslogicnode = defaultpsdemslogicnode;
	}


	public java.lang.String getDefaultParamName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPARAMNAME);
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

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode> psdemslogicnodes = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode> getPSDEMSLogicNodes(){
		if(this.psdemslogicnodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMSLOGICNODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMSLOGICNODES);
				if(obj!=null)list.add(obj);
			}
			this.psdemslogicnodes = list;
		}
		return (this.psdemslogicnodes.size() == 0)? null : this.psdemslogicnodes;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getPSDEMSLogicNode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode.class, this.getPSDEMSLogicNodes(), objKey, bTryMode);
	}
	public void setPSDEMSLogicNodes(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode> list){
		this.psdemslogicnodes = list;
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

}