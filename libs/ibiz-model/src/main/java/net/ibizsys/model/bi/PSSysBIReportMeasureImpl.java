package net.ibizsys.model.bi;



public class PSSysBIReportMeasureImpl extends net.ibizsys.model.bi.PSSysBIReportItemImpl implements net.ibizsys.model.bi.IPSSysBIReportMeasure{

	public final static String ATTR_GETAGGMODE = "aggMode";
	public final static String ATTR_GETPSSYSBICUBEMEASURE = "getPSSysBICubeMeasure";
	public final static String ATTR_GETPLACETYPE = "placeType";

	public java.lang.String getAggMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.bi.IPSSysBICubeMeasure pssysbicubemeasure;

	public net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasure(){
		if(this.pssysbicubemeasure != null) return this.pssysbicubemeasure;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBICUBEMEASURE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIReport ipssysbireport = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIReport.class);
		this.pssysbicubemeasure = ipssysbireport.getPSSysBICubeMust().getPSSysBICubeMeasure(value, false);
		return this.pssysbicubemeasure;
	}

	public net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasureMust(){
		net.ibizsys.model.bi.IPSSysBICubeMeasure value = this.getPSSysBICubeMeasure();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定立方体指标");}
		return value;
	}


	public java.lang.String getPlaceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLACETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}