package net.ibizsys.model.dataentity.logic;



public class PSDEUIEndLogicImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUIEndLogic{

	public final static String ATTR_GETDSTFIELDNAME = "dstFieldName";
	public final static String ATTR_GETRAWVALUE = "rawValue";
	public final static String ATTR_GETRAWVALUESTDDATATYPE = "rawValueStdDataType";
	public final static String ATTR_GETRETURNPARAM = "getReturnParam";
	public final static String ATTR_GETRETURNTYPE = "returnType";

	public java.lang.String getDstFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRawValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getRawValueStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWVALUESTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam returnparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getReturnParam(){
		if(this.returnparam != null) return this.returnparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRETURNPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.returnparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.returnparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getReturnParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getReturnParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定返回参数");}
		return value;
	}

	public void setReturnParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam returnparam){
		this.returnparam = returnparam;
	}


	public java.lang.String getReturnType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRETURNTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}