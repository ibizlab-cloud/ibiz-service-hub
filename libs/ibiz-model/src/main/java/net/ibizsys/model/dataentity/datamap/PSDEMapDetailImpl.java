package net.ibizsys.model.dataentity.datamap;



public class PSDEMapDetailImpl extends net.ibizsys.model.dataentity.datamap.PSDEMapObjectImpl implements net.ibizsys.model.dataentity.datamap.IPSDEMapField
		,net.ibizsys.model.app.dataentity.IPSAppDEMapField{

	public final static String ATTR_GETDSTFIELDNAME = "dstFieldName";
	public final static String ATTR_GETDSTPSAPPDEFIELD = "getDstPSAppDEField";
	public final static String ATTR_GETDSTPSDEFIELD = "getDstPSDEField";
	public final static String ATTR_GETEXPRESSION = "expression";
	public final static String ATTR_GETMAPTYPE = "mapType";
	public final static String ATTR_GETPSSYSTRANSLATOR = "getPSSysTranslator";
	public final static String ATTR_GETRAWVALUE = "rawValue";
	public final static String ATTR_GETSRCFIELDNAME = "srcFieldName";
	public final static String ATTR_GETSRCPSAPPDEFIELD = "getSrcPSAppDEField";
	public final static String ATTR_GETSRCPSDEFIELD = "getSrcPSDEField";

	public java.lang.String getDstFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField dstpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getDstPSAppDEField(){
		if(this.dstpsappdefield != null) return this.dstpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDEMap ipsappdemap = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMap.class);
		this.dstpsappdefield = ipsappdemap.getDstPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.dstpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getDstPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getDstPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标应用实体属性");}
		return value;
	}

	public void setDstPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField dstpsappdefield){
		this.dstpsappdefield = dstpsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField dstpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getDstPSDEField(){
		if(this.dstpsdefield != null) return this.dstpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.datamap.IPSDEMap ipsdemap = getParentPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMap.class);
		this.dstpsdefield = ipsdemap.getDstPSDEMust().getPSDEField(value, false);
		return this.dstpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getDstPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getDstPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体属性");}
		return value;
	}

	public void setDstPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField dstpsdefield){
		this.dstpsdefield = dstpsdefield;
	}


	public java.lang.String getExpression(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXPRESSION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMapType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
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

	public void setPSSysTranslator(net.ibizsys.model.res.IPSSysTranslator pssystranslator){
		this.pssystranslator = pssystranslator;
	}


	public java.lang.String getRawValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSrcFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField srcpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getSrcPSAppDEField(){
		if(this.srcpsappdefield != null) return this.srcpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.srcpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.srcpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getSrcPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getSrcPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源应用实体属性");}
		return value;
	}

	public void setSrcPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField srcpsappdefield){
		this.srcpsappdefield = srcpsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField srcpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getSrcPSDEField(){
		if(this.srcpsdefield != null) return this.srcpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.srcpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.srcpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getSrcPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getSrcPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源实体属性");}
		return value;
	}

	public void setSrcPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField srcpsdefield){
		this.srcpsdefield = srcpsdefield;
	}

}