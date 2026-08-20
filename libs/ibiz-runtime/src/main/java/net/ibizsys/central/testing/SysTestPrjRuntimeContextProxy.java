package net.ibizsys.central.testing;

import java.io.File;
import java.util.Map;

import org.springframework.util.Assert;

public class SysTestPrjRuntimeContextProxy implements ISysTestPrjRuntimeContext{

	final ISysTestPrjRuntimeContext proxySysTestPrjRuntimeContext;
	
	protected SysTestPrjRuntimeContextProxy(ISysTestPrjRuntimeContext proxySysTestPrjRuntimeContext) {
		this.proxySysTestPrjRuntimeContext = proxySysTestPrjRuntimeContext;
		Assert.notNull(this.proxySysTestPrjRuntimeContext, "传入代理测试项目运行时上下文对象无效");
	}
	
	@Override
	public ISysTestPrjRuntime getModelRuntime() {
		return this.proxySysTestPrjRuntimeContext.getModelRuntime();
	}

	@Override
	public String getParam(String strKey, String strDefault) {
		return this.proxySysTestPrjRuntimeContext.getParam(strKey, strDefault);
		
	}

	@Override
	public int getParam(String strKey, int nDefault) {
		return this.proxySysTestPrjRuntimeContext.getParam(strKey, nDefault);
	}

	@Override
	public long getParam(String strKey, long nDefault) {
		return this.proxySysTestPrjRuntimeContext.getParam(strKey, nDefault);
	}

	@Override
	public double getParam(String strKey, double fDefault) {
		return this.proxySysTestPrjRuntimeContext.getParam(strKey, fDefault);
	}

	@Override
	public boolean getParam(String strKey, boolean bDefault) {
		return this.proxySysTestPrjRuntimeContext.getParam(strKey, bDefault);
	}

	@Override
	public Map<String, Object> getParams(String strPKey, Map<String, Object> params) {
		return this.proxySysTestPrjRuntimeContext.getParams(strPKey, params);
	}

	
	@Override
	public File getWorkspace() {
		return this.proxySysTestPrjRuntimeContext.getWorkspace();
	}


	
}
