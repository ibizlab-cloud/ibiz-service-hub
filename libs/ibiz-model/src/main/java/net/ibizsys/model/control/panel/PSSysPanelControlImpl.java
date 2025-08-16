package net.ibizsys.model.control.panel;



public class PSSysPanelControlImpl extends net.ibizsys.model.control.panel.PSSysPanelItemImpl implements net.ibizsys.model.control.panel.IPSSysPanelControl{

	public final static String ATTR_GETPSCONTROL = "getPSControl";
	public final static String ATTR_GETVIEWFIELDNAME = "viewFieldName";
	private net.ibizsys.model.control.IPSControl pscontrol;

	public net.ibizsys.model.control.IPSControl getPSControl(){
		if(this.pscontrol != null) return this.pscontrol;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROL);
		if(value == null){
			return null;
		}
		this.pscontrol = getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCONTROL);
		return this.pscontrol;
	}

	public net.ibizsys.model.control.IPSControl getPSControlMust(){
		net.ibizsys.model.control.IPSControl value = this.getPSControl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定部件对象");}
		return value;
	}


	public java.lang.String getViewFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}