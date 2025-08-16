package net.ibizsys.model.control.chart;



public class PSDEChartSeriesPieImpl extends net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneImplBase2 implements net.ibizsys.model.control.chart.IPSChartSeriesPie{

	public final static String ATTR_GETCENTER = "center";
	public final static String ATTR_GETMINANGLE = "minAngle";
	public final static String ATTR_GETMINSHOWLABELANGLE = "minShowLabelAngle";
	public final static String ATTR_GETRADIUS = "radius";
	public final static String ATTR_GETROSETYPE = "roseType";
	public final static String ATTR_GETSTARTANGLE = "startAngle";

	public java.lang.Object getCenter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCENTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getMinAngle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINANGLE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getMinShowLabelAngle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINSHOWLABELANGLE);
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

	public java.lang.Object getRoseType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETROSETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getStartAngle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTARTANGLE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
}