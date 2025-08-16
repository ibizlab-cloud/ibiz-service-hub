package net.ibizsys.model.wf;



public abstract class PSWFLinkCondImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.IPSWFLinkCond{

	public final static String ATTR_GETCONDTYPE = "condType";

	public java.lang.String getCondType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}