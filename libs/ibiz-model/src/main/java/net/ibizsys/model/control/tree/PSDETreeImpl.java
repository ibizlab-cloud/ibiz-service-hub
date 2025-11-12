package net.ibizsys.model.control.tree;



public class PSDETreeImpl extends net.ibizsys.model.control.PSMDAjaxControlContainerImpl2 implements net.ibizsys.model.control.tree.IPSDETree{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETFROZENFIRSTCOLUMN = "frozenFirstColumn";
	public final static String ATTR_GETFROZENLASTCOLUMN = "frozenLastColumn";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSDETREECOLUMNS = "getPSDETreeColumns";
	public final static String ATTR_GETPSDETREENODERSS = "getPSDETreeNodeRSs";
	public final static String ATTR_GETPSDETREENODES = "getPSDETreeNodes";
	public final static String ATTR_GETTREEGRIDMODE = "treeGridMode";
	public final static String ATTR_GETTREESTYLE = "treeStyle";
	public final static String ATTR_HASWFDATAITEMS = "hasWFDataItems";
	public final static String ATTR_ISENABLEEDIT = "enableEdit";
	public final static String ATTR_ISENABLEROOTSELECT = "enableRootSelect";
	public final static String ATTR_ISOUTPUTICONDEFAULT = "outputIconDefault";
	public final static String ATTR_ISROOTVISIBLE = "rootVisible";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEmptyText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes emptytextpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes(){
		if(this.emptytextpslanguageres != null) return this.emptytextpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.emptytextpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEMPTYTEXTPSLANGUAGERES);
		return this.emptytextpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getEmptyTextPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定无值内容语言资源");}
		return value;
	}

	public void setEmptyTextPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes emptytextpslanguageres){
		this.emptytextpslanguageres = emptytextpslanguageres;
	}


	public int getFrozenFirstColumn(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFROZENFIRSTCOLUMN);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getFrozenLastColumn(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFROZENLASTCOLUMN);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref;

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(){
		if(this.psappcounterref != null) return this.psappcounterref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREF);
		if(value == null){
			return null;
		}
		this.psappcounterref = this.getPSAppCounterRef(value, false);
		return this.psappcounterref;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust(){
		net.ibizsys.model.app.control.IPSAppCounterRef value = this.getPSAppCounterRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用计数器引用");}
		return value;
	}

	public void setPSAppCounterRef(net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref){
		this.psappcounterref = psappcounterref;
	}


	private java.util.List<net.ibizsys.model.control.tree.IPSDETreeColumn> psdetreecolumns = null;
	public java.util.List<net.ibizsys.model.control.tree.IPSDETreeColumn> getPSDETreeColumns(){
		if(this.psdetreecolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREECOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.tree.IPSDETreeColumn> list = new java.util.ArrayList<net.ibizsys.model.control.tree.IPSDETreeColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.tree.IPSDETreeColumn obj = this.getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETREECOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.psdetreecolumns = list;
		}
		return (this.psdetreecolumns.size() == 0)? null : this.psdetreecolumns;
	}

	public net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeColumn.class, this.getPSDETreeColumns(), objKey, bTryMode);
	}
	public void setPSDETreeColumns(java.util.List<net.ibizsys.model.control.tree.IPSDETreeColumn> list){
		this.psdetreecolumns = list;
	}

	private java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRS> psdetreenoderss = null;
	public java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRS> getPSDETreeNodeRSs(){
		if(this.psdetreenoderss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREENODERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRS> list = new java.util.ArrayList<net.ibizsys.model.control.tree.IPSDETreeNodeRS>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.tree.IPSDETreeNodeRS obj = this.getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeRS.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETREENODERSS);
				if(obj!=null)list.add(obj);
			}
			this.psdetreenoderss = list;
		}
		return (this.psdetreenoderss.size() == 0)? null : this.psdetreenoderss;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNodeRS getPSDETreeNodeRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeRS.class, this.getPSDETreeNodeRSs(), objKey, bTryMode);
	}
	public void setPSDETreeNodeRs(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRS> list){
		this.psdetreenoderss = list;
	}

	private java.util.List<net.ibizsys.model.control.tree.IPSDETreeNode> psdetreenodes = null;
	public java.util.List<net.ibizsys.model.control.tree.IPSDETreeNode> getPSDETreeNodes(){
		if(this.psdetreenodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREENODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.tree.IPSDETreeNode> list = new java.util.ArrayList<net.ibizsys.model.control.tree.IPSDETreeNode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.tree.IPSDETreeNode obj = this.getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETREENODES);
				if(obj!=null)list.add(obj);
			}
			this.psdetreenodes = list;
		}
		return (this.psdetreenodes.size() == 0)? null : this.psdetreenodes;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNode getPSDETreeNode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNode.class, this.getPSDETreeNodes(), objKey, bTryMode);
	}
	public void setPSDETreeNodes(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNode> list){
		this.psdetreenodes = list;
	}

	public int getTreeGridMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTREEGRIDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getTreeStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTREESTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public boolean hasWFDataItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASWFDATAITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableEdit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEDIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRootSelect(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROOTSELECT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isOutputIconDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISOUTPUTICONDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRootVisible(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISROOTVISIBLE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}