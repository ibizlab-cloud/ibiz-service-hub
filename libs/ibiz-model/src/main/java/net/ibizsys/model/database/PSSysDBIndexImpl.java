package net.ibizsys.model.database;



public class PSSysDBIndexImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.database.IPSSysDBIndex{

	public final static String ATTR_GETALLPSSYSDBINDEXCOLUMNS = "getAllPSSysDBIndexColumns";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETINDEXTYPE = "indexType";
	public final static String ATTR_GETREMOVEFLAG = "removeFlag";
	public final static String ATTR_GETSOURCETYPE = "sourceType";
	public final static String ATTR_ISALLOWREVERSE = "allowReverse";

	private java.util.List<net.ibizsys.model.database.IPSSysDBIndexColumn> allpssysdbindexcolumns = null;
	public java.util.List<net.ibizsys.model.database.IPSSysDBIndexColumn> getAllPSSysDBIndexColumns(){
		if(this.allpssysdbindexcolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDBINDEXCOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSSysDBIndexColumn> list = new java.util.ArrayList<net.ibizsys.model.database.IPSSysDBIndexColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSSysDBIndexColumn obj = this.getPSModelObject(net.ibizsys.model.database.IPSSysDBIndexColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDBINDEXCOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdbindexcolumns = list;
		}
		return (this.allpssysdbindexcolumns.size() == 0)? null : this.allpssysdbindexcolumns;
	}

	public net.ibizsys.model.database.IPSSysDBIndexColumn getPSSysDBIndexColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSSysDBIndexColumn.class, this.getAllPSSysDBIndexColumns(), objKey, bTryMode);
	}
	public void setPSSysDBIndexColumns(java.util.List<net.ibizsys.model.database.IPSSysDBIndexColumn> list){
		this.allpssysdbindexcolumns = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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

	public java.lang.String getIndexType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINDEXTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean getRemoveFlag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEFLAG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public java.lang.String getSourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSOURCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAllowReverse(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWREVERSE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}