package net.ibizsys.model.database;



public class PSSysDBIndexColumnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.database.IPSSysDBIndexColumn{

	public final static String ATTR_GETLENGTH = "length";
	public final static String ATTR_GETPSSYSDBCOLUMN = "getPSSysDBColumn";
	public final static String ATTR_GETSORTDIR = "sortDir";
	public final static String ATTR_ISINCLUDEMODE = "includeMode";

	public int getLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLENGTH);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.database.IPSSysDBColumn pssysdbcolumn;

	public net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumn(){
		if(this.pssysdbcolumn != null) return this.pssysdbcolumn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDBCOLUMN);
		if(value == null){
			return null;
		}
		net.ibizsys.model.database.IPSSysDBTable ipssysdbtable = getParentPSModelObject(net.ibizsys.model.database.IPSSysDBTable.class);
		this.pssysdbcolumn = ipssysdbtable.getPSSysDBColumn(value, false);
		return this.pssysdbcolumn;
	}

	public net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumnMust(){
		net.ibizsys.model.database.IPSSysDBColumn value = this.getPSSysDBColumn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定索引列");}
		return value;
	}

	public void setPSSysDBColumn(net.ibizsys.model.database.IPSSysDBColumn pssysdbcolumn){
		this.pssysdbcolumn = pssysdbcolumn;
	}


	public java.lang.String getSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isIncludeMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}