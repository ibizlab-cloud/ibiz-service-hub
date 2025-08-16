package net.ibizsys.model.dataentity.wizard;



public class PSDEWizardStepImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.wizard.IPSDEWizardStep{

	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETSTEPTAG = "stepTag";
	public final static String ATTR_GETSUBTITLE = "subTitle";
	public final static String ATTR_GETSUBTITLEPSLANGUAGERES = "getSubTitlePSLanguageRes";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_GETTITLEPSLANGUAGERES = "getTitlePSLanguageRes";
	public final static String ATTR_GETTITLEPSSYSCSS = "getTitlePSSysCss";
	public final static String ATTR_ISENABLELINK = "enableLink";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标资源对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
	}


	public java.lang.String getStepTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTEPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定子抬头语言资源对象");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定抬头语言资源对象");}
		return value;
	}

	public void setTitlePSLanguageRes(net.ibizsys.model.res.IPSLanguageRes titlepslanguageres){
		this.titlepslanguageres = titlepslanguageres;
	}

	private net.ibizsys.model.res.IPSSysCss titlepssyscss;

	public net.ibizsys.model.res.IPSSysCss getTitlePSSysCss(){
		if(this.titlepssyscss != null) return this.titlepssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEPSSYSCSS);
		if(value == null){
			return null;
		}
		this.titlepssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTITLEPSSYSCSS);
		return this.titlepssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getTitlePSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getTitlePSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定抬头样式表对象");}
		return value;
	}

	public void setTitlePSSysCss(net.ibizsys.model.res.IPSSysCss titlepssyscss){
		this.titlepssyscss = titlepssyscss;
	}


	public boolean isEnableLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLELINK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}