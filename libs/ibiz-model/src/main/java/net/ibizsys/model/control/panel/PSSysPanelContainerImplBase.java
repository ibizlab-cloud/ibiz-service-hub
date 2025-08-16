package net.ibizsys.model.control.panel;



public class PSSysPanelContainerImplBase extends net.ibizsys.model.control.panel.PSSysPanelItemImpl implements net.ibizsys.model.control.layout.IPSLayoutContainer
		,net.ibizsys.model.control.panel.IPSPanelDataRegion{

	public final static String ATTR_GETDATANAME = "dataName";
	public final static String ATTR_GETDATAREGIONTYPE = "dataRegionType";
	public final static String ATTR_GETDATASOURCETYPE = "dataSourceType";
	public final static String ATTR_GETPSAPPDELOGIC = "getPSAppDELogic";
	public final static String ATTR_GETPSAPPDEMETHOD = "getPSAppDEMethod";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSLAYOUT = "getPSLayout";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";
	public final static String ATTR_GETRELOADTIMER = "reloadTimer";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_ISSHOWBUSYINDICATOR = "showBusyIndicator";

	public java.lang.String getDataName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATANAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataRegionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAREGIONTYPE);
		if(value == null){
			return "INHERIT";
		}
		return value.asText();
	}

	public java.lang.String getDataSourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASOURCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDELogic psappdelogic;

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic(){
		if(this.psappdelogic != null) return this.psappdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdelogic = ipsappdataentity.getPSAppDELogic(value, false);
		return this.psappdelogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDELogic value = this.getPSAppDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体处理逻辑");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEMethod psappdemethod;

	public net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod(){
		if(this.psappdemethod != null) return this.psappdemethod;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMETHOD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdemethod = ipsappdataentity.getPSAppDEMethod(value, false);
		return this.psappdemethod;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethodMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEMethod value = this.getPSAppDEMethod();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体方法");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体");}
		return value;
	}

	private net.ibizsys.model.control.layout.IPSLayout pslayout;

	public net.ibizsys.model.control.layout.IPSLayout getPSLayout(){
		if(this.pslayout != null) return this.pslayout;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUT);
		if(value == null){
			return null;
		}
		this.pslayout = getPSModelObject(net.ibizsys.model.control.layout.IPSLayout.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUT);
		return this.pslayout;
	}

	public net.ibizsys.model.control.layout.IPSLayout getPSLayoutMust(){
		net.ibizsys.model.control.layout.IPSLayout value = this.getPSLayout();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定布局设置");}
		return value;
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

	public int getReloadTimer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRELOADTIMER);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isShowBusyIndicator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWBUSYINDICATOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}