package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFJoinSingleCondImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDFJoinCondImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinSingleCond{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETCONDTYPE = "condType";
	public final static String ATTR_GETCONDVALUE = "condValue";
	public final static String ATTR_GETCONDVALUETYPE = "condValueType";
	public final static String ATTR_GETJOINFIELD = "joinField";
	public final static String ATTR_GETJOINFIELDSCOPE = "joinFieldScope";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";

	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getJoinField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJOINFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getJoinFieldScope(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJOINFIELDSCOPE);
		if(value == null){
			return "DATASTREAM";
		}
		return value.asText();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}