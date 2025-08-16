package net.ibizsys.model.dataentity.defield;



public class PSDEFSearchModeImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldObjectImpl implements net.ibizsys.model.dataentity.defield.IPSDEFSearchMode{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDSTPSDEFSEARCHMODE = "getDstPSDEFSearchMode";
	public final static String ATTR_GETDSTPSDEFIELD = "getDstPSDEField";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETITEMTAG = "itemTag";
	public final static String ATTR_GETITEMTAG2 = "itemTag2";
	public final static String ATTR_GETMODE = "mode";
	public final static String ATTR_GETPSDER = "getPSDER";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTRANSLATOR = "getPSSysTranslator";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETVALUEFORMAT = "valueFormat";
	public final static String ATTR_GETVALUEFUNC = "valueFunc";
	public final static String ATTR_GETVALUEOP = "valueOP";
	public final static String ATTR_GETVALUESEPARATOR = "valueSeparator";
	public final static String ATTR_ISARRAY = "array";
	public final static String ATTR_ISDEFAULT = "default";
	
	private String lowerCaseName = null;
	public String getLowerCaseName(){
		if(this.lowerCaseName == null){
			this.lowerCaseName = this.getName().toLowerCase();
		}
		return this.lowerCaseName;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEFSearchMode dstpsdefsearchmode;

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getDstPSDEFSearchMode(){
		if(this.dstpsdefsearchmode != null) return this.dstpsdefsearchmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEFSEARCHMODE);
		if(value == null){
			return null;
		}
		this.dstpsdefsearchmode = this.getDstPSDEFieldMust().getPSDEFSearchMode(value, false);
		return this.dstpsdefsearchmode;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getDstPSDEFSearchModeMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFSearchMode value = this.getDstPSDEFSearchMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体属性搜索模式");}
		return value;
	}

	public void setDstPSDEFSearchMode(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode dstpsdefsearchmode){
		this.dstpsdefsearchmode = dstpsdefsearchmode;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField dstpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getDstPSDEField(){
		if(this.dstpsdefield != null) return this.dstpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEFIELD);
		if(value == null){
			return null;
		}
		this.dstpsdefield = this.getDstPSDataEntityMust().getPSDEField(value, false);
		return this.dstpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getDstPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getDstPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体属性对象");}
		return value;
	}

	public void setDstPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField dstpsdefield){
		this.dstpsdefield = dstpsdefield;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity(){
		if(this.dstpsdataentity != null) return this.dstpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.dstpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDATAENTITY);
		return this.dstpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDstPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体对象");}
		return value;
	}

	public void setDstPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity){
		this.dstpsdataentity = dstpsdataentity;
	}


	public java.lang.String getItemTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.der.IPSDERBase psder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDER(){
		if(this.psder != null) return this.psder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDER);
		if(value == null){
			return null;
		}
		this.psder = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDER);
		return this.psder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关实体关系对象");}
		return value;
	}

	public void setPSDER(net.ibizsys.model.dataentity.der.IPSDERBase psder){
		this.psder = psder;
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

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统值转换器");}
		return value;
	}

	public void setPSSysTranslator(net.ibizsys.model.res.IPSSysTranslator pssystranslator){
		this.pssystranslator = pssystranslator;
	}


	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getValueFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueFunc(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFUNC);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueSeparator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUESEPARATOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isArray(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISARRAY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}