package net.ibizsys.model.control.list;



public class PSListDataItemImpl extends net.ibizsys.model.data.PSDataItemImpl implements net.ibizsys.model.control.list.IPSListDataItem{

	public final static String ATTR_GETFRONTPSCODELIST = "getFrontPSCodeList";
	public final static String ATTR_GETGROUPITEM = "groupItem";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端代码表");}
		return value;
	}

	public void setFrontPSCodeList(net.ibizsys.model.codelist.IPSCodeList frontpscodelist){
		this.frontpscodelist = frontpscodelist;
	}


	public java.lang.String getGroupItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPITEM);
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

	public boolean isCustomCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMCODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}