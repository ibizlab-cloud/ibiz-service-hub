package net.ibizsys.model.control.drctrl;



public class PSDEDRBarItemImpl extends net.ibizsys.model.control.drctrl.PSDEDRCtrlItemImpl implements net.ibizsys.model.control.drctrl.IPSDEDRBarItem{

	public final static String ATTR_GETPSDEDRBARGROUP = "getPSDEDRBarGroup";
	private net.ibizsys.model.control.drctrl.IPSDEDRBarGroup psdedrbargroup;

	public net.ibizsys.model.control.drctrl.IPSDEDRBarGroup getPSDEDRBarGroup(){
		if(this.psdedrbargroup != null) return this.psdedrbargroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDRBARGROUP);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.drctrl.IPSDEDRBar ipsdedrbar = getParentPSModelObject(net.ibizsys.model.control.drctrl.IPSDEDRBar.class);
		this.psdedrbargroup = ipsdedrbar.getPSDEDRBarGroup(value, false);
		return this.psdedrbargroup;
	}

	public net.ibizsys.model.control.drctrl.IPSDEDRBarGroup getPSDEDRBarGroupMust(){
		net.ibizsys.model.control.drctrl.IPSDEDRBarGroup value = this.getPSDEDRBarGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系栏项分组");}
		return value;
	}

}