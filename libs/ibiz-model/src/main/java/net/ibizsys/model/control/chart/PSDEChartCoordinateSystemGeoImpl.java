package net.ibizsys.model.control.chart;



public class PSDEChartCoordinateSystemGeoImpl extends net.ibizsys.model.control.chart.PSDEChartCoordinateSystemImplBase implements net.ibizsys.model.control.chart.IPSChartCoordinateSystemGeo{

	public final static String ATTR_GETPSCHARTGEO = "getPSChartGeo";
	private net.ibizsys.model.control.chart.IPSChartGeo pschartgeo;

	public net.ibizsys.model.control.chart.IPSChartGeo getPSChartGeo(){
		if(this.pschartgeo != null) return this.pschartgeo;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTGEO);
		if(value == null){
			return null;
		}
		this.pschartgeo = getPSModelObject(net.ibizsys.model.control.chart.IPSChartGeo.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCHARTGEO);
		return this.pschartgeo;
	}

	public net.ibizsys.model.control.chart.IPSChartGeo getPSChartGeoMust(){
		net.ibizsys.model.control.chart.IPSChartGeo value = this.getPSChartGeo();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定地理坐标系组件");}
		return value;
	}

	public void setPSChartGeo(net.ibizsys.model.control.chart.IPSChartGeo pschartgeo){
		this.pschartgeo = pschartgeo;
	}

}