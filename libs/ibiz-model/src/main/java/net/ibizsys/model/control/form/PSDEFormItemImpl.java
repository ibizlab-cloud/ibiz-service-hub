package net.ibizsys.model.control.form;



public class PSDEFormItemImpl extends net.ibizsys.model.control.form.PSDEFormDetailImpl implements net.ibizsys.model.control.form.IPSDEFormItem{

	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCAPTIONITEMNAME = "captionItemName";
	public final static String ATTR_GETCREATEDV = "createDV";
	public final static String ATTR_GETCREATEDVT = "createDVT";
	public final static String ATTR_GETDATATYPE = "dataType";
	public final static String ATTR_GETENABLECOND = "enableCond";
	public final static String ATTR_GETFIELDNAME = "fieldName";
	public final static String ATTR_GETIGNOREINPUT = "ignoreInput";
	public final static String ATTR_GETINPUTTIP = "inputTip";
	public final static String ATTR_GETINPUTTIPLANRESTAG = "inputTipLanResTag";
	public final static String ATTR_GETINPUTTIPUNIQUETAG = "inputTipUniqueTag";
	public final static String ATTR_GETINPUTTIPURL = "inputTipUrl";
	public final static String ATTR_GETITEMHEIGHT = "itemHeight";
	public final static String ATTR_GETITEMWIDTH = "itemWidth";
	public final static String ATTR_GETLABELCSSSTYLE = "labelCssStyle";
	public final static String ATTR_GETLABELDYNACLASS = "labelDynaClass";
	public final static String ATTR_GETLABELPOS = "labelPos";
	public final static String ATTR_GETLABELWIDTH = "labelWidth";
	public final static String ATTR_GETNOPRIVDISPLAYMODE = "noPrivDisplayMode";
	public final static String ATTR_GETOUTPUTCODELISTCONFIGMODE = "outputCodeListConfigMode";
	public final static String ATTR_GETPHPSLANGUAGERES = "getPHPSLanguageRes";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPSDEFORMITEMUPDATE = "getPSDEFormItemUpdate";
	public final static String ATTR_GETPSEDITOR = "getPSEditor";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETRESETITEMNAME = "resetItemName";
	public final static String ATTR_GETRESETITEMNAMES = "resetItemNames";
	public final static String ATTR_GETUNITNAME = "unitName";
	public final static String ATTR_GETUNITNAMEWIDTH = "unitNameWidth";
	public final static String ATTR_GETUPDATEDV = "updateDV";
	public final static String ATTR_GETUPDATEDVT = "updateDVT";
	public final static String ATTR_GETVALUEFORMAT = "valueFormat";
	public final static String ATTR_GETVALUEITEMNAME = "valueItemName";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISCOMPOSITEITEM = "compositeItem";
	public final static String ATTR_ISCONVERTTOCODEITEMTEXT = "convertToCodeItemText";
	public final static String ATTR_ISEMPTYCAPTION = "emptyCaption";
	public final static String ATTR_ISENABLEANCHOR = "enableAnchor";
	public final static String ATTR_ISENABLEINPUTTIP = "enableInputTip";
	public final static String ATTR_ISENABLEITEMPRIV = "enableItemPriv";
	public final static String ATTR_ISENABLEUNITNAME = "enableUnitName";
	public final static String ATTR_ISHIDDEN = "hidden";
	public final static String ATTR_ISINPUTTIPCLOSABLE = "inputTipClosable";
	public final static String ATTR_ISNEEDCODELISTCONFIG = "needCodeListConfig";
	public final static String ATTR_ISSHOWCAPTION = "showCaption";

	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCaptionItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTIONITEMNAME);
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

	public int getDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getEnableCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLECOND);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getIgnoreInput(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIGNOREINPUT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getInputTip(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTTIP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInputTipLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTTIPLANRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInputTipUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTTIPUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInputTipUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTTIPURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getItemHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getItemWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public java.lang.String getLabelCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLABELCSSSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLabelDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLABELDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLabelPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLABELPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getLabelWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLABELWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getNoPrivDisplayMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNOPRIVDISPLAYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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

	private net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(){
		if(this.psappdefield != null) return this.psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.form.IPSDEForm ipsdeform = getParentPSModelObject(net.ibizsys.model.control.form.IPSDEForm.class);
		this.psappdefield = ipsdeform.getPSAppDataEntityMust().getPSAppDEField(value, false);
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

	private net.ibizsys.model.control.form.IPSDEFormItemUpdate psdeformitemupdate;

	public net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdate(){
		if(this.psdeformitemupdate != null) return this.psdeformitemupdate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMITEMUPDATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.form.IPSDEForm ipsdeform = getParentPSModelObject(net.ibizsys.model.control.form.IPSDEForm.class);
		this.psdeformitemupdate = ipsdeform.getPSDEFormItemUpdate(value, false);
		return this.psdeformitemupdate;
	}

	public net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdateMust(){
		net.ibizsys.model.control.form.IPSDEFormItemUpdate value = this.getPSDEFormItemUpdate();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定表单项更新");}
		return value;
	}

	public void setPSDEFormItemUpdate(net.ibizsys.model.control.form.IPSDEFormItemUpdate psdeformitemupdate){
		this.psdeformitemupdate = psdeformitemupdate;
	}

	private net.ibizsys.model.control.IPSEditor pseditor;

	public net.ibizsys.model.control.IPSEditor getPSEditor(){
		if(this.pseditor != null) return this.pseditor;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSEDITOR);
		if(value == null){
			return null;
		}
		this.pseditor = getPSModelObject(net.ibizsys.model.control.IPSEditor.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSEDITOR);
		return this.pseditor;
	}

	public net.ibizsys.model.control.IPSEditor getPSEditorMust(){
		net.ibizsys.model.control.IPSEditor value = this.getPSEditor();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定编辑器对象");}
		return value;
	}

	public void setPSEditor(net.ibizsys.model.control.IPSEditor pseditor){
		this.pseditor = pseditor;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定表单项图片对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
	}


	public java.lang.String getResetItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESETITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<java.lang.String> resetitemnames = null;
	public java.util.List<java.lang.String> getResetItemNames(){
		if(this.resetitemnames == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESETITEMNAMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.resetitemnames = list;
		}
		return (this.resetitemnames.size() == 0)? null : this.resetitemnames;
	}

	public java.lang.String getUnitName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNITNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getUnitNameWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNITNAMEWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
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

	public java.lang.String getValueFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAllowEmpty(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWEMPTY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isCompositeItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCOMPOSITEITEM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isConvertToCodeItemText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCONVERTTOCODEITEMTEXT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEmptyCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEMPTYCAPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableAnchor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEANCHOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableInputTip(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEINPUTTIP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableItemPriv(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEITEMPRIV);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUnitName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUNITNAME);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isHidden(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISHIDDEN);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isInputTipClosable(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINPUTTIPCLOSABLE);
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

	public boolean isShowCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWCAPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}