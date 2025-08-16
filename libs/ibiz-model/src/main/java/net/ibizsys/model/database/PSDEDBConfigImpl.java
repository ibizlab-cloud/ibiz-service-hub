package net.ibizsys.model.database;



public class PSDEDBConfigImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.database.IPSDEDBConfig{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDBTYPE = "dBType";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETOBJNAMECASE = "objNameCase";
	public final static String ATTR_GETSTANDARDTABLENAME = "standardTableName";
	public final static String ATTR_GETTABLENAME = "tableName";
	public final static String ATTR_GETVIEW2NAME = "view2Name";
	public final static String ATTR_GETVIEW3NAME = "view3Name";
	public final static String ATTR_GETVIEW4NAME = "view4Name";
	public final static String ATTR_GETVIEWNAME = "viewName";
	public final static String ATTR_ISCUSTOMTABLEORVIEW = "customTableOrView";
	public final static String ATTR_ISVALID = "valid";

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getObjNameCase(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOBJNAMECASE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getStandardTableName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTANDARDTABLENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTableName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTABLENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getView2Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEW2NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getView3Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEW3NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getView4Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEW4NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getViewName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCustomTableOrView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMTABLEORVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALID);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}