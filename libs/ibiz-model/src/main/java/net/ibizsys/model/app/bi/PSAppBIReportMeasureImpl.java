package net.ibizsys.model.app.bi;



public class PSAppBIReportMeasureImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.bi.IPSAppBIReportMeasure{

	public final static String ATTR_GETAGGMODE = "aggMode";
	public final static String ATTR_GETDRILLDETAILPSAPPVIEW = "getDrillDetailPSAppView";
	public final static String ATTR_GETDRILLDOWNPSAPPVIEW = "getDrillDownPSAppView";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETITEMTAG = "itemTag";
	public final static String ATTR_GETITEMTAG2 = "itemTag2";
	public final static String ATTR_GETJSONFORMAT = "jsonFormat";
	public final static String ATTR_GETMEASUREFORMULA = "measureFormula";
	public final static String ATTR_GETMEASUREGROUP = "measureGroup";
	public final static String ATTR_GETMEASURENAME = "measureName";
	public final static String ATTR_GETMEASUREPARAMS = "measureParams";
	public final static String ATTR_GETMEASURETAG = "measureTag";
	public final static String ATTR_GETMEASURETYPE = "measureType";
	public final static String ATTR_GETPSAPPBICUBEMEASURE = "getPSAppBICubeMeasure";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPLACETYPE = "placeType";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTEXTTEMPLATE = "textTemplate";
	public final static String ATTR_GETTIPTEMPLATE = "tipTemplate";

	public java.lang.String getAggMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.view.IPSAppView drilldetailpsappview;

	public net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppView(){
		if(this.drilldetailpsappview != null) return this.drilldetailpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDRILLDETAILPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.drilldetailpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDRILLDETAILPSAPPVIEW);
		return this.drilldetailpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getDrillDetailPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定反查数据展示视图");}
		return value;
	}

	public void setDrillDetailPSAppView(net.ibizsys.model.app.view.IPSAppView drilldetailpsappview){
		this.drilldetailpsappview = drilldetailpsappview;
	}

	private net.ibizsys.model.app.view.IPSAppView drilldownpsappview;

	public net.ibizsys.model.app.view.IPSAppView getDrillDownPSAppView(){
		if(this.drilldownpsappview != null) return this.drilldownpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDRILLDOWNPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.drilldownpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDRILLDOWNPSAPPVIEW);
		return this.drilldownpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getDrillDownPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getDrillDownPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定钻取数据展示视图");}
		return value;
	}

	public void setDrillDownPSAppView(net.ibizsys.model.app.view.IPSAppView drilldownpsappview){
		this.drilldownpsappview = drilldownpsappview;
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

	public java.lang.String getJsonFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJSONFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMeasureFormula(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEASUREFORMULA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMeasureGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEASUREGROUP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMeasureName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEASURENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getMeasureParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEASUREPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getMeasureTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEASURETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMeasureType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEASURETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.bi.IPSAppBICubeMeasure psappbicubemeasure;

	public net.ibizsys.model.app.bi.IPSAppBICubeMeasure getPSAppBICubeMeasure(){
		if(this.psappbicubemeasure != null) return this.psappbicubemeasure;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBICUBEMEASURE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBIReport ipsappbireport = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReport.class);
		this.psappbicubemeasure = ipsappbireport.getPSAppBICubeMust().getPSAppBICubeMeasure(value, false);
		return this.psappbicubemeasure;
	}

	public net.ibizsys.model.app.bi.IPSAppBICubeMeasure getPSAppBICubeMeasureMust(){
		net.ibizsys.model.app.bi.IPSAppBICubeMeasure value = this.getPSAppBICubeMeasure();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用智能立方体指标");}
		return value;
	}

	public void setPSAppBICubeMeasure(net.ibizsys.model.app.bi.IPSAppBICubeMeasure psappbicubemeasure){
		this.psappbicubemeasure = psappbicubemeasure;
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

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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