package net.ibizsys.model.testing;



public class PSSysTestCaseImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.testing.IPSSysTestCase
		,net.ibizsys.model.testing.IPSDEFVRTestCase
		,net.ibizsys.model.testing.IPSDEActionTestCase
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETASSERTEXCEPTIONDATA = "assertExceptionData";
	public final static String ATTR_GETASSERTEXCEPTIONDATA2 = "assertExceptionData2";
	public final static String ATTR_GETASSERTEXCEPTIONNAME = "assertExceptionName";
	public final static String ATTR_GETASSERTTYPE = "assertType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEACTION = "getPSDEAction";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSTESTCASEASSERTS = "getPSSysTestCaseAsserts";
	public final static String ATTR_GETPSSYSTESTCASEINPUTS = "getPSSysTestCaseInputs";
	public final static String ATTR_GETPSSYSTESTDATA = "getPSSysTestData";
	public final static String ATTR_GETTESTCASESN = "testCaseSN";
	public final static String ATTR_GETTESTCASETYPE = "testCaseType";
	public final static String ATTR_ISROLLBACKTRANSACTION = "rollbackTransaction";

	public java.lang.String getAssertExceptionData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETASSERTEXCEPTIONDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAssertExceptionData2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETASSERTEXCEPTIONDATA2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAssertExceptionName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETASSERTEXCEPTIONNAME);
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

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction psdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction(){
		if(this.psdeaction != null) return this.psdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTION);
		if(value == null){
			return null;
		}
		this.psdeaction = this.getPSDataEntityMust().getPSDEAction(value, false);
		return this.psdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定测试实体行为");}
		return value;
	}

	public void setPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction psdeaction){
		this.psdeaction = psdeaction;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		this.psdefield = this.getPSDataEntityMust().getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关实体属性");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定测试实体对象");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
	}


	private java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> pssystestcaseasserts = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> getPSSysTestCaseAsserts(){
		if(this.pssystestcaseasserts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTCASEASSERTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestCaseAssert>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestCaseAssert obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestCaseAssert.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSTESTCASEASSERTS);
				if(obj!=null)list.add(obj);
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

	private java.util.List<net.ibizsys.model.testing.IPSSysTestCaseInput> pssystestcaseinputs = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestCaseInput> getPSSysTestCaseInputs(){
		if(this.pssystestcaseinputs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTCASEINPUTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestCaseInput> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestCaseInput>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestCaseInput obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestCaseInput.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSTESTCASEINPUTS);
				if(obj!=null)list.add(obj);
			}
			this.pssystestcaseinputs = list;
		}
		return (this.pssystestcaseinputs.size() == 0)? null : this.pssystestcaseinputs;
	}

	public net.ibizsys.model.testing.IPSSysTestCaseInput getPSSysTestCaseInput(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestCaseInput.class, this.getPSSysTestCaseInputs(), objKey, bTryMode);
	}
	public void setPSSysTestCaseInputs(java.util.List<net.ibizsys.model.testing.IPSSysTestCaseInput> list){
		this.pssystestcaseinputs = list;
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

	public void setPSSysTestData(net.ibizsys.model.testing.IPSSysTestData pssystestdata){
		this.pssystestdata = pssystestdata;
	}


	public java.lang.String getTestCaseSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTCASESN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTestCaseType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTCASETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isRollbackTransaction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISROLLBACKTRANSACTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}