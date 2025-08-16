package net.ibizsys.model.control.dataview;



public class PSDEDataViewDataItemImpl extends net.ibizsys.model.data.PSDataItemImpl implements net.ibizsys.model.control.dataview.IPSDEDataViewDataItem{

	public final static String ATTR_GETFRONTPSCODELIST = "getFrontPSCodeList";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_ISCUSTOMCODE = "customCode";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端代码表对象");}
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
		this.psappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDEFIELD);
		return this.psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关联应用实体属性");}
		return value;
	}

	public void setPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield){
		this.psappdefield = psappdefield;
	}


	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
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
}