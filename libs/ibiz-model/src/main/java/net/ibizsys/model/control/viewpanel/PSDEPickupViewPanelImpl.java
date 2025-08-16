package net.ibizsys.model.control.viewpanel;



public class PSDEPickupViewPanelImpl extends net.ibizsys.model.control.viewpanel.PSDEViewPanelImpl implements net.ibizsys.model.control.viewpanel.IPSDEPickupViewPanel{

	public final static String ATTR_GETEMBEDDEDPSAPPDEVIEW = "getEmbeddedPSAppDEView";
	private net.ibizsys.model.app.view.IPSAppDEView embeddedpsappdeview;

	public net.ibizsys.model.app.view.IPSAppDEView getEmbeddedPSAppDEView(){
		if(this.embeddedpsappdeview != null) return this.embeddedpsappdeview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMBEDDEDPSAPPDEVIEW);
		if(value == null){
			return null;
		}
		this.embeddedpsappdeview = getPSModelObject(net.ibizsys.model.app.view.IPSAppDEView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEMBEDDEDPSAPPDEVIEW);
		return this.embeddedpsappdeview;
	}

	public net.ibizsys.model.app.view.IPSAppDEView getEmbeddedPSAppDEViewMust(){
		net.ibizsys.model.app.view.IPSAppDEView value = this.getEmbeddedPSAppDEView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌入视图对象");}
		return value;
	}

}