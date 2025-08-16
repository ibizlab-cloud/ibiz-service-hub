package net.ibizsys.model.bi;



public abstract class PSSysBIReportItemImpl extends net.ibizsys.model.bi.PSSysBIReportObjectImpl implements net.ibizsys.model.bi.IPSSysBIReportItem{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETITEMPARAMS = "itemParams";
	public final static String ATTR_GETITEMTAG = "itemTag";
	public final static String ATTR_GETITEMTAG2 = "itemTag2";
	public final static String ATTR_GETITEMTYPE = "itemType";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getItemParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getItemTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}