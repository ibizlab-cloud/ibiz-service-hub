package net.ibizsys.model.control.chart;



public class PSDEChartLegendImpl extends net.ibizsys.model.control.chart.PSDEChartObjectImplBase implements net.ibizsys.model.control.chart.IPSDEChartLegend{

	public final static String ATTR_GETLEGENDPOS = "legendPos";
	public final static String ATTR_ISSHOWLEGEND = "showLegend";

	public java.lang.String getLegendPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEGENDPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isShowLegend(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWLEGEND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}