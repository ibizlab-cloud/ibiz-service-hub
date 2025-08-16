package net.ibizsys.model.control.chart;



public class PSDEChartCoordinateSystemRadarImpl extends net.ibizsys.model.control.chart.PSDEChartCoordinateSystemImplBase implements net.ibizsys.model.control.chart.IPSChartCoordinateSystemRadar{

	public final static String ATTR_GETPSCHARTRADAR = "getPSChartRadar";
	private net.ibizsys.model.control.chart.IPSChartRadar pschartradar;

	public net.ibizsys.model.control.chart.IPSChartRadar getPSChartRadar(){
		if(this.pschartradar != null) return this.pschartradar;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTRADAR);
		if(value == null){
			return null;
		}
		this.pschartradar = getPSModelObject(net.ibizsys.model.control.chart.IPSChartRadar.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCHARTRADAR);
		return this.pschartradar;
	}

	public net.ibizsys.model.control.chart.IPSChartRadar getPSChartRadarMust(){
		net.ibizsys.model.control.chart.IPSChartRadar value = this.getPSChartRadar();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图表雷达部件");}
		return value;
	}

}