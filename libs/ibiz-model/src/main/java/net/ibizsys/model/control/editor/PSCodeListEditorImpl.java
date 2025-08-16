package net.ibizsys.model.control.editor;



public class PSCodeListEditorImpl extends net.ibizsys.model.control.PSEditorImpl implements net.ibizsys.model.control.editor.IPSCodeListEditor{

	public final static String ATTR_GETALLITEMSTEXT = "allItemsText";
	public final static String ATTR_GETINLINEPSAPPCODELIST = "getInlinePSAppCodeList";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_ISALLITEMS = "allItems";
	public final static String ATTR_ISARRAY = "array";

	public java.lang.String getAllItemsText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLITEMSTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.codelist.IPSAppCodeList inlinepsappcodelist;

	public net.ibizsys.model.app.codelist.IPSAppCodeList getInlinePSAppCodeList(){
		if(this.inlinepsappcodelist != null) return this.inlinepsappcodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINLINEPSAPPCODELIST);
		if(value == null){
			return null;
		}
		this.inlinepsappcodelist = getPSModelObject(net.ibizsys.model.app.codelist.IPSAppCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETINLINEPSAPPCODELIST);
		return this.inlinepsappcodelist;
	}

	public net.ibizsys.model.app.codelist.IPSAppCodeList getInlinePSAppCodeListMust(){
		net.ibizsys.model.app.codelist.IPSAppCodeList value = this.getInlinePSAppCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定代码表（运行时内联）");}
		return value;
	}

	public void setInlinePSAppCodeList(net.ibizsys.model.app.codelist.IPSAppCodeList inlinepsappcodelist){
		this.inlinepsappcodelist = inlinepsappcodelist;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用代码表对象");}
		return value;
	}

	public void setPSAppCodeList(net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist){
		this.psappcodelist = psappcodelist;
	}


	public boolean isAllItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isArray(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISARRAY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}