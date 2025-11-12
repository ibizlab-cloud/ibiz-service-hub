package net.ibizsys.model.control.chart;



public class PSDEChartCoordinateSystemSingleImpl extends net.ibizsys.model.control.chart.PSDEChartCoordinateSystemImplBase implements net.ibizsys.model.control.chart.IPSChartCoordinateSystemSingle{

	public final static String ATTR_GETPSCHARTSINGLE = "getPSChartSingle";
	private net.ibizsys.model.control.chart.IPSChartSingle pschartsingle;

	public net.ibizsys.model.control.chart.IPSChartSingle getPSChartSingle(){
		if(this.pschartsingle != null) return this.pschartsingle;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTSINGLE);
		if(value == null){
			return null;
		}
		this.pschartsingle = getPSModelObject(net.ibizsys.model.control.chart.IPSChartSingle.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCHARTSINGLE);
		return this.pschartsingle;
	}

	public net.ibizsys.model.control.chart.IPSChartSingle getPSChartSingleMust(){
		net.ibizsys.model.control.chart.IPSChartSingle value = this.getPSChartSingle();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定单坐标系界面对象");}
		return value;
	}

	public void setPSChartSingle(net.ibizsys.model.control.chart.IPSChartSingle pschartsingle){
		this.pschartsingle = pschartsingle;
	}

}