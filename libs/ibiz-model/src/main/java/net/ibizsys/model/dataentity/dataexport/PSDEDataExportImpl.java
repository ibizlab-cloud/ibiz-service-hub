package net.ibizsys.model.dataentity.dataexport;



public class PSDEDataExportImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.dataexport.IPSDEDataExport
		,net.ibizsys.model.app.dataentity.IPSAppDEDataExport
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETEXPPARAMS = "expParams";
	public final static String ATTR_GETEXPTAG = "expTag";
	public final static String ATTR_GETEXPTAG2 = "expTag2";
	public final static String ATTR_GETFILENAMEFORMAT = "fileNameFormat";
	public final static String ATTR_GETGROUPLEVEL = "groupLevel";
	public final static String ATTR_GETMAXROWCOUNT = "maxRowCount";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPOTIME = "pOTime";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSDEDATAEXPORTGROUPS = "getPSDEDataExportGroups";
	public final static String ATTR_GETPSDEDATAEXPORTITEMS = "getPSDEDataExportItems";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISENABLECUSTOMIZED = "enableCustomized";
	public final static String ATTR_ISENABLEFRONT = "enableFront";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getExpParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXPPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getExpTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExpTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXPTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFileNameFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILENAMEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getGroupLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPLEVEL);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getMaxRowCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXROWCOUNT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getPOTime(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPOTIME);
		if(value == null){
			return -1;
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
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集合");}
		return value;
	}

	public void setPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset){
		this.psappdedataset = psappdedataset;
	}


	private java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup> psdedataexportgroups = null;
	public java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup> getPSDEDataExportGroups(){
		if(this.psdedataexportgroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAEXPORTGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAEXPORTGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataexportgroups = list;
		}
		return (this.psdedataexportgroups.size() == 0)? null : this.psdedataexportgroups;
	}

	public net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup getPSDEDataExportGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup.class, this.getPSDEDataExportGroups(), objKey, bTryMode);
	}
	public void setPSDEDataExportGroups(java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup> list){
		this.psdedataexportgroups = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem> psdedataexportitems = null;
	public java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem> getPSDEDataExportItems(){
		if(this.psdedataexportitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAEXPORTITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAEXPORTITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataexportitems = list;
		}
		return (this.psdedataexportitems.size() == 0)? null : this.psdedataexportitems;
	}

	public net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem getPSDEDataExportItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem.class, this.getPSDEDataExportItems(), objKey, bTryMode);
	}
	public void setPSDEDataExportItems(java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem> list){
		this.psdedataexportitems = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认数据集");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
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

	public boolean isEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFront(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFRONT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}