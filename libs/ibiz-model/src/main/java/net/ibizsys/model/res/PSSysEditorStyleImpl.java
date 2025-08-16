package net.ibizsys.model.res;



public class PSSysEditorStyleImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysEditorStyle{

	public final static String ATTR_GETAJAXHANDLERTYPE = "ajaxHandlerType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTAINERTYPE = "containerType";
	public final static String ATTR_GETEDITORHEIGHT = "editorHeight";
	public final static String ATTR_GETEDITORTYPE = "editorType";
	public final static String ATTR_GETEDITORWIDTH = "editorWidth";
	public final static String ATTR_GETLINKVIEWSHOWMODE = "linkViewShowMode";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETREFVIEWSHOWMODE = "refViewShowMode";
	public final static String ATTR_GETSTYLECODE = "styleCode";
	public final static String ATTR_ISEXTENDSTYLEONLY = "extendStyleOnly";
	public final static String ATTR_ISREPLACEDEFAULT = "replaceDefault";

	public java.lang.String getAjaxHandlerType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAJAXHANDLERTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

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

	public double getEditorHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORHEIGHT);
		if(value == null){
			return 0.0f;
		}
		return value.asDouble();
	}

	public java.lang.String getEditorType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getEditorWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORWIDTH);
		if(value == null){
			return 0.0f;
		}
		return value.asDouble();
	}

	public java.lang.String getLinkViewShowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKVIEWSHOWMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysCss pssyscss;

	public net.ibizsys.model.res.IPSSysCss getPSSysCss(){
		if(this.pssyscss != null) return this.pssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCSS);
		if(value == null){
			return null;
		}
		this.pssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCSS);
		return this.pssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面样式表");}
		return value;
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


	public java.lang.String getRefViewShowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFVIEWSHOWMODE);
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

	public boolean isReplaceDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREPLACEDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}