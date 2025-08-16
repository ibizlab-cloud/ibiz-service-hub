package net.ibizsys.model.control.tree;



public class PSDETreeNodeRSImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.tree.IPSDETreeNodeRS{

	public final static String ATTR_GETCHILDPSDETREENODE = "getChildPSDETreeNode";
	public final static String ATTR_GETPSDETREENODERSPARAMS = "getPSDETreeNodeRSParams";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";
	public final static String ATTR_GETPARENTFILTER = "parentFilter";
	public final static String ATTR_GETPARENTPSAPPDEFIELD = "getParentPSAppDEField";
	public final static String ATTR_GETPARENTPSDER1N = "getParentPSDER1N";
	public final static String ATTR_GETPARENTPSDETREENODE = "getParentPSDETreeNode";
	public final static String ATTR_GETPARENTVALUELEVEL = "parentValueLevel";
	public final static String ATTR_GETSEARCHMODE = "searchMode";
	private net.ibizsys.model.control.tree.IPSDETreeNode childpsdetreenode;

	public net.ibizsys.model.control.tree.IPSDETreeNode getChildPSDETreeNode(){
		if(this.childpsdetreenode != null) return this.childpsdetreenode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHILDPSDETREENODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.tree.IPSDETree ipsdetree = getParentPSModelObject(net.ibizsys.model.control.tree.IPSDETree.class);
		this.childpsdetreenode = ipsdetree.getPSDETreeNode(value, false);
		return this.childpsdetreenode;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNode getChildPSDETreeNodeMust(){
		net.ibizsys.model.control.tree.IPSDETreeNode value = this.getChildPSDETreeNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定下级节点对象");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRSParam> psdetreenodersparams = null;
	public java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRSParam> getPSDETreeNodeRSParams(){
		if(this.psdetreenodersparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREENODERSPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRSParam> list = new java.util.ArrayList<net.ibizsys.model.control.tree.IPSDETreeNodeRSParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.tree.IPSDETreeNodeRSParam obj = this.getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeRSParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETREENODERSPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdetreenodersparams = list;
		}
		return (this.psdetreenodersparams.size() == 0)? null : this.psdetreenodersparams;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNodeRSParam getPSDETreeNodeRSParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeRSParam.class, this.getPSDETreeNodeRSParams(), objKey, bTryMode);
	}
	public void setPSDETreeNodeRSParams(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRSParam> list){
		this.psdetreenodersparams = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSNavigateContext> psnavigatecontexts = null;
	public java.util.List<net.ibizsys.model.control.IPSNavigateContext> getPSNavigateContexts(){
		if(this.psnavigatecontexts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSNAVIGATECONTEXTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSNavigateContext> list = new java.util.ArrayList<net.ibizsys.model.control.IPSNavigateContext>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSNavigateContext obj = this.getPSModelObject(net.ibizsys.model.control.IPSNavigateContext.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSNAVIGATECONTEXTS);
				if(obj!=null)list.add(obj);
			}
			this.psnavigatecontexts = list;
		}
		return (this.psnavigatecontexts.size() == 0)? null : this.psnavigatecontexts;
	}

	public net.ibizsys.model.control.IPSNavigateContext getPSNavigateContext(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSNavigateContext.class, this.getPSNavigateContexts(), objKey, bTryMode);
	}
	public void setPSNavigateContexts(java.util.List<net.ibizsys.model.control.IPSNavigateContext> list){
		this.psnavigatecontexts = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSNavigateParam> psnavigateparams = null;
	public java.util.List<net.ibizsys.model.control.IPSNavigateParam> getPSNavigateParams(){
		if(this.psnavigateparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSNAVIGATEPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSNavigateParam> list = new java.util.ArrayList<net.ibizsys.model.control.IPSNavigateParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSNavigateParam obj = this.getPSModelObject(net.ibizsys.model.control.IPSNavigateParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSNAVIGATEPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psnavigateparams = list;
		}
		return (this.psnavigateparams.size() == 0)? null : this.psnavigateparams;
	}

	public net.ibizsys.model.control.IPSNavigateParam getPSNavigateParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSNavigateParam.class, this.getPSNavigateParams(), objKey, bTryMode);
	}
	public void setPSNavigateParams(java.util.List<net.ibizsys.model.control.IPSNavigateParam> list){
		this.psnavigateparams = list;
	}

	public java.lang.String getParentFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField parentpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getParentPSAppDEField(){
		if(this.parentpsappdefield != null) return this.parentpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.parentpsappdefield = this.getChildPSDETreeNodeMust().getPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.parentpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getParentPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getParentPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父关系连接属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.der.IPSDER1N parentpsder1n;

	public net.ibizsys.model.dataentity.der.IPSDER1N getParentPSDER1N(){
		if(this.parentpsder1n != null) return this.parentpsder1n;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTPSDER1N);
		if(value == null){
			return null;
		}
		this.parentpsder1n = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDER1N.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPARENTPSDER1N);
		return this.parentpsder1n;
	}

	public net.ibizsys.model.dataentity.der.IPSDER1N getParentPSDER1NMust(){
		net.ibizsys.model.dataentity.der.IPSDER1N value = this.getParentPSDER1N();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父值关系");}
		return value;
	}

	private net.ibizsys.model.control.tree.IPSDETreeNode parentpsdetreenode;

	public net.ibizsys.model.control.tree.IPSDETreeNode getParentPSDETreeNode(){
		if(this.parentpsdetreenode != null) return this.parentpsdetreenode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTPSDETREENODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.tree.IPSDETree ipsdetree = getParentPSModelObject(net.ibizsys.model.control.tree.IPSDETree.class);
		this.parentpsdetreenode = ipsdetree.getPSDETreeNode(value, false);
		return this.parentpsdetreenode;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNode getParentPSDETreeNodeMust(){
		net.ibizsys.model.control.tree.IPSDETreeNode value = this.getParentPSDETreeNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定上级节点对象");}
		return value;
	}


	public int getParentValueLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTVALUELEVEL);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getSearchMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}