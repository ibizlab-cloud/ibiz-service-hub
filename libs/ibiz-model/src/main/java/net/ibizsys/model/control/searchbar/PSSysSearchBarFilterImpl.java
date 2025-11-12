package net.ibizsys.model.control.searchbar;



public class PSSysSearchBarFilterImpl extends net.ibizsys.model.control.searchbar.PSSysSearchBarItemImplBase implements net.ibizsys.model.control.searchbar.IPSSearchBarFilter{

	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCREATEDV = "createDV";
	public final static String ATTR_GETCREATEDVT = "createDVT";
	public final static String ATTR_GETDATATYPE = "dataType";
	public final static String ATTR_GETITEMHEIGHT = "itemHeight";
	public final static String ATTR_GETITEMWIDTH = "itemWidth";
	public final static String ATTR_GETLABELCSSSTYLE = "labelCssStyle";
	public final static String ATTR_GETLABELPOS = "labelPos";
	public final static String ATTR_GETLABELWIDTH = "labelWidth";
	public final static String ATTR_GETOUTPUTCODELISTCONFIGMODE = "outputCodeListConfigMode";
	public final static String ATTR_GETPHPSLANGUAGERES = "getPHPSLanguageRes";
	public final static String ATTR_GETPSDEFSEARCHMODE = "getPSDEFSearchMode";
	public final static String ATTR_GETPSEDITOR = "getPSEditor";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETRESETITEMNAME = "resetItemName";
	public final static String ATTR_GETRESETITEMNAMES = "resetItemNames";
	public final static String ATTR_GETUNITNAME = "unitName";
	public final static String ATTR_GETUNITNAMEWIDTH = "unitNameWidth";
	public final static String ATTR_GETVALUEITEMNAME = "valueItemName";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_ISADDSEPARATOR = "addSeparator";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISCONVERTTOCODEITEMTEXT = "convertToCodeItemText";
	public final static String ATTR_ISEMPTYCAPTION = "emptyCaption";
	public final static String ATTR_ISENABLEITEMPRIV = "enableItemPriv";
	public final static String ATTR_ISENABLEUNITNAME = "enableUnitName";
	public final static String ATTR_ISHIDDEN = "hidden";
	public final static String ATTR_ISNEEDCODELISTCONFIG = "needCodeListConfig";
	public final static String ATTR_ISSHOWCAPTION = "showCaption";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题多语言资源对象");}
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

	public int getDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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

	private net.ibizsys.model.dataentity.defield.IPSDEFSearchMode psdefsearchmode;

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode(){
		if(this.psdefsearchmode != null) return this.psdefsearchmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFSEARCHMODE);
		if(value == null){
			return null;
		}
		this.psdefsearchmode = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEFSEARCHMODE);
		return this.psdefsearchmode;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchModeMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFSearchMode value = this.getPSDEFSearchMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性搜索模式");}
		return value;
	}

	public void setPSDEFSearchMode(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode psdefsearchmode){
		this.psdefsearchmode = psdefsearchmode;
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

	private net.ibizsys.model.res.IPSSysCss pssyscss;

	public net.ibizsys.model.res.IPSSysCss getPSSysCss(){
		if(this.pssyscss != null) return this.pssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCSS);
		if(value == null){
			return null;
		}
		this.pssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCSS);
		return this.pssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定过滤项界面样式表");}
		return value;
	}

	public void setPSSysCss(net.ibizsys.model.res.IPSSysCss pssyscss){
		this.pssyscss = pssyscss;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项图片对象");}
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

	public java.lang.String getValueItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public boolean isAddSeparator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISADDSEPARATOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAllowEmpty(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWEMPTY);
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