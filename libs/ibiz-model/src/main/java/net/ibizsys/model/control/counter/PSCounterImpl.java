package net.ibizsys.model.control.counter;



public class PSCounterImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.counter.IPSCounter{

	public final static String ATTR_GETCODENAME = "codeName";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}