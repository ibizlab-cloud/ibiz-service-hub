package net.ibizsys.model.control.form;



public class PSDEFormRawItemImpl extends net.ibizsys.model.control.form.PSDEFormDetailImpl implements net.ibizsys.model.control.form.IPSDEFormRawItem
		,net.ibizsys.model.control.IPSRawItemContainer{

	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETCSSSTYLE = "cssStyle";
	public final static String ATTR_GETDYNACLASS = "dynaClass";
	public final static String ATTR_GETHTMLCONTENT = "htmlContent";
	public final static String ATTR_GETPSRAWITEM = "getPSRawItem";
	public final static String ATTR_GETRAWCONTENT = "rawContent";
	public final static String ATTR_GETRAWITEMHEIGHT = "rawItemHeight";
	public final static String ATTR_GETRAWITEMWIDTH = "rawItemWidth";

	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHtmlContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHTMLCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.IPSRawItemBase psrawitem;

	public net.ibizsys.model.control.IPSRawItemBase getPSRawItem(){
		if(this.psrawitem != null) return this.psrawitem;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSRAWITEM);
		if(value == null){
			return null;
		}
		this.psrawitem = getPSModelObject(net.ibizsys.model.control.IPSRawItemBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSRAWITEM);
		return this.psrawitem;
	}

	public net.ibizsys.model.control.IPSRawItemBase getPSRawItemMust(){
		net.ibizsys.model.control.IPSRawItemBase value = this.getPSRawItem();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定直接内容对象");}
		return value;
	}

	public void setPSRawItem(net.ibizsys.model.control.IPSRawItemBase psrawitem){
		this.psrawitem = psrawitem;
	}


	public java.lang.String getRawContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getRawItemHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWITEMHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getRawItemWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWITEMWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}
}