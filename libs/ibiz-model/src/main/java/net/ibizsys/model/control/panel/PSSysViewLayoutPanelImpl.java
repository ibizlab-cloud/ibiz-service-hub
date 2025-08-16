package net.ibizsys.model.control.panel;



public class PSSysViewLayoutPanelImpl extends net.ibizsys.model.control.panel.PSSysPanelImpl implements net.ibizsys.model.control.panel.IPSSysViewLayoutPanel{

	public final static String ATTR_ISLAYOUTBODYONLY = "layoutBodyOnly";
	public final static String ATTR_ISLAYOUTPANEL = "layoutPanel";
	public final static String ATTR_ISUSEDEFAULTLAYOUT = "useDefaultLayout";
	public final static String ATTR_ISVIEWPROXYMODE = "viewProxyMode";

	public boolean isLayoutBodyOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLAYOUTBODYONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isLayoutPanel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLAYOUTPANEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUseDefaultLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUSEDEFAULTLAYOUT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isViewProxyMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVIEWPROXYMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}