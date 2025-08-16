package net.ibizsys.model.control.grid;



public class PSDEGridFieldColumnImpl extends net.ibizsys.model.control.grid.PSDEGridColumnImpl implements net.ibizsys.model.control.grid.IPSDEGridFieldColumn
		,net.ibizsys.model.control.grid.IPSDEGridEditItem{

	public final static String ATTR_GETCLCONVERTMODE = "cLConvertMode";
	public final static String ATTR_GETCREATEDV = "createDV";
	public final static String ATTR_GETCREATEDVT = "createDVT";
	public final static String ATTR_GETDATAITEMNAME = "dataItemName";
	public final static String ATTR_GETENABLECOND = "enableCond";
	public final static String ATTR_GETEXCELCAPTION = "excelCaption";
	public final static String ATTR_GETFILTERPSEDITOR = "getFilterPSEditor";
	public final static String ATTR_GETGROUPITEM = "groupItem";
	public final static String ATTR_GETIGNOREINPUT = "ignoreInput";
	public final static String ATTR_GETLINKPSAPPVIEW = "getLinkPSAppView";
	public final static String ATTR_GETLINKVALUEITEM = "linkValueItem";
	public final static String ATTR_GETOBJECTIDFIELD = "objectIdField";
	public final static String ATTR_GETOBJECTNAMEFIELD = "objectNameField";
	public final static String ATTR_GETOBJECTVALUEFIELD = "objectValueField";
	public final static String ATTR_GETOUTPUTCODELISTCONFIGMODE = "outputCodeListConfigMode";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPSDEGRIDEDITITEMUPDATE = "getPSDEGridEditItemUpdate";
	public final static String ATTR_GETPSDEUIACTION = "getPSDEUIAction";
	public final static String ATTR_GETPSDEUIACTIONGROUP = "getPSDEUIActionGroup";
	public final static String ATTR_GETPSEDITOR = "getPSEditor";
	public final static String ATTR_GETRESETITEMNAME = "resetItemName";
	public final static String ATTR_GETRESETITEMNAMES = "resetItemNames";
	public final static String ATTR_GETTEXTSEPARATOR = "textSeparator";
	public final static String ATTR_GETTREECOLUMNMODE = "treeColumnMode";
	public final static String ATTR_GETUNITNAME = "unitName";
	public final static String ATTR_GETUNITNAMEWIDTH = "unitNameWidth";
	public final static String ATTR_GETUPDATEDV = "updateDV";
	public final static String ATTR_GETUPDATEDVT = "updateDVT";
	public final static String ATTR_GETVALUEFORMAT = "valueFormat";
	public final static String ATTR_GETVALUEITEMNAME = "valueItemName";
	public final static String ATTR_GETVALUESEPARATOR = "valueSeparator";
	public final static String ATTR_GETVALUETYPE = "valueType";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISCONVERTTOCODEITEMTEXT = "convertToCodeItemText";
	public final static String ATTR_ISENABLEITEMPRIV = "enableItemPriv";
	public final static String ATTR_ISENABLELINKVIEW = "enableLinkView";
	public final static String ATTR_ISENABLEROWEDIT = "enableRowEdit";
	public final static String ATTR_ISENABLEUNITNAME = "enableUnitName";
	public final static String ATTR_ISNEEDCODELISTCONFIG = "needCodeListConfig";

	public java.lang.String getCLConvertMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLCONVERTMODE);
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

	public java.lang.String getDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getEnableCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLECOND);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getExcelCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXCELCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.IPSEditor filterpseditor;

	public net.ibizsys.model.control.IPSEditor getFilterPSEditor(){
		if(this.filterpseditor != null) return this.filterpseditor;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILTERPSEDITOR);
		if(value == null){
			return null;
		}
		this.filterpseditor = getPSModelObject(net.ibizsys.model.control.IPSEditor.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETFILTERPSEDITOR);
		return this.filterpseditor;
	}

	public net.ibizsys.model.control.IPSEditor getFilterPSEditorMust(){
		net.ibizsys.model.control.IPSEditor value = this.getFilterPSEditor();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定过滤器编辑器对象");}
		return value;
	}

	public void setFilterPSEditor(net.ibizsys.model.control.IPSEditor filterpseditor){
		this.filterpseditor = filterpseditor;
	}


	public java.lang.String getGroupItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPITEM);
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
	private net.ibizsys.model.app.view.IPSAppView linkpsappview;

	public net.ibizsys.model.app.view.IPSAppView getLinkPSAppView(){
		if(this.linkpsappview != null) return this.linkpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.linkpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETLINKPSAPPVIEW);
		return this.linkpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getLinkPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getLinkPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定链接视图");}
		return value;
	}

	public void setLinkPSAppView(net.ibizsys.model.app.view.IPSAppView linkpsappview){
		this.linkpsappview = linkpsappview;
	}


	public java.lang.String getLinkValueItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKVALUEITEM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getObjectIdField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOBJECTIDFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getObjectNameField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOBJECTNAMEFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getObjectValueField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOBJECTVALUEFIELD);
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
	private net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist;

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList(){
		if(this.psappcodelist != null) return this.psappcodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCODELIST);
		if(value == null){
			return null;
		}
		this.psappcodelist = getPSModelObject(net.ibizsys.model.app.codelist.IPSAppCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCODELIST);
		return this.psappcodelist;
	}

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust(){
		net.ibizsys.model.app.codelist.IPSAppCodeList value = this.getPSAppCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用代码表");}
		return value;
	}

	public void setPSAppCodeList(net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist){
		this.psappcodelist = psappcodelist;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(){
		if(this.psappdefield != null) return this.psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.psappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDEFIELD);
		return this.psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定列应用实体属性");}
		return value;
	}

	public void setPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield){
		this.psappdefield = psappdefield;
	}

	private net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate psdegridedititemupdate;

	public net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate getPSDEGridEditItemUpdate(){
		if(this.psdegridedititemupdate != null) return this.psdegridedititemupdate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEGRIDEDITITEMUPDATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.grid.IPSDEGrid ipsdegrid = getParentPSModelObject(net.ibizsys.model.control.grid.IPSDEGrid.class);
		this.psdegridedititemupdate = ipsdegrid.getPSDEGridEditItemUpdate(value, false);
		return this.psdegridedititemupdate;
	}

	public net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate getPSDEGridEditItemUpdateMust(){
		net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate value = this.getPSDEGridEditItemUpdate();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定表格编辑项更新对象");}
		return value;
	}

	public void setPSDEGridEditItemUpdate(net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate psdegridedititemupdate){
		this.psdegridedititemupdate = psdegridedititemupdate;
	}

	private net.ibizsys.model.dataentity.uiaction.IPSDEUIAction psdeuiaction;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIAction getPSDEUIAction(){
		if(this.psdeuiaction != null) return this.psdeuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTION);
		if(value == null){
			return null;
		}
		this.psdeuiaction = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTION);
		return this.psdeuiaction;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIAction getPSDEUIActionMust(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIAction value = this.getPSDEUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内置界面行为");}
		return value;
	}

	public void setPSDEUIAction(net.ibizsys.model.dataentity.uiaction.IPSDEUIAction psdeuiaction){
		this.psdeuiaction = psdeuiaction;
	}

	private net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup(){
		if(this.psdeuiactiongroup != null) return this.psdeuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.psdeuiactiongroup = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTIONGROUP);
		return this.psdeuiactiongroup;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroupMust(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup value = this.getPSDEUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组");}
		return value;
	}

	public void setPSDEUIActionGroup(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup){
		this.psdeuiactiongroup = psdeuiactiongroup;
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

	public java.lang.String getTextSeparator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTSEPARATOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getTreeColumnMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTREECOLUMNMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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

	public java.lang.String getValueSeparator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUESEPARATOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUETYPE);
		if(value == null){
			return "SIMPLE";
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

	public boolean isConvertToCodeItemText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCONVERTTOCODEITEMTEXT);
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

	public boolean isEnableLinkView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLELINKVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRowEdit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWEDIT);
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

	public boolean isNeedCodeListConfig(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNEEDCODELISTCONFIG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}