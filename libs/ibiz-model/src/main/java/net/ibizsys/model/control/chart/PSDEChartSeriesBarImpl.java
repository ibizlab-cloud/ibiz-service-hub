package net.ibizsys.model.control.chart;



public class PSDEChartSeriesBarImpl extends net.ibizsys.model.control.chart.PSDEChartSeriesImpl2 implements net.ibizsys.model.control.chart.IPSChartSeriesBar{

	public final static String ATTR_GETBARCATEGORYGAP = "barCategoryGap";
	public final static String ATTR_GETBARGAP = "barGap";
	public final static String ATTR_GETBARMAXWIDTH = "barMaxWidth";
	public final static String ATTR_GETBARMINHEIGHT = "barMinHeight";
	public final static String ATTR_GETBARMINWIDTH = "barMinWidth";
	public final static String ATTR_GETBARWIDTH = "barWidth";
	public final static String ATTR_ISSTACK = "stack";

	public java.lang.Object getBarCategoryGap(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBARCATEGORYGAP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getBarGap(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBARGAP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getBarMaxWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBARMAXWIDTH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getBarMinHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBARMINHEIGHT);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Object getBarMinWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBARMINWIDTH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getBarWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBARWIDTH);
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