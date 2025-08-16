package net.ibizsys.model.control.form;



public class PSDESearchFormItemExImpl extends net.ibizsys.model.control.form.PSDESearchFormItemImpl implements net.ibizsys.model.control.form.IPSDEFormItemEx{

	public final static String ATTR_GETPSDEFORMITEMS = "getPSDEFormItems";
	public final static String ATTR_ISCOMPOSITEITEM = "compositeItem";

	private java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> psdeformitems = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> getPSDEFormItems(){
		if(this.psdeformitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFormItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFormItem obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFormItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFORMITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdeformitems = list;
		}
		return (this.psdeformitems.size() == 0)? null : this.psdeformitems;
	}

	public net.ibizsys.model.control.form.IPSDEFormItem getPSDEFormItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFormItem.class, this.getPSDEFormItems(), objKey, bTryMode);
	}
	public void setPSDEFormItems(java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> list){
		this.psdeformitems = list;
	}

	public boolean isCompositeItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCOMPOSITEITEM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}