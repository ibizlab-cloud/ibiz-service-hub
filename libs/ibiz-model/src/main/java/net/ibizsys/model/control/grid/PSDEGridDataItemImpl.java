package net.ibizsys.model.control.grid;



public class PSDEGridDataItemImpl extends net.ibizsys.model.data.PSDataItemImpl implements net.ibizsys.model.control.grid.IPSDEGridDataItem{

	public final static String ATTR_GETDATAITEMPARAM0FORMAT = "format";
	public final static String ATTR_GETFORMAT = "format";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETVALUETYPE = "valueType";
	public final static String ATTR_ISCUSTOMCODE = "customCode";
	public final static String ATTR_ISDATAACCESSACTION = "dataAccessAction";

	public java.lang.String getDataItemParam0Format(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAITEMPARAM0FORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体属性");}
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
}