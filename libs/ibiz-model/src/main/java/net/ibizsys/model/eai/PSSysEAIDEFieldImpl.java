package net.ibizsys.model.eai;



public class PSSysEAIDEFieldImpl extends net.ibizsys.model.eai.PSSysEAIDEObjectImpl implements net.ibizsys.model.eai.IPSSysEAIDEField{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDSTTYPE = "dstType";
	public final static String ATTR_GETFIELDTAG = "fieldTag";
	public final static String ATTR_GETFIELDTAG2 = "fieldTag2";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSSYSEAIELEMENTATTR = "getPSSysEAIElementAttr";
	public final static String ATTR_GETPSSYSEAIELEMENTRE = "getPSSysEAIElementRE";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDstType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTTYPE);
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
	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefield = ipsdataentity.getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}

	private net.ibizsys.model.eai.IPSSysEAIElementAttr pssyseaielementattr;

	public net.ibizsys.model.eai.IPSSysEAIElementAttr getPSSysEAIElementAttr(){
		if(this.pssyseaielementattr != null) return this.pssyseaielementattr;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSEAIELEMENTATTR);
		if(value == null){
			return null;
		}
		net.ibizsys.model.eai.IPSSysEAIElement ipssyseaielement = getParentPSModelObject(net.ibizsys.model.eai.IPSSysEAIElement.class);
		this.pssyseaielementattr = ipssyseaielement.getPSSysEAIElementAttr(value, false);
		return this.pssyseaielementattr;
	}

	public net.ibizsys.model.eai.IPSSysEAIElementAttr getPSSysEAIElementAttrMust(){
		net.ibizsys.model.eai.IPSSysEAIElementAttr value = this.getPSSysEAIElementAttr();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定集成元素属性");}
		return value;
	}

	public void setPSSysEAIElementAttr(net.ibizsys.model.eai.IPSSysEAIElementAttr pssyseaielementattr){
		this.pssyseaielementattr = pssyseaielementattr;
	}

	private net.ibizsys.model.eai.IPSSysEAIElementRE pssyseaielementre;

	public net.ibizsys.model.eai.IPSSysEAIElementRE getPSSysEAIElementRE(){
		if(this.pssyseaielementre != null) return this.pssyseaielementre;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSEAIELEMENTRE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.eai.IPSSysEAIElement ipssyseaielement = getParentPSModelObject(net.ibizsys.model.eai.IPSSysEAIElement.class);
		this.pssyseaielementre = ipssyseaielement.getPSSysEAIElementRE(value, false);
		return this.pssyseaielementre;
	}

	public net.ibizsys.model.eai.IPSSysEAIElementRE getPSSysEAIElementREMust(){
		net.ibizsys.model.eai.IPSSysEAIElementRE value = this.getPSSysEAIElementRE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定集成元素引用属性");}
		return value;
	}

	public void setPSSysEAIElementRE(net.ibizsys.model.eai.IPSSysEAIElementRE pssyseaielementre){
		this.pssyseaielementre = pssyseaielementre;
	}

}