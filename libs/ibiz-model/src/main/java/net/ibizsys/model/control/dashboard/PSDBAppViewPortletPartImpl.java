package net.ibizsys.model.control.dashboard;



public class PSDBAppViewPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBPortletPartImpl implements net.ibizsys.model.control.dashboard.IPSDBAppViewPortletPart{

	public final static String ATTR_GETCONTENTPSCONTROL = "getContentPSControl";
	public final static String ATTR_GETPORTLETPSAPPVIEW = "getPortletPSAppView";
	public final static String ATTR_GETPORTLETTYPE = "portletType";
	private net.ibizsys.model.control.IPSControl contentpscontrol;

	@Deprecated
	public net.ibizsys.model.control.IPSControl getContentPSControl(){
		if(this.contentpscontrol != null) return this.contentpscontrol;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSCONTROL);
		if(value == null){
			return null;
		}
		this.contentpscontrol = getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCONTENTPSCONTROL);
		return this.contentpscontrol;
	}

	public net.ibizsys.model.control.IPSControl getContentPSControlMust(){
		net.ibizsys.model.control.IPSControl value = this.getContentPSControl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getContentPSControl]返回空值");}
		return value;
	}

	private net.ibizsys.model.app.view.IPSAppView portletpsappview;

	public net.ibizsys.model.app.view.IPSAppView getPortletPSAppView(){
		if(this.portletpsappview != null) return this.portletpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTLETPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.portletpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPORTLETPSAPPVIEW);
		return this.portletpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getPortletPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getPortletPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌入视图对象");}
		return value;
	}


	public java.lang.String getPortletType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTLETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}