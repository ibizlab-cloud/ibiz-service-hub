package net.ibizsys.model.search;



public class PSSysSearchDEImpl extends net.ibizsys.model.search.PSSysSearchSchemeObjectImpl implements net.ibizsys.model.search.IPSSysSearchDE{

	public final static String ATTR_GETALLPSSYSSEARCHDEFIELDS = "getAllPSSysSearchDEFields";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDETAG = "dETag";
	public final static String ATTR_GETDETAG2 = "dETag2";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSEARCHDOC = "getPSSysSearchDoc";
	public final static String ATTR_ISNOSQLSTORAGE = "noSQLStorage";

	private java.util.List<net.ibizsys.model.search.IPSSysSearchDEField> allpssyssearchdefields = null;
	public java.util.List<net.ibizsys.model.search.IPSSysSearchDEField> getAllPSSysSearchDEFields(){
		if(this.allpssyssearchdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSEARCHDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.search.IPSSysSearchDEField> list = new java.util.ArrayList<net.ibizsys.model.search.IPSSysSearchDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.search.IPSSysSearchDEField obj = this.getPSModelObject(net.ibizsys.model.search.IPSSysSearchDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSEARCHDEFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyssearchdefields = list;
		}
		return (this.allpssyssearchdefields.size() == 0)? null : this.allpssyssearchdefields;
	}

	public net.ibizsys.model.search.IPSSysSearchDEField getPSSysSearchDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.search.IPSSysSearchDEField.class, this.getAllPSSysSearchDEFields(), objKey, bTryMode);
	}
	public void setPSSysSearchDEFields(java.util.List<net.ibizsys.model.search.IPSSysSearchDEField> list){
		this.allpssyssearchdefields = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDETag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDETag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体对象");}
		return value;
	}

	private net.ibizsys.model.search.IPSSysSearchDoc pssyssearchdoc;

	public net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDoc(){
		if(this.pssyssearchdoc != null) return this.pssyssearchdoc;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEARCHDOC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.search.IPSSysSearchScheme ipssyssearchscheme = getParentPSModelObject(net.ibizsys.model.search.IPSSysSearchScheme.class);
		this.pssyssearchdoc = ipssyssearchscheme.getPSSysSearchDoc(value, false);
		return this.pssyssearchdoc;
	}

	public net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDocMust(){
		net.ibizsys.model.search.IPSSysSearchDoc value = this.getPSSysSearchDoc();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定全文检索文档");}
		return value;
	}


	public boolean isNoSQLStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOSQLSTORAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}