package net.ibizsys.model.dataentity.ds;



public class PSDEDataQueryCodeExpImp extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp{

	public final static String ATTR_GETEXPRESSION = "expression";
	public final static String ATTR_GETNAME = "name";

	public java.lang.String getExpression(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXPRESSION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}