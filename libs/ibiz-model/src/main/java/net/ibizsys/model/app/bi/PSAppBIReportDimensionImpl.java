package net.ibizsys.model.app.bi;



public class PSAppBIReportDimensionImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.bi.IPSAppBIReportDimension{

	public final static String ATTR_GETDIMENSIONFORMULA = "dimensionFormula";
	public final static String ATTR_GETDIMENSIONNAME = "dimensionName";
	public final static String ATTR_GETDIMENSIONPARAMS = "dimensionParams";
	public final static String ATTR_GETDIMENSIONTAG = "dimensionTag";
	public final static String ATTR_GETDIMENSIONTYPE = "dimensionType";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETITEMTAG = "itemTag";
	public final static String ATTR_GETITEMTAG2 = "itemTag2";
	public final static String ATTR_GETPSAPPBICUBEDIMENSION = "getPSAppBICubeDimension";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPLACETYPE = "placeType";
	public final static String ATTR_GETPLACEMENT = "placement";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTEXTPSAPPDEFIELD = "getTextPSAppDEField";
	public final static String ATTR_GETTEXTTEMPLATE = "textTemplate";
	public final static String ATTR_GETTIPTEMPLATE = "tipTemplate";

	public java.lang.String getDimensionFormula(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIMENSIONFORMULA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDimensionName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIMENSIONNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getDimensionParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIMENSIONPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getDimensionTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIMENSIONTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDimensionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIMENSIONTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.bi.IPSAppBICubeDimension psappbicubedimension;

	public net.ibizsys.model.app.bi.IPSAppBICubeDimension getPSAppBICubeDimension(){
		if(this.psappbicubedimension != null) return this.psappbicubedimension;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBICUBEDIMENSION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBIReport ipsappbireport = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReport.class);
		this.psappbicubedimension = ipsappbireport.getPSAppBICubeMust().getPSAppBICubeDimension(value, false);
		return this.psappbicubedimension;
	}

	public net.ibizsys.model.app.bi.IPSAppBICubeDimension getPSAppBICubeDimensionMust(){
		net.ibizsys.model.app.bi.IPSAppBICubeDimension value = this.getPSAppBICubeDimension();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用智能立方体维度");}
		return value;
	}

	public void setPSAppBICubeDimension(net.ibizsys.model.app.bi.IPSAppBICubeDimension psappbicubedimension){
		this.psappbicubedimension = psappbicubedimension;
	}

	private net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist;

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList(){
		if(this.psappcodelist != null) return this.psappcodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCODELIST);
		if(value == null){
			return null;
		}
		this.psappcodelist = getPSModelObject(net.ibizsys.model.app.codelist.IPSAppCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCODELIST);
		return this.psappcodelist;
	}

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust(){
		net.ibizsys.model.app.codelist.IPSAppCodeList value = this.getPSAppCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用代码表对象");}
		return value;
	}

	public void setPSAppCodeList(net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist){
		this.psappcodelist = psappcodelist;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(){
		if(this.psappdefield != null) return this.psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBIReport ipsappbireport = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReport.class);
		this.psappdefield = ipsappbireport.getPSAppBICubeMust().getPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关应用属性");}
		return value;
	}

	public void setPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield){
		this.psappdefield = psappdefield;
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

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField(){
		if(this.textpsappdefield != null) return this.textpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBIReport ipsappbireport = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReport.class);
		this.textpsappdefield = ipsappbireport.getPSAppBICubeMust().getPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.textpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTextPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定文本应用属性");}
		return value;
	}

	public void setTextPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield){
		this.textpsappdefield = textpsappdefield;
	}


	public java.lang.String getTextTemplate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTTEMPLATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTipTemplate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIPTEMPLATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}