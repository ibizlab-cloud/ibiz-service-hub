package net.ibizsys.model.control.counter;



public class PSSysCounterItemImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.counter.IPSSysCounterItem{

	public final static String ATTR_GETLOGICNAME = "logicName";

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}