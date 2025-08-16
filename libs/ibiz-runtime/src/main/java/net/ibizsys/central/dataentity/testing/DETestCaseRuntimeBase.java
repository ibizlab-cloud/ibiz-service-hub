package net.ibizsys.central.dataentity.testing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.testing.SysTestCaseRuntimeBase;

/**
 * 实体测试用例运行时对象基类
 * @author lionlau
 *
 */
public abstract class DETestCaseRuntimeBase extends SysTestCaseRuntimeBase implements IDETestCaseRuntime{

	private static final Log log = LogFactory.getLog(DETestCaseRuntimeBase.class);
}
