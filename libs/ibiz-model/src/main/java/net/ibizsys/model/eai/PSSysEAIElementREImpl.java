package net.ibizsys.model.eai;



public class PSSysEAIElementREImpl extends net.ibizsys.model.eai.PSSysEAIElementObjectImpl implements net.ibizsys.model.eai.IPSSysEAIElementRE{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETELEMENTRETYPE = "elementREType";
	public final static String ATTR_GETFIXEDVALUE = "fixedValue";
	public final static String ATTR_GETMAXOCCURS = "maxOccurs";
	public final static String ATTR_GETMINOCCURS = "minOccurs";
	public final static String ATTR_GETPSSYSEAIDATATYPE = "getPSSysEAIDataType";
	public final static String ATTR_GETRETAG = "rETag";
	public final static String ATTR_GETRETAG2 = "rETag2";
	public final static String ATTR_GETREFPSSYSEAIELEMENT = "getRefPSSysEAIElement";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";

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

	public java.lang.String getElementREType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETELEMENTRETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFixedValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIXEDVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMaxOccurs(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXOCCURS);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getMinOccurs(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINOCCURS);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.eai.IPSSysEAIDataType pssyseaidatatype;

	public net.ibizsys.model.eai.IPSSysEAIDataType getPSSysEAIDataType(){
		if(this.pssyseaidatatype != null) return this.pssyseaidatatype;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSEAIDATATYPE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.eai.IPSSysEAIScheme ipssyseaischeme = getParentPSModelObject(net.ibizsys.model.eai.IPSSysEAIScheme.class);
		this.pssyseaidatatype = ipssyseaischeme.getPSSysEAIDataType(value, false);
		return this.pssyseaidatatype;
	}

	public net.ibizsys.model.eai.IPSSysEAIDataType getPSSysEAIDataTypeMust(){
		net.ibizsys.model.eai.IPSSysEAIDataType value = this.getPSSysEAIDataType();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定集成数据类型");}
		return value;
	}


	public java.lang.String getRETag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRETag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.eai.IPSSysEAIElement refpssyseaielement;

	public net.ibizsys.model.eai.IPSSysEAIElement getRefPSSysEAIElement(){
		if(this.refpssyseaielement != null) return this.refpssyseaielement;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSSYSEAIELEMENT);
		if(value == null){
			return null;
		}
		net.ibizsys.model.eai.IPSSysEAIScheme ipssyseaischeme = getParentPSModelObject(net.ibizsys.model.eai.IPSSysEAIScheme.class);
		this.refpssyseaielement = ipssyseaischeme.getPSSysEAIElement(value, false);
		return this.refpssyseaielement;
	}

	public net.ibizsys.model.eai.IPSSysEAIElement getRefPSSysEAIElementMust(){
		net.ibizsys.model.eai.IPSSysEAIElement value = this.getRefPSSysEAIElement();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用属性组");}
		return value;
	}


	public boolean isAllowEmpty(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWEMPTY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}