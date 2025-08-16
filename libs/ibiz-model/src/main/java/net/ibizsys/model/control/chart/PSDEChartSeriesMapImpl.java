package net.ibizsys.model.control.chart;



public class PSDEChartSeriesMapImpl extends net.ibizsys.model.control.chart.PSDEChartSeriesImpl implements net.ibizsys.model.control.chart.IPSChartSeriesMap{

	public final static String ATTR_GETMAPTYPE = "mapType";

	public java.lang.String getMapType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}