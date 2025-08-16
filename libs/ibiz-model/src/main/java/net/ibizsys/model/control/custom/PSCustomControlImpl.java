package net.ibizsys.model.control.custom;



public class PSCustomControlImpl extends net.ibizsys.model.control.PSAjaxControlImpl implements net.ibizsys.model.control.custom.IPSCustomControl{

	public final static String ATTR_GETCUSTOMTAG = "customTag";
	public final static String ATTR_GETCUSTOMTAG2 = "customTag2";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";

	public java.lang.String getCustomTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端应用插件");}
		return value;
	}


	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}