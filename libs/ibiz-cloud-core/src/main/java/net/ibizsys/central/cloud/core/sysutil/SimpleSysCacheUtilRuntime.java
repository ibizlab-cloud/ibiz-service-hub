package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.sysutil.SysCacheUtilRuntimeBase;

public class SimpleSysCacheUtilRuntime extends SysCacheUtilRuntimeBase{

	@Override
	protected String onGet(String strName) throws Throwable {
		// TODO Auto-generated method stub
		return super.onGet(strName);
	}

	@Override
	protected boolean onContains(String strName) throws Throwable {
		// TODO Auto-generated method stub
		return super.onContains(strName);
	}

	@Override
	protected void onSet(String strName, Object objValue, int nSeconds) throws Throwable {
		// TODO Auto-generated method stub
		super.onSet(strName, objValue, nSeconds);
	}

	@Override
	protected void onReset(String strName) throws Throwable {
		// TODO Auto-generated method stub
		super.onReset(strName);
	}

	
}
