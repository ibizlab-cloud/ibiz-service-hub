package net.ibizsys.model.control.chart;



public class PSDEChartCoordinateSystemCartesian2DImpl extends net.ibizsys.model.control.chart.PSDEChartCoordinateSystemImplBase implements net.ibizsys.model.control.chart.IPSChartCoordinateSystemCartesian2D{

	public final static String ATTR_GETPSCHARTGRID = "getPSChartGrid";
	private net.ibizsys.model.control.chart.IPSChartGrid pschartgrid;

	public net.ibizsys.model.control.chart.IPSChartGrid getPSChartGrid(){
		if(this.pschartgrid != null) return this.pschartgrid;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTGRID);
		if(value == null){
			return null;
		}
		this.pschartgrid = getPSModelObject(net.ibizsys.model.control.chart.IPSChartGrid.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCHARTGRID);
		return this.pschartgrid;
	}

	public net.ibizsys.model.control.chart.IPSChartGrid getPSChartGridMust(){
		net.ibizsys.model.control.chart.IPSChartGrid value = this.getPSChartGrid();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定直角坐标绘图网格对象");}
		return value;
	}

}