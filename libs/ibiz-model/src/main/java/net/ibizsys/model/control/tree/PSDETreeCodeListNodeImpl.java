package net.ibizsys.model.control.tree;



public class PSDETreeCodeListNodeImpl extends net.ibizsys.model.control.tree.PSDETreeNodeImplBase implements net.ibizsys.model.control.tree.IPSDETreeCodeListNode{

	public final static String ATTR_GETPSAPPCODELIST = "getPSCodeList";
	public final static String ATTR_ISAPPENDCAPTION = "appendCaption";
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


	public boolean isAppendCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAPPENDCAPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}