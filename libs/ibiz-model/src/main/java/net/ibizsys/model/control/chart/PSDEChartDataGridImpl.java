package net.ibizsys.model.control.chart;



public class PSDEChartDataGridImpl extends net.ibizsys.model.control.chart.PSDEChartObjectImplBase implements net.ibizsys.model.control.chart.IPSDEChartDataGrid{

	public final static String ATTR_GETDATAGRIDPOS = "dataGridPos";
	public final static String ATTR_ISSHOWDATAGRID = "showDataGrid";

	public java.lang.String getDataGridPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAGRIDPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isShowDataGrid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWDATAGRID);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}