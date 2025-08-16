package net.ibizsys.model.dataentity.defield;



public class PSDEFInputTipImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldObjectImpl implements net.ibizsys.model.dataentity.defield.IPSDEFInputTip{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETCONTENTLANRESTAG = "contentLanResTag";
	public final static String ATTR_GETCONTENTPSLANGUAGERES = "getContentPSLanguageRes";
	public final static String ATTR_GETHTMLCONTENT = "htmlContent";
	public final static String ATTR_GETMOREURL = "moreUrl";
	public final static String ATTR_GETRAWCONTENT = "rawContent";
	public final static String ATTR_GETTIPMODE = "tipMode";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_ISDEFAULT = "default";
	public final static String ATTR_ISENABLECLOSE = "enableClose";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTLANRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes contentpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes(){
		if(this.contentpslanguageres != null) return this.contentpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.contentpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCONTENTPSLANGUAGERES);
		return this.contentpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getContentPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容语言资源");}
		return value;
	}

	public void setContentPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes contentpslanguageres){
		this.contentpslanguageres = contentpslanguageres;
	}


	public java.lang.String getHtmlContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHTMLCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMoreUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOREURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRawContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTipMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIPMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableClose(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECLOSE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}