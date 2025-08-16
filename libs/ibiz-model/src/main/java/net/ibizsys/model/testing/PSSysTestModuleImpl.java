package net.ibizsys.model.testing;



public class PSSysTestModuleImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.testing.IPSSysTestModule{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETMODULETAG = "moduleTag";
	public final static String ATTR_GETMODULETAG2 = "moduleTag2";
	public final static String ATTR_GETPSSYSTESTCASES = "getPSSysTestCases";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModuleTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODULETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.testing.IPSSysTestCase> pssystestcases = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestCase> getPSSysTestCases(){
		if(this.pssystestcases == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTCASES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestCase> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestCase>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestCase obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestCase.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSTESTCASES);
				if(obj!=null)list.add(obj);
			}
			this.pssystestcases = list;
		}
		return (this.pssystestcases.size() == 0)? null : this.pssystestcases;
	}

	public net.ibizsys.model.testing.IPSSysTestCase getPSSysTestCase(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestCase.class, this.getPSSysTestCases(), objKey, bTryMode);
	}
	public void setPSSysTestCases(java.util.List<net.ibizsys.model.testing.IPSSysTestCase> list){
		this.pssystestcases = list;
	}
}