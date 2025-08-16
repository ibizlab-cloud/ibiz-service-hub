package net.ibizsys.model.control.chart;



public class PSDEChartSeriesLineImpl extends net.ibizsys.model.control.chart.PSDEChartSeriesImpl2 implements net.ibizsys.model.control.chart.IPSChartSeriesLine{

	public final static String ATTR_GETSTEP = "step";
	public final static String ATTR_ISSTACK = "stack";

	public java.lang.Object getStep(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTEP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isStack(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSTACK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}