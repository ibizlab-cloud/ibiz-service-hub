package net.ibizsys.model.control.rawitem;



public class PSImageItemImpl extends net.ibizsys.model.control.rawitem.PSRawItemImplBase implements net.ibizsys.model.control.rawitem.IPSImageItem{

	public final static String ATTR_GETALTERNATIVETEXT = "alternativeText";
	public final static String ATTR_GETFITMODE = "fitMode";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_ISPLACECENTER = "placeCenter";

	public java.lang.String getAlternativeText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALTERNATIVETEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFitMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFITMODE);
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统图片资源");}
		return value;
	}


	public boolean isPlaceCenter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPLACECENTER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}