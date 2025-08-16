package net.ibizsys.model.app.usermode;



public class PSAppUserModeImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.usermode.IPSAppUserMode{

	public final static String ATTR_ISDEFAULTMODE = "defaultMode";

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}