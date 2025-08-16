package net.ibizsys.model.app.util;



public class PSAppUtilImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.util.IPSAppUtil{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETUTILPSDE10NAME = "utilPSDE10Name";
	public final static String ATTR_GETUTILPSDE2NAME = "utilPSDE2Name";
	public final static String ATTR_GETUTILPSDE3NAME = "utilPSDE3Name";
	public final static String ATTR_GETUTILPSDE4NAME = "utilPSDE4Name";
	public final static String ATTR_GETUTILPSDE5NAME = "utilPSDE5Name";
	public final static String ATTR_GETUTILPSDE6NAME = "utilPSDE6Name";
	public final static String ATTR_GETUTILPSDE7NAME = "utilPSDE7Name";
	public final static String ATTR_GETUTILPSDE8NAME = "utilPSDE8Name";
	public final static String ATTR_GETUTILPSDE9NAME = "utilPSDE9Name";
	public final static String ATTR_GETUTILPSDENAME = "utilPSDEName";
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

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}


	public java.lang.String getUtilPSDE10Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE10NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDE2Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE2NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDE3Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE3NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDE4Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE4NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDE5Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE5NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDE6Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE6NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDE7Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE7NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDE8Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE8NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDE9Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE9NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDEName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDENAME);
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