package net.ibizsys.model.res;



public class PSSysUnitImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysUnit{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETNAMEPSLANGUAGERES = "getNamePSLanguageRes";
	public final static String ATTR_GETUNITTAG = "unitTag";
	public final static String ATTR_GETUNITTAG2 = "unitTag2";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes namepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes(){
		if(this.namepslanguageres != null) return this.namepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.namepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAMEPSLANGUAGERES);
		return this.namepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getNamePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定名称语言资源对象");}
		return value;
	}


	public java.lang.String getUnitTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNITTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUnitTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNITTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}