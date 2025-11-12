package net.ibizsys.model.res;



public class PSSysTranslatorImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysTranslator{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETKEYPSDEFIELD = "getKeyPSDEField";
	public final static String ATTR_GETPSCODELIST = "getPSCodeList";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETTRANSLATORPARAMS = "translatorParams";
	public final static String ATTR_GETTRANSLATORTAG = "translatorTag";
	public final static String ATTR_GETTRANSLATORTAG2 = "translatorTag2";
	public final static String ATTR_GETTRANSLATORTYPE = "translatorType";
	public final static String ATTR_GETUSER2PSDEFIELD = "getUser2PSDEField";
	public final static String ATTR_GETUSERPSDEFIELD = "getUserPSDEField";
	public final static String ATTR_GETVALUEPSDEFIELD = "getValuePSDEField";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField(){
		if(this.keypsdefield != null) return this.keypsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.keypsdefield = ipsdataentity.getPSDEField(value, false);
		return this.keypsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getKeyPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标识存储属性");}
		return value;
	}

	public void setKeyPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield){
		this.keypsdefield = keypsdefield;
	}

	private net.ibizsys.model.codelist.IPSCodeList pscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeList(){
		if(this.pscodelist != null) return this.pscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCODELIST);
		if(value == null){
			return null;
		}
		this.pscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCODELIST);
		return this.pscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定代码表对象");}
		return value;
	}

	public void setPSCodeList(net.ibizsys.model.codelist.IPSCodeList pscodelist){
		this.pscodelist = pscodelist;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体对象");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后端模板插件对象");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
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

	public void setPSSystemModule(net.ibizsys.model.system.IPSSystemModule pssystemmodule){
		this.pssystemmodule = pssystemmodule;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getTranslatorParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRANSLATORPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getTranslatorTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRANSLATORTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTranslatorTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRANSLATORTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTranslatorType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRANSLATORTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField user2psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEField(){
		if(this.user2psdefield != null) return this.user2psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSER2PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.user2psdefield = ipsdataentity.getPSDEField(value, false);
		return this.user2psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getUser2PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定自定义属性2");}
		return value;
	}

	public void setUser2PSDEField(net.ibizsys.model.dataentity.defield.IPSDEField user2psdefield){
		this.user2psdefield = user2psdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField userpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEField(){
		if(this.userpsdefield != null) return this.userpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.userpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.userpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getUserPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定自定义属性");}
		return value;
	}

	public void setUserPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField userpsdefield){
		this.userpsdefield = userpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField valuepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField(){
		if(this.valuepsdefield != null) return this.valuepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.valuepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.valuepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值存储属性");}
		return value;
	}

	public void setValuePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField valuepsdefield){
		this.valuepsdefield = valuepsdefield;
	}

}