package net.ibizsys.model.control.chart;



public class PSDEChartCoordinateSystemCalendarImpl extends net.ibizsys.model.control.chart.PSDEChartCoordinateSystemImplBase implements net.ibizsys.model.control.chart.IPSChartCoordinateSystemCalendar{

	public final static String ATTR_GETPSCHARTCALENDAR = "getPSChartCalendar";
	private net.ibizsys.model.control.chart.IPSChartCalendar pschartcalendar;

	public net.ibizsys.model.control.chart.IPSChartCalendar getPSChartCalendar(){
		if(this.pschartcalendar != null) return this.pschartcalendar;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTCALENDAR);
		if(value == null){
			return null;
		}
		this.pschartcalendar = getPSModelObject(net.ibizsys.model.control.chart.IPSChartCalendar.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCHARTCALENDAR);
		return this.pschartcalendar;
	}

	public net.ibizsys.model.control.chart.IPSChartCalendar getPSChartCalendarMust(){
		net.ibizsys.model.control.chart.IPSChartCalendar value = this.getPSChartCalendar();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定地理坐标系组件");}
		return value;
	}

}