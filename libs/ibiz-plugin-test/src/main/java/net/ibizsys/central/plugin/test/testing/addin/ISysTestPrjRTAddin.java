package net.ibizsys.central.plugin.test.testing.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 系统作业功能组件运行时插件接口
 * @author lionlau
 *
 */
public interface ISysTestPrjRTAddin extends IModelRTAddin{

	/**
	 * 测试工具插件前缀
	 */
	public final static String ADDIN_TESTTOOL_PREFIX = "TESTTOOL:";
	
	
	/**
	 * 测试工具，默认
	 */
	public final static String TESTTOOL_DEFAULT = "DEFAULT";

}
