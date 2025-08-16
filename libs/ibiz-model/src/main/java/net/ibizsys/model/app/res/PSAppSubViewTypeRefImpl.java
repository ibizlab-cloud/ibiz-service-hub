package net.ibizsys.model.app.res;



public class PSAppSubViewTypeRefImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.res.IPSAppSubViewTypeRef{

	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSVIEWLAYOUTPANEL = "getPSViewLayoutPanel";
	public final static String ATTR_GETPLUGINCODE = "pluginCode";
	public final static String ATTR_GETREFTAG = "refTag";
	public final static String ATTR_GETTYPECODE = "typeCode";
	public final static String ATTR_GETVIEWMODEL = "viewModel";
	public final static String ATTR_GETVIEWTYPE = "viewType";
	public final static String ATTR_ISEXTENDSTYLEONLY = "extendStyleOnly";
	public final static String ATTR_ISREPLACEDEFAULT = "replaceDefault";

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端模板插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}

	private net.ibizsys.model.control.panel.IPSViewLayoutPanel psviewlayoutpanel;

	public net.ibizsys.model.control.panel.IPSViewLayoutPanel getPSViewLayoutPanel(){
		if(this.psviewlayoutpanel != null) return this.psviewlayoutpanel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSVIEWLAYOUTPANEL);
		if(value == null){
			return null;
		}
		this.psviewlayoutpanel = getPSModelObject(net.ibizsys.model.control.panel.IPSViewLayoutPanel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSVIEWLAYOUTPANEL);
		return this.psviewlayoutpanel;
	}

	public net.ibizsys.model.control.panel.IPSViewLayoutPanel getPSViewLayoutPanelMust(){
		net.ibizsys.model.control.panel.IPSViewLayoutPanel value = this.getPSViewLayoutPanel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定视图布局面板");}
		return value;
	}

	public void setPSViewLayoutPanel(net.ibizsys.model.control.panel.IPSViewLayoutPanel psviewlayoutpanel){
		this.psviewlayoutpanel = psviewlayoutpanel;
	}


	public java.lang.String getPluginCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLUGINCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTypeCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPECODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getViewModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWMODEL);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getViewType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isExtendStyleOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXTENDSTYLEONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isReplaceDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREPLACEDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}