package net.ibizsys.model.control.chart;



public class PSDEChartSeriesImpl extends net.ibizsys.model.control.chart.PSChartSeriesImpl implements net.ibizsys.model.control.chart.IPSDEChartSeries{

	public final static String ATTR_GETBASEOPTIONJOSTRING = "baseOptionJOString";
	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCATALOGFIELD = "catalogField";
	public final static String ATTR_GETCATALOGPSCODELIST = "getCatalogPSCodeList";
	public final static String ATTR_GETDATAFIELD = "dataField";
	public final static String ATTR_GETECHARTSTYPE = "eChartsType";
	public final static String ATTR_GETEXTVALUE2FIELD = "extValue2Field";
	public final static String ATTR_GETEXTVALUE3FIELD = "extValue3Field";
	public final static String ATTR_GETEXTVALUE4FIELD = "extValue4Field";
	public final static String ATTR_GETEXTVALUEFIELD = "extValueField";
	public final static String ATTR_GETGROUPMODE = "groupMode";
	public final static String ATTR_GETIDFIELD = "idField";
	public final static String ATTR_GETPSCHARTCOORDINATESYSTEM = "getPSChartCoordinateSystem";
	public final static String ATTR_GETPSCHARTDATASET = "getPSChartDataSet";
	public final static String ATTR_GETPSCHARTSERIESENCODE = "getPSChartSeriesEncode";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETSAMPLEDATA = "sampleData";
	public final static String ATTR_GETSERIESFIELD = "seriesField";
	public final static String ATTR_GETSERIESLAYOUTBY = "seriesLayoutBy";
	public final static String ATTR_GETSERIESPSCODELIST = "getSeriesPSCodeList";
	public final static String ATTR_GETSERIESTYPE = "seriesType";
	public final static String ATTR_GETTAGFIELD = "tagField";
	public final static String ATTR_GETVALUEFIELD = "valueField";
	public final static String ATTR_ISENABLECHARTDATASET = "enableChartDataSet";

	public java.lang.String getBaseOptionJOString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBASEOPTIONJOSTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes cappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes(){
		if(this.cappslanguageres != null) return this.cappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCAPPSLANGUAGERES);
		return this.cappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源对象");}
		return value;
	}

	public void setCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cappslanguageres){
		this.cappslanguageres = cappslanguageres;
	}


	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCatalogField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCATALOGFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.codelist.IPSCodeList catalogpscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getCatalogPSCodeList(){
		if(this.catalogpscodelist != null) return this.catalogpscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCATALOGPSCODELIST);
		if(value == null){
			return null;
		}
		this.catalogpscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCATALOGPSCODELIST);
		return this.catalogpscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getCatalogPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getCatalogPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分类代码表对象");}
		return value;
	}

	public void setCatalogPSCodeList(net.ibizsys.model.codelist.IPSCodeList catalogpscodelist){
		this.catalogpscodelist = catalogpscodelist;
	}


	public java.lang.String getDataField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEChartsType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETECHARTSTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExtValue2Field(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTVALUE2FIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExtValue3Field(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTVALUE3FIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExtValue4Field(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTVALUE4FIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExtValueField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTVALUEFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getIdField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIDFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.chart.IPSChartCoordinateSystem pschartcoordinatesystem;

	public net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystem(){
		if(this.pschartcoordinatesystem != null) return this.pschartcoordinatesystem;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTCOORDINATESYSTEM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.chart.IPSDEChart ipsdechart = getParentPSModelObject(net.ibizsys.model.control.chart.IPSDEChart.class);
		this.pschartcoordinatesystem = ipsdechart.getPSChartCoordinateSystem(value, false);
		return this.pschartcoordinatesystem;
	}

	public net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystemMust(){
		net.ibizsys.model.control.chart.IPSChartCoordinateSystem value = this.getPSChartCoordinateSystem();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图表坐标系统");}
		return value;
	}

	public void setPSChartCoordinateSystem(net.ibizsys.model.control.chart.IPSChartCoordinateSystem pschartcoordinatesystem){
		this.pschartcoordinatesystem = pschartcoordinatesystem;
	}

	private net.ibizsys.model.control.chart.IPSChartDataSet pschartdataset;

	public net.ibizsys.model.control.chart.IPSChartDataSet getPSChartDataSet(){
		if(this.pschartdataset != null) return this.pschartdataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.chart.IPSDEChart ipsdechart = getParentPSModelObject(net.ibizsys.model.control.chart.IPSDEChart.class);
		this.pschartdataset = ipsdechart.getPSChartDataSet(value, false);
		return this.pschartdataset;
	}

	public net.ibizsys.model.control.chart.IPSChartDataSet getPSChartDataSetMust(){
		net.ibizsys.model.control.chart.IPSChartDataSet value = this.getPSChartDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图表数据集对象");}
		return value;
	}

	public void setPSChartDataSet(net.ibizsys.model.control.chart.IPSChartDataSet pschartdataset){
		this.pschartdataset = pschartdataset;
	}

	private net.ibizsys.model.control.chart.IPSChartSeriesEncode pschartseriesencode;

	public net.ibizsys.model.control.chart.IPSChartSeriesEncode getPSChartSeriesEncode(){
		if(this.pschartseriesencode != null) return this.pschartseriesencode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTSERIESENCODE);
		if(value == null){
			return null;
		}
		this.pschartseriesencode = getPSModelObject(net.ibizsys.model.control.chart.IPSChartSeriesEncode.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCHARTSERIESENCODE);
		return this.pschartseriesencode;
	}

	public net.ibizsys.model.control.chart.IPSChartSeriesEncode getPSChartSeriesEncodeMust(){
		net.ibizsys.model.control.chart.IPSChartSeriesEncode value = this.getPSChartSeriesEncode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图表序列编码");}
		return value;
	}

	public void setPSChartSeriesEncode(net.ibizsys.model.control.chart.IPSChartSeriesEncode pschartseriesencode){
		this.pschartseriesencode = pschartseriesencode;
	}

	private net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin(){
		if(this.pssyspfplugin != null) return this.pssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSPFPLUGIN);
		return this.pssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}


	public java.lang.String getSampleData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSAMPLEDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSeriesField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERIESFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSeriesLayoutBy(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERIESLAYOUTBY);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.codelist.IPSCodeList seriespscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getSeriesPSCodeList(){
		if(this.seriespscodelist != null) return this.seriespscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERIESPSCODELIST);
		if(value == null){
			return null;
		}
		this.seriespscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSERIESPSCODELIST);
		return this.seriespscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getSeriesPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getSeriesPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定序列代码表对象");}
		return value;
	}

	public void setSeriesPSCodeList(net.ibizsys.model.codelist.IPSCodeList seriespscodelist){
		this.seriespscodelist = seriespscodelist;
	}


	public java.lang.String getSeriesType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERIESTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTagField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAGFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableChartDataSet(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECHARTDATASET);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}