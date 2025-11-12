package net.ibizsys.model.bi;



public class PSSysBIReportDimensionImpl extends net.ibizsys.model.bi.PSSysBIReportItemImpl implements net.ibizsys.model.bi.IPSSysBIReportDimension{

	public final static String ATTR_GETPSSYSBICUBEDIMENSION = "getPSSysBICubeDimension";
	public final static String ATTR_GETPLACETYPE = "placeType";
	public final static String ATTR_GETPLACEMENT = "placement";
	private net.ibizsys.model.bi.IPSSysBICubeDimension pssysbicubedimension;

	public net.ibizsys.model.bi.IPSSysBICubeDimension getPSSysBICubeDimension(){
		if(this.pssysbicubedimension != null) return this.pssysbicubedimension;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBICUBEDIMENSION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIReport ipssysbireport = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIReport.class);
		this.pssysbicubedimension = ipssysbireport.getPSSysBICubeMust().getPSSysBICubeDimension(value, false);
		return this.pssysbicubedimension;
	}

	public net.ibizsys.model.bi.IPSSysBICubeDimension getPSSysBICubeDimensionMust(){
		net.ibizsys.model.bi.IPSSysBICubeDimension value = this.getPSSysBICubeDimension();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定立方体维度");}
		return value;
	}

	public void setPSSysBICubeDimension(net.ibizsys.model.bi.IPSSysBICubeDimension pssysbicubedimension){
		this.pssysbicubedimension = pssysbicubedimension;
	}


	public java.lang.String getPlaceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLACETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPlacement(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLACEMENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}