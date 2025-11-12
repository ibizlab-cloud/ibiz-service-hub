package net.ibizsys.model.dataentity.logic;



public class PSDEUILogicImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDEUILogic
		,net.ibizsys.model.app.dataentity.IPSAppDEUILogic
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTPARAMNAME = "defaultParamName";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETLOGICTAG = "logicTag";
	public final static String ATTR_GETLOGICTAG2 = "logicTag2";
	public final static String ATTR_GETLOGICTAG3 = "logicTag3";
	public final static String ATTR_GETLOGICTAG4 = "logicTag4";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEUILOGICNODES = "getPSDEUILogicNodes";
	public final static String ATTR_GETPSDEUILOGICPARAMS = "getPSDEUILogicParams";
	public final static String ATTR_GETSTARTPSDEUILOGICNODE = "getStartPSDEUILogicNode";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
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

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNode> psdeuilogicnodes = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNode> getPSDEUILogicNodes(){
		if(this.psdeuilogicnodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUILOGICNODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNode> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDEUILogicNode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDEUILogicNode obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEUILOGICNODES);
				if(obj!=null)list.add(obj);
			}
			this.psdeuilogicnodes = list;
		}
		return (this.psdeuilogicnodes.size() == 0)? null : this.psdeuilogicnodes;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getPSDEUILogicNode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode.class, this.getPSDEUILogicNodes(), objKey, bTryMode);
	}
	public void setPSDEUILogicNodes(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNode> list){
		this.psdeuilogicnodes = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicParam> psdeuilogicparams = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicParam> getPSDEUILogicParams(){
		if(this.psdeuilogicparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUILOGICPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicParam> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDEUILogicParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDEUILogicParam obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEUILOGICPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdeuilogicparams = list;
		}
		return (this.psdeuilogicparams.size() == 0)? null : this.psdeuilogicparams;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getPSDEUILogicParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, this.getPSDEUILogicParams(), objKey, bTryMode);
	}
	public void setPSDEUILogicParams(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicParam> list){
		this.psdeuilogicparams = list;
	}
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicNode startpsdeuilogicnode;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getStartPSDEUILogicNode(){
		if(this.startpsdeuilogicnode != null) return this.startpsdeuilogicnode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTARTPSDEUILOGICNODE);
		if(value == null){
			return null;
		}
		this.startpsdeuilogicnode = this.getPSDEUILogicNode(value, false);
		return this.startpsdeuilogicnode;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getStartPSDEUILogicNodeMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicNode value = this.getStartPSDEUILogicNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定开始处理节点");}
		return value;
	}

	public void setStartPSDEUILogicNode(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode startpsdeuilogicnode){
		this.startpsdeuilogicnode = startpsdeuilogicnode;
	}

}