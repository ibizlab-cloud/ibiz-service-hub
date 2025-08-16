package net.ibizsys.model.database;



public class PSDEDBIndexImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.database.IPSDEDBIndex{

	public final static String ATTR_GETALLPSDEDBINDEXFIELDS = "getAllPSDEDBIndexFields";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETINDEXTYPE = "indexType";
	public final static String ATTR_ISALLOWREVERSE = "allowReverse";

	private java.util.List<net.ibizsys.model.database.IPSDEDBIndexField> allpsdedbindexfields = null;
	public java.util.List<net.ibizsys.model.database.IPSDEDBIndexField> getAllPSDEDBIndexFields(){
		if(this.allpsdedbindexfields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDBINDEXFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSDEDBIndexField> list = new java.util.ArrayList<net.ibizsys.model.database.IPSDEDBIndexField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSDEDBIndexField obj = this.getPSModelObject(net.ibizsys.model.database.IPSDEDBIndexField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDBINDEXFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedbindexfields = list;
		}
		return (this.allpsdedbindexfields.size() == 0)? null : this.allpsdedbindexfields;
	}

	public net.ibizsys.model.database.IPSDEDBIndexField getPSDEDBIndexField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSDEDBIndexField.class, this.getAllPSDEDBIndexFields(), objKey, bTryMode);
	}
	public void setPSDEDBIndexFields(java.util.List<net.ibizsys.model.database.IPSDEDBIndexField> list){
		this.allpsdedbindexfields = list;
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

	public boolean isAllowReverse(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWREVERSE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}