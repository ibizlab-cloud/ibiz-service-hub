package net.ibizsys.model.dataentity.defield;



public abstract class PSDEFUIItemImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldObjectImpl implements net.ibizsys.model.dataentity.defield.IPSDEFUIItem
		,net.ibizsys.model.app.dataentity.IPSAppDEFUIItem{

	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEDITORPARAMS = "editorParams";
	public final static String ATTR_GETEDITORSTYLE = "editorStyle";
	public final static String ATTR_GETEDITORTYPE = "editorType";
	public final static String ATTR_GETMAXVALUESTRING = "maxValueString";
	public final static String ATTR_GETMINSTRINGLENGTH = "minStringLength";
	public final static String ATTR_GETMINVALUESTRING = "minValueString";
	public final static String ATTR_GETORIGINCAPTION = "originCaption";
	public final static String ATTR_GETOUTPUTCODELISTCONFIGMODE = "outputCodeListConfigMode";
	public final static String ATTR_GETPHPSLANGUAGERES = "getPHPSLanguageRes";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPLACEHOLDER = "placeHolder";
	public final static String ATTR_GETPRECISION = "precision";
	public final static String ATTR_GETREFLINKPSDEVIEWCODENAME = "refLinkPSDEViewCodeName";
	public final static String ATTR_GETREFMPICKUPPSDEVIEWCODENAME = "refMPickupPSDEViewCodeName";
	public final static String ATTR_GETREFPSDEACMODE = "getRefPSDEACMode";
	public final static String ATTR_GETREFPSDEDATASET = "getRefPSDEDataSet";
	public final static String ATTR_GETREFPSDATAENTITY = "getRefPSDataEntity";
	public final static String ATTR_GETREFPICKUPPSDEVIEWCODENAME = "refPickupPSDEViewCodeName";
	public final static String ATTR_GETSCALE = "scale";
	public final static String ATTR_GETSTRINGLENGTH = "stringLength";
	public final static String ATTR_GETUIMODE = "uIMode";
	public final static String ATTR_GETVALUEFORMAT = "valueFormat";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISMOBILEMODE = "mobileMode";
	public final static String ATTR_ISNEEDCODELISTCONFIG = "needCodeListConfig";
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


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getEditorParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getEditorStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEditorType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORTYPE);
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

	public java.lang.String getOriginCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORIGINCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOutputCodeListConfigMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTPUTCODELISTCONFIGMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSLanguageRes phpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getPHPSLanguageRes(){
		if(this.phpslanguageres != null) return this.phpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPHPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.phpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPHPSLANGUAGERES);
		return this.phpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getPHPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getPHPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输入提示语言资源");}
		return value;
	}

	public void setPHPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes phpslanguageres){
		this.phpslanguageres = phpslanguageres;
	}

	private net.ibizsys.model.res.IPSSysImage pssysimage;

	public net.ibizsys.model.res.IPSSysImage getPSSysImage(){
		if(this.pssysimage != null) return this.pssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.pssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSIMAGE);
		return this.pssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标图片资源对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
	}


	public java.lang.String getPlaceHolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLACEHOLDER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getRefLinkPSDEViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFLINKPSDEVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefMPickupPSDEViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFMPICKUPPSDEVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ac.IPSDEACMode refpsdeacmode;

	public net.ibizsys.model.dataentity.ac.IPSDEACMode getRefPSDEACMode(){
		if(this.refpsdeacmode != null) return this.refpsdeacmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSDEACMODE);
		if(value == null){
			return null;
		}
		this.refpsdeacmode = this.getRefPSDataEntityMust().getPSDEACMode(value, false);
		return this.refpsdeacmode;
	}

	public net.ibizsys.model.dataentity.ac.IPSDEACMode getRefPSDEACModeMust(){
		net.ibizsys.model.dataentity.ac.IPSDEACMode value = this.getRefPSDEACMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体自填模式");}
		return value;
	}

	public void setRefPSDEACMode(net.ibizsys.model.dataentity.ac.IPSDEACMode refpsdeacmode){
		this.refpsdeacmode = refpsdeacmode;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet refpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSet(){
		if(this.refpsdedataset != null) return this.refpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSDEDATASET);
		if(value == null){
			return null;
		}
		this.refpsdedataset = this.getRefPSDataEntityMust().getPSDEDataSet(value, false);
		return this.refpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getRefPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体数据集");}
		return value;
	}

	public void setRefPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet refpsdedataset){
		this.refpsdedataset = refpsdedataset;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity refpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntity(){
		if(this.refpsdataentity != null) return this.refpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.refpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETREFPSDATAENTITY);
		return this.refpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getRefPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体对象");}
		return value;
	}

	public void setRefPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity refpsdataentity){
		this.refpsdataentity = refpsdataentity;
	}


	public java.lang.String getRefPickupPSDEViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPICKUPPSDEVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getScale(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCALE);
		if(value == null){
			return -1;
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

	public java.lang.String getUIMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFORMAT);
		if(value == null){
			return "%1$s";
		}
		return value.asText();
	}

	public boolean isAllowEmpty(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWEMPTY);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isMobileMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMOBILEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNeedCodeListConfig(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNEEDCODELISTCONFIG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}