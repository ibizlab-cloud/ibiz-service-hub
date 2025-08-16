package net.ibizsys.model.control.grid;



public class PSDEMultiEditViewPanelImpl extends net.ibizsys.model.control.grid.PSDEGridImpl implements net.ibizsys.model.control.grid.IPSDEMultiEditViewPanel{

	public final static String ATTR_GETEMBEDDEDPSAPPVIEW = "getEmbeddedPSAppView";
	public final static String ATTR_GETPANELSTYLE = "panelStyle";
	private net.ibizsys.model.app.view.IPSAppView embeddedpsappview;

	public net.ibizsys.model.app.view.IPSAppView getEmbeddedPSAppView(){
		if(this.embeddedpsappview != null) return this.embeddedpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMBEDDEDPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.embeddedpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEMBEDDEDPSAPPVIEW);
		return this.embeddedpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getEmbeddedPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getEmbeddedPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌入应用视图");}
		return value;
	}

	public void setEmbeddedPSAppView(net.ibizsys.model.app.view.IPSAppView embeddedpsappview){
		this.embeddedpsappview = embeddedpsappview;
	}


	public java.lang.String getPanelStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPANELSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}