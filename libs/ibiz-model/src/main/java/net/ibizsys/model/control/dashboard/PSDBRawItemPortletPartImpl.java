package net.ibizsys.model.control.dashboard;



public class PSDBRawItemPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBPortletPartImpl implements net.ibizsys.model.control.dashboard.IPSDBRawItemPortletPart
		,net.ibizsys.model.control.IPSRawItemContainer{

	public final static String ATTR_GETCONTENTPSCONTROL = "getContentPSControl";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETHTMLCONTENT = "htmlContent";
	public final static String ATTR_GETPSRAWITEM = "getPSRawItem";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPORTLETTYPE = "portletType";
	public final static String ATTR_GETRAWCONTENT = "rawContent";
	public final static String ATTR_GETRAWITEMHEIGHT = "rawItemHeight";
	public final static String ATTR_GETRAWITEMWIDTH = "rawItemWidth";
	private net.ibizsys.model.control.IPSControl contentpscontrol;

	@Deprecated
	public net.ibizsys.model.control.IPSControl getContentPSControl(){
		if(this.contentpscontrol != null) return this.contentpscontrol;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSCONTROL);
		if(value == null){
			return null;
		}
		this.contentpscontrol = getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCONTENTPSCONTROL);
		return this.contentpscontrol;
	}

	public net.ibizsys.model.control.IPSControl getContentPSControlMust(){
		net.ibizsys.model.control.IPSControl value = this.getContentPSControl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getContentPSControl]返回空值");}
		return value;
	}


	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
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

	private net.ibizsys.model.res.IPSSysImage pssysimage;

	public net.ibizsys.model.res.IPSSysImage getPSSysImage(){
		if(this.pssysimage != null) return this.pssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.pssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSIMAGE);
		return this.pssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图片内容");}
		return value;
	}


	public java.lang.String getPortletType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTLETTYPE);
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