package net.ibizsys.model.control.reportpanel;



public class PSDEReportPanelImpl extends net.ibizsys.model.control.PSControlImpl implements net.ibizsys.model.control.reportpanel.IPSDEReportPanel{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSAPPDEREPORT = "getPSAppDEReport";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEReport psappdereport;

	public net.ibizsys.model.app.dataentity.IPSAppDEReport getPSAppDEReport(){
		if(this.psappdereport != null) return this.psappdereport;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEREPORT);
		if(value == null){
			return null;
		}
		this.psappdereport = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEReport.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDEREPORT);
		return this.psappdereport;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEReport getPSAppDEReportMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEReport value = this.getPSAppDEReport();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体报表对象");}
		return value;
	}

	public void setPSAppDEReport(net.ibizsys.model.app.dataentity.IPSAppDEReport psappdereport){
		this.psappdereport = psappdereport;
	}

}