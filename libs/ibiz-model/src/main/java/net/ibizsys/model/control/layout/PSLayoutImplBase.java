package net.ibizsys.model.control.layout;



public abstract class PSLayoutImplBase extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.layout.IPSLayout{

	public final static String ATTR_GETNAME = "name";

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}