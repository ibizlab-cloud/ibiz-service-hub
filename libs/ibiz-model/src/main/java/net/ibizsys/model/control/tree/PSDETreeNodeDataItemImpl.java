package net.ibizsys.model.control.tree;



public class PSDETreeNodeDataItemImpl extends net.ibizsys.model.data.PSDataItemImpl implements net.ibizsys.model.control.tree.IPSDETreeNodeDataItem{

	public final static String ATTR_GETCLCONVERTMODE = "cLConvertMode";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETFRONTPSCODELIST = "getFrontPSCodeList";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPSDETREECOLUMN = "getPSDETreeColumn";
	public final static String ATTR_GETPRIVILEGEID = "privilegeId";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETVALUETYPE = "valueType";
	public final static String ATTR_ISCUSTOMCODE = "customCode";
	public final static String ATTR_ISDATAACCESSACTION = "dataAccessAction";
	public final static String ATTR_ISENABLEITEMPRIV = "enableItemPriv";

	public java.lang.String getCLConvertMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLCONVERTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.codelist.IPSCodeList frontpscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getFrontPSCodeList(){
		if(this.frontpscodelist != null) return this.frontpscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFRONTPSCODELIST);
		if(value == null){
			return null;
		}
		this.frontpscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETFRONTPSCODELIST);
		return this.frontpscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getFrontPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getFrontPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端代码表");}
		return value;
	}

	public void setFrontPSCodeList(net.ibizsys.model.codelist.IPSCodeList frontpscodelist){
		this.frontpscodelist = frontpscodelist;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(){
		if(this.psappdefield != null) return this.psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.tree.IPSDETreeNode ipsdetreenode = getParentPSModelObject(net.ibizsys.model.control.tree.IPSDETreeNode.class);
		this.psappdefield = ipsdetreenode.getPSAppDataEntityMust().getPSAppDEField(value, false);
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

	private net.ibizsys.model.control.tree.IPSDETreeColumn psdetreecolumn;

	public net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumn(){
		if(this.psdetreecolumn != null) return this.psdetreecolumn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREECOLUMN);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.tree.IPSDETree ipsdetree = getParentPSModelObject(net.ibizsys.model.control.tree.IPSDETree.class);
		this.psdetreecolumn = ipsdetree.getPSDETreeColumn(value, false);
		return this.psdetreecolumn;
	}

	public net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumnMust(){
		net.ibizsys.model.control.tree.IPSDETreeColumn value = this.getPSDETreeColumn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定树视图列");}
		return value;
	}

	public void setPSDETreeColumn(net.ibizsys.model.control.tree.IPSDETreeColumn psdetreecolumn){
		this.psdetreecolumn = psdetreecolumn;
	}


	public java.lang.String getPrivilegeId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRIVILEGEID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
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

	public boolean isCustomCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMCODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDATAACCESSACTION);
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
}