package net.ibizsys.model.control.chart;



public class PSDEChartSeriesEncodeImplBase extends net.ibizsys.model.control.chart.PSDEChartObjectImplBase implements net.ibizsys.model.control.chart.IPSDEChartSeriesEncode{

	public final static String ATTR_GETITEMID = "itemId";
	public final static String ATTR_GETITEMNAME = "itemName";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getItemId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}