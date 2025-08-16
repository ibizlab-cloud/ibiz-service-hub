package net.ibizsys.model.control.tree;



public class HiddenPSDETreeNodeEditItemImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.tree.IPSDETreeNodeEditItem{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCREATEDV = "createDV";
	public final static String ATTR_GETCREATEDVT = "createDVT";
	public final static String ATTR_GETENABLECOND = "enableCond";
	public final static String ATTR_GETIGNOREINPUT = "ignoreInput";
	public final static String ATTR_GETOUTPUTCODELISTCONFIGMODE = "outputCodeListConfigMode";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPSDETREENODEEDITITEMUPDATE = "getPSDETreeNodeEditItemUpdate";
	public final static String ATTR_GETPSEDITOR = "getPSEditor";
	public final static String ATTR_GETRESETITEMNAME = "resetItemName";
	public final static String ATTR_GETRESETITEMNAMES = "resetItemNames";
	public final static String ATTR_GETUNITNAME = "unitName";
	public final static String ATTR_GETUNITNAMEWIDTH = "unitNameWidth";
	public final static String ATTR_GETUPDATEDV = "updateDV";
	public final static String ATTR_GETUPDATEDVT = "updateDVT";
	public final static String ATTR_GETVALUEITEMNAME = "valueItemName";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISCONVERTTOCODEITEMTEXT = "convertToCodeItemText";
	public final static String ATTR_ISENABLEUNITNAME = "enableUnitName";
	public final static String ATTR_ISNEEDCODELISTCONFIG = "needCodeListConfig";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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

	public int getOutputCodeListConfigMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTPUTCODELISTCONFIGMODE);
		if(value == null){
			return 0;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定树表格编辑项更新对象");}
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

	public boolean isConvertToCodeItemText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCONVERTTOCODEITEMTEXT);
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