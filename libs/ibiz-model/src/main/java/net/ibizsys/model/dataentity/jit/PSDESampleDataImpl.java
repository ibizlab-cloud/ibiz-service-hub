package net.ibizsys.model.dataentity.jit;



public class PSDESampleDataImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.jit.IPSDESampleData
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDATA = "data";
	public final static String ATTR_GETDATAJO = "dataJO";
	public final static String ATTR_GETDATATYPE = "dataType";
	public final static String ATTR_GETLOGICMODE = "logicMode";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETRANDOMCOUNT = "randomCount";
	public final static String ATTR_GETRANDOMMODE = "randomMode";
	public final static String ATTR_GETRANDOMPARAM = "randomParam";
	public final static String ATTR_GETRANDOMPARAM2 = "randomParam2";
	public final static String ATTR_GETRANDOMPARAM3 = "randomParam3";
	public final static String ATTR_GETRANDOMPARAM4 = "randomParam4";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getDataJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getRandomCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRANDOMCOUNT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getRandomMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRANDOMMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRandomParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRANDOMPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRandomParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRANDOMPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getRandomParam3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRANDOMPARAM3);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getRandomParam4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRANDOMPARAM4);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}