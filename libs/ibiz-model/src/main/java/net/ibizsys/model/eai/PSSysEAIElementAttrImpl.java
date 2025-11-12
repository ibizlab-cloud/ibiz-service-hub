package net.ibizsys.model.eai;



public class PSSysEAIElementAttrImpl extends net.ibizsys.model.eai.PSSysEAIElementObjectImpl implements net.ibizsys.model.eai.IPSSysEAIElementAttr{

	public final static String ATTR_GETATTRTAG = "attrTag";
	public final static String ATTR_GETATTRTAG2 = "attrTag2";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETELEMENTATTRTYPE = "elementAttrType";
	public final static String ATTR_GETFIXEDVALUE = "fixedValue";
	public final static String ATTR_GETPSSYSEAIDATATYPE = "getPSSysEAIDataType";
	public final static String ATTR_GETREFPSSYSEAIELEMENT = "getRefPSSysEAIElement";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";

	public java.lang.String getAttrTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTRTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAttrTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTRTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

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

	public java.lang.String getElementAttrType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETELEMENTATTRTYPE);
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

	public void setPSSysEAIDataType(net.ibizsys.model.eai.IPSSysEAIDataType pssyseaidatatype){
		this.pssyseaidatatype = pssyseaidatatype;
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

	public void setRefPSSysEAIElement(net.ibizsys.model.eai.IPSSysEAIElement refpssyseaielement){
		this.refpssyseaielement = refpssyseaielement;
	}


	public boolean isAllowEmpty(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWEMPTY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}