package net.ibizsys.model.dataentity.service;



public class PSDEServiceAPIImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.service.IPSDEServiceAPI
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETAPIMODE = "aPIMode";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETLNPSLANGUAGERES = "getLNPSLanguageRes";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMAJORPSDESERVICEAPIRSS = "getMajorPSDEServiceAPIRSs";
	public final static String ATTR_GETMINORPSDESERVICEAPIRSS = "getMinorPSDEServiceAPIRSs";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETOUTPSSYSTRANSLATOR = "getOutPSSysTranslator";
	public final static String ATTR_GETPSDESERVICEAPIFIELDS = "getPSDEServiceAPIFields";
	public final static String ATTR_GETPSDESERVICEAPIMETHODS = "getPSDEServiceAPIMethods";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSUNIRES = "getPSSysUniRes";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_ISENABLEDATAEXPORT = "enableDataExport";
	public final static String ATTR_ISENABLEDATAIMPORT = "enableDataImport";
	public final static String ATTR_ISMAJOR = "major";
	public final static String ATTR_ISNESTED = "nested";

	public int getAPIMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPIMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes lnpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageRes(){
		if(this.lnpslanguageres != null) return this.lnpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLNPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.lnpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETLNPSLANGUAGERES);
		return this.lnpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getLNPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定逻辑名称语言资源");}
		return value;
	}

	public void setLNPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes lnpslanguageres){
		this.lnpslanguageres = lnpslanguageres;
	}


	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> majorpsdeserviceapirss = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> getMajorPSDEServiceAPIRSs(){
		if(this.majorpsdeserviceapirss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDESERVICEAPIRSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS>();
			net.ibizsys.model.service.IPSSysServiceAPI ipssysserviceapi = this.getParentPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class);
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(ipssysserviceapi.getPSDEServiceAPIRS((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.majorpsdeserviceapirss = list;
		}
		return (this.majorpsdeserviceapirss.size() == 0)? null : this.majorpsdeserviceapirss;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS getMajorPSDEServiceAPIRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS.class, this.getMajorPSDEServiceAPIRSs(), objKey, bTryMode);
	}
	
	public void setMajorPSDEServiceAPIRSs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> list){
		this.majorpsdeserviceapirss = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> minorpsdeserviceapirss = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> getMinorPSDEServiceAPIRSs(){
		if(this.minorpsdeserviceapirss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSDESERVICEAPIRSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS>();
			net.ibizsys.model.service.IPSSysServiceAPI ipssysserviceapi = this.getParentPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class);
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(ipssysserviceapi.getPSDEServiceAPIRS((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.minorpsdeserviceapirss = list;
		}
		return (this.minorpsdeserviceapirss.size() == 0)? null : this.minorpsdeserviceapirss;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS getMinorPSDEServiceAPIRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS.class, this.getMinorPSDEServiceAPIRSs(), objKey, bTryMode);
	}
	
	public void setMinorPSDEServiceAPIRSs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> list){
		this.minorpsdeserviceapirss = list;
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSSysTranslator outpssystranslator;

	public net.ibizsys.model.res.IPSSysTranslator getOutPSSysTranslator(){
		if(this.outpssystranslator != null) return this.outpssystranslator;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTPSSYSTRANSLATOR);
		if(value == null){
			return null;
		}
		this.outpssystranslator = getPSModelObject(net.ibizsys.model.res.IPSSysTranslator.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETOUTPSSYSTRANSLATOR);
		return this.outpssystranslator;
	}

	public net.ibizsys.model.res.IPSSysTranslator getOutPSSysTranslatorMust(){
		net.ibizsys.model.res.IPSSysTranslator value = this.getOutPSSysTranslator();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输出值转换器");}
		return value;
	}

	public void setOutPSSysTranslator(net.ibizsys.model.res.IPSSysTranslator outpssystranslator){
		this.outpssystranslator = outpssystranslator;
	}


	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIField> psdeserviceapifields = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIField> getPSDEServiceAPIFields(){
		if(this.psdeserviceapifields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPIFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEServiceAPIField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.service.IPSDEServiceAPIField obj = this.getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDESERVICEAPIFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.psdeserviceapifields = list;
		}
		return (this.psdeserviceapifields.size() == 0)? null : this.psdeserviceapifields;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIField getPSDEServiceAPIField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIField.class, this.getPSDEServiceAPIFields(), objKey, bTryMode);
	}
	public void setPSDEServiceAPIFields(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIField> list){
		this.psdeserviceapifields = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> psdeserviceapimethods = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> getPSDEServiceAPIMethods(){
		if(this.psdeserviceapimethods == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPIMETHODS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod obj = this.getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDESERVICEAPIMETHODS);
				if(obj!=null)list.add(obj);
			}
			this.psdeserviceapimethods = list;
		}
		return (this.psdeserviceapimethods.size() == 0)? null : this.psdeserviceapimethods;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethod(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod.class, this.getPSDEServiceAPIMethods(), objKey, bTryMode);
	}
	public void setPSDEServiceAPIMethods(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> list){
		this.psdeserviceapimethods = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后端扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}

	private net.ibizsys.model.security.IPSSysUniRes pssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(){
		if(this.pssysunires != null) return this.pssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.pssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNIRES);
		return this.pssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体服务接口统一资源");}
		return value;
	}

	public void setPSSysUniRes(net.ibizsys.model.security.IPSSysUniRes pssysunires){
		this.pssysunires = pssysunires;
	}


	public java.lang.String getServiceParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableDataExport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDATAEXPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDataImport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDATAIMPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMajor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAJOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNested(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNESTED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}