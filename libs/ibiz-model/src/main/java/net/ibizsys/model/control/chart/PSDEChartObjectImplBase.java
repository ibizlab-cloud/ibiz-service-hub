package net.ibizsys.model.control.chart;



public abstract class PSDEChartObjectImplBase extends net.ibizsys.model.control.PSControlObjectImpl implements net.ibizsys.model.control.chart.IPSDEChartObject{

	public final static String ATTR_GETINDEX = "index";

	public int getIndex(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINDEX);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}