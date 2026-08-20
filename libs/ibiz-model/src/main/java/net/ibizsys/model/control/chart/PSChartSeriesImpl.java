package net.ibizsys.model.control.chart;



public abstract class PSChartSeriesImpl extends net.ibizsys.model.control.PSControlItemImpl2 implements net.ibizsys.model.control.chart.IPSChartSeries
		,net.ibizsys.model.control.chart.IPSDEChartObject{

	public final static String ATTR_GETINDEX = "index";
	public final static String ATTR_ISNESTEDMODEL = "nestedModel";

	public int getIndex(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINDEX);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isNestedModel(){
		return true;
	}
}