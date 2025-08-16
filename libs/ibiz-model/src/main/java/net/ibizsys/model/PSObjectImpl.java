package net.ibizsys.model;



public abstract class PSObjectImpl extends net.ibizsys.model.PSObjectImplBase implements net.ibizsys.model.IPSObject
		,net.ibizsys.model.IPSModelObject{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETPSDYNAMODEL = "getPSDynaModel";
	public final static String ATTR_GETUSERCAT = "userCat";
	public final static String ATTR_GETUSERTAG = "userTag";
	public final static String ATTR_GETUSERTAG2 = "userTag2";
	public final static String ATTR_GETUSERTAG3 = "userTag3";
	public final static String ATTR_GETUSERTAG4 = "userTag4";

	@Deprecated
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

	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
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
	private net.ibizsys.model.dynamodel.IPSDynaModel psdynamodel;

	public net.ibizsys.model.dynamodel.IPSDynaModel getPSDynaModel(){
		if(this.psdynamodel != null) return this.psdynamodel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDYNAMODEL);
		if(value == null){
			return null;
		}
		this.psdynamodel = getPSModelObject(net.ibizsys.model.dynamodel.IPSDynaModel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDYNAMODEL);
		return this.psdynamodel;
	}

	public net.ibizsys.model.dynamodel.IPSDynaModel getPSDynaModelMust(){
		net.ibizsys.model.dynamodel.IPSDynaModel value = this.getPSDynaModel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定动态模型对象");}
		return value;
	}


	public java.lang.String getUserCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERCAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}