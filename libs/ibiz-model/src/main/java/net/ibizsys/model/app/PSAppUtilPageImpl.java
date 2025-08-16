package net.ibizsys.model.app;



public class PSAppUtilPageImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.IPSAppUtilPage{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSAPPVIEW = "getPSAppView";
	public final static String ATTR_GETPAGEURL = "pageUrl";
	public final static String ATTR_GETTARGETTYPE = "targetType";
	public final static String ATTR_GETUTILPARAMS = "utilParams";
	public final static String ATTR_GETUTILTAG = "utilTag";
	public final static String ATTR_GETUTILTYPE = "utilType";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.view.IPSAppView psappview;

	public net.ibizsys.model.app.view.IPSAppView getPSAppView(){
		if(this.psappview != null) return this.psappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.psappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPVIEW);
		return this.psappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标应用视图");}
		return value;
	}

	public void setPSAppView(net.ibizsys.model.app.view.IPSAppView psappview){
		this.psappview = psappview;
	}


	public java.lang.String getPageUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPAGEURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTargetType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTARGETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getUtilParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getUtilTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}