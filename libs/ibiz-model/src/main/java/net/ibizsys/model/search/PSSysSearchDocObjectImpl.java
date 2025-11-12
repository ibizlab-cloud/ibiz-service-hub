package net.ibizsys.model.search;



public abstract class PSSysSearchDocObjectImpl extends net.ibizsys.model.search.PSSysSearchSchemeObjectImpl implements net.ibizsys.model.search.IPSSysSearchDocObject{

	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSSYSSEARCHDOC = "getPSSysSearchDoc";

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.search.IPSSysSearchDoc pssyssearchdoc;

	@Deprecated
	public net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDoc(){
		if(this.pssyssearchdoc != null) return this.pssyssearchdoc;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEARCHDOC);
		if(value == null){
			return null;
		}
		this.pssyssearchdoc = getPSModelObject(net.ibizsys.model.search.IPSSysSearchDoc.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSEARCHDOC);
		return this.pssyssearchdoc;
	}

	public net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDocMust(){
		net.ibizsys.model.search.IPSSysSearchDoc value = this.getPSSysSearchDoc();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSSysSearchDoc]返回空值");}
		return value;
	}

	public void setPSSysSearchDoc(net.ibizsys.model.search.IPSSysSearchDoc pssyssearchdoc){
		this.pssyssearchdoc = pssyssearchdoc;
	}

}