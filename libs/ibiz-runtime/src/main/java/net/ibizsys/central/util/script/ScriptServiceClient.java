package net.ibizsys.central.util.script;

import net.ibizsys.central.service.ISubSysServiceAPIRuntime;

public class ScriptServiceClient implements IScriptServiceClient {

	private ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = null;
	public ScriptServiceClient(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) {
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
	}
	
	protected ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		return this.iSubSysServiceAPIRuntime;
	}
}
