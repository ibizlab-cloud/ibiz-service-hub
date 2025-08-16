package net.ibizsys.model.control.panel;



public class PSPanelItemCatGroupLogicImpl extends net.ibizsys.model.control.panel.PSPanelItemGroupLogicImpl implements net.ibizsys.model.control.panel.IPSPanelItemCatGroupLogic{

	public final static String ATTR_GETLOGICCAT = "logicCat";
	public final static String ATTR_GETRELATEDITEMNAMES = "relatedItemNames";

	public java.lang.String getLogicCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICCAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<java.lang.String> relateditemnames = null;
	public java.util.List<java.lang.String> getRelatedItemNames(){
		if(this.relateditemnames == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRELATEDITEMNAMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.relateditemnames = list;
		}
		return (this.relateditemnames.size() == 0)? null : this.relateditemnames;
	}
}