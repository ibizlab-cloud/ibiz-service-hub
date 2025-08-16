package net.ibizsys.model.control.chart;



public class PSDEChartCoordinateSystemParallelImpl extends net.ibizsys.model.control.chart.PSDEChartCoordinateSystemImplBase implements net.ibizsys.model.control.chart.IPSChartCoordinateSystemParallel{

	public final static String ATTR_GETPSCHARTPARALLEL = "getPSChartParallel";
	private net.ibizsys.model.control.chart.IPSChartParallel pschartparallel;

	public net.ibizsys.model.control.chart.IPSChartParallel getPSChartParallel(){
		if(this.pschartparallel != null) return this.pschartparallel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTPARALLEL);
		if(value == null){
			return null;
		}
		this.pschartparallel = getPSModelObject(net.ibizsys.model.control.chart.IPSChartParallel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCHARTPARALLEL);
		return this.pschartparallel;
	}

	public net.ibizsys.model.control.chart.IPSChartParallel getPSChartParallelMust(){
		net.ibizsys.model.control.chart.IPSChartParallel value = this.getPSChartParallel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定平行坐标系界面对象");}
		return value;
	}

}