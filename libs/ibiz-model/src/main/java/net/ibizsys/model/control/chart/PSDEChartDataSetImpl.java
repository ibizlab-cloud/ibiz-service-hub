package net.ibizsys.model.control.chart;



public class PSDEChartDataSetImpl extends net.ibizsys.model.control.chart.PSDEChartObjectImplBase implements net.ibizsys.model.control.chart.IPSDEChartDataSet{

	public final static String ATTR_GETPSCHARTDATASETFIELDS = "getPSChartDataSetFields";

	private java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetField> pschartdatasetfields = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetField> getPSChartDataSetFields(){
		if(this.pschartdatasetfields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTDATASETFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetField> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartDataSetField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartDataSetField obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartDataSetField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTDATASETFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.pschartdatasetfields = list;
		}
		return (this.pschartdatasetfields.size() == 0)? null : this.pschartdatasetfields;
	}

	public net.ibizsys.model.control.chart.IPSChartDataSetField getPSChartDataSetField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartDataSetField.class, this.getPSChartDataSetFields(), objKey, bTryMode);
	}
	public void setPSChartDataSetFields(java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetField> list){
		this.pschartdatasetfields = list;
	}
}