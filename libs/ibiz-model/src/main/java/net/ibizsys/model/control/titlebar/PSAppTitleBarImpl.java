package net.ibizsys.model.control.titlebar;



public class PSAppTitleBarImpl extends net.ibizsys.model.control.titlebar.PSTitleBarImplBase implements net.ibizsys.model.control.titlebar.IPSAppTitleBar{

	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETTITLEBARSTYLE = "titleBarStyle";
	public final static String ATTR_GETTITLEBARTYPE = "titleBarType";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标资源");}
		return value;
	}


	public java.lang.String getTitleBarStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEBARSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTitleBarType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEBARTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}