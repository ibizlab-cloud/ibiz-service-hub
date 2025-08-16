package net.ibizsys.model.control.dashboard;



public class PSDBCustomPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBSysPortletPartImpl implements net.ibizsys.model.control.dashboard.IPSDBCustomPortletPart{

	public final static String ATTR_GETCONTENTPSCONTROL = "getContentPSControl";
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

}