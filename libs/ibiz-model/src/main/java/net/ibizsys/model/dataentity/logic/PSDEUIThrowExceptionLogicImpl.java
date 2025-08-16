package net.ibizsys.model.dataentity.logic;



public class PSDEUIThrowExceptionLogicImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUIThrowExceptionLogic{

	public final static String ATTR_GETERRORCODE = "errorCode";
	public final static String ATTR_GETERRORINFO = "errorInfo";
	public final static String ATTR_GETEXCEPTIONOBJ = "exceptionObj";
	public final static String ATTR_GETEXCEPTIONPARAM = "getExceptionParam";

	public int getErrorCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERRORCODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getErrorInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERRORINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExceptionObj(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXCEPTIONOBJ);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam exceptionparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getExceptionParam(){
		if(this.exceptionparam != null) return this.exceptionparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXCEPTIONPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.exceptionparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.exceptionparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getExceptionParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getExceptionParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定异常参数对象");}
		return value;
	}

	public void setExceptionParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam exceptionparam){
		this.exceptionparam = exceptionparam;
	}

}