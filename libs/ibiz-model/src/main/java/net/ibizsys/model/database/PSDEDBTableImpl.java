package net.ibizsys.model.database;



public class PSDEDBTableImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.database.IPSDEDBTable{

	public final static String ATTR_GETALLPSDEFIELDS = "getAllPSDEFields";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSSYSDBTABLE = "getPSSysDBTable";
	public final static String ATTR_GETTABLETYPE = "tableType";

	private java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> allpsdefields = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getAllPSDEFields(){
		if(this.allpsdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.IPSDEField>();
			net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(ipsdataentity.getPSDEField((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.allpsdefields = list;
		}
		return (this.allpsdefields.size() == 0)? null : this.allpsdefields;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, this.getAllPSDEFields(), objKey, bTryMode);
	}
	public void setPSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list){
		this.allpsdefields = list;
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
	private net.ibizsys.model.database.IPSSysDBTable pssysdbtable;

	public net.ibizsys.model.database.IPSSysDBTable getPSSysDBTable(){
		if(this.pssysdbtable != null) return this.pssysdbtable;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDBTABLE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.pssysdbtable = ipsdataentity.getPSSysDBSchemeMust().getPSSysDBTable(value, false);
		return this.pssysdbtable;
	}

	public net.ibizsys.model.database.IPSSysDBTable getPSSysDBTableMust(){
		net.ibizsys.model.database.IPSSysDBTable value = this.getPSSysDBTable();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系数据库表");}
		return value;
	}


	public java.lang.String getTableType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTABLETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}