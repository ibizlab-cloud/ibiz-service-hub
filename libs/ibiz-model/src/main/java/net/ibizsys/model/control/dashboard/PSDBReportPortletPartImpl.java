package net.ibizsys.model.control.dashboard;



public class PSDBReportPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBSysPortletPartImpl implements net.ibizsys.model.control.dashboard.IPSDBReportPortletPart{

	public final static String ATTR_GETCONTENTPSCONTROL = "getContentPSControl";
	private net.ibizsys.model.control.IPSControl contentpscontrol;

	public net.ibizsys.model.control.IPSControl getContentPSControl(){
		if(this.contentpscontrol != null) return this.contentpscontrol;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSCONTROL);
		if(value == null){
			return null;
		}
		this.contentpscontrol = this.getPSControl(value, false);
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

}