package net.ibizsys.model.ai;



public abstract class PSSysAIFactoryObjectImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.ai.IPSSysAIFactoryObject{

	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSSYSAIFACTORY = "getPSSysAIFactory";

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactory(){
		return getParentPSModelObject(net.ibizsys.model.ai.IPSSysAIFactory.class);
		
	}

	public net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactoryMust(){
		net.ibizsys.model.ai.IPSSysAIFactory value = this.getPSSysAIFactory();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定所属系统AI工厂对象");}
		return value;
	}

}