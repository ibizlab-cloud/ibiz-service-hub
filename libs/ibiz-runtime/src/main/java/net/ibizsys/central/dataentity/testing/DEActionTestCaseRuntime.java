package net.ibizsys.central.dataentity.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.testing.ISysTestDataRuntime;
import net.ibizsys.central.testing.TestCaseAssertTypes;
import net.ibizsys.central.testing.TestCaseInputTypes;
import net.ibizsys.central.testing.TestCaseRunResult;
import net.ibizsys.central.testing.TestRollbackException;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.testing.IPSDEActionTestCase;
import net.ibizsys.model.testing.IPSSysTestCaseAssert;
import net.ibizsys.model.testing.IPSSysTestCaseInput;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;

public class DEActionTestCaseRuntime extends DETestCaseRuntimeBase{

	private static final Log log = LogFactory.getLog(DEActionTestCaseRuntime.class);
	private IDataEntityRuntime iDataEntityRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		if(!(this.getPSSysTestCase() instanceof IPSDEActionTestCase)) {
			throw new Exception("模型对象类型不正确");
		}
		
		super.onInit();
	}
	
	public IPSDEActionTestCase getPSDEActionTestCase() {
		return (IPSDEActionTestCase)this.getPSSysTestCase();
	}
	
	public IDataEntityRuntime getDataEntityRuntime() {
		if(this.iDataEntityRuntime == null) {
			this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSDEActionTestCase().getPSDataEntityMust().getId());
		}
		return this.iDataEntityRuntime;
	}
	
	@Override
	protected void fillTestCaseInfo(TestCaseRunResult testCaseRunResult) {
		testCaseRunResult.setDEName(this.getDataEntityRuntime().getName());
		testCaseRunResult.setDEActionName(this.getPSDEActionTestCase().getPSDEActionMust().getName());
		super.fillTestCaseInfo(testCaseRunResult);
	}
	
	@Override
	protected TestCaseRunResult onRun() throws Throwable {
		TestCaseRunResult testCaseRunResult = new TestCaseRunResult();
		IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntime();
		
		try {
			iDataEntityRuntime.rawExecute(new INamedAction() {

				@Override
				public Object execute(Object[] args) throws Throwable {
					runDEActionTestCase(testCaseRunResult);
					if(getPSSysTestCase().isRollbackTransaction()) {
						throw new TestRollbackException();
					}
					return null;
				}
				
				@Override
				public String getName() {
					return String.format("测试用例行为[%1$s]", getPSSysTestCase().getName());
				}
			}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
		}
		catch(Throwable ex) {
			if(!(isTestRollbackException(ex))) {
				throw ex;
			}
		}
		
		return testCaseRunResult;
	}
	
	protected void runDEActionTestCase (TestCaseRunResult testCaseRunResult) throws Throwable {
		
		IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntime();
		IPSDEAction iPSDEAction = this.getPSDEActionTestCase().getPSDEActionMust();
		
		IPSDEMethodDTO iPSDEMethodDTO = iPSDEAction.getPSDEActionInputMust().getPSDEMethodDTO();
		
		ArrayNode arrayNode = JsonUtils.createArrayNode();
		
		
		
		//循环测试数据
		java.util.List<IPSSysTestCaseInput> psSysTestCaseInputList = getPSDEActionTestCase().getPSSysTestCaseInputs();
		if(!ObjectUtils.isEmpty(psSysTestCaseInputList)) {
			for(IPSSysTestCaseInput iPSSysTestCaseInput : psSysTestCaseInputList) {
				
				ObjectNode objectNode = arrayNode.addObject();
				objectNode.put(TestCaseRunResult.FIELD_RESULTS_INPUTTAG, iPSSysTestCaseInput.getName());
				
				//判断预期
				List<IPSSysTestCaseAssert> psSysTestCaseAssertList = iPSSysTestCaseInput.getPSSysTestCaseAsserts();
				if(ObjectUtils.isEmpty(psSysTestCaseAssertList)) {
					log.warn(String.format("测试输入[%1$s]未定义断言，忽略执行", iPSSysTestCaseInput.getName()));
					
					objectNode.put(TestCaseRunResult.FIELD_RESULTS_ACTUALRESULT, "未定义断言，无法判断");
					objectNode.put(TestCaseRunResult.FIELD_RESULTS_EXECUTERESULT, TestCaseRunResult.STATUS_BLOCKING);
					continue;
				}
				
				//根据类型执行操作
				String strInputType = iPSSysTestCaseInput.getInputType();
				IEntity iEntity = null;
				if(iPSDEMethodDTO != null) {
					iEntity = (IEntity)iDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTO, null);
				}
				else {
					iEntity = iDataEntityRuntime.createEntity();
				}
				
				if(iPSSysTestCaseInput.getPSSysTestData() != null) {
					ISysTestDataRuntime iSysTestDataRuntime = this.getSystemRuntime().getSysTestDataRuntime(iPSSysTestCaseInput.getPSSysTestData());
					iSysTestDataRuntime.getEntity(iEntity);
				}
				
				Map<String, Object> data = this.getInputDataMap(iPSSysTestCaseInput.getName());
				if(data != null) {
					for(java.util.Map.Entry<String, Object> entry : data.entrySet()) {
						iEntity.set(entry.getKey(), entry.getValue());
					}
				}
				
				if(TestCaseInputTypes.CUSTOMCODE.equals(strInputType)) {
					this.invokeInputScript(iPSSysTestCaseInput.getName(), iDataEntityRuntime.createScriptEntity(iEntity));
				}
				
				Object objRet = null;
				Throwable throwable = null;
				try {
					objRet = iDataEntityRuntime.executeAction(iPSDEAction.getName(), iPSDEAction, new Object[] {iEntity});
				}
				catch (Throwable ex) {
					throwable = ex;
				}
				
				IEntity resultEntity = null;
				if(objRet instanceof IEntity) {
					resultEntity = (IEntity) objRet;
				}
				else {
					resultEntity = iEntity;
				}
				
				List<String> resultList = new ArrayList<String>();
				String strStatus = TestCaseRunResult.STATUS_PASS;
				
				for(IPSSysTestCaseAssert iPSSysTestCaseAssert : psSysTestCaseAssertList) {
					String strAssertType = iPSSysTestCaseAssert.getAssertType();
					String strName = iPSSysTestCaseAssert.getMemo();
					
					if(TestCaseAssertTypes.RESULT.equals(strAssertType)) {
						if(!StringUtils.hasLength(strName)) {
							strName = String.format("[%1$s]预期结果",iPSSysTestCaseAssert.getName());
						}
						//预期结果
						if(throwable!= null) {
							strStatus = TestCaseRunResult.STATUS_FAILURE;
							resultList.add(String.format("%1$s[未通过]，发生异常", strName));
						}
						else {
							if(this.testResult(resultEntity, iPSSysTestCaseAssert)) {
								resultList.add(String.format("%1$s[通过]", strName));
							}
							else {
								strStatus = TestCaseRunResult.STATUS_FAILURE;
								resultList.add(String.format("%1$s[未通过]", strName));
							}
						}
						continue;
					}
					
					if(TestCaseAssertTypes.EXCEPTION.equals(strAssertType)) {
						if(!StringUtils.hasLength(strName)) {
							if(StringUtils.hasLength(iPSSysTestCaseAssert.getExceptionName())) {
								strName = String.format("[%1$s]预期异常(%2$s)", iPSSysTestCaseAssert.getName(), iPSSysTestCaseAssert.getExceptionName());
							}
							else {
								strName = String.format("[%1$s]预期异常", iPSSysTestCaseAssert.getName());
							}
						}
						//预期异常
						if(throwable!=null) {
							if(this.testException(throwable, iPSSysTestCaseAssert)) {
								resultList.add(String.format("%1$s[通过]", strName));
							}
							else {
								strStatus = TestCaseRunResult.STATUS_FAILURE;
								resultList.add(String.format("%1$s[未通过]", strName));
							}
						}
						else {
							strStatus = TestCaseRunResult.STATUS_FAILURE;
							resultList.add(String.format("%1$s[未通过]，未发生异常", strName));
						}
						
						continue;
					}
					
					if(TestCaseAssertTypes.NOEXCEPTION.equals(strAssertType)) {
						
						if(!StringUtils.hasLength(strName)) {
							strName = String.format("[%1$s]预期无异常", iPSSysTestCaseAssert.getName());
						}
						//预期无异常
						if(throwable!=null) {
							strStatus = TestCaseRunResult.STATUS_FAILURE;
							resultList.add(String.format("%1$s[未通过]", strName));
						}
						else {
							resultList.add(String.format("%1$s[通过]", strName));
						}
						
						
						
						continue;
					}
					
					if(TestCaseAssertTypes.CUSTOMCODE.equals(strAssertType)) {
						if(!StringUtils.hasLength(strName)) {
							strName = String.format("[%1$s]代码判断",iPSSysTestCaseAssert.getName());
						}
						
						//预期代码
						if(throwable!= null) {
							strStatus = TestCaseRunResult.STATUS_FAILURE;
							resultList.add(String.format("%1$s[未通过]，发生异常", strName));
						}
						else {
							boolean bRet = true;
							Object objAssertRet = this.invokeAssertScript(iPSSysTestCaseAssert.getName(), iDataEntityRuntime.createScriptEntity(resultEntity));
							if(objAssertRet != null) {
								String strRet = objAssertRet.toString();
								if(!"true".equalsIgnoreCase(strRet)) {
									bRet = false;
								}
							}
								
							if(bRet) {
								resultList.add(String.format("%1$s[通过]", strName));
							}
							else {
								strStatus = TestCaseRunResult.STATUS_FAILURE;
								resultList.add(String.format("%1$s[未通过]，%2$s", strName, objAssertRet));
							}
						}
						
						continue;
					}
					
					if(!TestCaseRunResult.STATUS_FAILURE.equals(strStatus)) {
						strStatus = TestCaseRunResult.STATUS_BLOCKING;
						
					}
					resultList.add(String.format("%1$s[未判断]，无法识别的断言类型[%2$s]", strName, strAssertType));
				}
				
				objectNode.put(TestCaseRunResult.FIELD_RESULTS_ACTUALRESULT, StringUtils.collectionToDelimitedString(resultList, "\n"));
				objectNode.put(TestCaseRunResult.FIELD_RESULTS_EXECUTERESULT, strStatus);
				
				
			}
		}
		
		
		//判断全部结果
		String strStatus = TestCaseRunResult.STATUS_PASS;
		for(int i = 0;i<arrayNode.size();i++) {
			ObjectNode objectNode = (ObjectNode)arrayNode.get(i);
			JsonNode node = objectNode.get(TestCaseRunResult.FIELD_RESULTS_EXECUTERESULT);
			if(node == null) {
				continue;
			}
			
			String strText = node.asText(TestCaseRunResult.STATUS_PASS);
			if(TestCaseRunResult.STATUS_BLOCKING.equals(strText)) {
				if(!TestCaseRunResult.STATUS_FAILURE.equals(strStatus)) {
					strStatus = TestCaseRunResult.STATUS_BLOCKING;
				}
				continue;
			}
			
			if(TestCaseRunResult.STATUS_FAILURE.equals(strText)) {
				strStatus = TestCaseRunResult.STATUS_FAILURE;
				continue;
			}
		}
		
		testCaseRunResult.setStatus(strStatus);
		testCaseRunResult.setResults(arrayNode.toString());
		
	}

}
