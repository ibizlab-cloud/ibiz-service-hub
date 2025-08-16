package net.ibizsys.model.wf;



public class EndPSWFProcessImpl extends net.ibizsys.model.wf.PSWFProcessImpl implements net.ibizsys.model.wf.IPSWFEndProcess{

	public final static String ATTR_GETEXITSTATEVALUE = "exitStateValue";
	public final static String ATTR_ISTERMINALPROCESS = "terminalProcess";

	public java.lang.String getExitStateValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXITSTATEVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isTerminalProcess(){
		return true;
	}
}