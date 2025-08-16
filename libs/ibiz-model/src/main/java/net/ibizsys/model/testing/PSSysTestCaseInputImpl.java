package net.ibizsys.model.testing;



public class PSSysTestCaseInputImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.testing.IPSSysTestCaseInput{

	public final static String ATTR_GETINPUTPSDEACTION = "getInputPSDEAction";
	public final static String ATTR_GETINPUTTAG = "inputTag";
	public final static String ATTR_GETINPUTTAG2 = "inputTag2";
	public final static String ATTR_GETINPUTTAG3 = "inputTag3";
	public final static String ATTR_GETINPUTTAG4 = "inputTag4";
	public final static String ATTR_GETINPUTTYPE = "inputType";
	public final static String ATTR_GETINPUTVALUE = "inputValue";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETPSSYSTESTCASEASSERTS = "getPSSysTestCaseAsserts";
	public final static String ATTR_GETPSSYSTESTDATA = "getPSSysTestData";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	private net.ibizsys.model.dataentity.action.IPSDEAction inputpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getInputPSDEAction(){
		if(this.inputpsdeaction != null) return this.inputpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.testing.IPSSysTestCase ipssystestcase = getParentPSModelObject(net.ibizsys.model.testing.IPSSysTestCase.class);
		this.inputpsdeaction = ipssystestcase.getPSDataEntityMust().getPSDEAction(value, false);
		return this.inputpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getInputPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getInputPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输入行为");}
		return value;
	}


	public java.lang.String getInputTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInputTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInputTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInputTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInputType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInputValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPUTVALUE);
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

	private java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> pssystestcaseasserts = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> getPSSysTestCaseAsserts(){
		if(this.pssystestcaseasserts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTCASEASSERTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestCaseAssert>();
			net.ibizsys.model.testing.IPSSysTestCase ipssystestcase = this.getParentPSModelObject(net.ibizsys.model.testing.IPSSysTestCase.class);
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(ipssystestcase.getPSSysTestCaseAssert((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.pssystestcaseasserts = list;
		}
		return (this.pssystestcaseasserts.size() == 0)? null : this.pssystestcaseasserts;
	}

	public net.ibizsys.model.testing.IPSSysTestCaseAssert getPSSysTestCaseAssert(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestCaseAssert.class, this.getPSSysTestCaseAsserts(), objKey, bTryMode);
	}
	public void setPSSysTestCaseAsserts(java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> list){
		this.pssystestcaseasserts = list;
	}
	private net.ibizsys.model.testing.IPSSysTestData pssystestdata;

	public net.ibizsys.model.testing.IPSSysTestData getPSSysTestData(){
		if(this.pssystestdata != null) return this.pssystestdata;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTDATA);
		if(value == null){
			return null;
		}
		this.pssystestdata = getPSModelObject(net.ibizsys.model.testing.IPSSysTestData.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTESTDATA);
		return this.pssystestdata;
	}

	public net.ibizsys.model.testing.IPSSysTestData getPSSysTestDataMust(){
		net.ibizsys.model.testing.IPSSysTestData value = this.getPSSysTestData();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定测试数据");}
		return value;
	}


	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}