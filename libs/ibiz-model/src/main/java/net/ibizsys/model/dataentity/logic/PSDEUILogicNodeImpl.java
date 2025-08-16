package net.ibizsys.model.dataentity.logic;



public class PSDEUILogicNodeImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDEUILogicNode
		,net.ibizsys.model.app.dataentity.IPSAppDEUILogicNode{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDSTPSDEUILOGICPARAM = "getDstPSDEUILogicParam";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETLEFTPOS = "leftPos";
	public final static String ATTR_GETLOGICNODETYPE = "logicNodeType";
	public final static String ATTR_GETPSDEUILOGICLINKS = "getPSDEUILogicLinks";
	public final static String ATTR_GETPSDEUILOGICNODEPARAMS = "getPSDEUILogicNodeParams";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETSRCPSDEUILOGICPARAM = "getSrcPSDEUILogicParam";
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
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam dstpsdeuilogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParam(){
		if(this.dstpsdeuilogicparam != null) return this.dstpsdeuilogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEUILOGICPARAM);
		if(value == null){
			return null;
		}
		this.dstpsdeuilogicparam = getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDEUILOGICPARAM);
		return this.dstpsdeuilogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getDstPSDEUILogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数对象");}
		return value;
	}

	public void setDstPSDEUILogicParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam dstpsdeuilogicparam){
		this.dstpsdeuilogicparam = dstpsdeuilogicparam;
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

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLink> psdeuilogiclinks = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLink> getPSDEUILogicLinks(){
		if(this.psdeuilogiclinks == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUILOGICLINKS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLink> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDEUILogicLink>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDEUILogicLink obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicLink.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEUILOGICLINKS);
				if(obj!=null)list.add(obj);
			}
			this.psdeuilogiclinks = list;
		}
		return (this.psdeuilogiclinks.size() == 0)? null : this.psdeuilogiclinks;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicLink getPSDEUILogicLink(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicLink.class, this.getPSDEUILogicLinks(), objKey, bTryMode);
	}
	public void setPSDEUILogicLinks(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLink> list){
		this.psdeuilogiclinks = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam> psdeuilogicnodeparams = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam> getPSDEUILogicNodeParams(){
		if(this.psdeuilogicnodeparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUILOGICNODEPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEUILOGICNODEPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdeuilogicnodeparams = list;
		}
		return (this.psdeuilogicnodeparams.size() == 0)? null : this.psdeuilogicnodeparams;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam getPSDEUILogicNodeParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam.class, this.getPSDEUILogicNodeParams(), objKey, bTryMode);
	}
	public void setPSDEUILogicNodeParams(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam> list){
		this.psdeuilogicnodeparams = list;
	}
	private net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin(){
		if(this.pssyspfplugin != null) return this.pssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSPFPLUGIN);
		return this.pssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端模板插件对象");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam srcpsdeuilogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParam(){
		if(this.srcpsdeuilogicparam != null) return this.srcpsdeuilogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEUILOGICPARAM);
		if(value == null){
			return null;
		}
		this.srcpsdeuilogicparam = getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSRCPSDEUILOGICPARAM);
		return this.srcpsdeuilogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getSrcPSDEUILogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源逻辑参数对象");}
		return value;
	}

	public void setSrcPSDEUILogicParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam srcpsdeuilogicparam){
		this.srcpsdeuilogicparam = srcpsdeuilogicparam;
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