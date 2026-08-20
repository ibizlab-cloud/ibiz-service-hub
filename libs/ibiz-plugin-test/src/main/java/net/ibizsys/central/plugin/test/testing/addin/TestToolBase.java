package net.ibizsys.central.plugin.test.testing.addin;

import java.util.Map;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.plugin.test.addin.ITestTool;

public abstract class TestToolBase extends SysTestPrjRTAddinBase implements ITestTool {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(TestToolBase.class);

	@Override
	public String getType() {
		return (String) this.getAddinData();
	}
	
	@Override
	public Object run(String strPath, Map<String, Object> params) throws Throwable {
		return onRun(strPath, params);
	}
	
	protected abstract Object onRun(String strPath, Map<String, Object> params) throws Throwable;
}