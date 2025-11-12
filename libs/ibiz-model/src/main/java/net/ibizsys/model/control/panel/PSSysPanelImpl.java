package net.ibizsys.model.control.panel;



public class PSSysPanelImpl extends net.ibizsys.model.control.PSControlContainerImpl implements net.ibizsys.model.control.panel.IPSSysPanel
		,net.ibizsys.model.control.panel.IPSSysLayoutPanel{

	public final static String ATTR_GETALLPSPANELFIELDS = "getAllPSPanelFields";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDATAMODE = "dataMode";
	public final static String ATTR_GETDATANAME = "dataName";
	public final static String ATTR_GETDATATIMER = "dataTimer";
	public final static String ATTR_GETGETPSCONTROLACTION = "getGetPSControlAction";
	public final static String ATTR_GETLAYOUTMODE = "layoutMode";
	public final static String ATTR_GETPSLAYOUT = "getPSLayout";
	public final static String ATTR_GETPANELSTYLE = "panelStyle";
	public final static String ATTR_GETPANELWIDTH = "panelWidth";
	public final static String ATTR_GETROOTPSPANELITEMS = "getRootPSPanelItems";
	public final static String ATTR_ISLAYOUTPANEL = "layoutPanel";
	public final static String ATTR_ISMOBILEPANEL = "mobilePanel";

	private java.util.List<net.ibizsys.model.control.panel.IPSPanelField> allpspanelfields = null;
	public java.util.List<net.ibizsys.model.control.panel.IPSPanelField> getAllPSPanelFields(){
		if(this.allpspanelfields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSPANELFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.panel.IPSPanelField> list = new java.util.ArrayList<net.ibizsys.model.control.panel.IPSPanelField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.panel.IPSPanelField obj = this.getPSModelObject(net.ibizsys.model.control.panel.IPSPanelField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSPANELFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.allpspanelfields = list;
		}
		return (this.allpspanelfields.size() == 0)? null : this.allpspanelfields;
	}

	public net.ibizsys.model.control.panel.IPSPanelField getPSPanelField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.panel.IPSPanelField.class, this.getAllPSPanelFields(), objKey, bTryMode);
	}
	public void setPSPanelFields(java.util.List<net.ibizsys.model.control.panel.IPSPanelField> list){
		this.allpspanelfields = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDataName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATANAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDataTimer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATIMER);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.control.IPSControlAction getpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetPSControlAction(){
		if(this.getpscontrolaction != null) return this.getpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.getpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取数据行为");}
		return value;
	}

	public void setGetPSControlAction(net.ibizsys.model.control.IPSControlAction getpscontrolaction){
		this.getpscontrolaction = getpscontrolaction;
	}


	public java.lang.String getLayoutMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定面板布局对象");}
		return value;
	}

	public void setPSLayout(net.ibizsys.model.control.layout.IPSLayout pslayout){
		this.pslayout = pslayout;
	}


	public java.lang.String getPanelStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPANELSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getPanelWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPANELWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	private java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> rootpspanelitems = null;
	public java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> getRootPSPanelItems(){
		if(this.rootpspanelitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETROOTPSPANELITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> list = new java.util.ArrayList<net.ibizsys.model.control.panel.IPSPanelItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.panel.IPSPanelItem obj = this.getPSModelObject(net.ibizsys.model.control.panel.IPSPanelItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETROOTPSPANELITEMS);
				if(obj!=null)list.add(obj);
			}
			this.rootpspanelitems = list;
		}
		return (this.rootpspanelitems.size() == 0)? null : this.rootpspanelitems;
	}

	public net.ibizsys.model.control.panel.IPSPanelItem getRootPSPanelItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.panel.IPSPanelItem.class, this.getRootPSPanelItems(), objKey, bTryMode);
	}
	
	public void setRootPSPanelItems(java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> list){
		this.rootpspanelitems = list;
	}

	public boolean isLayoutPanel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLAYOUTPANEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMobilePanel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMOBILEPANEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}