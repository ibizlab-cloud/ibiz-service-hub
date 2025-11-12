package net.ibizsys.model.control;



public class PSControlRenderProxy extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.IPSControlRender{

	public final static String ATTR_GETLAYOUTPANELMODEL = "layoutPanelModel";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETPSLAYOUTPANEL = "getPSLayoutPanel";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETRENDERNAME = "renderName";
	public final static String ATTR_GETRENDERTYPE = "renderType";

	public java.lang.String getLayoutPanelModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUTPANELMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.panel.IPSLayoutPanel pslayoutpanel;

	public net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanel(){
		if(this.pslayoutpanel != null) return this.pslayoutpanel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUTPANEL);
		if(value == null){
			return null;
		}
		this.pslayoutpanel = getPSModelObject(net.ibizsys.model.control.panel.IPSLayoutPanel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUTPANEL);
		return this.pslayoutpanel;
	}

	public net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanelMust(){
		net.ibizsys.model.control.panel.IPSLayoutPanel value = this.getPSLayoutPanel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定布局面板");}
		return value;
	}

	public void setPSLayoutPanel(net.ibizsys.model.control.panel.IPSLayoutPanel pslayoutpanel){
		this.pslayoutpanel = pslayoutpanel;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}


	public java.lang.String getRenderName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRENDERNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRenderType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRENDERTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}