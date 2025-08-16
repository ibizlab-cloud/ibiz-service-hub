package net.ibizsys.model.dataentity.defield;



public class PSFormulaDEFieldImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldImpl implements net.ibizsys.model.dataentity.defield.IPSFormulaDEField{

	public final static String ATTR_GETFORMULACOLUMNS = "formulaColumns";
	public final static String ATTR_GETFORMULAFORMAT = "formulaFormat";
	public final static String ATTR_ISFORMULADEFIELD = "formulaDEField";
	public final static String ATTR_ISPHISICALDEFIELD = "phisicalDEField";

	public java.lang.String getFormulaColumns(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMULACOLUMNS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFormulaFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMULAFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isFormulaDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFORMULADEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPhisicalDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPHISICALDEFIELD);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}