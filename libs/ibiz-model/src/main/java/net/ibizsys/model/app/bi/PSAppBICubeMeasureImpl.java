package net.ibizsys.model.app.bi;



public class PSAppBICubeMeasureImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.bi.IPSAppBICubeMeasure{

	public final static String ATTR_GETAGGMODE = "aggMode";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDRILLDETAILPSAPPVIEW = "getDrillDetailPSAppView";
	public final static String ATTR_GETDRILLDOWNPSAPPVIEW = "getDrillDownPSAppView";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETJSONFORMAT = "jsonFormat";
	public final static String ATTR_GETMEASUREFORMULA = "measureFormula";
	public final static String ATTR_GETMEASUREGROUP = "measureGroup";
	public final static String ATTR_GETMEASURETAG = "measureTag";
	public final static String ATTR_GETMEASURETAG2 = "measureTag2";
	public final static String ATTR_GETMEASURETYPE = "measureType";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPARAMPSAPPDEUIACTION = "getParamPSAppDEUIAction";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTEXTTEMPLATE = "textTemplate";
	public final static String ATTR_GETTIPTEMPLATE = "tipTemplate";
	public final static String ATTR_ISDATAITEM = "dataItem";

	public java.lang.String getAggMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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

	public java.lang.String getMeasureTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEASURETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMeasureTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEASURETAG2);
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定阈值应用代码表对象");}
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
		net.ibizsys.model.app.bi.IPSAppBICube ipsappbicube = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBICube.class);
		this.psappdefield = ipsappbicube.getPSAppDataEntityMust().getPSAppDEField(value, false);
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

	private net.ibizsys.model.app.dataentity.IPSAppDEUIAction parampsappdeuiaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEUIAction getParamPSAppDEUIAction(){
		if(this.parampsappdeuiaction != null) return this.parampsappdeuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMPSAPPDEUIACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBICube ipsappbicube = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBICube.class);
		this.parampsappdeuiaction = ipsappbicube.getPSAppDataEntityMust().getPSAppDEUIAction(value, false);
		return this.parampsappdeuiaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUIAction getParamPSAppDEUIActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEUIAction value = this.getParamPSAppDEUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定参数配置界面行为对象");}
		return value;
	}

	public void setParamPSAppDEUIAction(net.ibizsys.model.app.dataentity.IPSAppDEUIAction parampsappdeuiaction){
		this.parampsappdeuiaction = parampsappdeuiaction;
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

	public boolean isDataItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDATAITEM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}