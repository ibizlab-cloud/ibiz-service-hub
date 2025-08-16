package net.ibizsys.model.app.res;



public class PSAppEditorStyleRefImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.res.IPSAppEditorStyleRef{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTAINERTYPE = "containerType";
	public final static String ATTR_GETEDITORTYPE = "editorType";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPLUGINCODE = "pluginCode";
	public final static String ATTR_GETREFTAG = "refTag";
	public final static String ATTR_GETSTYLECODE = "styleCode";
	public final static String ATTR_ISEXTENDSTYLEONLY = "extendStyleOnly";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContainerType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTAINERTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEditorType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin(){
		if(this.pssyspfplugin != null) return this.pssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSPFPLUGIN);
		return this.pssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端模板插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}


	public java.lang.String getPluginCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLUGINCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getStyleCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTYLECODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isExtendStyleOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXTENDSTYLEONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}