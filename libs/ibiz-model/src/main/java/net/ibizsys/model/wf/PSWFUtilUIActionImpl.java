package net.ibizsys.model.wf;



public class PSWFUtilUIActionImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.IPSWFUtilUIAction{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDEUIACTIONID = "getPSDEUIActionId";
	public final static String ATTR_GETPSWORKFLOWID = "getPSWorkflowId";
	public final static String ATTR_GETUTILTYPE = "utilType";

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSDEUIActionId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSWorkflowId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWORKFLOWID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}