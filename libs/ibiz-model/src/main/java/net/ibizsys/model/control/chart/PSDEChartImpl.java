package net.ibizsys.model.control.chart;



public class PSDEChartImpl extends net.ibizsys.model.control.chart.PSChartImpl implements net.ibizsys.model.control.chart.IPSDEChart{

	public final static String ATTR_GETBASEOPTIONJOSTRING = "baseOptionJOString";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOORDINATESYSTEM = "coordinateSystem";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETMINORSORTDIR = "minorSortDir";
	public final static String ATTR_GETMINORSORTPSAPPDEFIELD = "getMinorSortPSAppDEField";
	public final static String ATTR_GETPSCHARTCOORDINATESYSTEMS = "getPSChartCoordinateSystems";
	public final static String ATTR_GETPSDECHARTDATAGRID = "getPSDEChartDataGrid";
	public final static String ATTR_GETPSDECHARTLEGEND = "getPSDEChartLegend";
	public final static String ATTR_GETPSDECHARTSERIESES = "getPSDEChartSerieses";
	public final static String ATTR_GETPSDECHARTTITLE = "getPSDEChartTitle";
	public final static String ATTR_HASWFDATAITEMS = "hasWFDataItems";

	public java.lang.String getBaseOptionJOString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBASEOPTIONJOSTRING);
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

	public java.lang.String getCoordinateSystem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOORDINATESYSTEM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEmptyText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes emptytextpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes(){
		if(this.emptytextpslanguageres != null) return this.emptytextpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.emptytextpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEMPTYTEXTPSLANGUAGERES);
		return this.emptytextpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getEmptyTextPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定无值内容语言资源");}
		return value;
	}


	public java.lang.String getMinorSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField minorsortpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEField(){
		if(this.minorsortpsappdefield != null) return this.minorsortpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.minorsortpsappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMINORSORTPSAPPDEFIELD);
		return this.minorsortpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getMinorSortPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认排序应用实体属性");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> pschartcoordinatesystems = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> getPSChartCoordinateSystems(){
		if(this.pschartcoordinatesystems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTCOORDINATESYSTEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartCoordinateSystem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartCoordinateSystem obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartCoordinateSystem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTCOORDINATESYSTEMS);
				if(obj!=null)list.add(obj);
			}
			this.pschartcoordinatesystems = list;
		}
		return (this.pschartcoordinatesystems.size() == 0)? null : this.pschartcoordinatesystems;
	}

	public net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartCoordinateSystem.class, this.getPSChartCoordinateSystems(), objKey, bTryMode);
	}
	public void setPSChartCoordinateSystems(java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> list){
		this.pschartcoordinatesystems = list;
	}
	private net.ibizsys.model.control.chart.IPSDEChartDataGrid psdechartdatagrid;

	public net.ibizsys.model.control.chart.IPSDEChartDataGrid getPSDEChartDataGrid(){
		if(this.psdechartdatagrid != null) return this.psdechartdatagrid;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDECHARTDATAGRID);
		if(value == null){
			return null;
		}
		this.psdechartdatagrid = getPSModelObject(net.ibizsys.model.control.chart.IPSDEChartDataGrid.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDECHARTDATAGRID);
		return this.psdechartdatagrid;
	}

	public net.ibizsys.model.control.chart.IPSDEChartDataGrid getPSDEChartDataGridMust(){
		net.ibizsys.model.control.chart.IPSDEChartDataGrid value = this.getPSDEChartDataGrid();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体图表数据表格对象");}
		return value;
	}

	private net.ibizsys.model.control.chart.IPSDEChartLegend psdechartlegend;

	public net.ibizsys.model.control.chart.IPSDEChartLegend getPSDEChartLegend(){
		if(this.psdechartlegend != null) return this.psdechartlegend;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDECHARTLEGEND);
		if(value == null){
			return null;
		}
		this.psdechartlegend = getPSModelObject(net.ibizsys.model.control.chart.IPSDEChartLegend.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDECHARTLEGEND);
		return this.psdechartlegend;
	}

	public net.ibizsys.model.control.chart.IPSDEChartLegend getPSDEChartLegendMust(){
		net.ibizsys.model.control.chart.IPSDEChartLegend value = this.getPSDEChartLegend();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体图表图例对象");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.chart.IPSDEChartSeries> psdechartserieses = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSDEChartSeries> getPSDEChartSerieses(){
		if(this.psdechartserieses == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDECHARTSERIESES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSDEChartSeries> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSDEChartSeries>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSDEChartSeries obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSDEChartSeries.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDECHARTSERIESES);
				if(obj!=null)list.add(obj);
			}
			this.psdechartserieses = list;
		}
		return (this.psdechartserieses.size() == 0)? null : this.psdechartserieses;
	}

	public net.ibizsys.model.control.chart.IPSDEChartSeries getPSDEChartSeries(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSDEChartSeries.class, this.getPSDEChartSerieses(), objKey, bTryMode);
	}
	public void setPSDEChartSeries(java.util.List<net.ibizsys.model.control.chart.IPSDEChartSeries> list){
		this.psdechartserieses = list;
	}
	private net.ibizsys.model.control.chart.IPSDEChartTitle psdecharttitle;

	public net.ibizsys.model.control.chart.IPSDEChartTitle getPSDEChartTitle(){
		if(this.psdecharttitle != null) return this.psdecharttitle;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDECHARTTITLE);
		if(value == null){
			return null;
		}
		this.psdecharttitle = getPSModelObject(net.ibizsys.model.control.chart.IPSDEChartTitle.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDECHARTTITLE);
		return this.psdecharttitle;
	}

	public net.ibizsys.model.control.chart.IPSDEChartTitle getPSDEChartTitleMust(){
		net.ibizsys.model.control.chart.IPSDEChartTitle value = this.getPSDEChartTitle();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体图表标题对象");}
		return value;
	}


	@Deprecated
	public boolean hasWFDataItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASWFDATAITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}