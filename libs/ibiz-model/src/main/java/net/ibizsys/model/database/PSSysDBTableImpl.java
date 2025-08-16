package net.ibizsys.model.database;



public class PSSysDBTableImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.database.IPSSysDBTable{

	public final static String ATTR_GETALLPSSYSDBCOLUMNS = "getAllPSSysDBColumns";
	public final static String ATTR_GETALLPSSYSDBINDICES = "getAllPSSysDBIndices";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCREATESQL = "createSql";
	public final static String ATTR_GETDROPSQL = "dropSql";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_ISAUTOEXTENDMODEL = "autoExtendModel";
	public final static String ATTR_ISEXISTINGMODEL = "existingModel";

	private java.util.List<net.ibizsys.model.database.IPSSysDBColumn> allpssysdbcolumns = null;
	public java.util.List<net.ibizsys.model.database.IPSSysDBColumn> getAllPSSysDBColumns(){
		if(this.allpssysdbcolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDBCOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSSysDBColumn> list = new java.util.ArrayList<net.ibizsys.model.database.IPSSysDBColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSSysDBColumn obj = this.getPSModelObject(net.ibizsys.model.database.IPSSysDBColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDBCOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdbcolumns = list;
		}
		return (this.allpssysdbcolumns.size() == 0)? null : this.allpssysdbcolumns;
	}

	public net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSSysDBColumn.class, this.getAllPSSysDBColumns(), objKey, bTryMode);
	}
	public void setPSSysDBColumns(java.util.List<net.ibizsys.model.database.IPSSysDBColumn> list){
		this.allpssysdbcolumns = list;
	}

	private java.util.List<net.ibizsys.model.database.IPSSysDBIndex> allpssysdbindices = null;
	public java.util.List<net.ibizsys.model.database.IPSSysDBIndex> getAllPSSysDBIndices(){
		if(this.allpssysdbindices == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDBINDICES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSSysDBIndex> list = new java.util.ArrayList<net.ibizsys.model.database.IPSSysDBIndex>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSSysDBIndex obj = this.getPSModelObject(net.ibizsys.model.database.IPSSysDBIndex.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDBINDICES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdbindices = list;
		}
		return (this.allpssysdbindices.size() == 0)? null : this.allpssysdbindices;
	}

	public net.ibizsys.model.database.IPSSysDBIndex getPSSysDBIndex(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSSysDBIndex.class, this.getAllPSSysDBIndices(), objKey, bTryMode);
	}
	public void setPSSysDBIndices(java.util.List<net.ibizsys.model.database.IPSSysDBIndex> list){
		this.allpssysdbindices = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCreateSql(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATESQL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDropSql(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDROPSQL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAutoExtendModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAUTOEXTENDMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isExistingModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXISTINGMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}