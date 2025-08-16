package net.ibizsys.model.control.dashboard;



public class PSSysDashboardImpl extends net.ibizsys.model.control.dashboard.PSDashboardImpl implements net.ibizsys.model.control.dashboard.IPSSysDashboard{

	public final static String ATTR_GETCODENAME = "codeName";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}