package net.ibizsys.model.control.dashboard;



public class PSDBHtmlPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBSysPortletPartImpl implements net.ibizsys.model.control.dashboard.IPSDBHtmlPortletPart{

	public final static String ATTR_GETCONTENTPSCONTROL = "getContentPSControl";
	public final static String ATTR_GETHTMLSHOWMODE = "htmlShowMode";
	public final static String ATTR_GETPAGEURL = "pageUrl";
	private net.ibizsys.model.control.IPSControl contentpscontrol;

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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容部件");}
		return value;
	}

	public void setContentPSControl(net.ibizsys.model.control.IPSControl contentpscontrol){
		this.contentpscontrol = contentpscontrol;
	}


	public java.lang.String getHtmlShowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHTMLSHOWMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPageUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPAGEURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}