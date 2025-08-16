package net.ibizsys.model.control.captionbar;



public class PSCaptionBarImpl extends net.ibizsys.model.control.PSControlImpl implements net.ibizsys.model.control.captionbar.IPSCaptionBar{

	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETSUBCAPPSLANGUAGERES = "getSubCapPSLanguageRes";
	public final static String ATTR_GETSUBCAPTION = "subCaption";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源");}
		return value;
	}


	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标对象");}
		return value;
	}

	private net.ibizsys.model.res.IPSLanguageRes subcappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getSubCapPSLanguageRes(){
		if(this.subcappslanguageres != null) return this.subcappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.subcappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSUBCAPPSLANGUAGERES);
		return this.subcappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getSubCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getSubCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定子标题语言资源");}
		return value;
	}


	public java.lang.String getSubCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}