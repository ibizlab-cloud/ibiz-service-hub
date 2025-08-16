package net.ibizsys.central.testing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.testing.IPSSysTestCase;
import net.ibizsys.model.testing.IPSSysTestCaseAssert;
import net.ibizsys.model.testing.IPSSysTestCaseInput;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.PropertiesUtils;
import net.ibizsys.runtime.util.script.IScriptEntity;

/**
 * 系统测试用例运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysTestCaseRuntimeBase extends SystemModelRuntimeBase implements ISysTestCaseRuntime {

	private static final Log log = LogFactory.getLog(SysTestCaseRuntimeBase.class);

	private Map<String, Map<String, Object>> inputDataMap = new HashMap<String, Map<String, Object>>();
	private Map<String, Invocable> inputCodeMap = new HashMap<String, Invocable>();
	private Map<String, Map<String, Object>> assertDataMap = new HashMap<String, Map<String, Object>>();
	private Map<String, Invocable> assertCodeMap = new HashMap<String, Invocable>();

	private IPSSysTestCase iPSSysTestCase = null;

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysTestCase iPSSysTestCase) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysTestCase = iPSSysTestCase;
		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {

		java.util.List<IPSSysTestCaseInput> psSysTestCaseInputList = this.getPSSysTestCase().getPSSysTestCaseInputs();
		if (!ObjectUtils.isEmpty(psSysTestCaseInputList)) {
			for (IPSSysTestCaseInput iPSSysTestCaseInput : psSysTestCaseInputList) {
				String strType = iPSSysTestCaseInput.getInputType();
				if (!StringUtils.hasLength(strType)) {
					strType = TestCaseInputTypes.DATA;
				}
				this.inputDataMap.put(iPSSysTestCaseInput.getName(), this.prepareDataMode(iPSSysTestCaseInput.getInputValue()));
				if (TestCaseInputTypes.CUSTOMCODE.equals(strType)) {
					this.inputCodeMap.put(iPSSysTestCaseInput.getName(), this.prepareCodeMode(iPSSysTestCaseInput.getScriptCode()));
				}
			}
		}

		java.util.List<IPSSysTestCaseAssert> psSysTestCaseAssertList = this.getPSSysTestCase().getPSSysTestCaseAsserts();
		if (!ObjectUtils.isEmpty(psSysTestCaseAssertList)) {
			for (IPSSysTestCaseAssert iPSSysTestCaseAssert : psSysTestCaseAssertList) {
				String strType = iPSSysTestCaseAssert.getAssertType();
				if (!StringUtils.hasLength(strType)) {
					strType = TestCaseAssertTypes.RESULT;
				}
				if (TestCaseAssertTypes.RESULT.equals(strType)) {
					this.assertDataMap.put(iPSSysTestCaseAssert.getName(), this.prepareDataMode(iPSSysTestCaseAssert.getAssertValue()));
				} else if (TestCaseAssertTypes.CUSTOMCODE.equals(strType)) {
					this.assertCodeMap.put(iPSSysTestCaseAssert.getName(), this.prepareCodeMode(iPSSysTestCaseAssert.getScriptCode()));
				}

			}
		}

		super.onInit();
	}

	protected Map<String, Object> prepareDataMode(String strData) throws Exception {
		if (!StringUtils.hasLength(strData)) {
			return null;
		}
		strData = strData.toString();
		if (!StringUtils.hasLength(strData)) {
			return null;
		}

		if (strData.indexOf("{") == 0) {
			ObjectNode objectNode = JsonUtils.toObjectNode(strData);
			return JsonUtils.MAPPER.convertValue(objectNode, Map.class);
		} else {
			Properties properties = PropertiesUtils.load(strData);
			if (properties != null) {
				Map<String, Object> data = new LinkedHashMap<String, Object>();
				for (Object objKey : properties.keySet()) {
					String strName = (String) objKey;
					data.put(strName, PropertiesUtils.getProperty(properties, strName));
				}
				return data;
			}
		}
		return null;
	}

	protected Invocable prepareCodeMode(String strCustomCode) throws Exception {
		if (!StringUtils.hasLength(strCustomCode)) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有指定脚本代码"));
		}

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		String strJSCode = "function main(";
		strJSCode += "sys,entity";
		strJSCode += "){";
		strJSCode += strCustomCode;
		strJSCode += "}";
		engine.eval(strJSCode);
		return (Invocable) engine;
	}

	protected Map<String, Object> getInputDataMap(String strName) {
		return this.inputDataMap.get(strName);
	}

	protected Map<String, Object> getAssertDataMap(String strName) {
		return this.assertDataMap.get(strName);
	}

	protected Invocable getInputInvocable(String strName) {
		return this.inputCodeMap.get(strName);
	}

	protected Invocable getAssertInvocable(String strName) {
		return this.assertCodeMap.get(strName);
	}

	public IPSSysTestCase getPSSysTestCase() {
		return this.iPSSysTestCase;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysTestCase();
	}

	protected Object invokeInputScript(String strName, IScriptEntity iScriptEntity) {
		try {
			Invocable invocable = inputCodeMap.get(strName);
			if (invocable == null) {
				throw new Exception("脚本对象不存在");
			}
			return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), iScriptEntity);

		} catch (NoSuchMethodException | ScriptException ex) {
			log.error(ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.SCRIPT, String.format("执行输入脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), String.format("执行输入脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		} catch (Exception ex) {
			log.error(ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("执行输入脚本发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object invokeAssertScript(String strName, IScriptEntity iScriptEntity) {
		try {
			Invocable invocable = assertCodeMap.get(strName);
			if (invocable == null) {
				throw new Exception("脚本对象不存在");
			}
			return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), iScriptEntity);

		} catch (NoSuchMethodException | ScriptException ex) {
			log.error(ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.SCRIPT, String.format("执行断言脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), String.format("执行断言脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		} catch (Exception ex) {
			log.error(ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("执行断言脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}

	@Override
	public TestCaseRunResult run() {

		try {
			TestCaseRunResult testCaseRunResult = onRun();
			fillTestCaseInfo(testCaseRunResult);
			return testCaseRunResult;
			
		} catch (Throwable ex) {
			log.debug(String.format("执行系统测试用例[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			TestCaseRunResult testCaseRunResult = new TestCaseRunResult();
			testCaseRunResult.setStatus(TestCaseRunResult.STATUS_FAILURE);
			testCaseRunResult.setActualResult(ex.getMessage());
			fillTestCaseInfo(testCaseRunResult);
			return testCaseRunResult;
		}
	}
	
	protected void fillTestCaseInfo(TestCaseRunResult testCaseRunResult) {
		testCaseRunResult.setType(this.getPSSysTestCase().getTestCaseType());
		testCaseRunResult.setTestCaseTag(this.getPSSysTestCase().getCodeName());
	}

	protected TestCaseRunResult onRun() throws Throwable{
		throw new Exception("没有实现");
	}

	
	protected boolean isTestRollbackException(Throwable ex) {
		if(ex instanceof TestRollbackException) {
			return true;
		}
		if(ex.getCause() != null) {
			return this.isTestRollbackException(ex.getCause());
		}
		return false;
	}
	
	
	protected boolean testResult(IEntity iEntity, IPSSysTestCaseAssert iPSSysTestCaseAssert) {
		return true;
	}
	
	
	protected boolean testException(Throwable ex, IPSSysTestCaseAssert iPSSysTestCaseAssert) {
		return true;
	}
}
