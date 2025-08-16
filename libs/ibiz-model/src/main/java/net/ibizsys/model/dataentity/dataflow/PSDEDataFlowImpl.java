package net.ibizsys.model.dataentity.dataflow;



public class PSDEDataFlowImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEBUGMODE = "debugMode";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETLOGICSUBTYPE = "logicSubType";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEDATAFLOWLINKS = "getPSDEDataFlowLinks";
	public final static String ATTR_GETPSDEDATAFLOWNODES = "getPSDEDataFlowNodes";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPACKAGEMODEL = "packageModel";

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

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink> psdedataflowlinks = null;
	public java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink> getPSDEDataFlowLinks(){
		if(this.psdedataflowlinks == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAFLOWLINKS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAFLOWLINKS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataflowlinks = list;
		}
		return (this.psdedataflowlinks.size() == 0)? null : this.psdedataflowlinks;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink getPSDEDataFlowLink(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink.class, this.getPSDEDataFlowLinks(), objKey, bTryMode);
	}
	public void setPSDEDataFlowLinks(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink> list){
		this.psdedataflowlinks = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode> psdedataflownodes = null;
	public java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode> getPSDEDataFlowNodes(){
		if(this.psdedataflownodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAFLOWNODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAFLOWNODES);
				if(obj!=null)list.add(obj);
			}
			this.psdedataflownodes = list;
		}
		return (this.psdedataflownodes.size() == 0)? null : this.psdedataflownodes;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getPSDEDataFlowNode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode.class, this.getPSDEDataFlowNodes(), objKey, bTryMode);
	}
	public void setPSDEDataFlowNodes(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode> list){
		this.psdedataflownodes = list;
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


	public java.lang.String getPackageModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPACKAGEMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}