package net.ibizsys.model.eai;



public class PSSysEAIDERImpl extends net.ibizsys.model.eai.PSSysEAIDEObjectImpl implements net.ibizsys.model.eai.IPSSysEAIDER{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDERTAG = "dERTag";
	public final static String ATTR_GETDERTAG2 = "dERTag2";
	public final static String ATTR_GETPSDER = "getPSDER";
	public final static String ATTR_GETPSSYSEAIELEMENTRE = "getPSSysEAIElementRE";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDERTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDERTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDERTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.der.IPSDERBase psder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDER(){
		if(this.psder != null) return this.psder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDER);
		if(value == null){
			return null;
		}
		this.psder = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDER);
		return this.psder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体关系");}
		return value;
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

}