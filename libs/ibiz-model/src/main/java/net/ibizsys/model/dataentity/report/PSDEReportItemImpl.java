package net.ibizsys.model.dataentity.report;



public class PSDEReportItemImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.report.IPSDEReportItem
		,net.ibizsys.model.app.dataentity.IPSAppDEReportItem{

	public final static String ATTR_GETMINORPSAPPDEREPORT = "getMinorPSAppDEReport";
	private net.ibizsys.model.app.dataentity.IPSAppDEReport minorpsappdereport;

	public net.ibizsys.model.app.dataentity.IPSAppDEReport getMinorPSAppDEReport(){
		if(this.minorpsappdereport != null) return this.minorpsappdereport;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSAPPDEREPORT);
		if(value == null){
			return null;
		}
		this.minorpsappdereport = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEReport.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMINORPSAPPDEREPORT);
		return this.minorpsappdereport;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEReport getMinorPSAppDEReportMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEReport value = this.getMinorPSAppDEReport();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系报表对象");}
		return value;
	}

	public void setMinorPSAppDEReport(net.ibizsys.model.app.dataentity.IPSAppDEReport minorpsappdereport){
		this.minorpsappdereport = minorpsappdereport;
	}

}