package net.ibizsys.model.database;



public class PSDEFDTColumnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.database.IPSDEFDTColumn{

	public final static String ATTR_GETCOLUMNNAME = "columnName";
	public final static String ATTR_GETDBTYPE = "dBType";
	public final static String ATTR_GETQUERYCODEEXP = "queryCodeExp";
	public final static String ATTR_GETSTANDARDCOLUMNNAME = "standardColumnName";
	public final static String ATTR_ISAUTOINCREMENT = "autoIncrement";
	public final static String ATTR_ISVALUEAUTOGEN = "valueAutoGen";

	public java.lang.String getColumnName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDBType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDBTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getQueryCodeExp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQUERYCODEEXP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getStandardColumnName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTANDARDCOLUMNNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAutoIncrement(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAUTOINCREMENT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isValueAutoGen(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALUEAUTOGEN);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}