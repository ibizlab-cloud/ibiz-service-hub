package net.ibizsys.model.eai;



public class PSSysEAISchemeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.eai.IPSSysEAIScheme{

	public final static String ATTR_GETALLPSSYSEAIDES = "getAllPSSysEAIDEs";
	public final static String ATTR_GETALLPSSYSEAIDATATYPES = "getAllPSSysEAIDataTypes";
	public final static String ATTR_GETALLPSSYSEAIELEMENTS = "getAllPSSysEAIElements";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETSCHEMETAG = "schemeTag";
	public final static String ATTR_GETSCHEMETAG2 = "schemeTag2";

	private java.util.List<net.ibizsys.model.eai.IPSSysEAIDE> allpssyseaides = null;
	public java.util.List<net.ibizsys.model.eai.IPSSysEAIDE> getAllPSSysEAIDEs(){
		if(this.allpssyseaides == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSEAIDES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.eai.IPSSysEAIDE> list = new java.util.ArrayList<net.ibizsys.model.eai.IPSSysEAIDE>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.eai.IPSSysEAIDE obj = this.getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDE.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSEAIDES);
				if(obj!=null)list.add(obj);
			}
			this.allpssyseaides = list;
		}
		return (this.allpssyseaides.size() == 0)? null : this.allpssyseaides;
	}

	public net.ibizsys.model.eai.IPSSysEAIDE getPSSysEAIDE(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDE.class, this.getAllPSSysEAIDEs(), objKey, bTryMode);
	}
	public void setPSSysEAIDEs(java.util.List<net.ibizsys.model.eai.IPSSysEAIDE> list){
		this.allpssyseaides = list;
	}

	private java.util.List<net.ibizsys.model.eai.IPSSysEAIDataType> allpssyseaidatatypes = null;
	public java.util.List<net.ibizsys.model.eai.IPSSysEAIDataType> getAllPSSysEAIDataTypes(){
		if(this.allpssyseaidatatypes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSEAIDATATYPES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.eai.IPSSysEAIDataType> list = new java.util.ArrayList<net.ibizsys.model.eai.IPSSysEAIDataType>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.eai.IPSSysEAIDataType obj = this.getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDataType.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSEAIDATATYPES);
				if(obj!=null)list.add(obj);
			}
			this.allpssyseaidatatypes = list;
		}
		return (this.allpssyseaidatatypes.size() == 0)? null : this.allpssyseaidatatypes;
	}

	public net.ibizsys.model.eai.IPSSysEAIDataType getPSSysEAIDataType(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDataType.class, this.getAllPSSysEAIDataTypes(), objKey, bTryMode);
	}
	public void setPSSysEAIDataTypes(java.util.List<net.ibizsys.model.eai.IPSSysEAIDataType> list){
		this.allpssyseaidatatypes = list;
	}

	private java.util.List<net.ibizsys.model.eai.IPSSysEAIElement> allpssyseaielements = null;
	public java.util.List<net.ibizsys.model.eai.IPSSysEAIElement> getAllPSSysEAIElements(){
		if(this.allpssyseaielements == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSEAIELEMENTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.eai.IPSSysEAIElement> list = new java.util.ArrayList<net.ibizsys.model.eai.IPSSysEAIElement>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.eai.IPSSysEAIElement obj = this.getPSModelObject(net.ibizsys.model.eai.IPSSysEAIElement.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSEAIELEMENTS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyseaielements = list;
		}
		return (this.allpssyseaielements.size() == 0)? null : this.allpssyseaielements;
	}

	public net.ibizsys.model.eai.IPSSysEAIElement getPSSysEAIElement(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.eai.IPSSysEAIElement.class, this.getAllPSSysEAIElements(), objKey, bTryMode);
	}
	public void setPSSysEAIElements(java.util.List<net.ibizsys.model.eai.IPSSysEAIElement> list){
		this.allpssyseaielements = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}

	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}


	public java.lang.String getSchemeTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCHEMETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSchemeTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCHEMETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}