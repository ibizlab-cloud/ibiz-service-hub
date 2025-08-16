package net.ibizsys.model.control.form;



public class PSDEFDCatGroupLogicImpl extends net.ibizsys.model.control.form.PSDEFDGroupLogicImpl implements net.ibizsys.model.control.form.IPSDEFDCatGroupLogic{

	public final static String ATTR_GETLOGICCAT = "logicCat";
	public final static String ATTR_GETRELATEDDETAILNAMES = "relatedDetailNames";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";

	public java.lang.String getLogicCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICCAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<java.lang.String> relateddetailnames = null;
	public java.util.List<java.lang.String> getRelatedDetailNames(){
		if(this.relateddetailnames == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRELATEDDETAILNAMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.relateddetailnames = list;
		}
		return (this.relateddetailnames.size() == 0)? null : this.relateddetailnames;
	}

	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}