package net.ibizsys.model.control.chart;



public class PSDEChartSeriesFunnelImpl extends net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneImplBase2 implements net.ibizsys.model.control.chart.IPSChartSeriesFunnel{

	public final static String ATTR_GETFUNNELALIGN = "funnelAlign";
	public final static String ATTR_GETMAXSIZE = "maxSize";
	public final static String ATTR_GETMAXVALUE = "maxValue";
	public final static String ATTR_GETMINSIZE = "minSize";
	public final static String ATTR_GETMINVALUE = "minValue";

	public java.lang.String getFunnelAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFUNNELALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getMaxSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXSIZE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Object getMinSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINSIZE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
}