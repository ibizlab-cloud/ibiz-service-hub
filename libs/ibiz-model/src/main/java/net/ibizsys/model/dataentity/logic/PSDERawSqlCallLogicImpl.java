package net.ibizsys.model.dataentity.logic;



public class PSDERawSqlCallLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDERawSqlCallLogic{

	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETPSSYSDBSCHEME = "getPSSysDBScheme";
	public final static String ATTR_GETSQL = "sql";
	public final static String ATTR_ISFILLDSTLOGICPARAM = "fillDstLogicParam";
	public final static String ATTR_ISIGNORERESETDSTLOGICPARAM = "ignoreResetDstLogicParam";
	private net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam(){
		if(this.dstpsdelogicparam != null) return this.dstpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.dstpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.dstpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getDstPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数对象");}
		return value;
	}

	public void setDstPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam){
		this.dstpsdelogicparam = dstpsdelogicparam;
	}

	private net.ibizsys.model.database.IPSSysDBScheme pssysdbscheme;

	public net.ibizsys.model.database.IPSSysDBScheme getPSSysDBScheme(){
		if(this.pssysdbscheme != null) return this.pssysdbscheme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDBSCHEME);
		if(value == null){
			return null;
		}
		this.pssysdbscheme = getPSModelObject(net.ibizsys.model.database.IPSSysDBScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSDBSCHEME);
		return this.pssysdbscheme;
	}

	public net.ibizsys.model.database.IPSSysDBScheme getPSSysDBSchemeMust(){
		net.ibizsys.model.database.IPSSysDBScheme value = this.getPSSysDBScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据库体系");}
		return value;
	}

	public void setPSSysDBScheme(net.ibizsys.model.database.IPSSysDBScheme pssysdbscheme){
		this.pssysdbscheme = pssysdbscheme;
	}


	public java.lang.String getSql(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSQL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isFillDstLogicParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFILLDSTLOGICPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIgnoreResetDstLogicParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNORERESETDSTLOGICPARAM);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}