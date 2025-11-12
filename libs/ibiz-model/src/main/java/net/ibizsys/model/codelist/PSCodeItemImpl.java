package net.ibizsys.model.codelist;



public class PSCodeItemImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.codelist.IPSCodeItem{

	public final static String ATTR_GETBKCOLOR = "bKColor";
	public final static String ATTR_GETBEGINVALUE = "beginValue";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOLOR = "color";
	public final static String ATTR_GETDATA = "data";
	public final static String ATTR_GETENDVALUE = "endValue";
	public final static String ATTR_GETICONCLS = "iconCls";
	public final static String ATTR_GETICONCLSX = "iconClsX";
	public final static String ATTR_GETICONPATH = "iconPath";
	public final static String ATTR_GETICONPATHX = "iconPathX";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETPSCODEITEMS = "getPSCodeItems";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETTEXT = "text";
	public final static String ATTR_GETTEXTCLS = "textCls";
	public final static String ATTR_GETTEXTPSLANGUAGERES = "getTextPSLanguageRes";
	public final static String ATTR_GETTOOLTIP = "tooltip";
	public final static String ATTR_GETTOOLTIPPSLANGUAGERES = "getTooltipPSLanguageRes";
	public final static String ATTR_GETUSERDATA = "userData";
	public final static String ATTR_GETUSERDATA2 = "userData2";
	public final static String ATTR_GETVALUE = "value";
	public final static String ATTR_ISDEFAULT = "default";
	public final static String ATTR_ISDISABLESELECT = "disableSelect";
	public final static String ATTR_ISINCLUDEBEGINVALUE = "includeBeginValue";
	public final static String ATTR_ISINCLUDEENDVALUE = "includeEndValue";
	public final static String ATTR_ISSHOWASEMTPY = "showAsEmtpy";

	public java.lang.String getBKColor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBKCOLOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Double getBeginValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBEGINVALUE);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Double getEndValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENDVALUE);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}

	public java.lang.String getIconCls(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getIconClsX(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLSX);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getIconPath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getIconPathX(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONPATHX);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.codelist.IPSCodeItem> pscodeitems = null;
	public java.util.List<net.ibizsys.model.codelist.IPSCodeItem> getPSCodeItems(){
		if(this.pscodeitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCODEITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.codelist.IPSCodeItem> list = new java.util.ArrayList<net.ibizsys.model.codelist.IPSCodeItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.codelist.IPSCodeItem obj = this.getPSModelObject(net.ibizsys.model.codelist.IPSCodeItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCODEITEMS);
				if(obj!=null)list.add(obj);
			}
			this.pscodeitems = list;
		}
		return (this.pscodeitems.size() == 0)? null : this.pscodeitems;
	}

	public net.ibizsys.model.codelist.IPSCodeItem getPSCodeItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.codelist.IPSCodeItem.class, this.getPSCodeItems(), objKey, bTryMode);
	}
	public void setPSCodeItems(java.util.List<net.ibizsys.model.codelist.IPSCodeItem> list){
		this.pscodeitems = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定显示样式");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
	}


	public java.lang.String getText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTextCls(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTCLS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes textpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTextPSLanguageRes(){
		if(this.textpslanguageres != null) return this.textpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.textpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTEXTPSLANGUAGERES);
		return this.textpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTextPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTextPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定文本语言资源");}
		return value;
	}

	public void setTextPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes textpslanguageres){
		this.textpslanguageres = textpslanguageres;
	}


	public java.lang.String getTooltip(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIP);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes(){
		if(this.tooltippslanguageres != null) return this.tooltippslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.tooltippslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTOOLTIPPSLANGUAGERES);
		return this.tooltippslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTooltipPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定提示信息语言资源");}
		return value;
	}

	public void setTooltipPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres){
		this.tooltippslanguageres = tooltippslanguageres;
	}


	public java.lang.String getUserData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDisableSelect(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDISABLESELECT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIncludeBeginValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEBEGINVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIncludeEndValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEENDVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowAsEmtpy(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWASEMTPY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}