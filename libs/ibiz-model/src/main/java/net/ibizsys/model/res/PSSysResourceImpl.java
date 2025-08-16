package net.ibizsys.model.res;



public class PSSysResourceImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysResource{

	public final static String ATTR_GETAUTHACCESSTOKENURL = "authAccessTokenUrl";
	public final static String ATTR_GETAUTHCLIENTID = "authClientId";
	public final static String ATTR_GETAUTHCLIENTSECRET = "authClientSecret";
	public final static String ATTR_GETAUTHMODE = "authMode";
	public final static String ATTR_GETAUTHPARAM = "authParam";
	public final static String ATTR_GETAUTHPARAM2 = "authParam2";
	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETCONTENTPSDEFIELD = "getContentPSDEField";
	public final static String ATTR_GETNAMEPSDEFIELD = "getNamePSDEField";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSCONTENTCAT = "getPSSysContentCat";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPATHPSDEFIELD = "getPathPSDEField";
	public final static String ATTR_GETRESTAG = "resTag";
	public final static String ATTR_GETRESOURCEPARAMS = "resourceParams";
	public final static String ATTR_GETRESOURCETYPE = "resourceType";
	public final static String ATTR_GETRESOURCEURI = "resourceUri";
	public final static String ATTR_GETTAGPSDEFIELD = "getTagPSDEField";
	public final static String ATTR_GETUSER2PSDEFIELD = "getUser2PSDEField";
	public final static String ATTR_GETUSERPSDEFIELD = "getUserPSDEField";

	public java.lang.String getAuthAccessTokenUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHACCESSTOKENURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthClientId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHCLIENTID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthClientSecret(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHCLIENTSECRET);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField contentpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEField(){
		if(this.contentpsdefield != null) return this.contentpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.contentpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.contentpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getContentPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容值实体属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField namepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEField(){
		if(this.namepsdefield != null) return this.namepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.namepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.namepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getNamePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定名称值实体属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysContentCat pssyscontentcat;

	public net.ibizsys.model.res.IPSSysContentCat getPSSysContentCat(){
		if(this.pssyscontentcat != null) return this.pssyscontentcat;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCONTENTCAT);
		if(value == null){
			return null;
		}
		this.pssyscontentcat = getPSModelObject(net.ibizsys.model.res.IPSSysContentCat.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCONTENTCAT);
		return this.pssyscontentcat;
	}

	public net.ibizsys.model.res.IPSSysContentCat getPSSysContentCatMust(){
		net.ibizsys.model.res.IPSSysContentCat value = this.getPSSysContentCat();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统内容分类");}
		return value;
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

	private net.ibizsys.model.dataentity.defield.IPSDEField pathpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPathPSDEField(){
		if(this.pathpsdefield != null) return this.pathpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPATHPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.pathpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.pathpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPathPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPathPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定路径值实体属性");}
		return value;
	}


	public java.lang.String getResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getResourceParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESOURCEPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getResourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESOURCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getResourceUri(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESOURCEURI);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField tagpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTagPSDEField(){
		if(this.tagpsdefield != null) return this.tagpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAGPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.tagpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.tagpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTagPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTagPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标记值实体属性");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定自定义2值实体属性");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定自定义值实体属性");}
		return value;
	}

}