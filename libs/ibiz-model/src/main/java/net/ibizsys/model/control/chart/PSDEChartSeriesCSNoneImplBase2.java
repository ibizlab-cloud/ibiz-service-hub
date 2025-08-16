package net.ibizsys.model.control.chart;



public class PSDEChartSeriesCSNoneImplBase2 extends net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneImplBase implements net.ibizsys.model.control.chart.IPSChartPosition{

	public final static String ATTR_GETBOTTOM = "bottom";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETLEFT = "left";
	public final static String ATTR_GETRIGHT = "right";
	public final static String ATTR_GETTOP = "top";
	public final static String ATTR_GETWIDTH = "width";

	public java.lang.Object getBottom(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBOTTOM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getLeft(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEFT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getRight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRIGHT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getTop(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}