package net.ibizsys.central.backend;

import net.ibizsys.runtime.backend.SysDTSQueueBackendTaskRuntimeBase;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ActionSessionManager;

public class SysDTSQueueBackendTaskRuntime extends SysDTSQueueBackendTaskRuntimeBase implements ISysBackendTaskRuntime {

	@Override
	public Object execute(String strDynaInstId, String strParam) throws Throwable {
		return this.execute(strDynaInstId, strParam, null);
	}
	
	@Override
	protected IUserContext getUserContext() {
		IUserContext iUserContext = ActionSessionManager.getUserContext();
		if(iUserContext != null) {
			return iUserContext;
		}
		return this.getSystemRuntime().createDefaultUserContext();
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
