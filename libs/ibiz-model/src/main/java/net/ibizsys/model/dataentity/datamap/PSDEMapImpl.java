package net.ibizsys.model.dataentity.datamap;



public class PSDEMapImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.datamap.IPSDEMap
		,net.ibizsys.model.app.dataentity.IPSAppDEMap
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDSTPSAPPDATAENTITY = "getDstPSAppDataEntity";
	public final static String ATTR_GETDSTPSDE = "getDstPSDE";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMAPPARAMS = "mapParams";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSAPPDEMAPACTIONS = "getPSAppDEMapActions";
	public final static String ATTR_GETPSAPPDEMAPDATASETS = "getPSAppDEMapDataSets";
	public final static String ATTR_GETPSAPPDEMAPFIELDS = "getPSAppDEMapFields";
	public final static String ATTR_GETPSDEMAPACTIONS = "getPSDEMapActions";
	public final static String ATTR_GETPSDEMAPDATAQUERIES = "getPSDEMapDataQueries";
	public final static String ATTR_GETPSDEMAPDATASETS = "getPSDEMapDataSets";
	public final static String ATTR_GETPSDEMAPFIELDS = "getPSDEMapFields";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISENABLEFRONT = "enableFront";
	public final static String ATTR_ISVALID = "valid";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDataEntity dstpsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntity(){
		if(this.dstpsappdataentity != null) return this.dstpsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.dstpsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSAPPDATAENTITY);
		return this.dstpsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getDstPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标应用实体");}
		return value;
	}

	public void setDstPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity dstpsappdataentity){
		this.dstpsappdataentity = dstpsappdataentity;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity dstpsde;

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDE(){
		if(this.dstpsde != null) return this.dstpsde;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDE);
		if(value == null){
			return null;
		}
		this.dstpsde = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDE);
		return this.dstpsde;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDEMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDstPSDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定映射目标实体对象");}
		return value;
	}

	public void setDstPSDE(net.ibizsys.model.dataentity.IPSDataEntity dstpsde){
		this.dstpsde = dstpsde;
	}


	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
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

	public com.fasterxml.jackson.databind.node.ObjectNode getMapParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapAction> psappdemapactions = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapAction> getPSAppDEMapActions(){
		if(this.psappdemapactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMAPACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapAction> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEMapAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEMapAction obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMapAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPDEMAPACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.psappdemapactions = list;
		}
		return (this.psappdemapactions.size() == 0)? null : this.psappdemapactions;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMapAction getPSAppDEMapAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMapAction.class, this.getPSAppDEMapActions(), objKey, bTryMode);
	}
	public void setPSAppDEMapActions(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapAction> list){
		this.psappdemapactions = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet> psappdemapdatasets = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet> getPSAppDEMapDataSets(){
		if(this.psappdemapdatasets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMAPDATASETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPDEMAPDATASETS);
				if(obj!=null)list.add(obj);
			}
			this.psappdemapdatasets = list;
		}
		return (this.psappdemapdatasets.size() == 0)? null : this.psappdemapdatasets;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet getPSAppDEMapDataSet(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet.class, this.getPSAppDEMapDataSets(), objKey, bTryMode);
	}
	public void setPSAppDEMapDataSets(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet> list){
		this.psappdemapdatasets = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapField> psappdemapfields = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapField> getPSAppDEMapFields(){
		if(this.psappdemapfields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMAPFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapField> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEMapField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEMapField obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMapField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPDEMAPFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.psappdemapfields = list;
		}
		return (this.psappdemapfields.size() == 0)? null : this.psappdemapfields;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMapField getPSAppDEMapField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMapField.class, this.getPSAppDEMapFields(), objKey, bTryMode);
	}
	public void setPSAppDEMapFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapField> list){
		this.psappdemapfields = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapAction> psdemapactions = null;
	public java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapAction> getPSDEMapActions(){
		if(this.psdemapactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMAPACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapAction> list = new java.util.ArrayList<net.ibizsys.model.dataentity.datamap.IPSDEMapAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.datamap.IPSDEMapAction obj = this.getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMapAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMAPACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.psdemapactions = list;
		}
		return (this.psdemapactions.size() == 0)? null : this.psdemapactions;
	}

	public net.ibizsys.model.dataentity.datamap.IPSDEMapAction getPSDEMapAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMapAction.class, this.getPSDEMapActions(), objKey, bTryMode);
	}
	public void setPSDEMapActions(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapAction> list){
		this.psdemapactions = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery> psdemapdataqueries = null;
	public java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery> getPSDEMapDataQueries(){
		if(this.psdemapdataqueries == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMAPDATAQUERIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery> list = new java.util.ArrayList<net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery obj = this.getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMAPDATAQUERIES);
				if(obj!=null)list.add(obj);
			}
			this.psdemapdataqueries = list;
		}
		return (this.psdemapdataqueries.size() == 0)? null : this.psdemapdataqueries;
	}

	public net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery getPSDEMapDataQuery(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery.class, this.getPSDEMapDataQueries(), objKey, bTryMode);
	}
	public void setPSDEMapDataQueries(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery> list){
		this.psdemapdataqueries = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet> psdemapdatasets = null;
	public java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet> getPSDEMapDataSets(){
		if(this.psdemapdatasets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMAPDATASETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet> list = new java.util.ArrayList<net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet obj = this.getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMAPDATASETS);
				if(obj!=null)list.add(obj);
			}
			this.psdemapdatasets = list;
		}
		return (this.psdemapdatasets.size() == 0)? null : this.psdemapdatasets;
	}

	public net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet getPSDEMapDataSet(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet.class, this.getPSDEMapDataSets(), objKey, bTryMode);
	}
	public void setPSDEMapDataSets(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet> list){
		this.psdemapdatasets = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapField> psdemapfields = null;
	public java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapField> getPSDEMapFields(){
		if(this.psdemapfields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMAPFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.datamap.IPSDEMapField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.datamap.IPSDEMapField obj = this.getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMapField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMAPFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.psdemapfields = list;
		}
		return (this.psdemapfields.size() == 0)? null : this.psdemapfields;
	}

	public net.ibizsys.model.dataentity.datamap.IPSDEMapField getPSDEMapField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMapField.class, this.getPSDEMapFields(), objKey, bTryMode);
	}
	public void setPSDEMapFields(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapField> list){
		this.psdemapfields = list;
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


	public boolean isEnableBackend(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEBACKEND);
		if(value == null){
			return true;
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

	public boolean isValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALID);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}