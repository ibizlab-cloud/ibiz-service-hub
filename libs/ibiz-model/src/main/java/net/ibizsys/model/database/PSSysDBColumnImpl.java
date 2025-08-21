package net.ibizsys.model.database;



public class PSSysDBColumnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.database.IPSSysDBColumn{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETCOLUMNTAG = "columnTag";
	public final static String ATTR_GETCOLUMNTAG2 = "columnTag2";
	public final static String ATTR_GETCREATESQL = "createSql";
	public final static String ATTR_GETDATATYPE = "dataType";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETDROPSQL = "dropSql";
	public final static String ATTR_GETLENGTH = "length";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETPRECISION = "precision";
	public final static String ATTR_GETREFPSSYSDBCOLUMN = "getRefPSSysDBColumn";
	public final static String ATTR_GETREFPSSYSDBTABLE = "getRefPSSysDBTable";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_ISAUTOINCREMENT = "autoIncrement";
	public final static String ATTR_ISFKEY = "fKey";
	public final static String ATTR_ISNULLABLE = "nullable";
	public final static String ATTR_ISPKEY = "pKey";
	public final static String ATTR_ISUNSIGNED = "unsigned";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColumnTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColumnTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNTAG2);
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

	public java.lang.String getDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUE);
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

	public int getLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLENGTH);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.database.IPSSysDBColumn refpssysdbcolumn;

	public net.ibizsys.model.database.IPSSysDBColumn getRefPSSysDBColumn(){
		if(this.refpssysdbcolumn != null) return this.refpssysdbcolumn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSSYSDBCOLUMN);
		if(value == null){
			return null;
		}
		this.refpssysdbcolumn = getRefPSSysDBTable().getPSSysDBColumn(value, false);
		return this.refpssysdbcolumn;
	}

	public net.ibizsys.model.database.IPSSysDBColumn getRefPSSysDBColumnMust(){
		net.ibizsys.model.database.IPSSysDBColumn value = this.getRefPSSysDBColumn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用数据列");}
		return value;
	}

	public void setRefPSSysDBColumn(net.ibizsys.model.database.IPSSysDBColumn refpssysdbcolumn){
		this.refpssysdbcolumn = refpssysdbcolumn;
	}

	private net.ibizsys.model.database.IPSSysDBTable refpssysdbtable;

	public net.ibizsys.model.database.IPSSysDBTable getRefPSSysDBTable(){
		if(this.refpssysdbtable != null) return this.refpssysdbtable;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSSYSDBTABLE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.database.IPSSysDBScheme ipssysdbscheme = getParentPSModelObject(net.ibizsys.model.database.IPSSysDBScheme.class);
		this.refpssysdbtable = ipssysdbscheme.getPSSysDBTable(value, false);
		return this.refpssysdbtable;
	}

	public net.ibizsys.model.database.IPSSysDBTable getRefPSSysDBTableMust(){
		net.ibizsys.model.database.IPSSysDBTable value = this.getRefPSSysDBTable();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用数据表");}
		return value;
	}

	public void setRefPSSysDBTable(net.ibizsys.model.database.IPSSysDBTable refpssysdbtable){
		this.refpssysdbtable = refpssysdbtable;
	}


	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isAutoIncrement(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAUTOINCREMENT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isFKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFKEY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNullable(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNULLABLE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPKEY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUnsigned(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUNSIGNED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}