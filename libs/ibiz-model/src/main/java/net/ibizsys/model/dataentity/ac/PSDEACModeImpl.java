package net.ibizsys.model.dataentity.ac;



public class PSDEACModeImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.ac.IPSDEACMode
		,net.ibizsys.model.app.dataentity.IPSAppDEACMode
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETACPARAMS = "aCParams";
	public final static String ATTR_GETACTAG = "aCTag";
	public final static String ATTR_GETACTAG2 = "aCTag2";
	public final static String ATTR_GETACTAG3 = "aCTag3";
	public final static String ATTR_GETACTAG4 = "aCTag4";
	public final static String ATTR_GETACTYPE = "aCType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETHISTORYPSSYSMSGTEMPL = "getHistoryPSSysMsgTempl";
	public final static String ATTR_GETITEMPSLAYOUTPANEL = "getItemPSLayoutPanel";
	public final static String ATTR_GETITEMPSSYSPFPLUGIN = "getItemPSSysPFPlugin";
	public final static String ATTR_GETLINKPSAPPVIEW = "getLinkPSAppView";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMINORSORTDIR = "minorSortDir";
	public final static String ATTR_GETMINORSORTPSAPPDEFIELD = "getMinorSortPSAppDEField";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSDEACMODEDATAITEMS = "getPSDEACModeDataItems";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDEUIACTIONGROUP = "getPSDEUIActionGroup";
	public final static String ATTR_GETPSSYSAICHATAGENT = "getPSSysAIChatAgent";
	public final static String ATTR_GETPSSYSAIFACTORY = "getPSSysAIFactory";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPAGINGMODE = "pagingMode";
	public final static String ATTR_GETPAGINGSIZE = "pagingSize";
	public final static String ATTR_GETPICKUPPSAPPVIEW = "getPickupPSAppView";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETSCRIPTMODE = "scriptMode";
	public final static String ATTR_GETTEXTPSAPPDEFIELD = "getTextPSAppDEField";
	public final static String ATTR_GETVALUEPSAPPDEFIELD = "getValuePSAppDEField";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISENABLEPAGINGBAR = "enablePagingBar";

	public com.fasterxml.jackson.databind.node.ObjectNode getACParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getACTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getACTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getACTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getACTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getACType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTYPE);
		if(value == null){
			return "AUTOCOMPLETE";
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
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


	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.msg.IPSSysMsgTempl historypssysmsgtempl;

	public net.ibizsys.model.msg.IPSSysMsgTempl getHistoryPSSysMsgTempl(){
		if(this.historypssysmsgtempl != null) return this.historypssysmsgtempl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHISTORYPSSYSMSGTEMPL);
		if(value == null){
			return null;
		}
		this.historypssysmsgtempl = getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTempl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETHISTORYPSSYSMSGTEMPL);
		return this.historypssysmsgtempl;
	}

	public net.ibizsys.model.msg.IPSSysMsgTempl getHistoryPSSysMsgTemplMust(){
		net.ibizsys.model.msg.IPSSysMsgTempl value = this.getHistoryPSSysMsgTempl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定历史消息模板对象");}
		return value;
	}

	public void setHistoryPSSysMsgTempl(net.ibizsys.model.msg.IPSSysMsgTempl historypssysmsgtempl){
		this.historypssysmsgtempl = historypssysmsgtempl;
	}

	private net.ibizsys.model.control.panel.IPSLayoutPanel itempslayoutpanel;

	public net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanel(){
		if(this.itempslayoutpanel != null) return this.itempslayoutpanel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPSLAYOUTPANEL);
		if(value == null){
			return null;
		}
		this.itempslayoutpanel = getPSModelObject(net.ibizsys.model.control.panel.IPSLayoutPanel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETITEMPSLAYOUTPANEL);
		return this.itempslayoutpanel;
	}

	public net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanelMust(){
		net.ibizsys.model.control.panel.IPSLayoutPanel value = this.getItemPSLayoutPanel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定布局面板");}
		return value;
	}

	public void setItemPSLayoutPanel(net.ibizsys.model.control.panel.IPSLayoutPanel itempslayoutpanel){
		this.itempslayoutpanel = itempslayoutpanel;
	}

	private net.ibizsys.model.res.IPSSysPFPlugin itempssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getItemPSSysPFPlugin(){
		if(this.itempssyspfplugin != null) return this.itempssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.itempssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETITEMPSSYSPFPLUGIN);
		return this.itempssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getItemPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getItemPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	public void setItemPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin itempssyspfplugin){
		this.itempssyspfplugin = itempssyspfplugin;
	}

	private net.ibizsys.model.app.view.IPSAppView linkpsappview;

	public net.ibizsys.model.app.view.IPSAppView getLinkPSAppView(){
		if(this.linkpsappview != null) return this.linkpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.linkpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETLINKPSAPPVIEW);
		return this.linkpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getLinkPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getLinkPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据链接视图");}
		return value;
	}

	public void setLinkPSAppView(net.ibizsys.model.app.view.IPSAppView linkpsappview){
		this.linkpsappview = linkpsappview;
	}


	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMinorSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField minorsortpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEField(){
		if(this.minorsortpsappdefield != null) return this.minorsortpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.minorsortpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.minorsortpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getMinorSortPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定从排序应用属性对象");}
		return value;
	}

	public void setMinorSortPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField minorsortpsappdefield){
		this.minorsortpsappdefield = minorsortpsappdefield;
	}


	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet(){
		if(this.psappdedataset != null) return this.psappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集对象");}
		return value;
	}

	public void setPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset){
		this.psappdedataset = psappdedataset;
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

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}


	private java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem> psdeacmodedataitems = null;
	public java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem> getPSDEACModeDataItems(){
		if(this.psdeacmodedataitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACMODEDATAITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem obj = this.getPSModelObject(net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEACMODEDATAITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdeacmodedataitems = list;
		}
		return (this.psdeacmodedataitems.size() == 0)? null : this.psdeacmodedataitems;
	}

	public net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem getPSDEACModeDataItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem.class, this.getPSDEACModeDataItems(), objKey, bTryMode);
	}
	public void setPSDEACModeDataItems(java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem> list){
		this.psdeacmodedataitems = list;
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据集");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
	}

	private net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup(){
		if(this.psdeuiactiongroup != null) return this.psdeuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.psdeuiactiongroup = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTIONGROUP);
		return this.psdeuiactiongroup;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroupMust(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup value = this.getPSDEUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组");}
		return value;
	}

	public void setPSDEUIActionGroup(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup){
		this.psdeuiactiongroup = psdeuiactiongroup;
	}

	private net.ibizsys.model.ai.IPSSysAIChatAgent pssysaichatagent;

	public net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgent(){
		if(this.pssysaichatagent != null) return this.pssysaichatagent;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSAICHATAGENT);
		if(value == null){
			return null;
		}
		net.ibizsys.model.ai.IPSSysAIFactory ipssysaifactory = this.getPSSysAIFactoryMust();
		this.pssysaichatagent = ipssysaifactory.getPSSysAIChatAgent(value, false);
		return this.pssysaichatagent;
	}

	public net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgentMust(){
		net.ibizsys.model.ai.IPSSysAIChatAgent value = this.getPSSysAIChatAgent();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定AI交谈代理");}
		return value;
	}

	public void setPSSysAIChatAgent(net.ibizsys.model.ai.IPSSysAIChatAgent pssysaichatagent){
		this.pssysaichatagent = pssysaichatagent;
	}

	private net.ibizsys.model.ai.IPSSysAIFactory pssysaifactory;

	public net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactory(){
		if(this.pssysaifactory != null) return this.pssysaifactory;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSAIFACTORY);
		if(value == null){
			return null;
		}
		this.pssysaifactory = getPSModelObject(net.ibizsys.model.ai.IPSSysAIFactory.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSAIFACTORY);
		return this.pssysaifactory;
	}

	public net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactoryMust(){
		net.ibizsys.model.ai.IPSSysAIFactory value = this.getPSSysAIFactory();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定AI工厂");}
		return value;
	}

	public void setPSSysAIFactory(net.ibizsys.model.ai.IPSSysAIFactory pssysaifactory){
		this.pssysaifactory = pssysaifactory;
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


	public int getPagingMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPAGINGMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getPagingSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPAGINGSIZE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.view.IPSAppView pickuppsappview;

	public net.ibizsys.model.app.view.IPSAppView getPickupPSAppView(){
		if(this.pickuppsappview != null) return this.pickuppsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPICKUPPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.pickuppsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPICKUPPSAPPVIEW);
		return this.pickuppsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getPickupPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getPickupPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌入选择视图");}
		return value;
	}

	public void setPickupPSAppView(net.ibizsys.model.app.view.IPSAppView pickuppsappview){
		this.pickuppsappview = pickuppsappview;
	}


	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getScriptMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField(){
		if(this.textpsappdefield != null) return this.textpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.textpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.textpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTextPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定文本应用属性对象");}
		return value;
	}

	public void setTextPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield){
		this.textpsappdefield = textpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField valuepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getValuePSAppDEField(){
		if(this.valuepsappdefield != null) return this.valuepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.valuepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.valuepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getValuePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getValuePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值应用属性对象");}
		return value;
	}

	public void setValuePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField valuepsappdefield){
		this.valuepsappdefield = valuepsappdefield;
	}


	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
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

	public boolean isEnablePagingBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPAGINGBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}