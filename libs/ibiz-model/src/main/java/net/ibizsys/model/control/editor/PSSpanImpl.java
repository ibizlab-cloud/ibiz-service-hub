package net.ibizsys.model.control.editor;



public class PSSpanImpl extends net.ibizsys.model.control.editor.PSCodeListEditorImpl implements net.ibizsys.model.control.editor.IPSSpan{

	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETHALIGN = "hAlign";
	public final static String ATTR_GETLINKPSAPPVIEW = "getLinkPSAppView";
	public final static String ATTR_GETPRECISION = "precision";
	public final static String ATTR_GETRENDERMODE = "renderMode";
	public final static String ATTR_GETVALIGN = "vAlign";
	public final static String ATTR_GETWRAPMODE = "wrapMode";
	public final static String ATTR_ISEDITABLE = "editable";
	public final static String ATTR_ISENABLELINKVIEW = "enableLinkView";

	@Deprecated
	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHALIGN);
		if(value == null){
			return "LEFT";
		}
		return value.asText();
	}
	private net.ibizsys.model.app.view.IPSAppView linkpsappview;

	public net.ibizsys.model.app.view.IPSAppView getLinkPSAppView(){
		if(this.linkpsappview != null) return this.linkpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.linkpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETLINKPSAPPVIEW);
		return this.linkpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getLinkPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getLinkPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据链接视图");}
		return value;
	}

	public void setLinkPSAppView(net.ibizsys.model.app.view.IPSAppView linkpsappview){
		this.linkpsappview = linkpsappview;
	}


	public java.lang.Integer getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.String getRenderMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRENDERMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALIGN);
		if(value == null){
			return "MIDDLE";
		}
		return value.asText();
	}

	public java.lang.String getWrapMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWRAPMODE);
		if(value == null){
			return "NOWRAP";
		}
		return value.asText();
	}

	public boolean isEditable(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEDITABLE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableLinkView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLELINKVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}