package net.ibizsys.model.control.chart;



public class PSDEChartPolarImpl extends net.ibizsys.model.control.chart.PSDEChartCoordinateSystemControlImplBase implements net.ibizsys.model.control.chart.IPSDEChartPolar{

	public final static String ATTR_GETPSCHARTPOLARANGLEAXIS = "getPSChartPolarAngleAxis";
	public final static String ATTR_GETPSCHARTPOLARRADIUSAXIS = "getPSChartPolarRadiusAxis";
	private net.ibizsys.model.control.chart.IPSChartPolarAngleAxis pschartpolarangleaxis;

	public net.ibizsys.model.control.chart.IPSChartPolarAngleAxis getPSChartPolarAngleAxis(){
		if(this.pschartpolarangleaxis != null) return this.pschartpolarangleaxis;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTPOLARANGLEAXIS);
		if(value == null){
			return null;
		}
		this.pschartpolarangleaxis = getPSModelObject(net.ibizsys.model.control.chart.IPSChartPolarAngleAxis.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCHARTPOLARANGLEAXIS);
		return this.pschartpolarangleaxis;
	}

	public net.ibizsys.model.control.chart.IPSChartPolarAngleAxis getPSChartPolarAngleAxisMust(){
		net.ibizsys.model.control.chart.IPSChartPolarAngleAxis value = this.getPSChartPolarAngleAxis();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定角度轴");}
		return value;
	}

	public void setPSChartPolarAngleAxis(net.ibizsys.model.control.chart.IPSChartPolarAngleAxis pschartpolarangleaxis){
		this.pschartpolarangleaxis = pschartpolarangleaxis;
	}

	private net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis pschartpolarradiusaxis;

	public net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis getPSChartPolarRadiusAxis(){
		if(this.pschartpolarradiusaxis != null) return this.pschartpolarradiusaxis;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTPOLARRADIUSAXIS);
		if(value == null){
			return null;
		}
		this.pschartpolarradiusaxis = getPSModelObject(net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCHARTPOLARRADIUSAXIS);
		return this.pschartpolarradiusaxis;
	}

	public net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis getPSChartPolarRadiusAxisMust(){
		net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis value = this.getPSChartPolarRadiusAxis();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定径向轴");}
		return value;
	}

	public void setPSChartPolarRadiusAxis(net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis pschartpolarradiusaxis){
		this.pschartpolarradiusaxis = pschartpolarradiusaxis;
	}

}