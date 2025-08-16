package net.ibizsys.model.app.dataentity;



public class PSAppDEFieldImpl2 extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDEField{

	public final static String ATTR_GETALLPSAPPDEFUIMODES = "getAllPSAppDEFUIModes";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOMPUTEPSAPPDEFLOGIC = "getComputePSAppDEFLogic";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETDEFAULTVALUEPSAPPDEFLOGIC = "getDefaultValuePSAppDEFLogic";
	public final static String ATTR_GETDEFAULTVALUETYPE = "defaultValueType";
	public final static String ATTR_GETLNPSLANGUAGERES = "getLNPSLanguageRes";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMAXVALUESTRING = "maxValueString";
	public final static String ATTR_GETMINSTRINGLENGTH = "minStringLength";
	public final static String ATTR_GETMINVALUESTRING = "minValueString";
	public final static String ATTR_GETONCHANGEPSAPPDEFLOGIC = "getOnChangePSAppDEFLogic";
	public final static String ATTR_GETPRECISION = "precision";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETQSPHPSLANGUAGERES = "getQSPHPSLanguageRes";
	public final static String ATTR_GETQUICKSEARCHPLACEHOLDER = "quickSearchPlaceHolder";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETSTRINGLENGTH = "stringLength";
	public final static String ATTR_GETUSERCAT = "userCat";
	public final static String ATTR_GETUSERTAG = "userTag";
	public final static String ATTR_GETUSERTAG2 = "userTag2";
	public final static String ATTR_GETUSERTAG3 = "userTag3";
	public final static String ATTR_GETUSERTAG4 = "userTag4";
	public final static String ATTR_GETVALUEFORMAT = "valueFormat";
	public final static String ATTR_ISDATATYPEFIELD = "dataTypeField";
	public final static String ATTR_ISENABLEFRONTONLY = "enableFrontOnly";
	public final static String ATTR_ISENABLEQUICKSEARCH = "enableQuickSearch";
	public final static String ATTR_ISKEYFIELD = "keyField";
	public final static String ATTR_ISMAJORFIELD = "majorField";

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEFUIMode> allpsappdefuimodes = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEFUIMode> getAllPSAppDEFUIModes(){
		if(this.allpsappdefuimodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEFUIMODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEFUIMode> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEFUIMode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEFUIMode obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEFUIMode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEFUIMODES);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdefuimodes = list;
		}
		return (this.allpsappdefuimodes.size() == 0)? null : this.allpsappdefuimodes;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEFUIMode getPSAppDEFUIMode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEFUIMode.class, this.getAllPSAppDEFUIModes(), objKey, bTryMode);
	}
	public void setPSAppDEFUIModes(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEFUIMode> list){
		this.allpsappdefuimodes = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEFLogic computepsappdeflogic;

	public net.ibizsys.model.app.dataentity.IPSAppDEFLogic getComputePSAppDEFLogic(){
		if(this.computepsappdeflogic != null) return this.computepsappdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOMPUTEPSAPPDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.computepsappdeflogic = (net.ibizsys.model.app.dataentity.IPSAppDEFLogic)ipsappdataentity.getPSAppDELogic(value, false);
		return this.computepsappdeflogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEFLogic getComputePSAppDEFLogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEFLogic value = this.getComputePSAppDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值计算逻辑");}
		return value;
	}

	public void setComputePSAppDEFLogic(net.ibizsys.model.app.dataentity.IPSAppDEFLogic computepsappdeflogic){
		this.computepsappdeflogic = computepsappdeflogic;
	}


	public java.lang.String getDefaultValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEFLogic defaultvaluepsappdeflogic;

	public net.ibizsys.model.app.dataentity.IPSAppDEFLogic getDefaultValuePSAppDEFLogic(){
		if(this.defaultvaluepsappdeflogic != null) return this.defaultvaluepsappdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUEPSAPPDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.defaultvaluepsappdeflogic = (net.ibizsys.model.app.dataentity.IPSAppDEFLogic)ipsappdataentity.getPSAppDELogic(value, false);
		return this.defaultvaluepsappdeflogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEFLogic getDefaultValuePSAppDEFLogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEFLogic value = this.getDefaultValuePSAppDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认值逻辑");}
		return value;
	}

	public void setDefaultValuePSAppDEFLogic(net.ibizsys.model.app.dataentity.IPSAppDEFLogic defaultvaluepsappdeflogic){
		this.defaultvaluepsappdeflogic = defaultvaluepsappdeflogic;
	}


	public java.lang.String getDefaultValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUETYPE);
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

	public java.lang.String getMaxValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMinStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMinValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEFLogic onchangepsappdeflogic;

	public net.ibizsys.model.app.dataentity.IPSAppDEFLogic getOnChangePSAppDEFLogic(){
		if(this.onchangepsappdeflogic != null) return this.onchangepsappdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETONCHANGEPSAPPDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.onchangepsappdeflogic = (net.ibizsys.model.app.dataentity.IPSAppDEFLogic)ipsappdataentity.getPSAppDELogic(value, false);
		return this.onchangepsappdeflogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEFLogic getOnChangePSAppDEFLogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEFLogic value = this.getOnChangePSAppDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值变更逻辑");}
		return value;
	}

	public void setOnChangePSAppDEFLogic(net.ibizsys.model.app.dataentity.IPSAppDEFLogic onchangepsappdeflogic){
		this.onchangepsappdeflogic = onchangepsappdeflogic;
	}


	public int getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return "NONE";
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes qsphpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getQSPHPSLanguageRes(){
		if(this.qsphpslanguageres != null) return this.qsphpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQSPHPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.qsphpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETQSPHPSLANGUAGERES);
		return this.qsphpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getQSPHPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getQSPHPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定快速搜索占位提示信息语言资源");}
		return value;
	}

	public void setQSPHPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes qsphpslanguageres){
		this.qsphpslanguageres = qsphpslanguageres;
	}


	public java.lang.String getQuickSearchPlaceHolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQUICKSEARCHPLACEHOLDER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getUserCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERCAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDataTypeField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDATATYPEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFrontOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFRONTONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableQuickSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKSEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isKeyField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISKEYFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMajorField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAJORFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}