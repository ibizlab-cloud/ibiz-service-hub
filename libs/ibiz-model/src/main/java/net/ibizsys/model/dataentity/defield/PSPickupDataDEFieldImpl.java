package net.ibizsys.model.dataentity.defield;



public class PSPickupDataDEFieldImpl extends net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl implements net.ibizsys.model.dataentity.defield.IPSPickupDataDEField{

	public final static String ATTR_ISENABLEWRITEBACK = "enableWriteBack";
	public final static String ATTR_ISIGNOREREFRESH = "ignoreRefresh";
	public final static String ATTR_ISPHISICALDEFIELD = "phisicalDEField";

	public boolean isEnableWriteBack(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWRITEBACK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIgnoreRefresh(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNOREREFRESH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPhisicalDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPHISICALDEFIELD);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}