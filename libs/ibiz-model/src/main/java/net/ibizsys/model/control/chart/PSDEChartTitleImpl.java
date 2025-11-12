package net.ibizsys.model.control.chart;



public class PSDEChartTitleImpl extends net.ibizsys.model.control.chart.PSDEChartObjectImplBase implements net.ibizsys.model.control.chart.IPSDEChartTitle{

	public final static String ATTR_GETSUBTITLE = "subTitle";
	public final static String ATTR_GETSUBTITLEPSLANGUAGERES = "getSubTitlePSLanguageRes";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_GETTITLEPSLANGUAGERES = "getTitlePSLanguageRes";
	public final static String ATTR_GETTITLEPOS = "titlePos";
	public final static String ATTR_ISSHOWTITLE = "showTitle";

	public java.lang.String getSubTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes subtitlepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getSubTitlePSLanguageRes(){
		if(this.subtitlepslanguageres != null) return this.subtitlepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBTITLEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.subtitlepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSUBTITLEPSLANGUAGERES);
		return this.subtitlepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getSubTitlePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getSubTitlePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定子标题语言资源");}
		return value;
	}

	public void setSubTitlePSLanguageRes(net.ibizsys.model.res.IPSLanguageRes subtitlepslanguageres){
		this.subtitlepslanguageres = subtitlepslanguageres;
	}


	public java.lang.String getTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes titlepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes(){
		if(this.titlepslanguageres != null) return this.titlepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.titlepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTITLEPSLANGUAGERES);
		return this.titlepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTitlePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源");}
		return value;
	}

	public void setTitlePSLanguageRes(net.ibizsys.model.res.IPSLanguageRes titlepslanguageres){
		this.titlepslanguageres = titlepslanguageres;
	}


	public java.lang.String getTitlePos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isShowTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWTITLE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}