package net.ibizsys.model.control.chart;



public class PSDEChartSeriesCSCartesian2DEncodeImpl extends net.ibizsys.model.control.chart.PSDEChartSeriesEncodeImplBase implements net.ibizsys.model.control.chart.IPSChartSeriesCSCartesian2DEncode{

	public final static String ATTR_GETPSCHARTXAXIS = "getPSChartXAxis";
	public final static String ATTR_GETPSCHARTYAXIS = "getPSChartYAxis";
	public final static String ATTR_GETX = "x";
	public final static String ATTR_GETY = "y";
	private net.ibizsys.model.control.chart.IPSChartXAxis pschartxaxis;

	public net.ibizsys.model.control.chart.IPSChartXAxis getPSChartXAxis(){
		if(this.pschartxaxis != null) return this.pschartxaxis;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTXAXIS);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.chart.IPSDEChart ipsdechart = getParentPSModelObject(net.ibizsys.model.control.chart.IPSDEChart.class);
		this.pschartxaxis = ipsdechart.getPSChartXAxis(value, false);
		return this.pschartxaxis;
	}

	public net.ibizsys.model.control.chart.IPSChartXAxis getPSChartXAxisMust(){
		net.ibizsys.model.control.chart.IPSChartXAxis value = this.getPSChartXAxis();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图表X坐标轴");}
		return value;
	}

	private net.ibizsys.model.control.chart.IPSChartYAxis pschartyaxis;

	public net.ibizsys.model.control.chart.IPSChartYAxis getPSChartYAxis(){
		if(this.pschartyaxis != null) return this.pschartyaxis;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTYAXIS);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.chart.IPSDEChart ipsdechart = getParentPSModelObject(net.ibizsys.model.control.chart.IPSDEChart.class);
		this.pschartyaxis = ipsdechart.getPSChartYAxis(value, false);
		return this.pschartyaxis;
	}

	public net.ibizsys.model.control.chart.IPSChartYAxis getPSChartYAxisMust(){
		net.ibizsys.model.control.chart.IPSChartYAxis value = this.getPSChartYAxis();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图表Y坐标轴");}
		return value;
	}

	private java.lang.String[] x = null;
	public java.lang.String[] getX(){
		if(this.x == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETX);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.x = array;
		}
		return this.x;
	}
	private java.lang.String[] y = null;
	public java.lang.String[] getY(){
		if(this.y == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETY);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.y = array;
		}
		return this.y;
	}
}