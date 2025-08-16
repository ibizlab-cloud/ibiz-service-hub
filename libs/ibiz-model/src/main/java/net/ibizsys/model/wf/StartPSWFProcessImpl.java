package net.ibizsys.model.wf;



public class StartPSWFProcessImpl extends net.ibizsys.model.wf.PSWFProcessImpl implements net.ibizsys.model.wf.IPSWFStartProcess{

	public final static String ATTR_GETFORMCODENAME = "formCodeName";
	public final static String ATTR_GETMOBFORMCODENAME = "mobFormCodeName";
	public final static String ATTR_GETMOBSTARTVIEWCODENAME = "mobStartViewCodeName";
	public final static String ATTR_GETMOBSTARTVIEWNAME = "mobStartViewName";
	public final static String ATTR_GETSTARTVIEWCODENAME = "startViewCodeName";
	public final static String ATTR_GETSTARTVIEWNAME = "startViewName";
	public final static String ATTR_ISSTARTPROCESS = "startProcess";

	public java.lang.String getFormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobFormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBFORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobStartViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBSTARTVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobStartViewName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBSTARTVIEWNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getStartViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTARTVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getStartViewName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTARTVIEWNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isStartProcess(){
		return true;
	}
}