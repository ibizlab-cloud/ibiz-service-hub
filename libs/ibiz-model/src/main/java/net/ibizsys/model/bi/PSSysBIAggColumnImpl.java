package net.ibizsys.model.bi;



public class PSSysBIAggColumnImpl extends net.ibizsys.model.bi.PSSysBIAggTableObjectImpl implements net.ibizsys.model.bi.IPSSysBIAggColumn{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOLUMNTAG = "columnTag";
	public final static String ATTR_GETCOLUMNTAG2 = "columnTag2";
	public final static String ATTR_GETCOLUMNTYPE = "columnType";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSSYSBICUBEDIMENSION = "getPSSysBICubeDimension";
	public final static String ATTR_GETPSSYSBICUBEMEASURE = "getPSSysBICubeMeasure";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColumnTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColumnTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColumnType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIAggTable ipssysbiaggtable = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIAggTable.class);
		this.psdefield = ipssysbiaggtable.getPSDataEntityMust().getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}

	private net.ibizsys.model.bi.IPSSysBICubeDimension pssysbicubedimension;

	public net.ibizsys.model.bi.IPSSysBICubeDimension getPSSysBICubeDimension(){
		if(this.pssysbicubedimension != null) return this.pssysbicubedimension;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBICUBEDIMENSION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIAggTable ipssysbiaggtable = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIAggTable.class);
		this.pssysbicubedimension = ipssysbiaggtable.getPSSysBICubeMust().getPSSysBICubeDimension(value, false);
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

	private net.ibizsys.model.bi.IPSSysBICubeMeasure pssysbicubemeasure;

	public net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasure(){
		if(this.pssysbicubemeasure != null) return this.pssysbicubemeasure;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBICUBEMEASURE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIAggTable ipssysbiaggtable = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIAggTable.class);
		this.pssysbicubemeasure = ipssysbiaggtable.getPSSysBICubeMust().getPSSysBICubeMeasure(value, false);
		return this.pssysbicubemeasure;
	}

	public net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasureMust(){
		net.ibizsys.model.bi.IPSSysBICubeMeasure value = this.getPSSysBICubeMeasure();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定立方体指标");}
		return value;
	}

	public void setPSSysBICubeMeasure(net.ibizsys.model.bi.IPSSysBICubeMeasure pssysbicubemeasure){
		this.pssysbicubemeasure = pssysbicubemeasure;
	}

}