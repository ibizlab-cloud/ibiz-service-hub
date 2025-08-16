package net.ibizsys.model.search;



public class PSSysSearchDEFieldImpl extends net.ibizsys.model.search.PSSysSearchDEObjectImpl implements net.ibizsys.model.search.IPSSysSearchDEField{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETDEFAULTVALUETYPE = "defaultValueType";
	public final static String ATTR_GETFIELDTAG = "fieldTag";
	public final static String ATTR_GETFIELDTAG2 = "fieldTag2";
	public final static String ATTR_GETFIELDS = "fields";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSSYSSEARCHFIELD = "getPSSysSearchField";
	public final static String ATTR_GETPSSYSTRANSLATOR = "getPSSysTranslator";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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

	public java.lang.String getDefaultValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private java.lang.String[] fields = null;
	public java.lang.String[] getFields(){
		if(this.fields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.fields = array;
		}
		return this.fields;
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.search.IPSSysSearchDE ipssyssearchde = getParentPSModelObject(net.ibizsys.model.search.IPSSysSearchDE.class);
		this.psdefield = ipssyssearchde.getPSDataEntityMust().getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性");}
		return value;
	}

	private net.ibizsys.model.search.IPSSysSearchField pssyssearchfield;

	public net.ibizsys.model.search.IPSSysSearchField getPSSysSearchField(){
		if(this.pssyssearchfield != null) return this.pssyssearchfield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEARCHFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.search.IPSSysSearchDE ipssyssearchde = getParentPSModelObject(net.ibizsys.model.search.IPSSysSearchDE.class);
		this.pssyssearchfield = ipssyssearchde.getPSSysSearchDocMust().getPSSysSearchField(value, false);
		return this.pssyssearchfield;
	}

	public net.ibizsys.model.search.IPSSysSearchField getPSSysSearchFieldMust(){
		net.ibizsys.model.search.IPSSysSearchField value = this.getPSSysSearchField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定检索文档属性");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysTranslator pssystranslator;

	public net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator(){
		if(this.pssystranslator != null) return this.pssystranslator;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTRANSLATOR);
		if(value == null){
			return null;
		}
		this.pssystranslator = getPSModelObject(net.ibizsys.model.res.IPSSysTranslator.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTRANSLATOR);
		return this.pssystranslator;
	}

	public net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust(){
		net.ibizsys.model.res.IPSSysTranslator value = this.getPSSysTranslator();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统值转换器");}
		return value;
	}

}