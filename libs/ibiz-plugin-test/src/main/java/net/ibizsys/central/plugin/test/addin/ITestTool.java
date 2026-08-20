package net.ibizsys.central.plugin.test.addin;

import java.util.Map;

import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface ITestTool extends IModelRTAddin{

	/**
	 * 获取工具类型
	 * @return
	 */
	String getType();
	
	
	/**
	 * 运行测试工具
	 * @param strPath
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	Object run(String strPath, Map<String, Object> params) throws Throwable;
	
}
