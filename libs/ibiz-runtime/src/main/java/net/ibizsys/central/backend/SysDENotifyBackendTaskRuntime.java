package net.ibizsys.central.backend;

import net.ibizsys.runtime.backend.SysDENotifyBackendTaskRuntimeBase;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;

public class SysDENotifyBackendTaskRuntime extends SysDENotifyBackendTaskRuntimeBase implements ISysBackendTaskRuntime {

	@Override
	public Object execute(String strDynaInstId, String strParam) throws Throwable {
		return this.execute(strDynaInstId, strParam, null);
	}

	@Override
	protected IUserContext getUserContext() {
		return UserContext.getCurrent();
	}
	
	@Override
	public String getTimerPolicy() {
		return this.getPSSysBackService().getTimerPolicy();
	}


	@Override
	public boolean isTimerMode() {
		return this.getPSSysBackService().isTimerMode();
	}
	
	@Override
	public boolean isLocalMode() {
		return this.getPSSysBackService().isLocalMode();
	}
}
