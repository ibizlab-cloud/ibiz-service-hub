package net.ibizsys.central.cloud.devops.core.addin;

import java.util.Collection;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.testing.TestCaseAssertTypes;
import net.ibizsys.central.testing.TestCaseRunResult;
import net.ibizsys.centralstudio.dto.PSSysTestPrjDTO;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.testing.IPSSysTestCaseAssert;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogLevels;

public abstract class DevOpsTestToolBase extends CloudDevOpsUtilRTAddinBase implements IDevOpsTestTool{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DevOpsTestToolBase.class);
	
	public static final TypeReference<Collection<PSSysTestPrjDTO>> PSSysTestPrjDTOListType = new TypeReference<Collection<PSSysTestPrjDTO>>(){};
	public static final TypeReference<Collection<TestCaseRunResult>> TestCaseRunResultListType = new TypeReference<Collection<TestCaseRunResult>>(){};
	
	
	
	@Override
	protected void onInit() throws Exception {
	
		super.onInit();
	}
	
	
	@Override
	protected boolean isPrepareConfigEntity() {
		return true;
	}
	
	@Override
	public Collection<PSSysTestPrjDTO> initTestProjects(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params){
		try {
			if(params == null) {
				throw new Exception("未传入测试项目参数");
			}
			return this.onInitTestProjects(dcSystem, iPSSystemService, params);
		}
		catch(Throwable ex) {
			log.error(String.format("测试工具[%1$s]初始化测试项目发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("测试工具[%1$s]初始化测试项目发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudDevOpsUtilRuntime(), String.format("测试工具[%1$s]初始化测试项目发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}
	
	protected Collection<PSSysTestPrjDTO> onInitTestProjects(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable{
		throw new Exception("没有实现");
	}


	@Override
	public PSSysTestPrjDTO runTestProject(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params) {
		try {
			if(params == null) {
				throw new Exception("未传入测试项目参数");
			}
			return this.onRunTestProject(dcSystem, iPSSystemService, params);
		}
		catch(Throwable ex) {
			log.error(String.format("测试工具[%1$s]运行测试项目，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("测试工具[%1$s]运行测试项目发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudDevOpsUtilRuntime(), String.format("测试工具[%1$s]运行测试项目发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}
	
	
	protected PSSysTestPrjDTO onRunTestProject(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable{
		throw new Exception("没有实现");
	}
	
	/**
	 * 获取传入断言的预期结果
	 * @param iPSSysTestCaseAssert
	 * @return
	 */
	protected String getExpectedResult(IPSSysTestCaseAssert iPSSysTestCaseAssert){
		
		String strResult = iPSSysTestCaseAssert.getMemo();
		if (StringUtils.hasLength(strResult)) {
			return strResult;
		}
		String strAssertType = iPSSysTestCaseAssert.getAssertType();
		if(TestCaseAssertTypes.RESULT.equals(strAssertType)) {
			return String.format("[%1$s]预期结果",iPSSysTestCaseAssert.getName());
		}
		
		if(TestCaseAssertTypes.EXCEPTION.equals(strAssertType)) {
			if(StringUtils.hasLength(iPSSysTestCaseAssert.getExceptionName())) {
				return String.format("[%1$s]预期异常(%2$s)", iPSSysTestCaseAssert.getName(), iPSSysTestCaseAssert.getExceptionName());
			}
			else {
				return String.format("[%1$s]预期异常", iPSSysTestCaseAssert.getName());
			}
		}
		
		if(TestCaseAssertTypes.NOEXCEPTION.equals(strAssertType)) {
			return String.format("[%1$s]预期无异常", iPSSysTestCaseAssert.getName());
		}
		
		if(TestCaseAssertTypes.CUSTOMCODE.equals(strAssertType)) {
			return String.format("[%1$s]代码判断",iPSSysTestCaseAssert.getName());
		}
		
		return String.format("[%1$s]%2$s",iPSSysTestCaseAssert.getName(), strAssertType);
	}
	
	
}
