package net.ibizsys.model.control.chart;



public class PSDEChartSeriesGaugeImpl extends net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneImplBase implements net.ibizsys.model.control.chart.IPSChartSeriesGauge{

	public final static String ATTR_GETENDANGLE = "endAngle";
	public final static String ATTR_GETMAXVALUE = "maxValue";
	public final static String ATTR_GETMINVALUE = "minValue";
	public final static String ATTR_GETRADIUS = "radius";
	public final static String ATTR_GETSPLITNUMBER = "splitNumber";
	public final static String ATTR_GETSTARTANGLE = "startAngle";
	public final static String ATTR_ISCLOCKWISE = "clockwise";

	public java.lang.Integer getEndAngle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENDANGLE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Object getRadius(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRADIUS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getSplitNumber(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSPLITNUMBER);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getStartAngle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTARTANGLE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public boolean isClockwise(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCLOCKWISE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}