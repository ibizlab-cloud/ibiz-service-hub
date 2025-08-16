package net.ibizsys.model.control.tree;



public class PSDETreeNodeImplBase extends net.ibizsys.model.control.PSControlItemImpl implements net.ibizsys.model.control.tree.IPSDETreeNode
		,net.ibizsys.model.control.IPSControlXDataContainer{

	public final static String ATTR_GETACCUSERMODE = "accUserMode";
	public final static String ATTR_GETACCESSKEY = "accessKey";
	public final static String ATTR_GETCOUNTERID = "counterId";
	public final static String ATTR_GETCOUNTERMODE = "counterMode";
	public final static String ATTR_GETDYNACLASS = "dynaClass";
	public final static String ATTR_GETMODELOBJ = "modelObj";
	public final static String ATTR_GETNAMEPSLANGUAGERES = "getNamePSLanguageRes";
	public final static String ATTR_GETNAVFILTER = "navFilter";
	public final static String ATTR_GETNAVPSAPPVIEW = "getNavPSAppView";
	public final static String ATTR_GETNAVPSDER = "getNavPSDER";
	public final static String ATTR_GETNAVVIEWPARAMJO = "navViewParamJO";
	public final static String ATTR_GETNODETYPE = "nodeType";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSDECONTEXTMENU = "getPSDEContextMenu";
	public final static String ATTR_GETPSDETREENODECOLUMNS = "getPSDETreeNodeColumns";
	public final static String ATTR_GETPSDETREENODEDATAITEMS = "getPSDETreeNodeDataItems";
	public final static String ATTR_GETPSDETREENODEEDITITEMUPDATES = "getPSDETreeNodeEditItemUpdates";
	public final static String ATTR_GETPSDETREENODEEDITITEMS = "getPSDETreeNodeEditItems";
	public final static String ATTR_GETPSDETREENODERVS = "getPSDETreeNodeRVs";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETSHAPEDYNACLASS = "shapeDynaClass";
	public final static String ATTR_GETSHAPEPSSYSCSS = "getShapePSSysCss";
	public final static String ATTR_GETTREENODETYPE = "treeNodeType";
	public final static String ATTR_HASPSDETREENODERSS = "hasPSDETreeNodeRSs";
	public final static String ATTR_ISALLOWDRAG = "allowDrag";
	public final static String ATTR_ISALLOWDROP = "allowDrop";
	public final static String ATTR_ISALLOWEDITTEXT = "allowEditText";
	public final static String ATTR_ISALLOWORDER = "allowOrder";
	public final static String ATTR_ISAPPENDPNODEID = "appendPNodeId";
	public final static String ATTR_ISDISABLESELECT = "disableSelect";
	public final static String ATTR_ISENABLECHECK = "enableCheck";
	public final static String ATTR_ISENABLEEDITDATA = "enableEditData";
	public final static String ATTR_ISENABLEEXPORT = "enableExport";
	public final static String ATTR_ISENABLEFILTER = "enableFilter";
	public final static String ATTR_ISENABLEIMPORT = "enableImport";
	public final static String ATTR_ISENABLENEWDATA = "enableNewData";
	public final static String ATTR_ISENABLEQUICKCREATE = "enableQuickCreate";
	public final static String ATTR_ISENABLEQUICKSEARCH = "enableQuickSearch";
	public final static String ATTR_ISENABLEREMOVEDATA = "enableRemoveData";
	public final static String ATTR_ISENABLEROWEDIT = "enableRowEdit";
	public final static String ATTR_ISENABLEROWEDITCHANGEDONLY = "enableRowEditChangedOnly";
	public final static String ATTR_ISENABLESEARCH = "enableSearch";
	public final static String ATTR_ISENABLEVIEWDATA = "enableViewData";
	public final static String ATTR_ISEXPANDFIRSTONLY = "expandFirstOnly";
	public final static String ATTR_ISEXPANDED = "expanded";
	public final static String ATTR_ISLOADDEFAULT = "loadDefault";
	public final static String ATTR_ISPICKUPMODE = "pickupMode";
	public final static String ATTR_ISREADONLY = "readOnly";
	public final static String ATTR_ISROOTNODE = "rootNode";
	public final static String ATTR_ISSELECTFIRSTONLY = "selectFirstOnly";
	public final static String ATTR_ISSELECTED = "selected";

	public int getAccUserMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACCUSERMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getAccessKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACCESSKEY);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCounterId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOUNTERID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getCounterMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOUNTERMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModelObj(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELOBJ);
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


	public java.lang.String getNavFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.view.IPSAppView navpsappview;

	public net.ibizsys.model.app.view.IPSAppView getNavPSAppView(){
		if(this.navpsappview != null) return this.navpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.navpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAVPSAPPVIEW);
		return this.navpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getNavPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getNavPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定导航视图对象");}
		return value;
	}

	private net.ibizsys.model.dataentity.der.IPSDERBase navpsder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDER(){
		if(this.navpsder != null) return this.navpsder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVPSDER);
		if(value == null){
			return null;
		}
		this.navpsder = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAVPSDER);
		return this.navpsder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getNavPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定导航关系");}
		return value;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getNavViewParamJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWPARAMJO);
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
	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.psappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDATAENTITY);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体对象");}
		return value;
	}

	private net.ibizsys.model.control.toolbar.IPSDEContextMenu psdecontextmenu;

	public net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenu(){
		if(this.psdecontextmenu != null) return this.psdecontextmenu;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDECONTEXTMENU);
		if(value == null){
			return null;
		}
		this.psdecontextmenu = getPSModelObject(net.ibizsys.model.control.toolbar.IPSDEContextMenu.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDECONTEXTMENU);
		return this.psdecontextmenu;
	}

	public net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenuMust(){
		net.ibizsys.model.control.toolbar.IPSDEContextMenu value = this.getPSDEContextMenu();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定上下文菜单对象");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeColumn> psdetreenodecolumns = null;
	public java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeColumn> getPSDETreeNodeColumns(){
		if(this.psdetreenodecolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREENODECOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeColumn> list = new java.util.ArrayList<net.ibizsys.model.control.tree.IPSDETreeNodeColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.tree.IPSDETreeNodeColumn obj = this.getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETREENODECOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.psdetreenodecolumns = list;
		}
		return (this.psdetreenodecolumns.size() == 0)? null : this.psdetreenodecolumns;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNodeColumn getPSDETreeNodeColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeColumn.class, this.getPSDETreeNodeColumns(), objKey, bTryMode);
	}
	public void setPSDETreeNodeColumns(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeColumn> list){
		this.psdetreenodecolumns = list;
	}

	private java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeDataItem> psdetreenodedataitems = null;
	public java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeDataItem> getPSDETreeNodeDataItems(){
		if(this.psdetreenodedataitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREENODEDATAITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeDataItem> list = new java.util.ArrayList<net.ibizsys.model.control.tree.IPSDETreeNodeDataItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.tree.IPSDETreeNodeDataItem obj = this.getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeDataItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETREENODEDATAITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdetreenodedataitems = list;
		}
		return (this.psdetreenodedataitems.size() == 0)? null : this.psdetreenodedataitems;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNodeDataItem getPSDETreeNodeDataItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeDataItem.class, this.getPSDETreeNodeDataItems(), objKey, bTryMode);
	}
	public void setPSDETreeNodeDataItems(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeDataItem> list){
		this.psdetreenodedataitems = list;
	}

	private java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate> psdetreenodeedititemupdates = null;
	public java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate> getPSDETreeNodeEditItemUpdates(){
		if(this.psdetreenodeedititemupdates == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREENODEEDITITEMUPDATES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate> list = new java.util.ArrayList<net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate obj = this.getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETREENODEEDITITEMUPDATES);
				if(obj!=null)list.add(obj);
			}
			this.psdetreenodeedititemupdates = list;
		}
		return (this.psdetreenodeedititemupdates.size() == 0)? null : this.psdetreenodeedititemupdates;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate getPSDETreeNodeEditItemUpdate(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate.class, this.getPSDETreeNodeEditItemUpdates(), objKey, bTryMode);
	}
	public void setPSDETreeNodeEditItemUpdates(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate> list){
		this.psdetreenodeedititemupdates = list;
	}

	private java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItem> psdetreenodeedititems = null;
	public java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItem> getPSDETreeNodeEditItems(){
		if(this.psdetreenodeedititems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREENODEEDITITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItem> list = new java.util.ArrayList<net.ibizsys.model.control.tree.IPSDETreeNodeEditItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.tree.IPSDETreeNodeEditItem obj = this.getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeEditItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETREENODEEDITITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdetreenodeedititems = list;
		}
		return (this.psdetreenodeedititems.size() == 0)? null : this.psdetreenodeedititems;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNodeEditItem getPSDETreeNodeEditItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeEditItem.class, this.getPSDETreeNodeEditItems(), objKey, bTryMode);
	}
	public void setPSDETreeNodeEditItems(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItem> list){
		this.psdetreenodeedititems = list;
	}

	private java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRV> psdetreenodervs = null;
	public java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRV> getPSDETreeNodeRVs(){
		if(this.psdetreenodervs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREENODERVS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRV> list = new java.util.ArrayList<net.ibizsys.model.control.tree.IPSDETreeNodeRV>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.tree.IPSDETreeNodeRV obj = this.getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeRV.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETREENODERVS);
				if(obj!=null)list.add(obj);
			}
			this.psdetreenodervs = list;
		}
		return (this.psdetreenodervs.size() == 0)? null : this.psdetreenodervs;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNodeRV getPSDETreeNodeRV(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNodeRV.class, this.getPSDETreeNodeRVs(), objKey, bTryMode);
	}
	public void setPSDETreeNodeRVs(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRV> list){
		this.psdetreenodervs = list;
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
	private net.ibizsys.model.res.IPSSysCss pssyscss;

	public net.ibizsys.model.res.IPSSysCss getPSSysCss(){
		if(this.pssyscss != null) return this.pssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCSS);
		if(value == null){
			return null;
		}
		this.pssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCSS);
		return this.pssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定节点界面样式表");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysImage pssysimage;

	public net.ibizsys.model.res.IPSSysImage getPSSysImage(){
		if(this.pssysimage != null) return this.pssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.pssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSIMAGE);
		return this.pssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定节点图标对象");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端绘制插件");}
		return value;
	}


	public java.lang.String getShapeDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHAPEDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysCss shapepssyscss;

	public net.ibizsys.model.res.IPSSysCss getShapePSSysCss(){
		if(this.shapepssyscss != null) return this.shapepssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHAPEPSSYSCSS);
		if(value == null){
			return null;
		}
		this.shapepssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSHAPEPSSYSCSS);
		return this.shapepssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getShapePSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getShapePSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图形界面样式表");}
		return value;
	}


	public java.lang.String getTreeNodeType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTREENODETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean hasPSDETreeNodeRSs(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASPSDETREENODERSS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAllowDrag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWDRAG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAllowDrop(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWDROP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAllowEditText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWEDITTEXT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAllowOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWORDER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAppendPNodeId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAPPENDPNODEID);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDisableSelect(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDISABLESELECT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCheck(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECHECK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableEditData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEDITDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableExport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEXPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFILTER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableImport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEIMPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableNewData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLENEWDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableQuickCreate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKCREATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableQuickSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKSEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRemoveData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEREMOVEDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRowEdit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWEDIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRowEditChangedOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWEDITCHANGEDONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableViewData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEVIEWDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isExpandFirstOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXPANDFIRSTONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isExpanded(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXPANDED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isLoadDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLOADDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isPickupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPICKUPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isReadOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREADONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRootNode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISROOTNODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSelectFirstOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSELECTFIRSTONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSelected(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSELECTED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}