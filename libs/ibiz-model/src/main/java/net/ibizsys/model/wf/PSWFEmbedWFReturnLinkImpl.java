package net.ibizsys.model.wf;



public class PSWFEmbedWFReturnLinkImpl extends net.ibizsys.model.wf.PSWFLinkImpl implements net.ibizsys.model.wf.IPSWFEmbedWFReturnLink{

	public final static String ATTR_GETNEXTCONDITION = "nextCondition";

	@Deprecated
	public java.lang.String getNextCondition(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEXTCONDITION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}