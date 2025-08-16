package net.ibizsys.model.dataentity.logic;



public class PSDELogicNodeImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDELogicNode
		,net.ibizsys.model.app.dataentity.IPSAppDELogicNode{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETLEFTPOS = "leftPos";
	public final static String ATTR_GETLOGICNODETYPE = "logicNodeType";
	public final static String ATTR_GETNODEPARAMS = "nodeParams";
	public final static String ATTR_GETPSDELOGICLINKS = "getPSDELogicLinks";
	public final static String ATTR_GETPSDELOGICNODEPARAMS = "getPSDELogicNodeParams";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETTOPPOS = "topPos";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_ISPARALLELOUTPUT = "parallelOutput";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getLeftPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEFTPOS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getLogicNodeType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNODETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getNodeParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNODEPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLink> psdelogiclinks = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLink> getPSDELogicLinks(){
		if(this.psdelogiclinks == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGICLINKS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLink> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDELogicLink>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDELogicLink obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicLink.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDELOGICLINKS);
				if(obj!=null)list.add(obj);
			}
			this.psdelogiclinks = list;
		}
		return (this.psdelogiclinks.size() == 0)? null : this.psdelogiclinks;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicLink getPSDELogicLink(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicLink.class, this.getPSDELogicLinks(), objKey, bTryMode);
	}
	public void setPSDELogicLinks(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLink> list){
		this.psdelogiclinks = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam> psdelogicnodeparams = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam> getPSDELogicNodeParams(){
		if(this.psdelogicnodeparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGICNODEPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDELOGICNODEPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdelogicnodeparams = list;
		}
		return (this.psdelogicnodeparams.size() == 0)? null : this.psdelogicnodeparams;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam getPSDELogicNodeParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam.class, this.getPSDELogicNodeParams(), objKey, bTryMode);
	}
	public void setPSDELogicNodeParams(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam> list){
		this.psdelogicnodeparams = list;
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


	public int getTopPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPPOS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isParallelOutput(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPARALLELOUTPUT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}