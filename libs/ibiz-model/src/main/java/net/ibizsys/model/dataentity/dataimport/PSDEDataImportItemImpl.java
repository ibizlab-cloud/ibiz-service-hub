package net.ibizsys.model.dataentity.dataimport;



public class PSDEDataImportItemImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem
		,net.ibizsys.model.app.dataentity.IPSAppDEDataImportItem{

	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCREATEDV = "createDV";
	public final static String ATTR_GETCREATEDVT = "createDVT";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPSCODELIST = "getPSCodeList";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSSYSTRANSLATOR = "getPSSysTranslator";
	public final static String ATTR_GETUPDATEDV = "updateDV";
	public final static String ATTR_GETUPDATEDVT = "updateDVT";
	public final static String ATTR_ISHIDDENDATAITEM = "hiddenDataItem";
	public final static String ATTR_ISUNIQUEITEM = "uniqueItem";
	private net.ibizsys.model.res.IPSLanguageRes cappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes(){
		if(this.cappslanguageres != null) return this.cappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCAPPSLANGUAGERES);
		return this.cappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源");}
		return value;
	}

	public void setCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cappslanguageres){
		this.cappslanguageres = cappslanguageres;
	}


	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCreateDV(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEDV);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCreateDVT(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEDVT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(){
		if(this.psappdefield != null) return this.psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体属性");}
		return value;
	}

	public void setPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield){
		this.psappdefield = psappdefield;
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

	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefield = ipsdataentity.getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}

	private net.ibizsys.model.res.IPSSysTranslator pssystranslator;

	public net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator(){
		if(this.pssystranslator != null) return this.pssystranslator;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTRANSLATOR);
		if(value == null){
			return null;
		}
		this.pssystranslator = getPSModelObject(net.ibizsys.model.res.IPSSysTranslator.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTRANSLATOR);
		return this.pssystranslator;
	}

	public net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust(){
		net.ibizsys.model.res.IPSSysTranslator value = this.getPSSysTranslator();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值转换器");}
		return value;
	}

	public void setPSSysTranslator(net.ibizsys.model.res.IPSSysTranslator pssystranslator){
		this.pssystranslator = pssystranslator;
	}


	public java.lang.String getUpdateDV(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEDV);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUpdateDVT(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEDVT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isHiddenDataItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISHIDDENDATAITEM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUniqueItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUNIQUEITEM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}