package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFPredefinedSourceNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowSourceNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFPredefinedSourceNode{

	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";

	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}