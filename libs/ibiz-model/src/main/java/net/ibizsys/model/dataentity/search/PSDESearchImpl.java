package net.ibizsys.model.dataentity.search;



public class PSDESearchImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.search.IPSDESearch{

	public final static String ATTR_GETDETAG = "dETag";
	public final static String ATTR_GETDETAG2 = "dETag2";
	public final static String ATTR_GETPSSYSSEARCHDE = "getPSSysSearchDE";
	public final static String ATTR_GETPSSYSSEARCHSCHEME = "getPSSysSearchScheme";
	public final static String ATTR_ISNOSQLSTORAGE = "noSQLStorage";

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
	private net.ibizsys.model.search.IPSSysSearchDE pssyssearchde;

	public net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDE(){
		if(this.pssyssearchde != null) return this.pssyssearchde;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEARCHDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.search.IPSSysSearchScheme ipssyssearchscheme = this.getPSSysSearchSchemeMust();
		this.pssyssearchde = ipssyssearchscheme.getPSSysSearchDE(value, false);
		return this.pssyssearchde;
	}

	public net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDEMust(){
		net.ibizsys.model.search.IPSSysSearchDE value = this.getPSSysSearchDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定全文检索实体");}
		return value;
	}

	public void setPSSysSearchDE(net.ibizsys.model.search.IPSSysSearchDE pssyssearchde){
		this.pssyssearchde = pssyssearchde;
	}

	private net.ibizsys.model.search.IPSSysSearchScheme pssyssearchscheme;

	public net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchScheme(){
		if(this.pssyssearchscheme != null) return this.pssyssearchscheme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEARCHSCHEME);
		if(value == null){
			return null;
		}
		this.pssyssearchscheme = getPSModelObject(net.ibizsys.model.search.IPSSysSearchScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSEARCHSCHEME);
		return this.pssyssearchscheme;
	}

	public net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchSchemeMust(){
		net.ibizsys.model.search.IPSSysSearchScheme value = this.getPSSysSearchScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定全文检索体系");}
		return value;
	}

	public void setPSSysSearchScheme(net.ibizsys.model.search.IPSSysSearchScheme pssyssearchscheme){
		this.pssyssearchscheme = pssyssearchscheme;
	}


	public boolean isNoSQLStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOSQLSTORAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}