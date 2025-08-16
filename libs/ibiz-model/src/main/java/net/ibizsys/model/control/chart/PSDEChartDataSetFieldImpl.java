package net.ibizsys.model.control.chart;



public class PSDEChartDataSetFieldImpl extends net.ibizsys.model.control.chart.PSDEChartObjectImplBase implements net.ibizsys.model.control.chart.IPSDEChartDataSetField{

	public final static String ATTR_GETGROUPMODE = "groupMode";
	public final static String ATTR_GETPSCODELIST = "getPSCodeList";
	public final static String ATTR_ISGROUPFIELD = "groupField";

	public java.lang.String getGroupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.codelist.IPSCodeList pscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeList(){
		if(this.pscodelist != null) return this.pscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCODELIST);
		if(value == null){
			return null;
		}
		this.pscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCODELIST);
		return this.pscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定代码表对象");}
		return value;
	}


	public boolean isGroupField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISGROUPFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}