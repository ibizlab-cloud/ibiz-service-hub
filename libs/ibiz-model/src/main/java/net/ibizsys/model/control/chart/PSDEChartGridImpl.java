package net.ibizsys.model.control.chart;



public class PSDEChartGridImpl extends net.ibizsys.model.control.chart.PSDEChartCoordinateSystemControlImplBase2 implements net.ibizsys.model.control.chart.IPSDEChartGrid{

	public final static String ATTR_GETPSCHARTGRIDXAXIS0 = "getPSChartGridXAxis0";
	public final static String ATTR_GETPSCHARTGRIDXAXIS1 = "getPSChartGridXAxis1";
	public final static String ATTR_GETPSCHARTGRIDYAXIS0 = "getPSChartGridYAxis0";
	public final static String ATTR_GETPSCHARTGRIDYAXIS1 = "getPSChartGridYAxis1";
	private net.ibizsys.model.control.chart.IPSChartGridXAxis pschartgridxaxis0;

	public net.ibizsys.model.control.chart.IPSChartGridXAxis getPSChartGridXAxis0(){
		if(this.pschartgridxaxis0 != null) return this.pschartgridxaxis0;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTGRIDXAXIS0);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.chart.IPSDEChart ipsdechart = getParentPSModelObject(net.ibizsys.model.control.chart.IPSDEChart.class);
		this.pschartgridxaxis0 = (net.ibizsys.model.control.chart.IPSChartGridXAxis)ipsdechart.getPSChartXAxis(value, false);
		return this.pschartgridxaxis0;
	}

	public net.ibizsys.model.control.chart.IPSChartGridXAxis getPSChartGridXAxis0Must(){
		net.ibizsys.model.control.chart.IPSChartGridXAxis value = this.getPSChartGridXAxis0();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定绘图表格X轴[0]");}
		return value;
	}

	private net.ibizsys.model.control.chart.IPSChartGridXAxis pschartgridxaxis1;

	public net.ibizsys.model.control.chart.IPSChartGridXAxis getPSChartGridXAxis1(){
		if(this.pschartgridxaxis1 != null) return this.pschartgridxaxis1;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTGRIDXAXIS1);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.chart.IPSDEChart ipsdechart = getParentPSModelObject(net.ibizsys.model.control.chart.IPSDEChart.class);
		this.pschartgridxaxis1 = (net.ibizsys.model.control.chart.IPSChartGridXAxis)ipsdechart.getPSChartXAxis(value, false);
		return this.pschartgridxaxis1;
	}

	public net.ibizsys.model.control.chart.IPSChartGridXAxis getPSChartGridXAxis1Must(){
		net.ibizsys.model.control.chart.IPSChartGridXAxis value = this.getPSChartGridXAxis1();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定绘图表格X轴[1]");}
		return value;
	}

	private net.ibizsys.model.control.chart.IPSChartGridYAxis pschartgridyaxis0;

	public net.ibizsys.model.control.chart.IPSChartGridYAxis getPSChartGridYAxis0(){
		if(this.pschartgridyaxis0 != null) return this.pschartgridyaxis0;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTGRIDYAXIS0);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.chart.IPSDEChart ipsdechart = getParentPSModelObject(net.ibizsys.model.control.chart.IPSDEChart.class);
		this.pschartgridyaxis0 = (net.ibizsys.model.control.chart.IPSChartGridYAxis)ipsdechart.getPSChartYAxis(value, false);
		return this.pschartgridyaxis0;
	}

	public net.ibizsys.model.control.chart.IPSChartGridYAxis getPSChartGridYAxis0Must(){
		net.ibizsys.model.control.chart.IPSChartGridYAxis value = this.getPSChartGridYAxis0();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定绘图表格Y轴[0]");}
		return value;
	}

	private net.ibizsys.model.control.chart.IPSChartGridYAxis pschartgridyaxis1;

	public net.ibizsys.model.control.chart.IPSChartGridYAxis getPSChartGridYAxis1(){
		if(this.pschartgridyaxis1 != null) return this.pschartgridyaxis1;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTGRIDYAXIS1);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.chart.IPSDEChart ipsdechart = getParentPSModelObject(net.ibizsys.model.control.chart.IPSDEChart.class);
		this.pschartgridyaxis1 = (net.ibizsys.model.control.chart.IPSChartGridYAxis)ipsdechart.getPSChartYAxis(value, false);
		return this.pschartgridyaxis1;
	}

	public net.ibizsys.model.control.chart.IPSChartGridYAxis getPSChartGridYAxis1Must(){
		net.ibizsys.model.control.chart.IPSChartGridYAxis value = this.getPSChartGridYAxis1();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定绘图表格Y轴[1]");}
		return value;
	}

}