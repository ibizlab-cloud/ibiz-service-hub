package net.ibizsys.model.control.chart;



public class PSDEChartCoordinateSystemControlImplBase extends net.ibizsys.model.control.chart.PSDEChartObjectImplBase implements net.ibizsys.model.control.chart.IPSChartCoordinateSystemControl{

	public final static String ATTR_GETBASEOPTIONJOSTRING = "baseOptionJOString";
	public final static String ATTR_GETPSCHARTCOORDINATESYSTEM = "getPSChartCoordinateSystem";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getBaseOptionJOString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBASEOPTIONJOSTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.chart.IPSChartCoordinateSystem pschartcoordinatesystem;

	public net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystem(){
		if(this.pschartcoordinatesystem != null) return this.pschartcoordinatesystem;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTCOORDINATESYSTEM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.chart.IPSDEChart ipsdechart = getParentPSModelObject(net.ibizsys.model.control.chart.IPSDEChart.class);
		this.pschartcoordinatesystem = ipsdechart.getPSChartCoordinateSystem(value, false);
		return this.pschartcoordinatesystem;
	}

	public net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystemMust(){
		net.ibizsys.model.control.chart.IPSChartCoordinateSystem value = this.getPSChartCoordinateSystem();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图表坐标系统");}
		return value;
	}

	public void setPSChartCoordinateSystem(net.ibizsys.model.control.chart.IPSChartCoordinateSystem pschartcoordinatesystem){
		this.pschartcoordinatesystem = pschartcoordinatesystem;
	}


	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}