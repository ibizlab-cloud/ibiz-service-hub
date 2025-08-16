package net.ibizsys.model.dataentity.dataflow;



public class PSDEDataFlowNodeImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETLEFTPOS = "leftPos";
	public final static String ATTR_GETNODEPARAMS = "nodeParams";
	public final static String ATTR_GETNODETYPE = "nodeType";
	public final static String ATTR_GETPSDEDATAFLOWNODEFILTER = "getPSDEDataFlowNodeFilter";
	public final static String ATTR_GETPSDEDATAFLOWNODEPARAMS = "getPSDEDataFlowNodeParams";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETTOPPOS = "topPos";
	public final static String ATTR_GETWIDTH = "width";

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

	public com.fasterxml.jackson.databind.node.ObjectNode getNodeParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNODEPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getNodeType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNODETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter psdedataflownodefilter;

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter getPSDEDataFlowNodeFilter(){
		if(this.psdedataflownodefilter != null) return this.psdedataflownodefilter;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAFLOWNODEFILTER);
		if(value == null){
			return null;
		}
		this.psdedataflownodefilter = getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEDATAFLOWNODEFILTER);
		return this.psdedataflownodefilter;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter getPSDEDataFlowNodeFilterMust(){
		net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter value = this.getPSDEDataFlowNodeFilter();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据流节点过滤器");}
		return value;
	}

	public void setPSDEDataFlowNodeFilter(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter psdedataflownodefilter){
		this.psdedataflownodefilter = psdedataflownodefilter;
	}


	private java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam> psdedataflownodeparams = null;
	public java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam> getPSDEDataFlowNodeParams(){
		if(this.psdedataflownodeparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAFLOWNODEPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAFLOWNODEPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataflownodeparams = list;
		}
		return (this.psdedataflownodeparams.size() == 0)? null : this.psdedataflownodeparams;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam getPSDEDataFlowNodeParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam.class, this.getPSDEDataFlowNodeParams(), objKey, bTryMode);
	}
	public void setPSDEDataFlowNodeParams(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam> list){
		this.psdedataflownodeparams = list;
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
}