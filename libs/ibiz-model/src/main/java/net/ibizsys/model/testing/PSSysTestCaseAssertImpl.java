package net.ibizsys.model.testing;



public class PSSysTestCaseAssertImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.testing.IPSSysTestCaseAssert{

	public final static String ATTR_GETASSERTTAG = "assertTag";
	public final static String ATTR_GETASSERTTAG2 = "assertTag2";
	public final static String ATTR_GETASSERTTAG3 = "assertTag3";
	public final static String ATTR_GETASSERTTAG4 = "assertTag4";
	public final static String ATTR_GETASSERTTYPE = "assertType";
	public final static String ATTR_GETASSERTVALUE = "assertValue";
	public final static String ATTR_GETEXCEPTIONNAME = "exceptionName";
	public final static String ATTR_GETEXCEPTIONTAG = "exceptionTag";
	public final static String ATTR_GETEXCEPTIONTAG2 = "exceptionTag2";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETPSSYSTESTCASEINPUT = "getPSSysTestCaseInput";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";

	public java.lang.String getAssertTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETASSERTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAssertTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETASSERTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAssertTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETASSERTTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAssertTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETASSERTTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAssertType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETASSERTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAssertValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETASSERTVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExceptionName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXCEPTIONNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExceptionTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXCEPTIONTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExceptionTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXCEPTIONTAG2);
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
	private net.ibizsys.model.testing.IPSSysTestCaseInput pssystestcaseinput;

	public net.ibizsys.model.testing.IPSSysTestCaseInput getPSSysTestCaseInput(){
		if(this.pssystestcaseinput != null) return this.pssystestcaseinput;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTCASEINPUT);
		if(value == null){
			return null;
		}
		net.ibizsys.model.testing.IPSSysTestCase ipssystestcase = getParentPSModelObject(net.ibizsys.model.testing.IPSSysTestCase.class);
		this.pssystestcaseinput = ipssystestcase.getPSSysTestCaseInput(value, false);
		return this.pssystestcaseinput;
	}

	public net.ibizsys.model.testing.IPSSysTestCaseInput getPSSysTestCaseInputMust(){
		net.ibizsys.model.testing.IPSSysTestCaseInput value = this.getPSSysTestCaseInput();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定测试用例输入");}
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