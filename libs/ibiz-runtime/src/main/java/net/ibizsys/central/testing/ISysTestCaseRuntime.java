package net.ibizsys.central.testing;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.testing.IPSSysTestCase;

/**
 * 系统测试用例运行时
 * @author lionlau
 *
 */
public interface ISysTestCaseRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化测试用例运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSSysTestCase
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysTestCase iPSSysTestCase) throws Exception;

	

	
	/**
	 * 运行测试用例
	 */
	TestCaseRunResult run();
	
}
