package net.ibizsys.model.control.tree;



public class PSDETreeNodeFieldColumnImpl extends net.ibizsys.model.control.tree.PSDETreeNodeColumnImpl implements net.ibizsys.model.control.tree.IPSDETreeNodeFieldColumn
		,net.ibizsys.model.control.tree.IPSDETreeNodeEditItem{

	public final static String ATTR_GETCLCONVERTMODE = "cLConvertMode";
	public final static String ATTR_GETCREATEDV = "createDV";
	public final static String ATTR_GETCREATEDVT = "createDVT";
	public final static String ATTR_GETDATAITEMNAME = "dataItemName";
	public final static String ATTR_GETENABLECOND = "enableCond";
	public final static String ATTR_GETIGNOREINPUT = "ignoreInput";
	public final static String ATTR_GETLINKPSAPPVIEW = "getLinkPSAppView";
	public final static String ATTR_GETLINKVALUEITEM = "linkValueItem";
	public final static String ATTR_GETOBJECTIDFIELD = "objectIdField";
	public final static String ATTR_GETOBJECTNAMEFIELD = "objectNameField";
	public final static String ATTR_GETOBJECTVALUEFIELD = "objectValueField";
	public final static String ATTR_GETOUTPUTCODELISTCONFIGMODE = "outputCodeListConfigMode";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPSDETREENODEEDITITEMUPDATE = "getPSDETreeNodeEditItemUpdate";
	public final static String ATTR_GETPSDEUIACTION = "getPSDEUIAction";
	public final static String ATTR_GETPSDEUIACTIONGROUP = "getPSDEUIActionGroup";
	public final static String ATTR_GETPSEDITOR = "getPSEditor";
	public final static String ATTR_GETRESETITEMNAME = "resetItemName";
	public final static String ATTR_GETRESETITEMNAMES = "resetItemNames";
	public final static String ATTR_GETTEXTSEPARATOR = "textSeparator";
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

	private net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate psdetreenodeedititemupdate;

	public net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate getPSDETreeNodeEditItemUpdate(){
		if(this.psdetreenodeedititemupdate != null) return this.psdetreenodeedititemupdate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREENODEEDITITEMUPDATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.tree.IPSDETreeNode ipsdetreenode = getParentPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNode.class);
		this.psdetreenodeedititemupdate = ipsdetreenode.getPSDETreeNodeEditItemUpdate(value, false);
		return this.psdetreenodeedititemupdate;
	}

	public net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate getPSDETreeNodeEditItemUpdateMust(){
		net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate value = this.getPSDETreeNodeEditItemUpdate();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定树表编辑项更新对象");}
		return value;
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