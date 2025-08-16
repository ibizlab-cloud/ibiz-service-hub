package net.ibizsys.model.control.chart;



public class PSDEChartSeriesCSNoneEncodeImpl extends net.ibizsys.model.control.chart.PSDEChartSeriesEncodeImplBase implements net.ibizsys.model.control.chart.IPSChartSeriesCSNoneEncode{

	public final static String ATTR_GETCATEGORY = "category";
	public final static String ATTR_GETVALUE = "value";

	public java.lang.String getCategory(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCATEGORY);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}